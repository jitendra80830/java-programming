//java FileOutputStream: write a byte into a file
import java.io.*;

class WriteByte1{
	public static void main(String args[]){
		byte cities[]={'B','O','D','H','G','A','Y','A','G','A','Y','A','B','I','H','A','R','\n'};
		
		FileOutputStream outfile=null; //create a outfile stream
		try{
			outfile=new FileOutputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/city.txt");
			
			//connect the outfile stream to "ciy.txt"
			outfile.write(cities); //write data to stream
			outfile.close(); //close file
		}
		catch(IOException ioe){
			System.out.println(ioe);
			System.exit(-1);
		}
	}
}