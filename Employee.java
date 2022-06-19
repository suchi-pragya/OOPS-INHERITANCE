// public class Employee extends  Person {
//     private double annual_salary;
//     private int emp_yr;
//     private String insurance_no;
     
//     public Employee(String n ,double a,int y , String i){
//         super(n);
//          this.annual_salary = a;
//          this.emp_yr =y;
//        this. insurance_no = i;
//     }
//     public void setSalary(double a){
//         annual_salary =a;
    
//     }
//     public void setYear (int y){
//         emp_yr = y;

//     }
//     public void setInsurance_no(String i){
//         insurance_no = i;
//     }
//     public double getSalary(){
//         return annual_salary;

//     }
//     public int getYear(){
//         return emp_yr;
//     }
//     public String getInsurance(){
//         return insurance_no;
//     }
   
//     public String toString(){
//         return super.toString()+ ""+"annual_salry"+"emp_yr"+"insurance_no";
//     }


    
// }
public class Employee extends Person {
	private double annualSalary;
	private int yearOfJoining;
	private String InsuranceNo;
	
	public Employee(String name, double annualSalary, int yearOfJoining, String InsuranceNo) {
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;
		this.InsuranceNo = InsuranceNo;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public String getInsuranceNo() {
		return InsuranceNo;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", yearOfJoining=" + yearOfJoining + ", InsuranceNo="
				+ InsuranceNo + ", name=" + name + "]";
	}
	
	
}
