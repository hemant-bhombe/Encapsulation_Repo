package Package_2;

import Package_1.City;
import Package_3.Employee1;

public class Student1 extends Employee1{
	int id;
	String name;
	City c;
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected City getC() {
		return c;
	}
	protected void setC(City c) {
		this.c = c;
	}
}
