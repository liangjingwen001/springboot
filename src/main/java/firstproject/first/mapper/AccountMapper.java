package firstproject.first.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import firstproject.first.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
