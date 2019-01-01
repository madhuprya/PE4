package com.stackroute.pefour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
    public String  matchString(String str,String search) {
<<<<<<< HEAD
=======

        String str1 = str;
        String res = "";
        String ser = search;


        Pattern pattern = Pattern.compile(ser);
        Matcher matcher = pattern.matcher(str1);


        while(matcher.find()) {
            System.out.print("found at: "
                    + matcher.start() + "-" + matcher.end());
            res =res+ "found at: " + matcher.start() + "-" + matcher.end() + " ";

        }
        res=res.trim();
>>>>>>> e3c8bbe6baf33ca8d0f2d03a2694fd861e545722

        return res;


        }
    }

