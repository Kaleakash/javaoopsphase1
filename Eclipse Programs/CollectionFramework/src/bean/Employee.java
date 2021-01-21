package bean;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;

@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return id-o.id;			// Asc Order Id wise 0 means equals, first > second +ve, first < second -ve 
		//return o.id-id;
		return name.compareTo(o.name);
	}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
