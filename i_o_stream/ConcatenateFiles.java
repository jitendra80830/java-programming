/*For concatenate files*/
import java.io.*;

class ConcatenateFiles{
	public static void main(String args[]) throws IOException{
		//declare file stream
		FileInputStream file1=null;
		FileInputStream file2=null;
		
		SequenceInputStream file3=null;
		
		file1=new FileInputStream("C:/Users/jitendra kumar/Documents/Git_Work/JAVA/i_o_stream/testout.txt");
		file2=new FileInputStream("C:/Users/jitendra kumar/Documents/Git_Work/JAVA/i_o_stream/testout1.txt");
		
		file3=new SequenceInputStream(file1,file2); //for concatenation files for file1 and file2
		
		//create Buffered inpput and output stream
		BufferedInputStream inBuffer=new BufferedInputStream(file3);
		
		BufferedOutputStream outBuffer=new BufferedOutputStream(System.out);
		
		//Read and write the till the end of buffers
		int ch;
		while((ch=inBuffer.read())!=-1){
			outBuffer.write((char) ch);
		}
		inBuffer.close();
		outBuffer.close();
		file1.close();
		file2.close();
		file3.close();
	}
}
		