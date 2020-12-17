//java FileOutputStream :Write a string into a file
import java.io.*;

class WriteString{
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/testout.txt");
			
			String s=("WELCOME TO NTPEL! HOPE YOU ARE ENJOYING JAVA PROGRAMMING");
			byte b[]=s.getBytes(); //convert into a byte array
			fout.write(b);
			fout.close();
			System.out.println("Writing is over....");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}