package byXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;
public class EmployeeConfig {
	public static void main(String[] args) {
		EmployeeDAO_Impl ei = new EmployeeDAO_Impl();
		ApplicationContext con = new FileSystemXmlApplicationContext("Employee.xml");
		EmployeeDAO_Impl emp= con.getBean("employeeDAO_Impl",EmployeeDAO_Impl.class);
		Employee employee=new Employee(1,"Akshay",21,"developer",20000);
 	   ei.createEmployee(employee);
 	   employee=new Employee(2,"Prathyusha",30,"trainer",55032);
 	   ei.createEmployee(employee);
 	   //retrieve employee
 	   Employee getEmployee=ei.viewEmployee(2);
 	   System.out.println(getEmployee);
 	   //update employee
 	   Employee updatedEmployee=new Employee(3,"praveen",35,"manager",60023);
 	   ei.updateEmployee(updatedEmployee);
 	   //delete employee
 	   ei.removeEmployee(2);
 	   //list of employees
 	   List<Employee> list=ei.getEmployeeList();
 	   System.out.println("list of employees:");
 	   for(Employee e:list) {
 		   System.out.println(e);
 	   }
}
}
