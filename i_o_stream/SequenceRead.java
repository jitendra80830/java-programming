/* java sequenceinput Example: reading sequenc of files*/
import java.io.*;

class SequenceRead{
	public static void main(String args[]) throws Exception{
		FileInputStream input1=new FileInputStream("C:/Users/jitendra kumar/Documents/Git_Work/JAVA/i_o_stream/testout.txt");
		FileInputStream input2=new FileInputStream("C:/Users/jitendra kumar/Documents/Git_Work/JAVA/i_o_stream/testout1.txt");
		
		SequenceInputStream inSt=new SequenceInputStream(input1,input2);
		
		int j;
		while((j=inSt.read())!=-1){
			System.out.print((char)j);
		}
		inSt.close();
		input1.close();
		input2.close();
	}
}