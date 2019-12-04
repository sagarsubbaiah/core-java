import java.util.Date;

public class Employee {
	private int employeeId;
    private String employeeName;
    private String gender;
    private Date dateOfbirth;
    private boolean employee;
    private String department;
    private int salary;

    

    public Employee(int employeeId, String employeeName, String gender, Date dateOfbirth, boolean employee,
            String department, int salary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.dateOfbirth = dateOfbirth;
        this.employee = employee;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
