package mypack;

import generated.CatalogService;
import generated.CatalogServiceService;

public class CMClient {

	public CMClient() {
		
	}

	// tests CatalogService web service by calling one method
	public static void main(String[] args) {
		CatalogServiceService cssrvc = new CatalogServiceService();
		CatalogService csrvc = cssrvc.getCatalogServicePort();
		try{
			System.out.println(csrvc.getTotalNumOfProducts()); 
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
