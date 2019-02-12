package com.csii.ljj;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Before Method");
            div(1,0);
            System.out.println("Returnning Method");
        }catch (Exception e){
            throw e;
        }finally {
        System.out.println("Aftermethod");
        }
    }

    public static int div(int i,int j) {
        return i/j ;
    }

}
