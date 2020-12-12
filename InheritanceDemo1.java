//Single Inheritance Example
import java.util.Date;
class Person{
	String name;
	Date dob;
	int mobile;
	void readData(String n,Date d,int m){
		name=n;
		dob=d;
		mobile=m;
	}
	void printData(){
		System.out.println("Name:"+name);
		System.out.println("DOB:"+dob);
		//d.printDate();
		System.out.println("Mobile;"+mobile);
	}
}
class Student extends Person{
	String institution;
	int[] qualif=new int[20];
	int roll;
	int[] marks=new int[5];
	
	void printBioData(){
		printData();
		System.out.println("Institution: "+institution);
		System.out.println("Roll:"+roll);
		
		for(int q=0;q<qualif.length;q++){
			System.out.println("Marks:"+qualif[q]);
		}
		for(int m=0;m<marks.length;m++){
			System.out.println("Result:"+m+" "+marks[m]);
		}
	}
}
class InheritanceDemo1{
	public static void main(String args[]){
		Person p=new Person();
		Student s=new Student();
		p.printData();
		s.printBioData();
	}
}