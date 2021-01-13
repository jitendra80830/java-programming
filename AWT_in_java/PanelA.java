//Create a Panel
import java.awt.*;

public class PanelA{
	public static void main(String[] args){
		Frame frame=new Frame("Frame in Panel");
		Panel panel=new Panel();
		frame.setSize(400,400);
		frame.setBackground(Color.red);
		frame.setLayout(null);
		panel.setSize(200,200);
		panel.setBackground(Color.blue);
		frame.add(panel);
		frame.show();
	}
}
