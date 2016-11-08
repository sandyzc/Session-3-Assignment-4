package assignments;

import java.util.Scanner;

public class Student {
	
	String name;
	int id;
	int sub1;
	int sub2;
	int sub3;
	double fees;

	
	public Student(String name, int sub1, int sub2, int sub3, double fees) {
		this.name = name;
		this.id = id;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.fees = fees;
	}

	public void getTotalmarks(){
		
		int Totalmarks= sub1+sub2+sub3;
		System.out.println("Total marks obtained by "+name +" is " +Totalmarks);
	}
	
	public void getAverageMarks(){
		
		int AverageMarks= (sub1+sub2+sub3)/3;
		System.out.println("Average marks obtained by "+name +" is " + AverageMarks);
	}

	public void getResult(){
		if(sub1>=35 && sub2>35 && sub3>=35 && (sub1+sub2+sub3)/3 >= 35){
			System.out.println("The result is pass");
		}
		else{
			System.out.println("The result is Fail");
		}
		
	}
	
	public static void main(String[] args) {
		
		Student st = new Student(null,23,0,0,2500.00);
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the name of STUDENT 1");
		st.name =sr.next();
		System.out.println("enter sub 1 marks out of 100");
		st.sub1= sr.nextInt();
		System.out.println("enter sub 2 marks out of 100");
		st.sub2= sr.nextInt();
		System.out.println("enter sub 3 marks out of 100");
		st.sub3= sr.nextInt();
		System.out.println("The student id is " + st.id);
		System.out.println("The student name is " + st.name);
		System.out.println("Fees paid is "+ st.fees);
		st.getTotalmarks();
		st.getAverageMarks();
		st.getResult();
		
		System.out.println("***************************************");
		
		Student st1 = new Student(null,24,0,0,2500.00);
		System.out.println("Enter the name of STUDENT 2");
		st.name =sr.next();
		System.out.println("enter sub 1 marks out of 100");
		st.sub1= sr.nextInt();
		System.out.println("enter sub 2 marks out of 100");
		st.sub2= sr.nextInt();
		System.out.println("enter sub 3 marks out of 100");
		st.sub3= sr.nextInt();
		System.out.println("The student id is " + st.id);
		System.out.println("The student name is " + st.name);
		System.out.println("Fees paid is "+ st.fees);
		st.getTotalmarks();
		st.getAverageMarks();
		st.getResult();
		
System.out.println("***************************************");
		
		Student st2 = new Student(null,25,0,0,2500.00);
		System.out.println("Enter the name of STUDENT 3");
		st.name =sr.next();
		System.out.println("enter sub 1 marks out of 100");
		st.sub1= sr.nextInt();
		
		System.out.println("enter sub 2 marks out of 100");
		st.sub2= sr.nextInt();
		System.out.println("enter sub 3 marks out of 100");
		st.sub3= sr.nextInt();
		System.out.println("The student id is " + st.id);
		System.out.println("The student name is " + st.name);
		System.out.println("Fees paid is "+ st.fees);
		st.getTotalmarks();
		st.getAverageMarks();
		st.getResult();


	}
	

}
