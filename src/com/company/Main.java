package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean tf = true;

        System.out.println("Enter two words:");
        String word1 = input.next();
        String word2 = input.next();

        if(word1.length() == word2.length()){

            for (int i=0; i < word1.length();i++){

                String temp = word1.substring(i,i+1);
                for (int j=0; j < word2.length(); j++){

                    if (word2.contains(temp)){
                        tf = true;
                    }else {
                        tf = false;
                    }
                }
            }
        }else {
            System.out.println("False");
        }

        System.out.println(tf);
    }
}
