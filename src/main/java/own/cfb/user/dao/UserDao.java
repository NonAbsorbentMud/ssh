package own.cfb.user.dao;

import own.cfb.user.model.Users;

import java.util.List;

public interface UserDao {

    public Users getUserByAccount(String account);
    public Users saveUser(Users user);
    public Users updateUser(Users user);
    public void deleteUser(Users user);
    public List<Users> getAllUsers(Integer page,Integer size);
    public <T> List<Users> getUsersByField(String fieldColumn,T value);

}
