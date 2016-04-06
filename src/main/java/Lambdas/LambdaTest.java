package main.java.Lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
	
	public static void main(String[] args)
	{
		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Running thread using older way");
				
			}
			
		});
		
		t.start();
		
		Thread t2 = new Thread(
				() -> System.out.println("Running thread using lambdas")
				);
		
		t2.start();
		
		//Old way:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println("--------------Old Way------------------------------");
		for(Integer n: list) {
		    System.out.println(n);
		}
		
		//New way:
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println("--------------New Way------------------------------");
		list2.forEach(n -> System.out.println(n));
		
		//or we can use :: double colon operator in Java 8
		System.out.println("--------------Using double colon operator in Java8------------------------------");
		list2.forEach(System.out::println);
	}

}
