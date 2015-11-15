package mypackage.service;

import java.util.List;

import javax.jws.WebService;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import mypackage.dao.CatalogDAO;
import mypackage.dto.Category;
import mypackage.dto.Product;

/** 
 * CatalogService is the service which makes use of CatalogDAO to interact with the database. 
 * CatalogDAO is a static field initialized in the service constructor. 
 * When a new service instance is created, a new DAO instance is also created.
 * In each service method, CatalogDAO is used to open/close a session or a session with transaction, 
 * and to perform CRUD operations. 
 * 
 * 
 * @author sudha
 *
 */

@WebService() // can customize name, target namespace etc parameters
public class CatalogService implements CatalogServiceInterface{
	
	private CatalogDAO catalogDAO;
	
	public CatalogService() {
		catalogDAO = new CatalogDAO();
	}
	
	/* (non-Javadoc)
	 * @see mypackage.service.CatalogServiceInterface#persist(mypackage.dto.Product)
	 */
	@Override
	public void persist(Product entity){
		catalogDAO.openSessionWithTransaction();
		catalogDAO.persist(entity);
		catalogDAO.closeCurrentSessionWithTransaction();
	}
	
	/* (non-Javadoc)
	 * @see mypackage.service.CatalogServiceInterface#delete(mypackage.dto.Product)
	 */
	@Override
	public void delete(Product entity){
		catalogDAO.openSessionWithTransaction();
		catalogDAO.delete(entity);
		catalogDAO.closeCurrentSessionWithTransaction();
	}
	
	public String get(int PId){
		catalogDAO.openCurrentSession();
		String name = catalogDAO.findById(PId);
		catalogDAO.closeCurrentSession();
		return name;
	}
	
	/* (non-Javadoc)
	 * @see mypackage.service.CatalogServiceInterface#getAllCategories()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Category> getAllCategories(){
		Criteria crit = catalogDAO.openCurrentSession().createCriteria(Category.class);
		List<Category> categories = (List<Category>) crit.list(); 
		catalogDAO.closeCurrentSession();
		return categories; 
	}
	
	/* (non-Javadoc)
	 * @see mypackage.service.CatalogServiceInterface#getAllProducts()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public int getTotalNumOfProducts(){
		Criteria crit = catalogDAO.openCurrentSession().createCriteria(Product.class);
		List<Product> products = (List<Product>) crit.list();
		catalogDAO.closeCurrentSession();
		return products.size();
	}
	
	/* (non-Javadoc)
	 * @see mypackage.service.CatalogServiceInterface#getProductsFromCategory(java.lang.String)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public int getByNameLike(String nameLike){
		String match = nameLike + "%";
		Criteria crit = catalogDAO.openCurrentSession().createCriteria(Product.class)
																.add(Restrictions.like("ProdName", match));
		List<Product> products = (List<Product>) crit.list();
		catalogDAO.closeCurrentSession();
		return products.size();
	}
		
}

