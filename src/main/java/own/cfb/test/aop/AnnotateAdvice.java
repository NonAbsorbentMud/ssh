package own.cfb.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
public class AnnotateAdvice {

    @Pointcut(value="execution(* own.cfb.test.domain.BeanTwo.printTwo(..))")
    public void pointCut(){
        System.out.println("基于注解的切点");
    }
    @Before(value="pointCut()")
    public void before(){
        System.out.println("基于注解的前置通知");
    }
    @AfterReturning(value="pointCut()")
    public void afterReturning(){
        System.out.println("基于注解的后置通知");
    }
    @Around(value="pointCut()")
    public Object arround(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("基于注解的环绕前通知");
        Object proceed = pjp.proceed();
        System.out.println("基于注解的环绕后通知");
        return proceed;
    }
    @AfterThrowing(value="pointCut()")
    public void afterException(){
        System.out.println("基于注解的异常拦截通知");
    }
    @After(value="pointCut()")
    public void after(){
        System.out.println("基于注解的后置通知");
    }
}
