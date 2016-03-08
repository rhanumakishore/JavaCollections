package main.java.List.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;
public class IteratorExample {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("Delhi");
    linkedlist.add("Agra");
    linkedlist.add("Mysore");
    linkedlist.add("Chennai");
    linkedlist.add("Pune");
 
    // Obtaining Iterator
    Iterator it = linkedlist.iterator();
 
    // Iterating the list in forward direction
    System.out.println("LinkedList elements:");
    while(it.hasNext()){
       System.out.println(it.next());
    }
 }
}