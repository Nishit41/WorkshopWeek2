package com.bridgelabz.basics;

public class CountCharacter {
    public static void main(String[] args) {
        String string = "This is for review questions";
        int count = 0;
        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i) != ' ')
                count++;
        }
        System.out.println("no of char=>"+count);

        }
}
