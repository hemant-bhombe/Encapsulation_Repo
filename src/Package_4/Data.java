package Package_4;

import java.util.Random;
import java.util.Scanner;

import Package_1.City;
import Package_2.Student;
import Package_3.Employee;

public class Data extends Student
{

	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	Student s4=new Student();
	Student s5=new Student();
	
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	Employee e4=new Employee();
	Employee e5=new Employee();
	
	public void m1()
	{	
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		while(true)
		{	
			System.err.println("Enter 1 for Student 1 & Employee 1 Information");
			System.err.println("Enter 2 for Student 2 & Employee 2 Information");
			System.err.println("Enter 3 for Student 3 & Employee 3 Information");
			System.err.println("Enter 4 for Student 4 & Employee 4 Information");
			System.err.println("Enter 5 for Student 5 & Employee 5 Information");
			System.err.println("Enter 0 for Exit");
			System.out.println("ENter Number");
			int x=sc.nextInt();
			
			 int otp=r.nextInt(444);
			 System.out.println("OTP="+otp);
			 System.out.println("Enter OTP");
			 int ot=sc.nextInt();
	 if(otp==ot)
	 {
		 {
			
		
		 System.out.println("Success!!");
		 }

			
		City c1=new City();
		c1.setName("Pune");
		c1.setAreaname("Karve Nagar");
		
		s1.setId(1);
		s1.setName("1ABC");
		s1.setC(c1);
	
		s2.setId(2);
		s2.setName("2PQR");
		s2.setC(c1);
		
		s3.setId(3);
		s3.setName("3LMN");
		s3.setC(c1);
	
		s4.setId(4);
		s4.setName("4JKL");
		s4.setC(c1);
	
		s5.setId(5);
		s5.setName("5xyz");
		s5.setC(c1);
		
//Employee:
		e1.setId(11);
		e1.setName("E1");
		e1.setC(c1);
		
		e2.setId(22);
		e2.setName("E2");
		e2.setC(c1);
		
		e3.setId(33);
		e3.setName("E3");
		e3.setC(c1);
		
		
		e4.setId(44);
		e4.setName("E4");
		e4.setC(c1);
		
		e5.setId(55);
		e5.setName("E5");
		e5.setC(c1);
		
		if(x==1)
		{
		System.out.println("Student ID: "+s1.getId());
		System.out.println("Student NAme: " +s1.getName());
		System.out.println("Employee ID: "+e1.getId());
		System.out.println("Employee Name: "+e1.getName());
		System.out.println("City AreaNAme: "+c1.getAreaname());
		System.out.println("City NAME: "+c1.getName());
		System.out.println();
		}
		
		else if(x==2)
		{
		System.out.println("Student ID: "+s2.getId());
		System.out.println("Student NAme: " +s2.getName());
		System.out.println("EMployee ID: "+e2.getId());
		System.out.println("Employee Name: "+e2.getName());
		System.out.println("City AreaNAme: "+e3.getC().getAreaname());
		System.out.println("City NAME: "+e3.getC().getName());		
		System.out.println();
		}
		
		else if(x==3)
		{
		System.out.println("Student ID: "+s3.getId());
		System.out.println("Student Name: "+s3.getName());
		System.out.println("Student City Area NAme: "+s3.getC().getAreaname());
		System.out.println("Student City NAme: "+s3.getC().getName());
		System.out.println("Employee ID :"+e3.getId());
		System.out.println("Employee NAme :"+e3.getName());
		System.out.println("Employee City Area NAme: "+e3.getC().getAreaname());
		System.out.println("EMployee City NAme: "+e3.getName());
		System.out.println();
		}
		
		else if(x==4)
		{
		System.out.println("Student ID: "+s4.getId());
		System.out.println("Student Name: "+s4.getName());
		System.out.println("Student City Area NAme: "+s4.getC().getAreaname());
		System.out.println("Student City NAme: "+s4.getC().getName());
		System.out.println("Employee ID :"+e4.getId());
		System.out.println("Employee NAme :"+e4.getName());
		System.out.println("Employee City Area NAme: "+e4.getC().getAreaname());
		System.out.println("EMployee City NAme: "+e4.getName());
		}
		
		else if(x==5)
		{
		System.out.println();
		System.out.println("Student ID: "+s5.getId());
		System.out.println("Student Name: "+s5.getName());
		System.out.println("Student City Area NAme: "+s5.getC().getAreaname());
		System.out.println("Student City NAme: "+s5.getC().getName());
		System.out.println("Employee ID :"+e5.getId());
		System.out.println("Employee NAme :"+e5.getName());
		System.out.println("Employee City Area NAme: "+e5.getC().getAreaname());
		System.out.println("EMployee City NAme: "+e5.getName());
		System.out.println();
		}
		
		else if(x==0)
		{
			System.out.println("Thank you! Visit Again!!");
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid Number");
		
	}
	 }
		else
		 {
			 System.out.println("Invalid OTP!!, Please Enter Correct OTP");
			 
		 }
	
}
}
}

