package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        System.out.println(getFirstElement(new int[] {3,1,4}));
        System.out.println(getFirstElement(new int[] {2,1,4}));
        System.out.println(getFirstElement(new int[] {5,1,4}));
        System.out.println(getFirstElement(new int[] {7,1,4}));
    }
    public static int getFirstElement(int[] arr){
        return arr[0];
    }

    public static int addition(int num) {
        return num +1;
        System.out.println(addition());

    }

    public static int search(int[] arr, int item) {
        return arr.indexOf(item, 0);

    }

    public static int convert(int minutes) {
        return minutes*60;
    }

    public static String giveMeSomething(String a) {
        return "something" + " " + a;
    }


}
