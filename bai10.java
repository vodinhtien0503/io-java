package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class bai10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String file="C:\\Users\\Administrator\\Desktop\\sqljdbc_6.0.8112.100_enu\\abc.txt";
InputStream fins=null;
try {
	fins=new FileInputStream(file);
	byte file_content[]=new byte[2*1024];
	int read=0;
	while((read=fins.read(file_content))>0) {
		System.out.println(new String(file_content,0,read-1));
	}
} catch (FileNotFoundException e) {
	// TODO: handle exception
	e.printStackTrace();
}
catch(IOException e) {
	e.printStackTrace();
}finally {
	try {
		if(fins!=null)fins.close();
	} catch (Exception e2) {
		// TODO: handle exception
	}
}
	}

}
