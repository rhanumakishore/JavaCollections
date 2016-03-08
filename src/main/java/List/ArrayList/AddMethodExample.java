package main.java.List.ArrayList;

import java.util.ArrayList;
public class AddMethodExample {
   public static void main(String[] args) {
       // ArrayList of String type
       ArrayList<String> al = new ArrayList<String>();
       // simple add() methods for adding elements at the end
       al.add("Hi");
       al.add("hello");
       al.add("String");
       al.add("Test");
       //adding element to the 4th position
       //4th position = 3 index as index starts with 0
       al.add(3,"Howdy");

       System.out.println("Elements after adding string Howdy:"+ al);
       //adding string to 1st position
       al.add(0, "Bye");

       //Print
       System.out.println("Elements after adding string bye:"+ al);
   }
}