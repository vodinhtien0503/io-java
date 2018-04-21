package io;
import java.io.File;
import java.util.Date;

public class bai1 {
     public static void main(String a[])
     {
        File file = new File("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}