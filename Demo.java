//Polymorphism-itis OOP methology where methods have many forms.
//It 2 types  
//1.Runtime ,dynamicbinding   eg. MethodOverriding
//2.CompileTime ,staticbinding eg.MethodOverloading
public class Demo {
public static void main(String args[])
{
	Child c1=new Child();
	c1.display(1);
	c1.display();
	
	Parent c2=new Child();
	c2.display();//parent
	c2.m();//child
	c2.m1();
}
}


//parent---void display(int a)
//child---void display(int b)