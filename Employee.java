package in.sts.gradleproject.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class Employee {



	
	private int id;
	private int reportingto;
	private String designation;
	private String firstname;
	private String lastname;
	private Address addressmodel;
	private Salary salarymodel;
	
	private List<String> TLdetail=new ArrayList<>();
	private LinkedHashSet<String> TL=new LinkedHashSet<>();
	private HashMap<String,String> hp=new HashMap<>();
	private HashSet<Employee> employeeHashset=new HashSet<>();
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddressmodel() {
		return addressmodel;
	}
	public void setAddressmodel(Address addressmodel) {
		this.addressmodel = addressmodel;
	}


	public Salary getSalarymodel() {
		return salarymodel;
	}
	public void setSalarymodel(Salary salarymodel) {
		this.salarymodel = salarymodel;
	}

	public int getReportingto() {
		return reportingto;
	}
	public void setReportingto(int reportingto) {
		this.reportingto = reportingto;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public List<String> getTLdetail() {
		return TLdetail;
	}
	public void setTLdetail(List<String> tLdetail) {
		TLdetail = tLdetail;
	}
	public LinkedHashSet<String> getTL() {
		return TL;
	}
	public void setTL(LinkedHashSet<String> tL) {
		TL = tL;
	}
	
	public HashMap<String, String> getHp() {
		return hp;
	}
	public void setHp(HashMap<String, String> hp) {
		this.hp = hp;
	}
	
	
	
	public HashSet<Employee> getEmployeeHashset() {
		return employeeHashset;
	}
	public void setEmployeeHashset(HashSet<Employee> employeeHashset) {
		this.employeeHashset = employeeHashset;
	}
	public Employee() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(designation, firstname, id, lastname, reportingto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(firstname, other.firstname)
				&& id == other.id && Objects.equals(lastname, other.lastname) && reportingto == other.reportingto;
	}
	public Employee(int id, int reportingto, String designation, String firstname, String lastname) {
		super();
		this.id = id;
		this.reportingto = reportingto;
		this.designation = designation;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", reportingto=" + reportingto + ", designation=" + designation + ", firstname="
				+ firstname + ", lastname=" + lastname + ", addressmodel=" + addressmodel + ", salarymodel="
				+ salarymodel + ", TLdetail=" + TLdetail + ", TL=" + TL + ", hp=" + hp + "]";
	}


}
