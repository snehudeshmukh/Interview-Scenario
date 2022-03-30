package mutableclass;

public final class Student {
	private final int rollno;
	private final String name;
	private final Address addr;
Student(int roll,String name,Address add){
	this.rollno=roll;
	this.name=name;
Address dummyadd1= new Address();
dummyadd1.setPin(add.getPin());
dummyadd1.setCity(add.getCity());
dummyadd1.setDist(add.getDist());
this.addr=dummyadd1;
}
public int getRollno() {
	return rollno;
}
public String getName() {
	return name;
}
public Address getAddr() {
	Address dummyadd2= new Address();
	dummyadd2.setPin(this.addr.getPin());
	dummyadd2.setCity(this.addr.getCity());
	dummyadd2.setDist(this.addr.getDist());
	return dummyadd2;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
}

}
