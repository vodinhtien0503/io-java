package io;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        String strLine = "";
         ArrayList<String> list = new ArrayList<String>();
        try {
             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
              while (strLine != null)
               {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                   break;
                list.add(strLine);
            }
         System.out.println(Arrays.toString(list.toArray()));
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("khong tim thay tep tin");
        } catch (IOException e) {
            System.err.println("khong the doc tep tin.");
        }
	}

}
