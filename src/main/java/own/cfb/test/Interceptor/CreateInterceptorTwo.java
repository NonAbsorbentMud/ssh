package own.cfb.test.Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CreateInterceptorTwo extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        return null;
    }
}
