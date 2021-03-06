package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/5/16.
 */
public class GenericVarArgsDemo {
    public static void main(String[] args) {
        //Explicit parameters as below are not required but are useful
        //when the generic method has more number of arguments of different types
    List<Integer> ints =  GenericVarArgsDemo.<Integer>toList(1,2,3,4);
    addAll(ints,5,6,7,8);
    List<String> strings = GenericVarArgsDemo.<String>toList("Believe","In","Yourself");
    addAll(strings,"Rajat");
    }
    //A generic var args method to takes in a list and an array of any number of arguments ,
    // adds them and returns a list
    public static <T> void addAll(List<T> list, T... arr){
        for(T element : arr){
            list.add(element);
        }
        System.out.println("Elements in list are : "+list);
    }

    public static <T> List<T> toList(T... arr){
        List<T> list = new ArrayList<>();
        for(T element : arr){
            list.add(element);
        }
        return list;
    }
}
