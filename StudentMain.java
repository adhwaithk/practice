import java.util.*;
import java.io.*;
class Student{
	private int id;
	private String name;
	private Integer[] marks;
	public float average;
	private char grade;
	public Student(int id, String name, Integer[] marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public Integer[] setMarks(Integer[] marks) {
		return this.marks=getMarks();
		
	}
	public Integer[] getMarks() {
		return marks;
	}
	public void setAverage(float average) {
		this.average=average;
	}
	public float getAverage() {
		return average;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
	public char getGrade() {
		return grade;
	}
	public void calculateAvg() {
		StudentMain sm=new StudentMain();
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		float avg=sum/sm.n;	
		setAverage(avg);
		}
	public void findGrade() {
		float avg=getAverage();
		if(avg>+80 && avg<=100) {
			setGrade('O');
		}
		else if(avg>=50 && avg<80) {
			setGrade('A');
		}
		else {
			setGrade('F');
		}
	}
}

public class StudentMain {
			static Scanner sc=new Scanner(System.in);
			static int n;
			static List<Integer>al=new ArrayList<Integer>();
			public static Student getStudentDetails() {
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter the no of subjects");
				n=sc.nextInt();
				if(n<=0) {
					System.out.println("invalid number of subjects");
					System.out.println("enter the number of subjects");
					n=sc.nextInt();
				}
				for(int i=0;i<n;i++) {
					int t=i+1;
					System.out.println("enter mark for subject" +t);
					int m=sc.nextInt();
					al.add(m);
				}
				Integer[] marks =new Integer[al.size()];
				for(int i=0;i<al.size();i++) {
					marks[i]=al.get(i);
				}
				Student s=new Student(id,name,marks);
				return s;
			}
			
			

	public static void main(String[] args) {
		Student s2 =getStudentDetails();
		System.out.println("id:" + s2.getId());
		System.out.println("name:" +s2.getName());
		s2.calculateAvg();
		System.out.println("Average:" +s2.getAverage());
		s2.findGrade();
		System.out.println("grade:" +s2.getGrade() );
		
		

	}

}