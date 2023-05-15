package hibernateOneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Department {

	@Id
	@Column(name="Department_Id")
	private int did;
	@Column(name="Department_Name")
	private String dname;
	
	// getter and setter.
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
	
	
}
