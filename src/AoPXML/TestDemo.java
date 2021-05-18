package AoPXML;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void TestAspect() {
        ApplicationContext context = new ClassPathXmlApplicationContext("AoPXML/bean.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

}
