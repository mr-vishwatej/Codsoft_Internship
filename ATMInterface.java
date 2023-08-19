import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ATMInterface implements ActionListener
{
  TextField wa=new TextField();
  TextField da=new TextField();
  TextField txt1=new TextField();
 JButton btn1=new JButton("Check Balance");
 JButton btn2=new JButton("Withdraw Amount");
 JButton btn3=new JButton("Deposite Amount");
  Label wl=new Label("Enter Withdraw Amount ");
  Label dl=new Label("Enter Deposite Amount ");
  Label title=new Label("WELCOME TO ATM");
 public ATMInterface() 
 {
 	
 JFrame fr=new JFrame("Simple Calculation Demo");
 
 fr.setSize(900,800);
 fr.setLayout(null);
 fr.setVisible(true);

 fr.getContentPane().setBackground(Color.LIGHT_GRAY);

 //create font 
 Font fnt=new Font("Arial",Font.BOLD,20);
 Font fl=new Font("Monospaced",Font.BOLD,30);

 Font ft=new Font("Dialog",Font.BOLD,60);
 //set display possition for controls
title.setFont(ft);
 title.setBounds(150,70,600,60);


 btn1.setBounds(310,180,220,37);
 btn2.setBounds(310,400,220,37);
 btn3.setBounds(310,590,220,37);

  wl.setBounds(70,330,400,30);
  dl.setBounds(70,520,400,30);
  wa.setBounds(480,330,320,40);
 da.setBounds(480,520,320,40);

 btn1.setFont(fnt);
 btn2.setFont(fnt);
 btn3.setFont(fnt);
 wl.setFont(fl);
 dl.setFont(fl);

txt1.setFont(fnt);


 fr.add(title);
 fr.add(wl);
 fr.add(dl);
 fr.add(wa);
 fr.add(da);
 fr.add(txt1);
 fr.add(btn1);
 fr.add(btn2);
 fr.add(btn3);

 btn1.addActionListener(this);
 btn2.addActionListener(this);
 btn3.addActionListener(this);

 fr.addWindowListener(new WindowAdapter()
 {
 public void windowClosing(WindowEvent e)
 {
 System.exit(1);
 }
 });
 }
 // code to execute after event occure
 double availableBalance=5000;
 public void actionPerformed(ActionEvent e)
 {

 if(e.getSource()==btn1)
 {

 	JFrame jf=new JFrame("Withdraw");
 	jf.setVisible(true);
 	jf.setLayout(null);
 	jf.setSize(500,300);
 	Font fg=new Font("Arial",Font.BOLD,35);

	jf.getContentPane().setBackground(Color.cyan);

 	Label wam=new Label("Your Current Balance :- ");
 	Label po=new Label("Rs."+availableBalance);
 	po.setFont(fg);

  	  wam.setFont(fg);
  	  wam.setBounds(30,100,430,30);
 	  jf.add(wam);
 	  jf.add(po);
 	  po.setBounds(150,145,200,50);


 }
 else if(e.getSource()==btn2)
 {
 	String s1=wa.getText();
 	double amt=Double.parseDouble(s1);
 	JFrame jf=new JFrame("Withdraw");
 	jf.setVisible(true);
 	jf.setLayout(null);
 	jf.setSize(500,300);
 	Font fg=new Font("Arial",Font.BOLD,35);

 	if(amt>availableBalance)
 	{
		jf.getContentPane().setBackground(Color.RED);


 		Label Withdrawa=new Label("Insufficeient Balance..!");
  	  Withdrawa.setFont(fg);
  	  Withdrawa.setBounds(30,100,430,30);
  	  jf.add(Withdrawa);
 	}

 	else
 	{
		jf.getContentPane().setBackground(Color.GREEN);
 		availableBalance-=amt;
 	

 	  Label Widrawamt=new Label("Transcantion Successful..!");
 	  Label curBal=new Label("Current Balance Rs"+availableBalance);
  	  Widrawamt.setFont(fg);
  	  curBal.setFont(fg);
  	  Widrawamt.setBounds(10,100,460,30);
  	  curBal.setBounds(10,150,470,30);
  	  jf.add(Widrawamt);
  	  jf.add(curBal);
 	}

 
 }
 else if(e.getSource()==btn3)
  {
  	JFrame jf=new JFrame("Withdraw");
 	jf.setVisible(true);
 	jf.setLayout(null);
 	jf.setSize(500,300);
 	Font fg=new Font("Arial",Font.BOLD,35);

  	String s3=da.getText();
 	double amt3=Double.parseDouble(s3);
	jf.getContentPane().setBackground(Color.GREEN);

 	availableBalance+=amt3;

 	Label wam=new Label("Transcantion Successful..!");
 	
  	  wam.setFont(fg);
  	  wam.setBounds(10,100,450,30);
 	  jf.add(wam);
 	
 	 }

	}
 public static void main(String[] arg)
 {
 ATMInterface m=new ATMInterface();
 }
}
