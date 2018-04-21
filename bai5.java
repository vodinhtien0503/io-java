package io;

import java.io.File;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File my_file_dir = new File("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\abc.txt");
		 if (my_file_dir.isDirectory()) 
         {
          System.out.println(my_file_dir.getAbsolutePath() + " la thu muc.\n");
         } 
       else
        {
          System.out.println(my_file_dir.getAbsolutePath() + " khong la thu muc.\n");
        }
       if (my_file_dir.isFile()) 
         {
          System.out.println(my_file_dir.getAbsolutePath() + " la tep tin.\n");
         } 
       else
        {
          System.out.println(my_file_dir.getAbsolutePath() + " khong la tep tin.\n");
        }  
	}

}
