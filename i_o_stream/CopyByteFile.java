/*copying a file onto another file using ByteStream class*/
import java.io.*;

class CopyByteFile{
	public static void main(String  args[]){
		//declare and create input and output file
		FileInputStream infile=null;
		FileOutputStream outfile=null;
		
		byte byteRead; //Declare a variable to hold a byte
		try{
			infile=new FileInputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/testout.txt");
			outfile=new FileOutputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/byte1.txt");
			
			//reading bytes from testout.txt and write to bytea.txt file
			byteRead=(byte)infile.read();
			while(byteRead !=-1){
				outfile.write(byteRead);
				byteRead=(byte)infile.read();
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
		