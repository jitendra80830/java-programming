/* java FileInputStream : Reading a sigle character from a file*/
import java.io.FileInputStream;
public class ReadingChar{
	public static void main(String args[]){
		try{
			
			FileInputStream fin=new FileInputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/testout.txt");
			int i=fin.read();
			System.out.println((char)i);
			System.out.println(i); //if you want print asci code of letters
			fin.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
		