package mypackage;

import mypackage.service.CatalogService;
import mypackage.service.CatalogServiceInterface;

public class CatalogDriver {

	public CatalogDriver() {
		
	}

	public static void main(String[] args) {

		CatalogServiceInterface catServ = new CatalogService();
		
		System.out.println(catServ.get(100));
		
	/*	CatalogServiceInterface catServ = new CatalogService();
	    System.out.println(catServ.getAllProducts().size());
		List<Product> productList = catServ.getAllProducts();
		for(Product p : productList){
			System.out.println("pName: " + p.getProdName() + " ,pDesc: " + p.getProdDesc());
		}
		
		List<Product> productFromCat = catServ.getProductsFromCategory("MOV");
		for(Product p : productFromCat){
			System.out.println("pName: " + p.getProdName() + " ,pDesc: " + p.getProdDesc());
		}
		
		Category cat1 = new Category();
		cat1.setCatId("BKS");
		
		Product entity = new Product(8,"HTML", "HTML book", cat1);
		catServ.persist(entity);
		*/
	}

}
