/*Example of BufferedOutputStream class for writing into a file*/
import java.io.*;
class BuffereReadFile{
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("C:/Users/jitendra kumar/Documents/Git_Work/i_o_stream/testout1.txt");
			
			BufferedInputStream bout=new BufferedInputStream(fin);
			int i;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}