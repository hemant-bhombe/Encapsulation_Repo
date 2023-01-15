package Package_5;



import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.DocAttribute;

import Package_1.City;
import Package_2.Student1;
import Package_3.Employee1;
import Package_4.Data1;

public class Test1 extends Data1{
	
	public static void main(String[] args) {
		
		Data1 d=new Data1();
		d.studentdata();
		List<Test1> list=d.studentdata();
		for(Test1 dd : list)
		{
		System.out.println("Student ID: "+dd.getId());
		System.out.println("Student Name: "+dd.getName());
		System.out.println("Student City Name: "+dd.getC().getName());
		System.out.println("Student AreaName: "+dd.getC().getAreaname());
		System.out.println();
		}
		
		 
		List<Test1> list1=d.employeedata();
		d.employeedata();
		for(Test1 em : list1)
		{
			System.out.println("Employee ID: " +em.getEid());
			System.out.println("Employee Name: " +em.getEname());
			System.out.println("Employee City Name: " +em.getC().getName());
			System.out.println("Employee AreaName: " +em.getC().getAreaname());
			System.out.println();
		}
	}
}