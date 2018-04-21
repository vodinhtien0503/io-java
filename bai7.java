package io;

import java.io.File;
import java.util.Date;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("abc.txt");
	       Date date=new Date(file.lastModified());
		   System.out.println("\nlan cuoi tep tin duoc sua la: "+date+"\n");	   
	     }
	}


