package firstproject.first.service;

import firstproject.first.bean.User;

import java.util.List;

public interface UserService {

    public User getUserById(int id);

    public List<User> getAllUser();

    public void saveUser(User user);
}
