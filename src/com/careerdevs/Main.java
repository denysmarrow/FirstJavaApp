package com.careerdevs;

import javax.naming.PartialResultException;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        System.out.println(getFirstElement(new int[] {3,1,4}));
        System.out.println(addition(0));
        System.out.println(search(new int[]));

    }
    public static int getFirstElement(int[] arr){
        return arr[0];
    }

    public static int addition(int num) {
        return num +1;


    }

    public static int search(int arr[], int item) {
        int index=-1;
        for(int i=0; i < arr.length;i++){
            if(arr[i]==item){
                index = i;
                i+=arr.length+1;
            }
        }
        return index;
    }

    public static int convert(int minutes) {
        return minutes*60;
    }

    public static String giveMeSomething(String a) {
        return "something " + a;
    }

    //algorithm 6

    public class Challenge {
        public static boolean reverse(boolean b) {
            return !b;

        }
    }

    //algorithm 7

    public class Program {
        public static int countWords(String s) {
            return s.split(" ").length;
        }
    }

    //algorithm 8

    public class ExistsANumberHigher {
        public static boolean existsHigher(int[] arr, int n) {
            if (arr.length == 0) return false;
            for (int i : arr) {
                if (i >= n) return true;
            }
            return false;
        }
    }

    //algorithm 10

    public class SumOfTwoNumbers {
        public static int sum(int a, int b) {
            return a + b;
        }
    }

    //algorithm 11

    public class Program {
        public static boolean isSameNum(int x, int y) {
            return x == y;
        }
    }

    //algorithm 12

    public class Age {
        public static int calcAge(int age) {
            return age*365;
        }
    }

    //algorithm 13

    public class Challenge {
        public static String helloName(String name) {
            return "Hello " + name + "!";
        }
    }

    //algorithm 14

    public class ReverseOrder {
        public static String reverse(final String str) {
            return new StringBuilder(str).reverse().toString();
        }
    }



}
