package javaTraining;

import java.util.*;

public class numbersinwords {
 static String convertToWords(int n) {
     if (n == 0) 
         return "Zero";
     
     String[] units = {
         "",        "One",       "Two",      "Three",
         "Four",    "Five",      "Six",      "Seven",
         "Eight",   "Nine",      "Ten",      "Eleven",
         "Twelve",  "Thirteen",  "Fourteen", "Fifteen",
         "Sixteen", "Seventeen", "Eighteen", "Nineteen"
     };
     
     String[] tens = { 
         "",     "",     "Twenty",  "Thirty", "Forty",
         "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" 
     };
     
     String[] multiplier = 
                 {"", "Thousand", "Million", "Billion"};
   
     String res = "";
     int group = 0;
     
     while (n > 0) {
         if (n % 1000 != 0) {
             
             int value = n % 1000;
             String temp = "";
             
             if (value >= 100) {
                 temp = units[value / 100] + " Hundred and ";
                 value %= 100;
             }

             if (value >= 20) {
                 temp += tens[value / 10] + " ";
                 value %= 10;
             }

             if (value > 0) {
                 temp += units[value] + " ";
             }

             temp += multiplier[group] + " ";
             
             res = temp + res;
         }
         n /= 1000;
         group++;
     }
     
     return res.trim();
 }

 public static void main(String[] args) {
	 Scanner se = new Scanner(System.in);
	 System.out.print("Enter the number: ");
     int n = se.nextInt();
     System.out.println(convertToWords(n));
     se.close();
 }
}