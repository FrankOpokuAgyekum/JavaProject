package com.frantronics.frank.javapractice;

public class MyClass {

    public MyClass(){

    }

    public static void main(String[] args){
        int[] myArray = new int[0];
        printUnorderedPairs(myArray);
    }

    // Big O (Runtime) practice (Example 1)
     static void foo(int[] array){
        int sum = 0;
        int product = 1;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        for(int i = 0; i < array.length; i++){
            product *= array[i];
        }
        System.out.println(sum + "," + product);
    }

    // Big O practice (Example 2)
    static void printPairs(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
    // Big O practice (Example 3)
    static void printUnorderedPairs(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }

}
