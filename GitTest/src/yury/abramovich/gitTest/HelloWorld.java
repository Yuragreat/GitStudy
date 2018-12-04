package yury.abramovich.gitTest;

public class HelloWorld {
	// correct main
	public static void main(String[] args) {
		
		print("Hello World");
		for(int i=0; i<10; i++)
			print(new Integer (i));
	}

	private static void print(Object o)
	{
		System.out.println(o.toString());
	}
}
