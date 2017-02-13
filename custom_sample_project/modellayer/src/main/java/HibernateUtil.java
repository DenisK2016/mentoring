
import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	static {
		Configuration cfg = new Configuration().configure();
		// StandardServiceRegistryBuilder builder = new
		// StandardServiceRegistryBuilder()
		// .applySettings(cfg.getProperties());
		// sessionFactory = cfg.buildSessionFactory(builder.build());
		sessionFactory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
}
