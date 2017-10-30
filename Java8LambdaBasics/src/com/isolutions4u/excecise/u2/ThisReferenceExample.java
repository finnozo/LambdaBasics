package com.isolutions4u.excecise.u2;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10,i->{
			System.out.println("The value of i is : " + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReferenceExample example = new ThisReferenceExample();
		/*example.doProcess(10, i->{
			System.out.println("The value of i is : " + i);
			//System.out.println(this); This is not work
		});*/
		example.execute();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is the Main TheReference instance";
	}
	

}


/*
 * 
 new Process() {

			@Override
			public void process(int i) {
				System.out.println("The value of i is : " + i);
				System.out.println(this);

			}
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "This is the anonymous class";
			}
		}
 * */
 