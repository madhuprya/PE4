package com.stackroute.pefour;
import java.lang.*;

public class Replace {
    public String stringReplace(String s){

        if(s.contains(" "))
        {
            String[] str = s.split("//s");
            String str1="";
            for(int i=0;i<str.length;i++)
            {
                str1 += str[i].replaceAll("d", "f");
            }
            return str1;
        }
        else
            s=s.replaceAll("d","f");
        return s;

    }
}
