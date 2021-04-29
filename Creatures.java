class Creatures{
	public static void main(String[] args)
	{
		Cheetha ch=new Cheetha();//reference variable
		ch.run();
		Fish fh=new Fish();
		fh.swim();
		


	}
}
class Cheetha{
	void run()
	{
	     System.out.println("It runs very fast.........");
	}
}
class Fish{
	void swim()
	{
		System.out.println("It swims");
	}
}
