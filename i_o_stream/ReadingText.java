/*java FileInputStream: Reading a text from a file*/
import java.io.FileInputStream;

public class ReadingText{
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/testout.txt");
			int i;
			while((i=fin.read()) !=-1){
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}