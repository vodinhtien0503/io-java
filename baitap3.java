


package io;

import java.io.File;

public class baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File my_file_dir = new File("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\xyz.txt");
         if (my_file_dir.exists()) 
           {
            System.out.println("tep tin hoac thu muc ton tai\n");
           } 
         else
          {
            System.out.println("tep tin hoac thu muc khong ton tai\n");
          }
	}

}
