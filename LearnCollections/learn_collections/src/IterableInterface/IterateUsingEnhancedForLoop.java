package IterableInterface;

import java.util.ArrayList;
import java.util.List;

/*
There are three ways in which objects of Iterable can be iterated.

1.Using enhanced for loop(for-each loop)
2.Using Iterable forEach loop
3.Using Iterator<T> interface

 */

public class IterateUsingEnhancedForLoop {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("learn");
        list.add("Java");
        list.add("with");
        list.add("me!");

        // Iterate through the list using Enhanced for each loop

        for(String st: list){
            System.out.println(st);
        }

    }
}
