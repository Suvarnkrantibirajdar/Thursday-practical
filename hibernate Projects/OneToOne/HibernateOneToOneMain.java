package hibernateOneToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOneToOneMain {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Department d1=new Department();
		d1.setDid(101);
		d1.setDname("HR");
		
		Department d2=new Department();
		d2.setDid(102);
		d2.setDname("Finance");
		
		Employee e1=new Employee();
		e1.setEid(201);
		e1.setEname("Kranti");
		e1.setDpm(d2);
		
		Employee e2=new Employee();
		e2.setEid(202);
		e2.setEname("Joshma");
		e2.setDpm(d1);
		
		Employee e3=new Employee();
		e3.setEid(203);
		e3.setEname("Mueez");
		e3.setDpm(d2);
	
		
		Session s=factory.openSession();
		
		Transaction tx=s.beginTransaction();
		
		s.save(d1);
		s.save(d2);
		s.save(e1);
		s.save(e2);
		s.save(e3);
		
		tx.commit();
		
		s.close();
		factory.close();

	}

}
