package AspectJ注解;

//增强类

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //在增强类上面加注解，生成代理对象
public class UserProxy  {
    //前置通知：
    @Before(value="execution(* AspectJ注解.User.add(..))") // 作前置通知
public void before(){
    System.out.println("before......");
}

}

