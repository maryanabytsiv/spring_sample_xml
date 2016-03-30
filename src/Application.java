import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ss.service.CustomreService;

public class Application {

	public static void main(String[] args) {
		//CustomreService service = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomreService service = appContext.getBean("customerService", CustomreService.class);
		System.out.println(service);
		
		CustomreService service2 = appContext.getBean("customerService", CustomreService.class);
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
