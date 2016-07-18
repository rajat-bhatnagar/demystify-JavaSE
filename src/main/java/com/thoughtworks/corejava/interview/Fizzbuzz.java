package com.thoughtworks.corejava.interview;

/**
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz”
 * instead of the number
 * and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 */
public class Fizzbuzz {
    public static void main(String[] args) {
        for(int counter=1;counter<=100;counter++){
            if((counter%3 ==0) && (counter%5 == 0)){
                System.out.println("Counter "+counter+ " FizzBuzz");
            }
            else if(counter%3 == 0 ){
                System.out.println("Counter "+counter+ " Fizz");
            } else if(counter%5 == 0){
                System.out.println("Counter "+counter+ " Buzz");
            }
            else{
                System.out.println("Counter "+counter);
            }

        }
    }
}
