package AspectJ注解;


import org.springframework.stereotype.Component;

@Component
public class User {

    public void add(){
        System.out.println("add,,,,,,,");
    }
}
