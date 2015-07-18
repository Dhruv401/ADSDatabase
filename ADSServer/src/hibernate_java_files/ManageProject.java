package hibernate_java_files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageProject {
	
	private static SessionFactory sessionFactory;
	
	
	
	public static void main(String args[])
	{
		try{
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}catch(Exception e)
			{
				System.out.println("Failed to create sssion factory object : "+e);
			}
		
		ManageProject mp = new ManageProject();
		
		mp.addProject("xyz", "s1", "sbk", 12008);
		
	}
	
	
	public String addProject(String pROJECT_NAME, String pROJECT_TYPE, String pROJECT_DETAILS, int oRG_ID)
	{
		
		
		Session session = sessionFactory.openSession();
		
		Transaction tx;
		
		int PROJECT_ID;
		
		try{
			
			tx = session.beginTransaction();
			
			
			PROJECT p = new PROJECT(pROJECT_NAME, pROJECT_TYPE, pROJECT_DETAILS, oRG_ID);
			
			PROJECT_ID = (int) session.save(p);
			
			System.out.println("Id :"+PROJECT_ID);
			
			tx.commit();
			
			session.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error while adding Organization row: "+e);
		}
		
		return null;
	}

}
