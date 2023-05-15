package hibernateOneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Employee {

	@Id
	@Column(name="Employee_Id")
	private int eid;
	@Column(name="Employee_Name")
	private String ename;
	@OneToOne
	private Department dpm;
	
	// getter and setter.
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDpm() {
		return dpm;
	}
	public void setDpm(Department dpm) {
		this.dpm = dpm;
	}
	
	
}
