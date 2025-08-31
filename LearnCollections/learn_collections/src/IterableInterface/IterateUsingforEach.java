package IterableInterface;

import java.util.ArrayList;
import java.util.List;

public class IterateUsingforEach {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("learn");
        list.add("Java");
        list.add("with");
        list.add("me!");

        // Iterate using forEach

        list.forEach((element)-> { System.out.println(element);});

    }
}
