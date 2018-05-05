package com.anurag.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        StringBuilder sbf=new StringBuilder(A);
	        if(A.equals(sbf.reverse().toString())){
	           System.out.println("Yes"); 
	        }

	}
}