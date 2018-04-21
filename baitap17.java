package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class baitap17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader br = null;
	        String strLine = "";
	        try {
	            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\abc.txt"), "UTF-8"));
	             while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
	                System.out.println(strLine);
	            }
	           reader.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("khong tim thay tep tin");
	        } catch (IOException e) {
	            System.err.println("khong the doc tep tin.");
	        }
	}

}
