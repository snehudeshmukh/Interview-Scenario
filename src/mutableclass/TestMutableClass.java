package mutableclass;

public class TestMutableClass {
	public static void main(String[] args) {
		Address a1= new Address(12345,"Bhramhapuri","Chandrapur");
		Student s1= new Student(10,"Ram",a1);
		System.out.println("Student details before change:"+s1);
		a1.setCity("Mumbai");
		System.out.println("Student details after change:"+s1);
	}

}
