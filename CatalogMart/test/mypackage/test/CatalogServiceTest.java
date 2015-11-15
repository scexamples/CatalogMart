/**
 * 
 */
package mypackage.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mypackage.service.CatalogService;

/**
 * @author sudha
 *
 */
public class CatalogServiceTest {

	// instantiate a new CatalogService for use in this test
	CatalogService catSrvc = new CatalogService();
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link mypackage.service.CatalogService#get(int)}.
	 */
	@Test
	public final void testGet() {
		assertEquals(catSrvc.get(1), "Java");
		assertEquals(catSrvc.get(100), "Product not found.");
		
	}

	/**
	 * Test method for {@link mypackage.service.CatalogService#getAllCategories()}.
	 */
	@Test
	public final void testGetAllCategories() {
		assertEquals(catSrvc.getAllCategories().size(), 3);
	}

	/**
	 * Test method for {@link mypackage.service.CatalogService#getTotalNumOfProducts()}.
	 */
	@Test
	public final void testGetTotalNumOfProducts() {
		assertEquals(catSrvc.getTotalNumOfProducts(), 8);
	}

	/**
	 * Test method for {@link mypackage.service.CatalogService#getByNameLike(java.lang.String)}.
	 */
	@Test
	public final void testGetByNameLike() {
		assertEquals(catSrvc.getByNameLike("Java"), 2);
	}

}
