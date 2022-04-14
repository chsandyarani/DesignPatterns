package Singleton.Demo;

class Singleton {

	String str;
	static Singleton object;

//constrcutor with string parameter  

	private Singleton(String str) {
		this.str = str;
	}

	// creating object
	public static Singleton getObject(String str) {
		if (object == null) {
			object = new Singleton(str);
		}

		return object;
	}

}

public class SingletonClass {
	public static void main(String[] args) {
		// In singleton pattern when we want create two objects to the one class it
		// won't create
		Singleton singleton = Singleton.getObject("hi");
		Singleton singleton1 = Singleton.getObject("hello");
		System.out.println(singleton.str);
		System.out.println(singleton1.str);

	}

}
