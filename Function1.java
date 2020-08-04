package functionalInterfaces;

import java.util.*;

@FunctionalInterface
interface DisplayLocation{
			public String loc(Employee e);
}


class Employee{
	int id;
	String name;
	String location;
	double salary;
	
	Employee(int id,String n,String loc,double s){
		this.id=id;
		this.name=n;
		this.location=loc;
		this.salary=s;
	}
}

public class Function1 {

	public static void main(String[] args) {
				Employee e1 = new Employee(1,"abhi","patna",20000);
				Employee e2 = new Employee(2,"ahi","hhalli",100000);
				Employee e3 = new Employee(3,"anil","bidar",25000);
				Employee e4 = new Employee(4,"appu","patna",200000);
				Employee e5 = new Employee(5,"arun","dvg",30000);
				
				List<Employee> al = new ArrayList<Employee>(); 
				List<String> s = new ArrayList<String>();
				al.add(e1);
				al.add(e2);
				al.add(e3);
				al.add(e4);
				al.add(e5);
				
				DisplayLocation dc = (Employee e) -> e.location;
				
				
				s.add(dc.loc(e1));
				s.add(dc.loc(e2));
				s.add(dc.loc(e3));
				s.add(dc.loc(e4));
				s.add(dc.loc(e5));
				
				s.forEach(i->System.out.println(i));
	}

}
