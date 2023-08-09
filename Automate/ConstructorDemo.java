package Automate;

public class ConstructorDemo {
	  
	public ConstructorDemo()
	{
		System.out.println("i am a constructor");
	}
	
	public void dev() {
		System.out.println("test");
	}
	
	public void dev1() {
		System.out.println("test1");
	}
	public void dev3() {
		int a=10;
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd=new ConstructorDemo();
		cd.dev();
		cd.dev1();
		
			
	}
}
	