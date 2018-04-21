package io;

import java.io.File;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file=new File("C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu");
if(file.exists()) {
	System.out.println(filesize_byte(file));
	System.out.println(filesize_kilobyte(file));
	System.out.println(filesize_megabyte(file));
}
else {
	System.out.println("tep tin khong ton tai");
}
	}
private static String filesize_byte(File file) {
	return file.length()+"bytes";
}
private static String filesize_megabyte(File file) {
	return (double)file.length()/(1024*1024)+"mb";
}
	private static String filesize_kilobyte(File file) {
		return (double)file.length()/1024+"kb";
	}

}
