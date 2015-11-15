package mypackage.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Product {
	
	@Id
	private int PId;
	private String ProdName;
	private String ProdDesc;
	
	@ManyToOne
	@JoinColumn(name="CatId")
	@XmlElement
	private Category cat;
	
	// Provided no-args constructor for Hibernate
	public Product() {
		
	}
	
	public Product(int pId, String prodName, String prodDesc, Category cat) {
		PId = pId;
		ProdName = prodName;
		ProdDesc = prodDesc;
		this.cat = cat;
	}

	public int getPId() {
		return PId;
	}

	public void setPId(int pId) {
		PId = pId;
	}

	public String getProdName() {
		return ProdName;
	}

	public void setProdName(String prodName) {
		ProdName = prodName;
	}

	public String getProdDesc() {
		return ProdDesc;
	}

	public void setProdDesc(String prodDesc) {
		ProdDesc = prodDesc;
	}
	
	public Category getCategory() {
		return cat;
	}

	public void setCategory(Category category) {
		cat = category;
	}
	
}
