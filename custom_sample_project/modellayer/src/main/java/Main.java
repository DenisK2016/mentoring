import org.hibernate.Session;

public class Main {

	

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();

			

			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.shutdown();

		}

	}

}