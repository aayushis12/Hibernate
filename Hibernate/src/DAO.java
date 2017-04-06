import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

//import net.sf.ehcache.hibernate.HibernateUtil;

public class DAO {

	
	public void addTeacher(Teacher teacher){
		Transaction tx=null;
		Session session=Utility.getSessionFactory().openSession();
		tx=session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public List<Teacher> getTeacher(){
		List<Teacher> Teachers=new ArrayList<Teacher>();
		Transaction tx=null;
		Session session=Utility.getSessionFactory().openSession();
		tx=session.beginTransaction();
		Teachers=session.createQuery("from Teacher").list();
		return Teachers;
		
	}
	
	public void updateTeacher(Teacher teacher){
		Transaction tx=null;
		Session session=Utility.getSessionFactory().openSession();
		tx=session.beginTransaction();
		session.update(teacher);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteTeacher(String name){
		Transaction tx=null;
		Session session=Utility.getSessionFactory().openSession();
		tx=session.beginTransaction();
		Query query=session.createQuery("from Teacher where name= :name");
		query.setParameter("name", name);
		//Teacher teacher=(Teacher)session.get(Teacher.class, name);
		Teacher teacher=(Teacher)query.getSingleResult();
		session.delete(teacher);
		session.getTransaction().commit();
		session.close();
	}
}
