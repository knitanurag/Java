package com.anurag.hackerRank.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This is method to check for two strings if they are anagrams
 */
public class JavaAnagrams {

  //  Time Complexity: O(n) using a HashMap
  // Space Complexity: O(n)
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    sc.close();
    boolean isAnagram = isAnagram(a,b);
    System.out.println("Both Strings are anagram:" +isAnagram);

  }

  private static boolean isAnagram(String a, String b) {
    if(a == null || b == null || a.length() != b.length()){
      return false;
    }
    Map<Character,Integer> map = new HashMap<>();
    a = a.toLowerCase();
    b = b.toLowerCase();

    /* Fill HashMap with 1st String */
    for(int i = 0; i < a.length(); i++){
      map.merge(a.charAt(i), 1 , Integer :: sum);
    }

    /* Compare 2nd String to 1st String's HashMap */
    for(int i = 0; i < b.length(); i++){
      char ch = b.charAt(i);
      if(map.containsKey(ch) && map.get(ch) > 0){
        map.put(ch, map.get(ch) - 1);
      } else {
        return false;
      }
    }
    return true;
  }

}
