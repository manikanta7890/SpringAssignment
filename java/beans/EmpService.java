package beans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



@Service
public class EmpService {

	@Autowired
	private EmpRepository repo;
	
	@Transactional//(propagation = Propagation.REQUIRED)
	public void save(Employee emp) {
		try {
		for(int i=0; i<5; i++) {
			repo.save(emp);
			int eid = new Random().nextInt(10);
			emp.setEid(eid);
		}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void upd() {
		repo.upd();
	}
	public void del(int eid) {
		repo.del(eid);
	}
}

