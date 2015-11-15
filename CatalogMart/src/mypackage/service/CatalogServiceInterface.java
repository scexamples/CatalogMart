package mypackage.service;

import java.util.List;

import javax.jws.WebService;

import mypackage.dto.Category;
import mypackage.dto.Product;

// This is the Service Endpoint Interface

@WebService()
public interface CatalogServiceInterface {
	
	// persist the given product
	public void persist(Product entity);

	// delete the given product
	public void delete(Product entity);

	/**
	 * 
	 * @return product name for an PId
	 */
	public String get(int PId);

	/**
	 * 
	 * @return List of all categories in the Catalog
	 */
	public List<Category> getAllCategories();	

	/**
	 * 
	 * @return Total number of products in the Catalog
	 */
	public int getTotalNumOfProducts();

	/**
	 * 
	 * @return number of products with name matching a String pattern
	 */
	public int getByNameLike(String like);

}