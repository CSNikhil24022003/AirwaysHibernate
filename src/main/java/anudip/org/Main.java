package anudip.org;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Main {
	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();        
        SessionFactory factory=md.getSessionFactoryBuilder().build();         
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();        
        AirWays a=new AirWays();
        a.setPlaneName("Air India");        
        AirWays a1=new AirWays();
        a1.setPlaneName("IndiGo");        
        Passenger p=new Passenger();
        p.setPname("Vamsi");        
        Passenger p1=new Passenger();
        p1.setPname("Krishna");        
        a.getPassenger().add(p);
        a.getPassenger().add(p1);
        a1.getPassenger().add(p);        
        session.save(a);
        session.save(a1);
        session.save(p);
        session.save(p1);
        t.commit();        
        factory.close();
        session.close();
	}						
}