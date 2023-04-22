package own.cfb.user.service.impl;

import own.cfb.user.dao.UserDao;
import own.cfb.user.model.Users;
import own.cfb.user.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Users login(String account, String pwd) {
        try{
            Users user = userDao.getUserByAccount(account);
            if(user==null){
                throw new RuntimeException("该账号还未注册!");
            }else{
                if(user.getPassWord().equals(pwd)){
                    return user;
                }else{
                    throw new RuntimeException("密码错误!");
                }
            }
        }catch(Exception e){
            throw e;
        }
    }

    @Override
    public Users register(Users user) {
        return userDao.saveUser(user);
    }
}
