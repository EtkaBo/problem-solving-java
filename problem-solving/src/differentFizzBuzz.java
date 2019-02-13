/**
* Problem Link: 
* https://www.hackerrank.com/challenges/java-if-else/problem?h_r=next-challenge&h_v=zen
*
*
* Explanation:
*  
* Given an integer, , perform the following conditional actions:
*
**If  is odd, print Weird
**If  is even and in the inclusive range of  to , print Not Weird
**If  is even and in the inclusive range of  to , print Weird
**If  is even and greater than , print Not Weird
*
*
*
*
*
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        String result = "Weird";

        if(n % 2 == 0 && n >1 && n < 5) {
            result = "Not " + result;
        }

        if(n % 2 == 0 && n > 20) {
            result = "Not " + result;
        }

        System.out.println(result);
    }
}
