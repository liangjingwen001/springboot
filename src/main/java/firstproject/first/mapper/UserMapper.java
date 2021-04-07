package firstproject.first.mapper;

import firstproject.first.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    public User getUser(int id);

    @Select("select * from user")
    public List<User> getAllUser();

    @Insert("insert into user(`name`,`age`) values (#{name},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void insertUser(User user);
}
