package com.principal;
public class Solution5 {
    public static void main(String[] args) {
        int month = 2;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
            		 break;
            default: monthString = "Invalid month";
            		 break;
        }
System.out.println(monthString);
}
}