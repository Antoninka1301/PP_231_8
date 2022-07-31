package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getById(int id);

    public void save(User user);

    public void updateUser(User user);

    public void delete(int id);
}
