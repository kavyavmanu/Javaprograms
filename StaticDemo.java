class StaticDemo{
	int var=90;
	static int xyz=88;
	public static void main(String[] args)
	{
		StaticDemo ref=new StaticDemo();//no static keyword for run() so we are creating class object to access run() function
		ref.run();
		StaticDemo.speak();  ///by using static variable we can access any members without creating new object 
		StaticDemo obj=new StaticDemo();
		System.out.println(obj.var);
		StaticDemo abc=new StaticDemo();
		abc.speak();          //we should not create object for static class but still 
		                      //i have created because to prove once a static its always a static



	}

	static void speak()
	{   
		xyz=89;///new value of static variable will be the final output
		System.out.println("I am speaking");
		System.out.println(xyz);

		this.var=99;

	}
	void run()
	{   

		System.out.println("I am running");
	}
}
