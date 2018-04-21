package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai8 {

	public static void main(String[] args) throws IOException
	  {
	    BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("nhap ten cua ban: ");
	    String name = R.readLine();
	    System.out.println("ten cua ban la: " + name);
	  

	}

}
