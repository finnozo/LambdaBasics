package com.isolutions4u;

public class Greater {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		
		Greater greater = new Greater();
		Greeting greeting = new HelloWorldGreeting();
		greater.greet(greeting);
		
		
		///////////////////////////////////////////////////////////////////////
		//////// This is lambda examples  ////////////////////////////////////
		/////////////////////////////////////////////////////////////////////
						//x = ()->System.out.println("Sushil Dangi");
						//x = (int a)-> a * 2;
						//fun = (int a,int b) -> a + b;
						/* safeDivideFun = (int a , int b) ->{
						 * 		if(b == 0)
									return 0;
								else 
									return a / b;
							};
						 */
						// strLen = (String s) -> s.length();
		///////////////////////////////////////////////////////////////////
		////////////////// End ///////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
		
		Greeting myLambda = () -> System.out.println("Hello Sushil"); 
		//MyLambdaAdd addFun = (int a , int b) -> a + b;
		greater.greet(myLambda);
		myLambda.perform();
		Greeting g = new Greeting() {
			
			@Override
			public void perform() {
				// TODO Auto-generated method stub
				
				System.out.println("Test");
				
			}
		};
		
		g.perform();
	}
	
	

}

interface MyLambda {
	
	void fun();
}

interface MyLambdaAdd {
	
	int fun(int a,int b);
}