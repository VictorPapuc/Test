import com.learn.model.Customer;
import com.learn.service.CustomerService;
import com.learn.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {


        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service);

        CustomerService service2 = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service2);
        System.out.println(service.findAll().get(0).getFirstname());

    }

}