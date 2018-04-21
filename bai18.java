package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai18 {
	  public static void main(String [ ] args) throws FileNotFoundException {
          new bai18().findLongestWords();
     }

 public String findLongestWords() throws FileNotFoundException {

   String longest_word = "";
   String current;
   Scanner sc = new Scanner(new File("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\abc.txt"));


   while (sc.hasNext()) {
      current = sc.next();
       if (current.length() > longest_word.length()) {
         longest_word = current;
       }

   }
     System.out.println("\n"+longest_word+"\n");
        return longest_word;
	}

}
