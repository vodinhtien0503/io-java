package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\abc.txt"));
	             while (strLine != null)
	             {
	                sb.append(strLine);
	                sb.append(System.lineSeparator());
	                strLine = br.readLine();
	                System.out.println(strLine);
	            }
	             br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("tep khong tim thay");
	        } catch (IOException e) {
	            System.err.println("khong the doc tep.");
	        }
	}

}
