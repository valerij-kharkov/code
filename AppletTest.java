import java.awt.*;
import java.applet.*;
/*<applet code="AppleTest" width =300 height=300>
</applet>
*/
public class AppletTest extends Applet implements Runnable{
	String msg= " You simply the best";
	Thread t;
	int state;
	 boolean stopFlag;
	
public void init(){ setBackground(Color.BLUE.darker());
setForeground(Color.MAGENTA.brighter());}

public void start(){
	t=new Thread(this);
	stopFlag=false;
	t.start();
	}

public void run(){
for(;;){
	try {
		repaint();
		
		Thread.sleep(250);

		if(stopFlag)
			break;
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	}

public void stop(){
	//stopFlag=true;
	//t=null;
	
}

public void paint(Graphics g){
	String ch;
	ch=msg.substring(0, 1);
	msg=msg.substring(1,msg.length());
	msg+=ch;
	
	g.drawString(msg, 30, 50); 
	showStatus(msg);
}

//void retro (){}


}
