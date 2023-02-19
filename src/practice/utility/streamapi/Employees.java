package practice.utility.streamapi;

public class Employees implements Comparable<Employees> {
	int EmpId;
	String EmpName;
	String EmpCity;
	String EmpCountry;
	Double EmpSalary;
	String EmpDepratmentName;

	public Employees(int empId, String empName, String empCity, String empCountry, Double empSalary,
			String empDepratmentName) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpCity = empCity;
		EmpCountry = empCountry;
		EmpSalary = empSalary;
		EmpDepratmentName = empDepratmentName;
	}

	@Override
	public String toString() {
		return "Employees [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpCity=" + EmpCity + ", EmpCountry="
				+ EmpCountry + ", EmpSalary=" + EmpSalary + ", EmpDepratmentName=" + EmpDepratmentName + "]";
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpCity() {
		return EmpCity;
	}

	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}

	public String getEmpCountry() {
		return EmpCountry;
	}

	public void setEmpCountry(String empCountry) {
		EmpCountry = empCountry;
	}

	public Double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(Double empSalary) {
		EmpSalary = empSalary;
	}

	public String getEmpDepratmentName() {
		return EmpDepratmentName;
	}

	public void setEmpDepratmentName(String empDepratmentName) {
		EmpDepratmentName = empDepratmentName;
	}

	@Override
	public int compareTo(Employees o) {
		return this.getEmpName().compareTo(o.getEmpName());
	}

}
