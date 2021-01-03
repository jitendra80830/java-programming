//Applet programming
import java.awt.*;
import java.applet.*;

public class Sample extends Applet{
	String msg;
	//Set the foreground and background color
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg="Inside init()....";
	}
	//initializing thhe string to be display
	public void start(){
		msg+="Inside start()...";
	}
	//Display msg in applet window
	public void paint(Graphics g){
		msg+="Inside paint()..";
		g.drawString(msg,10,30);
	}
}