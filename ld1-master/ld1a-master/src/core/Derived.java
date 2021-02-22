package core;
class Base1 {
	public Base1() {
		System.out.println("Base1");
	}
	public Base1(String message) {
		messageString = message;
	}
	public String messageString = "hi";
	public void display() {
		System.out.println(messageString);
	}
}
public class Derived extends Base1 {
	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.display();
	}
	public Derived() {
		super("FromDerived");
		System.out.println("Derived");
	}
	public String messageString = "hii";
	public void display() {
		System.out.println(super.messageString);
		super.display();
		System.out.println(messageString);
	}
}
