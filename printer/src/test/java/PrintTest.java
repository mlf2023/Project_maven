import com.ztt.service.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintTest {
    @Test
    public void printTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Printer printer=applicationContext.getBean(Printer.class);
        printer.print();
    }
}
