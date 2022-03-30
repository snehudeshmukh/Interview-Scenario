package mutableclass;

public class Address {
	int pin;
	String city;
	String dist;
	public Address(){
		
	}
	public Address(int pin,String city,String dist){
		this.pin=pin;
		this.city=city;
		this.dist=dist;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	
public String toString() {
	return this.pin+" "+this.city+" "+this.dist;
}
}
