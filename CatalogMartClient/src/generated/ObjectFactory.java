
package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTotalNumOfProducts_QNAME = new QName("http://service.mypackage/", "getTotalNumOfProducts");
    private final static QName _GetAllCategories_QNAME = new QName("http://service.mypackage/", "getAllCategories");
    private final static QName _Delete_QNAME = new QName("http://service.mypackage/", "delete");
    private final static QName _GetByNameLike_QNAME = new QName("http://service.mypackage/", "getByNameLike");
    private final static QName _Product_QNAME = new QName("http://service.mypackage/", "product");
    private final static QName _GetResponse_QNAME = new QName("http://service.mypackage/", "getResponse");
    private final static QName _GetTotalNumOfProductsResponse_QNAME = new QName("http://service.mypackage/", "getTotalNumOfProductsResponse");
    private final static QName _Persist_QNAME = new QName("http://service.mypackage/", "persist");
    private final static QName _Category_QNAME = new QName("http://service.mypackage/", "category");
    private final static QName _GetByNameLikeResponse_QNAME = new QName("http://service.mypackage/", "getByNameLikeResponse");
    private final static QName _GetAllCategoriesResponse_QNAME = new QName("http://service.mypackage/", "getAllCategoriesResponse");
    private final static QName _PersistResponse_QNAME = new QName("http://service.mypackage/", "persistResponse");
    private final static QName _Get_QNAME = new QName("http://service.mypackage/", "get");
    private final static QName _DeleteResponse_QNAME = new QName("http://service.mypackage/", "deleteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link GetTotalNumOfProductsResponse }
     * 
     */
    public GetTotalNumOfProductsResponse createGetTotalNumOfProductsResponse() {
        return new GetTotalNumOfProductsResponse();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link GetTotalNumOfProducts }
     * 
     */
    public GetTotalNumOfProducts createGetTotalNumOfProducts() {
        return new GetTotalNumOfProducts();
    }

    /**
     * Create an instance of {@link GetAllCategories }
     * 
     */
    public GetAllCategories createGetAllCategories() {
        return new GetAllCategories();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetByNameLike }
     * 
     */
    public GetByNameLike createGetByNameLike() {
        return new GetByNameLike();
    }

    /**
     * Create an instance of {@link PersistResponse }
     * 
     */
    public PersistResponse createPersistResponse() {
        return new PersistResponse();
    }

    /**
     * Create an instance of {@link GetByNameLikeResponse }
     * 
     */
    public GetByNameLikeResponse createGetByNameLikeResponse() {
        return new GetByNameLikeResponse();
    }

    /**
     * Create an instance of {@link GetAllCategoriesResponse }
     * 
     */
    public GetAllCategoriesResponse createGetAllCategoriesResponse() {
        return new GetAllCategoriesResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link Persist }
     * 
     */
    public Persist createPersist() {
        return new Persist();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalNumOfProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "getTotalNumOfProducts")
    public JAXBElement<GetTotalNumOfProducts> createGetTotalNumOfProducts(GetTotalNumOfProducts value) {
        return new JAXBElement<GetTotalNumOfProducts>(_GetTotalNumOfProducts_QNAME, GetTotalNumOfProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "getAllCategories")
    public JAXBElement<GetAllCategories> createGetAllCategories(GetAllCategories value) {
        return new JAXBElement<GetAllCategories>(_GetAllCategories_QNAME, GetAllCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByNameLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "getByNameLike")
    public JAXBElement<GetByNameLike> createGetByNameLike(GetByNameLike value) {
        return new JAXBElement<GetByNameLike>(_GetByNameLike_QNAME, GetByNameLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalNumOfProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "getTotalNumOfProductsResponse")
    public JAXBElement<GetTotalNumOfProductsResponse> createGetTotalNumOfProductsResponse(GetTotalNumOfProductsResponse value) {
        return new JAXBElement<GetTotalNumOfProductsResponse>(_GetTotalNumOfProductsResponse_QNAME, GetTotalNumOfProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "persist")
    public JAXBElement<Persist> createPersist(Persist value) {
        return new JAXBElement<Persist>(_Persist_QNAME, Persist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByNameLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "getByNameLikeResponse")
    public JAXBElement<GetByNameLikeResponse> createGetByNameLikeResponse(GetByNameLikeResponse value) {
        return new JAXBElement<GetByNameLikeResponse>(_GetByNameLikeResponse_QNAME, GetByNameLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "getAllCategoriesResponse")
    public JAXBElement<GetAllCategoriesResponse> createGetAllCategoriesResponse(GetAllCategoriesResponse value) {
        return new JAXBElement<GetAllCategoriesResponse>(_GetAllCategoriesResponse_QNAME, GetAllCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "persistResponse")
    public JAXBElement<PersistResponse> createPersistResponse(PersistResponse value) {
        return new JAXBElement<PersistResponse>(_PersistResponse_QNAME, PersistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<Get>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mypackage/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

}
