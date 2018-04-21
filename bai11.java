package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\abc.txt"));
          while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("khong tim thay tep tin");
        } catch (IOException e) {
            System.err.println("khong ton tai tep tin.");
        }
	}

}
