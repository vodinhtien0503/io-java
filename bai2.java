package io;

import java.io.File;
import java.io.FilenameFilter;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu");
         String[] list = file.list(new FilenameFilter() {
         @Override
          public boolean accept(File dir, String name) {
           if(name.toLowerCase().endsWith(".txt")){
                  return true;
              } else {
                  return false;
              }
          }
      });
      for(String f:list){
          System.out.println(f);
      }
	}

}
