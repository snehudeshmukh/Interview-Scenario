package immutableclass;

public final class Student {
	
	private final int rollno;
	private final String name;
	private final String address;
Student(int roll,String name,String add){
	this.rollno=roll;
	this.name= name;
	this.address=add;
}
public int getRollno() {
return rollno;
}
public String getName(){
	return name;
}
public String getAddress() {
	return address;
}
public static void main(String[] args) {
	Student s1= new Student(10,"Ram","Pune");
	System.out.println(s1.getRollno());
	System.out.println(s1.getName());
	System.out.println(s1.getAddress());
}
	}

