//Applet Calculater
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletCalculater1 extends Applet implements ActionListener {
	
	String msg="";
	int v1,v2,result;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,mull,div,clear,mod,EQ;
	char op;
	public void init(){
		Color k=new Color(120,89,90);
		setBackground(k);
		t1=new TextField(10);
		GridLayout g1=new GridLayout(2,0);
		setLayout(g1);
		add(t1);
		for(int i=0;i<10;i++){
			b[i]=new Button(""+i);
		}
		add=new Button("+");
		sub=new Button("-");
		mull=new Button("x");
		div=new Button("/");
		mod=new Button("%");
		clear=new Button("CLEAR");
		EQ=new Button("=");
		t1.addActionListener(this);
		for(int i=0;i<10;i++){
			
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mull);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		for(int i=0;i<10;i++){
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mull.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if(Character.isDigit(ch))
			
			
			t1.setText(t1.getText()+str);
		else
			if(str.equals("+")){
				v1=Integer.parseInt(t1.getText());
				op='+';
				t1.setText("");
			}
			else if(str.equals("-")){
				v1=Integer.parseInt(t1.getText());
				op='-';
				t1.setText("");
			}
			else if(str.equals("x")){
				v1=Integer.parseInt(t1.getText());
				op='x';
				t1.setText("");
			}
			else if(str.equals("/")){
				v1=Integer.parseInt(t1.getText());
				op='/';
				t1.setText("");
			}
			else if(str.equals("%")){
				v1=Integer.parseInt(t1.getText());
				op='%';
				t1.setText("");
			}
			if(str.equals("=")){
				v2=Integer.parseInt(t1.getText());
				if(op=='+')
					result=v1+v2;
				else if(op=='-')
					result=v1-v2;
				else if(op=='x')
					result=v1*v2;
				else if(op=='/')
					result=v1/v2;
				else if(op=='%')
					result=v1%v2;
				t1.setText(""+result);
			}
			if(str.equals("clear")){
				t1.setText("");
			}
	}
}
	
		