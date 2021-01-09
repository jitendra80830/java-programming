//create a frame windows
import java.awt.*;
import java.applet.*;
public class AppletFrame extends Applet{
	Frame f;
	public void init(){
		f=new Frame("A frame window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void paint(Graphics g){
		g.drawString("This is in applet window",10,20);
	}
}
/*
<html>
	<body>
		<applet width="300" height="300" code="AppletFrame.class">
		</applet>
	</body>
</html>
*/
