package com.stackroute.pefour;


import java.util.Scanner;
public class Characterstring {
    int count=0;
    String str1="";
    public int characterString(String str , String ch){
       str1= str.replace(ch,"");
       count=str.length()-str1.length();
        return count;
    }

}
