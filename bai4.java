package io;

import java.io.File;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File my_file_dir = new File("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\abc.txt");
        if (my_file_dir.canWrite()) 
          {
           System.out.println(my_file_dir.getAbsolutePath() + " co the viet.\n");
          } 
        else
         {
           System.out.println(my_file_dir.getAbsolutePath() + " khong the viet.\n");
         }
        if (my_file_dir.canRead()) 
          {
           System.out.println(my_file_dir.getAbsolutePath() + " co the doc.\n");
          } 
        else
         {
           System.out.println(my_file_dir.getAbsolutePath() + " khong the doc.\n");
         }  
	}

}
