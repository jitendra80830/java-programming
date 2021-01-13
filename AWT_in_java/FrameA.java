//Create a Frame
import java.awt.*;

public class FrameA{
	public static void main(String[] args){
		Frame frame=new Frame("Frame in java");
		frame.resize(500,500);
		frame.setBackground(Color.blue);
		
		frame.show();
	}
}