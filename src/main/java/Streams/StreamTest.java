package main.java.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Using Stream.of");
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(i -> System.out.println(i));
		
		System.out.println("Using list.stream");
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
		{
			list.add(i);
		}
		
		Stream<Integer> stream1 = list.stream();
		stream1.forEach(i -> System.out.println(i));
		
		System.out.println("Convert stream to list using stream.collect");
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=1;i<20 ;i++)
		{
			intList.add(i);
		}
		
		Stream<Integer> stream2 = intList.stream();
		List<Integer>  evenNumbersList = stream2.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Printing even numbers");
		evenNumbersList.forEach(i -> System.out.println(i));
		
		
		
		List<String> memberNames = new ArrayList<String>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		
		System.out.println("---------------------------filter---------------------------------");
		memberNames.stream().filter(s -> s.startsWith("S")).forEach(s -> System.out.println(s));
		
		System.out.println("-------------------------sorted--------------------------------");
		memberNames.stream().sorted().forEach(System.out::println);
		
		System.out.println("-------------------------sorted and uppercase--------------------------------");
		List<String> memNamesInUpperCase = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		memNamesInUpperCase.forEach(System.out::println);
		
		System.out.println("--------------------match-------------------------------");
		boolean matched = memberNames.stream().anyMatch(s -> s.startsWith("A"));
		System.out.println(matched);
		
		System.out.println("-----------------------------count----------------------------------");
		long count = memberNames.stream().filter(s -> s.startsWith("S")).count();
		System.out.println(count);
		
		System.out.println("----------------------------------reduce--------------------------------");
		Stream<Integer> lengthStream = memberNames.stream().map(s -> s.length());
		Optional<Integer> sum = lengthStream.reduce((x,y) -> x+y);
		sum.ifPresent(System.out::println);
		
		
		System.out.println("--------------------------findAny-----------------------------------------");
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Amitabh", "Bachan", 60));
		users.add(new User(2, "Abhishek", "Bachan", 40));
		users.add(new User(3, "Shahrukh", "Khan", 50));
		users.add(new User(4, "Aamir", "Khan", 49));
		users.add(new User(5, "Salman", "Khan", 45));
		users.add(new User(6, "Ranbir", "Kapoor", 35));
		
		User result = users.stream().filter(x -> "Khan".equals(x.getLastName()) && x.getAge() > 30).findAny().orElse(null);
		System.out.println("User object : "+result);
		
		System.out.println("--------------------------collect and forEach-----------------------------------------");
		users.stream().filter(x -> x.getLastName().equals("Bachan")).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("--------------------------collect and map and forEach-----------------------------------------");
		users.stream().filter(x -> (x.getLastName().equals("Khan") && x.getAge() >= 50)).map(User :: getLastName).forEach(System.out::println);
		
		System.out.println("--------------------------sort custom object-----------------------------------------");
		//users.stream().sorted((user1, user2) -> user1.getAge() - user2.getAge()).map(User :: getFirstName).forEach(System.out::println);;
		users.stream().sorted((user1, user2) -> user1.getAge() - user2.getAge()).forEach(u -> System.out.println(u.getFirstName() + "  " + u.getLastName() + "  " + u.getAge()));
		//users.stream().sorted((user1, user2) -> user1.getAge() - user2.getAge()).iterator().forEachRemaining(System.out::println);
		

	}

}
