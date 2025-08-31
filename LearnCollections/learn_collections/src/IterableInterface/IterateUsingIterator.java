package IterableInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateUsingIterator {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("learn");
        list.add("Java");
        list.add("with");
        list.add("me!");

        // Iterate using Iterator

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            String element = itr.next();
            System.out.println(element);
        }


    }
}
