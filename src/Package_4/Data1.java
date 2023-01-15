package Package_4;

import java.util.ArrayList;
import java.util.List;

import Package_1.City;

import Package_2.Student1;
import Package_3.Employee1;
import Package_5.Test;
import Package_5.Test1;

public class Data1 extends Student1
{
	public List<Test1> studentdata()
	{
	List<Test1> list=new ArrayList<>();
		
	City c1=new City();
	c1.setName("Pune");
	c1.setAreaname("Karve Nagar");
	
		Test1 s1=new Test1();
		s1.setId(100);
		s1.setName("Student1");
		s1.setC(c1);

		Test1 s2=new Test1();
		s2.setId(200);
		s2.setName("Student2");
		s2.setC(c1);
			
		Test1 s3=new Test1();
		s3.setId(3);
		s3.setName("Student3");
		s3.setC(c1);
		
		Test1 s4=new Test1();
		s4.setId(4);
		s4.setName("Student4");
		s4.setC(c1);
		
		Test1 s5=new Test1();
		s5.setId(5);
		s5.setName("Student5");
		s5.setC(c1);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		return list;
	}
//Employee:
		public List<Test1> employeedata()
		{
		List<Test1> list=new ArrayList<>();
			{
				City c2=new City();
				c2.setName("Pune1");
				c2.setAreaname("Akurdi");
	
		Test1 e1=new Test1();
		e1.setEid(11);
		e1.setEname("Employee1");
		e1.setC(c2);
		
		Test1 e2=new Test1();
		e2.setEid(12);
		e2.setEname("Employee1");
		e2.setC(c2);
		
		Test1 e3=new Test1();
		e3.setEid(13);
		e3.setEname("Employee1");
		e3.setC(c2);
		
		Test1 e4=new Test1();
		e4.setEid(14);
		e4.setEname("Employee1");
		e4.setC(c2);

		Test1 e5=new Test1();
		e5.setEid(188);
		e5.setEname("Employee1");
		e5.setC(c2);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		return list;
	}
		}
}
