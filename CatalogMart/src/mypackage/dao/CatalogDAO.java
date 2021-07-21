package mypackage.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import mypackage.dto.Product;

/** 
 * This DAO class contains all basic CRUD methods to interact with the database
 * This class has a static method that returns a sessionFactory configured based on
 * hibernate.cfg.xml.
 * It has two member variables: a currentSession and a currentTransaction
 * A currentSession is created by calling the getSessionFactory method
 * Every method that interacts with the database does so by calling methods on the currentSession
 * obtained from getSessionFactory().
 * openCurrentSession() and closeCurrentSession() methods are used for read-type CRUD operations  
 * 
 * openCurrentSessionwithTransaction() opens a session and then opens a transaction 
 * and closeCurrentSessionwithTransaction() commits the transaction before closing the Session
 *
 */
public class CatalogDAO {

	private Session currentSession;
	private Transaction currentTransaction;

	public CatalogDAO() {

	}

	// static method that provides a SessionFactory which creates Sessions
	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		return factory;
	}
	
	// gets a new session
	public Session getCurrentSession() {
		return currentSession;
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	// gets a new session and opens a new transaction
	public Session openSessionWithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	// commits transaction and then closes session
	public void closeCurrentSessionWithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	// add product to database
	public void persist(Product entity) {
		// TODO: logic to validate existence of product
		currentSession.persist(entity);
	}

	// update product in database
	public void update(Product entity) {
		// TODO: Validate existence of product
		currentSession.update(entity);
	}

	// delete product from database
	public void delete(Product entity) {
		// TODO: logic to validate existence of product
		currentSession.delete(entity);
	}
	
	// find product based on PId
	public String findById(int PId){
		Product prdt = (Product) getCurrentSession().get(Product.class, PId);
		
		if(prdt != null){
			return prdt.getProdName();
		} 
		
		return "Product not found.";
		
	}

}
