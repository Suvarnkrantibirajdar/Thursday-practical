package hibernateManyToMany;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ManyToManyMain {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("sk");
		
		Employee e2=new Employee();
		e2.setEid(102);
		e2.setEname("Aboli");
		
		Employee e3=new Employee();
		e3.setEid(103);
		e3.setEname("Rash");
		
		Project p1=new Project();
		p1.setPid(201);
		p1.setPname("Library Manegement System");
		
		Project p2=new Project();
		p2.setPid(202);
		p2.setPname("Restorant Management System");
		
		Project p3=new Project();
		p3.setPid(203);
		p3.setPname("School Management System");
		
		List<Project> pl1=new ArrayList<Project>();
		pl1.add(p1);
		pl1.add(p2);
		
		List<Project> pl2=new ArrayList<Project>();
		pl2.add(p2);
		pl2.add(p3);
		
		List<Employee> el1=new ArrayList<Employee>();
		el1.add(e1);
		el1.add(e2);
		el1.add(e3);
		
		List<Employee> el2=new ArrayList<Employee>();
		el1.add(e2);
		el1.add(e3);
		
		e1.setProj(pl1);
		e2.setProj(pl2);
		e3.setProj(pl2);
		
		p1.setEmp(el1);
		p2.setEmp(el2);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(p1);
		s.save(p2);
		s.save(p3);
		s.save(e1);
		s.save(e2);
		s.save(e3);
		
		tx.commit();
		s.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
