package classprograms;

class A
{
	int nonStaticVariable;
	static int staticVariable;
	
	static void staticMethod()
	{
		System.out.println(staticVariable);    //10
		//System.out.println(nonStaticVariable);  //Non static method can not accssible in static method
	}
	void nonStaticMethod() 
	{
		System.out.println("static variable="+staticVariable);   //10
		System.out.println("variable="+nonStaticVariable);  //0
	}
	
}

public class MainInstanceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.staticVariable=10;
		//A.nonStaticVariable=10;   // no object created so cant access the variable
		
		A.staticMethod();   //  10
		
		A a1=new A();
		A a2=new A();
		System.out.println("variable="+(a1.nonStaticVariable));  //0
		System.out.println("static variable="+(a1.staticVariable));     //10
		
		a1.nonStaticMethod();   //10  
		                        //0
		a1.staticMethod();      //10
	
	
		System.out.println("static variable="+(a2.staticVariable));    //10
		a1.staticVariable=20;
		System.out.println("static variable="+(a2.staticVariable));    //20
	

	}

}
