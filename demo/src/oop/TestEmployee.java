package oop;

class Employee {
	protected String name;
	protected int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.salary);
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

class Manager extends Employee {
	protected int hraper;

	public Manager(String name, int salary, int hraper) {
		super(name, salary);
		this.hraper = hraper;
	}

	@Override
	public void print() { // Overriding
		super.print();
		System.out.println(this.hraper);
	}

	public int getSalary() {
		return this.salary + this.salary * this.hraper / 100;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Manager("Mr. Abc", 100000, 30); // upcasting
		e = new Employee("Mr.Xyz", 10000);
		if (e instanceof Manager)
		{
		   Manager m = (Manager) e; // Downcasting
		}
	}
}
