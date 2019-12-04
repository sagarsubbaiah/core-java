import java.util.Date;

public class Employee {
	private long id;
	private String name;
	private String gender;
	private Date dob;
	private boolean fte;
	private String department;
	private long salary;
	
	public Employee(long id, String name, String gender, Date dob, boolean fte, String department, long salary) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.dob=dob;
		this.fte=fte;
		this.department=department;
		this.salary=salary;
	}
	
	public void setId(long id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setDob(Date dob) {
		this.dob=dob;
	}
	public void setFte(boolean fte) {
		this.fte=fte;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public void setSalary(long salary) {
		this.salary=salary;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public Date getDate() {
		return dob;
	}
	public boolean getFte() {
		return fte;
	}
	public String getDepartment() {
		return department;
	}
	public long getSalary() {
		return salary;
	}

}
