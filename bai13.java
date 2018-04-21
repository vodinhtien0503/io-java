package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        String str_data = "";
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\abc.txt"));
	             while (strLine != null)
	             {
	                if (strLine == null)
	                  break;
	                str_data += strLine;
	                strLine = br.readLine();
	                
	            }
	              System.out.println(str_data);
	             br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("khong tim thay tep tin");
	        } catch (IOException e) {
	            System.err.println("khong the doc tep tin.");
	        }

	}

}
