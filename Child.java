
public class Child extends Parent {

	void display(int a)//methodoverloading
	{
		System.out.println("in child display(int a)");
	}
	static void display()//methodoverriding
	{
		System.out.println("in child display()");
	}
	void m()
	{
		System.out.println("Child m()");
	}
	
	
	void m2()//non overrided
	{
		System.out.println("child m2()");
	}
}
