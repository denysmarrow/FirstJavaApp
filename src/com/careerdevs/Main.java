package com.careerdevs;

import javax.naming.PartialResultException;

public class Main {

    public static void main(String[] args) {
        System.out.println(getFirstElement(new int[] {3,1,4}));
        System.out.println(addition(0));
        System.out.println(search(new int[] ));
        System.out.println(convert(new int[] {1, 2, 3}, new int[]));
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
        return "something" + " " + a;
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


}
