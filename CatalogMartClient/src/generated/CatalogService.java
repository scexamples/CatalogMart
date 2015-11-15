
package generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CatalogService", targetNamespace = "http://service.mypackage/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CatalogService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "get", targetNamespace = "http://service.mypackage/", className = "generated.Get")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "http://service.mypackage/", className = "generated.GetResponse")
    @Action(input = "http://service.mypackage/CatalogService/getRequest", output = "http://service.mypackage/CatalogService/getResponse")
    public String get(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://service.mypackage/", className = "generated.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://service.mypackage/", className = "generated.DeleteResponse")
    @Action(input = "http://service.mypackage/CatalogService/deleteRequest", output = "http://service.mypackage/CatalogService/deleteResponse")
    public void delete(
        @WebParam(name = "arg0", targetNamespace = "")
        Product arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getByNameLike", targetNamespace = "http://service.mypackage/", className = "generated.GetByNameLike")
    @ResponseWrapper(localName = "getByNameLikeResponse", targetNamespace = "http://service.mypackage/", className = "generated.GetByNameLikeResponse")
    @Action(input = "http://service.mypackage/CatalogService/getByNameLikeRequest", output = "http://service.mypackage/CatalogService/getByNameLikeResponse")
    public int getByNameLike(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "persist", targetNamespace = "http://service.mypackage/", className = "generated.Persist")
    @ResponseWrapper(localName = "persistResponse", targetNamespace = "http://service.mypackage/", className = "generated.PersistResponse")
    @Action(input = "http://service.mypackage/CatalogService/persistRequest", output = "http://service.mypackage/CatalogService/persistResponse")
    public void persist(
        @WebParam(name = "arg0", targetNamespace = "")
        Product arg0);

    /**
     * 
     * @return
     *     returns java.util.List<generated.Category>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCategories", targetNamespace = "http://service.mypackage/", className = "generated.GetAllCategories")
    @ResponseWrapper(localName = "getAllCategoriesResponse", targetNamespace = "http://service.mypackage/", className = "generated.GetAllCategoriesResponse")
    @Action(input = "http://service.mypackage/CatalogService/getAllCategoriesRequest", output = "http://service.mypackage/CatalogService/getAllCategoriesResponse")
    public List<Category> getAllCategories();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotalNumOfProducts", targetNamespace = "http://service.mypackage/", className = "generated.GetTotalNumOfProducts")
    @ResponseWrapper(localName = "getTotalNumOfProductsResponse", targetNamespace = "http://service.mypackage/", className = "generated.GetTotalNumOfProductsResponse")
    @Action(input = "http://service.mypackage/CatalogService/getTotalNumOfProductsRequest", output = "http://service.mypackage/CatalogService/getTotalNumOfProductsResponse")
    public int getTotalNumOfProducts();

}