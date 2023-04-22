package own.cfb.test.action;

import com.opensymphony.xwork2.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//创建Action方式2：实现Action接口
public class CreateActionTwo implements Action {
    protected Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public String execute() throws Exception {
        return "execute";
    }
}
