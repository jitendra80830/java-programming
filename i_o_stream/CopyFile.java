/*copying a file into another file using charaterStream class*/
import java.io.*;

class CopyFile{
	public static void main(String args[]){
		
		//declare and create input and output file
		File inFile=new File("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/testout.txt");
		File outFile=new File("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/city.txt");
		
		FileReader ins=null; //create file stream
		FileWriter outs=null;
		try{
			ins=new FileReader(inFile);
			outs=new FileWriter(outFile);
			
			int ch;
			while((ch=ins.read()) !=-1){
				outs.write(ch);
			}
		}catch(IOException ioe){
			System.out.println(ioe);
			System.exit(-1);
		}finally{
			try{	
				ins.close();
				outs.close();
			}catch(IOException ioe){System.out.println(ioe);}
		}
	}
}