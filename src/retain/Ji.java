package retain;

public class Ji implements Comparable<Ji>{
	
	private String name;
	private int id;
	private double salary;
	public Ji() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ji [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	public Ji(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(Ji o) {
		
		return this.name.compareTo(o.name);
	}
	


	
	
	
	
	
	
	
}
