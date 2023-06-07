import com.ztt.controller.DogController;
import com.ztt.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring_demo2 {
    @Test
    public void dogTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo2.xml");
        Dog d = (Dog) applicationContext.getBean("dog");
        d.eat();

    }
    @Test
    public void AutoTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("demo2.xml");
        DogController controller=applicationContext.getBean(DogController.class);
        controller.getDog();
    }
}
