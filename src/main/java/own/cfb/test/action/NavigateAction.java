package own.cfb.test.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigateAction {
    protected Logger logger= LoggerFactory.getLogger(getClass());
    //属性驱动
    private String fieldParam;
    public void setFieldParam(String fieldParam) {
        this.fieldParam = fieldParam;
    }
    public String toDispatcher(){
        logger.info("fieldParam：{},actionParam:{}",fieldParam,actionParam);
        return "toDispatcher";
    }
    public String toRedirect(){
        logger.info("fieldParam：{},actionParam:{}",fieldParam,actionParam);
        return "toRedirect";
    }
    //Action传参用
    private String actionParam;
    public String getActionParam() {
        return actionParam;
    }
    public void setActionParam(String actionParam) {
        this.actionParam = actionParam;
    }
    public String toChain(){
        actionParam="222222222";
        logger.info("fieldParam：{},actionParam:{}",fieldParam,actionParam);
        return "toChain";
    }
    public String toRedirectAct(){
        actionParam="toRedirectAct";
        logger.info("fieldParam：{},actionParam:{}",fieldParam,actionParam);
        return "toRedirectAct";
    }
}
