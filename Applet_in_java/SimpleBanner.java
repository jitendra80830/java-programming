/* A Simple Banner applet*/
import java.awt.*;
import java.applet.*;
public class SimpleBanner extends Applet implements Runnable{
	String msg="A Simple Moviing Banner";
	Thread t=null;
	int state;
	boolean stopFlag;
	
	//set color and initializing Thread.
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	
	//start Thread.
	public void start(){
		
		t=new Thread(this);
		stopFlag=false;
		t.start();
	}
	//Entry point for the thread that runs the banner
	public void run(){
		char ch;
		//display banner
		for( ; ; ){
			try{
				repaint();
				Thread.sleep(250);
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				
				msg+=ch;;
				if(stopFlag)
					break;
			}catch(InterruptedException e){}
		}
	}
	//displaying the banner 
	public void paint(Graphics g){
		g.drawString(msg,50,30);
	}
}
/*
<applet code="SimpleBanner.class" width="300" height="300"></applet>
*/

		
	