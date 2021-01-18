//Intractive a Applet
import java.awt.*;
import java.applet.*;

public class IntractiveApplet extends Applet{
	TextField InputA,InputB;
	public void init(){
		InputA = new TextField(8);
		InputB = new TextField(8);
		add(InputA);
		add(InputB);
		InputA.setText("23");
		InputB.setText("11");
	}
	public void paint(Graphics g){
		int x=0;
		int y=0;
		int z=0;
		String s;
		g.drawString("Enter two Value",5,10);
		try{
			s=InputA.getText();
			x=Integer.parseInt(s);
			s=InputB.getText();
			y=Integer.parseInt(s);
			z=x+y;
			s=String.valueOf(z);
			g.drawString("The sum is ",10,57);
			g.drawString(s,100,75);
		}catch(Exception e){}
	}
}
/*
<applet code="IntractiveApplet.class" height=400 width=300></applet>
*/
			
			