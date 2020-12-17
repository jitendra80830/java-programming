//java Fileoutstream:write a byte into a file
import java.io.FileOutputStream;

public class WriteByte{
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/text.txt");
			fout.write(65);
			fout.write(90);
			fout.write(100);
			fout.write(1);
			fout.write(25);
			fout.write(123);
			fout.close();
			System.out.println("File Writing is over.....");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}