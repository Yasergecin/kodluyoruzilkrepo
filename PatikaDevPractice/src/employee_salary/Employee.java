package employee_salary;

public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	public int tax() {
		if(this.salary<1000) {
			return 0;
		}
		else {
			return salary*3/100;
		}
	}
	
	public int raiseSalary() {
		if(2021-this.hireYear<10) {
			return this.salary/20;
		}
		if(2021-this.hireYear>9 && 2021-this.hireYear<20 || 2021-this.hireYear==10) {
			return this.salary/10;
		}
		if(2021-this.hireYear>19) {
			return this.salary*15/100;
		}
		return 0;
	}
	
	public void tostring() {
		System.out.println("Ad�: "+this.name+"\nMaa��: "+this.salary+
				"\n�al��ma Saati: "+this.workHours+"\nBa�lang�� Y�l�: "+this.hireYear);
		System.out.println("Vergi : "+tax());
		System.out.println("Bonus: "+bonus());
		System.out.println("Maa� Art���: "+raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maa� : "
		+(bonus()+this.salary-tax()));
		System.out.println("Toplam Maa� : "+(this.salary+raiseSalary()+bonus()));
	}
	
	public double bonus() {
		if(this.workHours>40) {
			return (this.workHours-40)*30;
		}else {
			return 0;
		}
	}

}
