/*Example of BufferedOutputStream class for writing into a file*/
import java.io.*;
class BuffereWrite{
	public static void main(String args[]) throws Exception{
		FileOutputStream fout=new FileOutputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/testout1.txt");
		
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Welcome to NPTEL\ni am jitendra kumar from cse branch\nand now am in 3rd year!";
		
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");
	}
}