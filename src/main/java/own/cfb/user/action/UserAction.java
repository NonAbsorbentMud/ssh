package own.cfb.user.action;

import com.opensymphony.xwork2.ActionContext;
import own.cfb.common.action.BaseAction;
import own.cfb.user.model.Users;
import own.cfb.user.service.UserService;

public class UserAction extends BaseAction {
    private String account;
    private String pwd;
    private Users user;
    private UserService userService;

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public String login(){
        try{
            Users u=userService.login(account,pwd);
            ActionContext.getContext().getSession().put("user",u);
            return "main";
        }catch(Exception e) {
            ActionContext.getContext().getSession().put("msg",e.getMessage());
            return "warn";
        }
    }
    public String register(){
        Users u = userService.register(this.user);
        return "register";
    }
}
