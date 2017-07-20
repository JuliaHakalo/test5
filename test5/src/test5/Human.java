package test5;

public class Human {
	private double a;
	private int age;
	
	private String name;
	
	
	

	public Human(double a, int age, String name) {
		super();
		this.a = a;
		this.age = age;
		this.name = name;
	}




	@Override
	public String toString() {
		return "Human [a=" + a + ", age=" + age + ", name=" + name + "]";
	}


	
}
