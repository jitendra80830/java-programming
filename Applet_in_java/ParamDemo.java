//parameter uses
import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet{
	String fontName;
	int fontSize;
	float leading;
	boolean active;
	
	//Initialize the String to be displayed
	public void start(){
		String param;
		fontName=getParameter("fontName");
		if(fontName==null)
			fontName="Not fount";
		param=getParameter("fontSize");
		try{
			if(param!=null)
				fontSize=Integer.parseInt(param);
			else
				fontSize=0;
		}catch(NumberFormatException e){
			fontSize=-1;
		}
		param=getParameter("leading");
		try{
			if(param!=null)
				leading=Float.valueOf(param).floatValue();
			else
				leading=0;
		}catch(NumberFormatException e){
			leading=1;
		}
		param=getParameter("accountEnabled");
		if(param!=null)
			active=Boolean.valueOf(param).booleanValue();
	}
	//Display parameter
	public void paint(Graphics g){
		g.drawString("Font Name "+fontName,10,20);
		g.drawString("Font Size "+fontSize,10,20);
		g.drawString("Leading "+leading,10,20);
		g.drawString("Account Active "+active,10,20);
	}
}