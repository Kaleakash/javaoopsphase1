package bean;

public class Employee {
private int id;
private String name;
private float salary;


public int getId() {
	return id;
}
/*
@Override
public boolean equals(Object obj) {
	Employee emp = (Employee)obj;
	if(this.salary==emp.salary && this.name.equals(emp.name) && this.id ==emp.id) {
		return true;
	}else {
		return false;
	}
}
*/

@Override
public int hashCode() {
	float flag = 100;
	flag = flag +id+name.hashCode()+salary;
	return (int)flag;
}



public void setId(int id) {
	this.id = id;
}

/*
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + Float.floatToIntBits(salary);				//Unique HashCode 
	return result;
}
*/

@Override
public boolean equals(Object obj) {
	if (this == obj)					
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
		return false;
	return true;
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
	if(salary<0) {
		this.salary = 8000;
	}else {
	this.salary = salary;
	}
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
