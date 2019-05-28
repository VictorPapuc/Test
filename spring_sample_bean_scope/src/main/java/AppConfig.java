import com.learn.repository.CustomerRepository;
import com.learn.repository.HibernateCustomerRepositoryImpl;
import com.learn.service.CustomerService;
import com.learn.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.learn"})
public class AppConfig {

    @Bean("customerService")
    public CustomerService getCustomerService() {

        //constructor Injection
        //  CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
        CustomerServiceImpl service = new CustomerServiceImpl();
        //Setter injection
        //  service.setCustomerRepository(getCustomerRepository());
        return service;
    }


//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
}
