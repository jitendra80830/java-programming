/*uses of destroy() methods in an appllet*/
import java.applet.Applet;
import java.awt.Graphics;
public class AppletLifecycle extends Applet{
	StringBuffer strBuffer;
	public void init(){
		strBuffer=new StringBuffer();
		addItem("initializing the applet");
	}
	public void start(){
		addItem("Starting the applet");
	}
	public void staop(){
		addItem("Stoping the applet");
	}
	public void destroy(){
		addItem("unloading the applet");
	}
	void addItem(String word){
		System.out.println(word);
		strBuffer.append(word);
		repaint();
	}
	public void paint(Graphics g){
		//draw a rectangle around the applet's display area
		g.drawRect(0,0,getWidth()-1,getHeight()-1);
		//displaying the String inside the rectangle
		g.drawString(strBuffer.toString(),10,20);
	}
}
/*
<applet code="AppletLifecycle.class" width="300" height="200"></applet>
*/
