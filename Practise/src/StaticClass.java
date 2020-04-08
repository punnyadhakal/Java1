//Create a class with static variable and assign and display variable value using static method of class

public class StaticClass {

	public static void main(String[] args) {
	DemoClass.setname("punya");
	System.out.println(DemoClass.display());
	
	
	DemoClass.getname("laxmi");
	System.out.println(DemoClass.display1());
	DemoClass.name1 = "Punnya";
	System.out.println(DemoClass.name1);
	}

}
