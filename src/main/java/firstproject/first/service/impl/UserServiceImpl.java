package firstproject.first.service.impl;

import firstproject.first.bean.User;
import firstproject.first.mapper.UserMapper;
import firstproject.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.getUser(id);
    }

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    public void saveUser(User user){
        userMapper.insertUser(user);
    }
}
