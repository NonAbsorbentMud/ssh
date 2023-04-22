package own.cfb.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {

    public void pointCut(){
        System.out.println("基于配置XML的切点");
    }
    public void before(){
        System.out.println("基于配置XML的前置通知");
    }
    public void afterReturning(){
        System.out.println("基于配置XML的后置通知");
    }
    public Object arround(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("基于配置XML的环绕前通知");
        Object proceed = pjp.proceed();
        System.out.println("基于配置XML的环绕后通知");
        return proceed;
    }
    public void afterException(){
        System.out.println("基于配置XML的异常拦截通知");
    }
    public void after(){
        System.out.println("基于配置XML的后置通知");
    }
}
