import com.learn.model.Customer;
import com.learn.repository.CustomerRepository;
import com.learn.service.CustomerService;
import com.learn.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);


        System.out.println(service.findAll().get(0).getFirstname());


    }

}