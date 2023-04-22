package own.cfb.common.action;

import com.opensymphony.xwork2.ActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import own.cfb.common.service.BaseService;

public class BaseAction extends ActionSupport {
    protected Logger logger= LoggerFactory.getLogger(this.getClass());
    private BaseService baseService;

    public void setBaseService(BaseService baseService) {
        this.baseService = baseService;
    }
    public String toJsp(){
        return "toJsp";
    }
    public String toHtml(){
        return "toHtml";
    }
}
