package main.java.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {
	
	public static void main(String args[]){
		   ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");

		   /*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		   /* Sort statement*/
		   Collections.sort(listofcountries);

		   /* Sorted List*/
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		   
		   //Sort arraylist in descending order
		   Collections.sort(listofcountries, new Comparator<String>(){
			   
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s2.compareTo(s1);
			}
		});
		   
		   System.out.println("After Sorting in descending order:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		}

}
