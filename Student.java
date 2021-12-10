package ReferenceExample;

public class Student {
	String name;
	int rollNo;
	Department dept;
	
	public Student(String name, int rollNo, int deptid, String deptName, int subsOffered){
		this.name=name;
		this.rollNo=rollNo;
		dept = new Department(deptid,deptName,subsOffered);
		
	}

}


  class MainClass{
	  public static void main(String args[]) {
		  Department d1=new Department(1,"xyz", 10);
		  Student s1=new Student("abc", 1000, d1.id,d1.name,d1.subjectsOffered);
		  d1.setSubjectsOffered(11);
		  
		  
		  System.out.println("No of subjects offered by dept1 "+s1.dept.subjectsOffered);
	  }
  }
