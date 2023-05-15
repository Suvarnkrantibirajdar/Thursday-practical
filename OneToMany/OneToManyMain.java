package oneTomany;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMain {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Project p1=new Project();
		p1.setPid(101);
		p1.setPname("ABC");
		
		
		Employee e1=new Employee();
		e1.setEid(201);
		e1.setEname("sk");
		e1.setProj(p1);
		
		Employee e2=new Employee();
		e2.setEid(202);
		e2.setEname("pk");
		e2.setProj(p1);
		
		Employee e3=new Employee();
		e3.setEid(203);
		e3.setEname("rj");
		e3.setProj(p1);
		
		List<Employee > li=new ArrayList<Employee>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		
		p1.setEmp(li);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(p1);
		s.save(e1);
		s.save(e2);
		s.save(e3);
		
		tx.commit();
		s.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
