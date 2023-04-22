package own.cfb.test.action;

import com.opensymphony.xwork2.ActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//创建Action方式3（推荐）：继承ActionSupport.实现 Validateable,ValidateAware,TextProvider,LocaleProvider等接口
public class CreateActionThree extends ActionSupport {
    protected Logger logger= LoggerFactory.getLogger(this.getClass());
    public String three() throws Exception {
        return "three";
    }
}
