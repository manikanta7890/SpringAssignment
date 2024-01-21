package beans;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.concentrix.spring_transaction_demo.config.BeanConfig;
import com.concentrix.spring_transaction_demo.model.Employee;
import com.concentrix.spring_transaction_demo.service.EmpService;

public class ConfigBeans 
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context =
        		new AnnotationConfigApplicationContext(BeanConfig.class);
    	context.registerShutdownHook();
        
        EmpService service = context.getBean(EmpService.class);
        
        Employee emp = new Employee(100,"Siva",26, "Software Engineer",26352);
        Employee em = new Employee(101,"Deva",30,"HR",37457);
        Employee emp1 = new Employee(102,"Rahul",32,"Trainer",36453);
        service.save(emp);
        service.update();
        service.delete(101);
        try {
          service.save(emp);
        }catch(Exception e) {
 	      	System.out.println(e.getMessage());
        }
        context.close();
        
    }
}
