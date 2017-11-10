import java.awt.*;
class LabelTest extends Frame {
	Panel p;
	Label label1, label2, label3;
	public LabelTest(String str) {
		super(str);
		p=new Panel();
		label1=new Label("이대");
		label2=new Label("강남", Label.CENTER);
		label3=new Label("종로", Label.LEFT);
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		p.add(label1); 	p.add(label2); 	p.add(label3);
		add(p);
		setSize(300,300);
		setVisible(true);	
	}
}
public class Main
{
	public static void main(String[] args) 
	{
		new LabelTest("레이블 테스트");
	}
}
import java.awt.*;
class FlickeringLabel extends Label implements Runnable{
	public FlickeringLabel(String text) {
		super(text);
		Thread th = new Thread(this);
		th.start();
	}

	public void run() {
		int n=0;
		while(true) { 
			if(n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n == 0) n = 1;
			else n = 0;
			try {
				Thread.sleep(500); 
			}
			catch(InterruptedException e) {
				return; 
			}
		}
	}
}
class FlickeringLabelEx extends Frame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
	
		// 깜박이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜박");
		// 깜박이지 않는 레이블 생성
		Label label = new Label("안깜박");
		// 깜박이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박");
		Panel p = new Panel();
		p.add(fLabel);
		p.add(label);
		p.add(fLabel2);
		add(p);
		setSize(300,150);
		setVisible(true);
	}
}
public class Main{
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}

