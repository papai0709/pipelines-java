package com.microsoft.demo;

import java.util.Random;

public class Pipeline_Test {

    public String MyTestPipeline(String s){
        String rev = "";
        char [] w = s.toCharArray();

        for(int i = s.length()-1; i>=0; i--){
           rev = rev.concat(String.valueOf(w[i]));
        }
        return rev;
    }

    public char[] random_password(int len)
    {
        System.out.println("Generating password using random function : ");
        System.out.print("Your new password is : ");

        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";


        String values = Capital_chars + Small_chars +
                numbers + symbols;

        // Using random method
        Random rndm_method = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] =
                    values.charAt(rndm_method.nextInt(values.length()));

        }
        return password;
    }

//    public static void main(String[] args) {
//
//        int length = 10;
//        System.out.println(random_password(length));
//    }
}




