package retain;

public class Empget {
	
	private double salary;
	private int rollno;
	@Override
	public String toString() {
		return "Empget [salary=" + salary + ", rollno=" + rollno + "]";
	}
	public Empget(double salary, int rollno) {
		super();
		this.salary = salary;
		this.rollno = rollno;
	}
	public Empget() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	

}
