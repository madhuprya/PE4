package com.stackroute.pefour;

public class FindingHarry {
    public boolean findingHarry(String actualString , String expectedString){
        String str1 = actualString.replaceAll(expectedString,"");

        if(str1.length()<actualString.length()){

             return true;
        }
        else{

            return false;}

    }
}
