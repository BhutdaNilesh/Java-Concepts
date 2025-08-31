package IterableInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
   public static void main(String[] args){
       List<String> list = new LinkedList<>();
       list.add("learn");
       list.add("Java");
       list.add("with");
       list.add("me!");

       ListIterator<String> itr = list.listIterator();

       // Traversing elements
       System.out.println("Forward Iteration");
       while(itr.hasNext()){
           String element = itr.next();
           System.out.println(element);
       }

       System.out.println("Backward Iteration");
       while(itr.hasPrevious()){
           String element = itr.previous();
           System.out.println(element);
       }

   }

}
