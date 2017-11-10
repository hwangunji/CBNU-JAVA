
import javax.swing.*;
import java.awt.*; 
import javax.swing.border.*;

public class BoxLayoutTest extends JFrame {
	private static final long serialVersionUID = 1L;

	public BoxLayoutTest(){
		super( "BoxLayout��������" );
		JRadioButton r1,r2;
	    //�ڽ� ���̾ƿ� �Ŵ����� �����ϰ� �����̳ʿ� ����
	    setLayout(new BorderLayout());
		//���� ��ġ �ڽ� ���̾ƿ��� ����
	    Box left = Box.createVerticalBox();
	    //���� ���� ��ġ�ϱ� ���� ���� ������Ʈ�� ���� Ȯ��
	    left.add(Box.createVerticalStrut(30)); 
	    //������ư�� ���� ��ư �׷� ����
	    ButtonGroup radioGroup = new ButtonGroup();
	    //��ư ��ü�� ���� �� ��ư �׷쿡 �߰�
	    radioGroup.add(r1 = new JRadioButton("�߱�")); 
	    //��ư ��ü�� Box��ü left�� �߰�
	    left.add(r1);                                  
	    left.add(Box.createVerticalStrut(30));              
	    radioGroup.add(r2 = new JRadioButton("�౸"));
	    left.add(r2);
	
		   
	    //Box��ü left�� �гο� �߰�
	    JPanel leftPanel = new JPanel(new BorderLayout());
	    //�г��� �׵θ����� ��Īȿ���� ����
	    leftPanel.setBorder(
		   new TitledBorder( new EtchedBorder(),"������"));       
	    leftPanel.add(left, BorderLayout.CENTER);

	    //�������� ��ġ�ϴ� �ڽ����̾ƿ� ����
	    Box right = Box.createVerticalBox();
	    right.add(Box.createVerticalStrut(30));  
	    //üũ�ڽ��� ������ �ڽ����̾ƿ��� �߰�
	    right.add(new JCheckBox("C���"));
	    right.add(Box.createVerticalStrut(30));             
	    right.add(new JCheckBox("Java"));
	    right.add(Box.createVerticalStrut(30));             
	    right.add(new JCheckBox("C#"));
	    right.add(Box.createVerticalStrut(30));             
	    right.add(new JCheckBox("Phython"));
	       
	
	    JPanel rightPanel = new JPanel(new BorderLayout());
	    rightPanel.setBorder(
		     new TitledBorder(new EtchedBorder(), "���α׷��� ���"));  
	    rightPanel.add(right, BorderLayout.CENTER);
		
	    //�������� ��ġ�ϴ� �ڽ����̾ƿ��� ������
	    //�г�leftPanel�� rightPanel�� �� �ڽ� ���̾ƿ��� ��ġ
	    Box center = Box.createHorizontalBox();
		center.add(leftPanel);
		center.add(rightPanel);
		add(center,  BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BoxLayoutTest box = new BoxLayoutTest();
		box.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
