package byConfig;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
public class Config {
	public static void main(String[] args) {
		EmployeeDAO_Impl es=new EmployeeDAO_Impl();
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeDAO_Impl employeeDAO=context.getBean(EmployeeDAO_Impl.class);
		Employee employee=new Employee(1,"Akshay",21,"developer",20000);
 	   es.createEmployee(employee);
 	   employee=new Employee(2,"Prathyusha",30,"trainer",55032);
 	   es.createEmployee(employee);
 	   //retrieve employee
 	   Employee getEmployee=es.viewEmployee(2);
 	   System.out.println(getEmployee);
 	   //update employee
 	   Employee updatedEmployee=new Employee(3,"praveen",35,"manager",60023);
 	   es.updateEmployee(updatedEmployee);
 	   //delete employee
 	   es.removeEmployee(2);
 	   //list of employees
 	   List<Employee> list=es.getEmployeeList();
 	   System.out.println("list of employees:");
 	   for(Employee e:list) {
 		   System.out.println(e);
 	   }
}
}
