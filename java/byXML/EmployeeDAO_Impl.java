package byXML;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class EmployeeDAO_Impl implements EmployeeDAO{
	private List<Employee> employeeList = new ArrayList<Employee>();
	
	public void createEmployee(Employee employee) {
		if(!(employeeList.contains(employee))) {
		employeeList.add(employee);
		System.out.println("New Employee Created");
		}
		else {
			System.out.println("Employee already Exists");
		}
	}
	public Employee viewEmployee(int eid) {
		for(Employee e:employeeList) {
			if(eid==e.getEid()) {
				return e;
			}
		}
		System.out.println("Employee Not Found");
		return null;
	}
	
	public void updateEmployee(Employee employee){
		for(Employee e:employeeList) {
			if(employee.getEid()==e.getEid()) {
				e.setEid(employee.getEid());
				e.setEname(employee.getEname());
				e.setEage(employee.getEage());
				e.setDepartment(employee.getDepartment());
				e.setSalary(employee.getSalary());
			}
	}
	}
	
	public void removeEmployee(int eid) {
		for(Employee e:employeeList) {
			if(eid==e.getEid()) {
				employeeList.remove(eid);
				System.out.println("Employee Removed Successfully");
			}
			else {
				System.out.println("Employee No found");
				break;
			}
		}
	}
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeList;
	}
}