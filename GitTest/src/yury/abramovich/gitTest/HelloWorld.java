package yury.abramovich.gitTest;

public class HelloWorld {
	// correct main
	public static void main(String[] args) {
		
		print(new HelloWorldHelp().getHelloWorld());
		new HelloWorld().count10();

	}
// print some object
	private static void print(Object o)
	{
		System.out.println(o.toString());
	}
	
	private void count10() {
		for(int i=0; i<10; i++)
			print(new Integer (i));
	}
}
