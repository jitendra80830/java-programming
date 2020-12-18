/*Handling a random access file*/
import java.io.*;

class RandomAccFiles{
	public static void main(String args[]){
		RandomAccessFile file=null;
		try{
			file=new RandomAccessFile("rand.txt","rw");
			
			//Writing to files
			file.writeChar('x');
			file.writeInt(555);
			file.writeDouble(3.14159);
			
			file.seek(0);//got0the begnning
			
			//Reading from the files
			System.out.println(file.readChar());
			System.out.println(file.readInt());
			System.out.println(file.readDouble());
			
			file.seek(2);
			System.out.println(file.readInt());
			
			//Go to the end and append false to the file
			file.seek(file.length());
			file.writeBoolean(false);
			
			file.seek(4);
			System.out.println(file.readBoolean());
			file.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
			
		