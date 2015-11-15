package mypackage.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Category {
	
	@Id
	private String CatId;
	private String CatName;
	
	// Provided no-args constructor for Hibernate
	public Category() {
		
	}
	
	public String getCatId() {
		return CatId;
	}

	public void setCatId(String catId) {
		CatId = catId;
	}

	public String getCatName() {
		return CatName;
	}

	public void setCatName(String catName) {
		CatName = catName;
	}
	
}
