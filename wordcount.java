import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class wordcount implements ActionListener{ 
 		JLabel heading=new JLabel(" Word Counter ");
 		JTextField input=new JTextField();
 		JButton submit=new JButton("SUBMIT");
 		Font font=(new Font("Monospaced",Font.BOLD,30));
		Font font1=(new Font("Arial",Font.BOLD,60));
		Font font3=(new Font("Dialog",Font.BOLD,30));
 		JLabel  result=new JLabel(" ");	
 	
 	wordcount()
 	{
 	    JFrame frame=new JFrame();
 		frame.setLayout(null);
 		frame.setSize(1000,1000);
 		frame.setVisible(true);

 		
 		
 		frame.getContentPane().setBackground(Color.gray);
 		heading.setFont(font1);
 		heading.setBounds(710,50,700,100);
 		heading.setForeground(Color.red);
 		input.setBounds(410,200,1100,60);
 		input.setFont(font);
 		frame.add(heading);
 		frame.add(input);
 		
 		submit.setBounds(775,570,400,70);
		submit.setBackground(Color.green);
		submit.setFont(font3);
		frame.add(submit);
		submit.addActionListener(this);
		
		result.setBounds(860,370,1000,70);
		result.setForeground(Color.white);
		result.setFont(font3);
		frame.add(result);
 		
 		
 		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	
 	}
 	public  void actionPerformed(ActionEvent e)
 	{
 		String str=input.getText();
	  	// String str4=str.replace("[\n]+", " ");
	  	// System.out.println (str4);
	   	String str3= str.replaceAll("( )+", " ");
	  	//System.out.println (str3);
  		String str1=str3.trim();
  		//	System.out.println (str1);
  		int cnt=0;
  		for(int i=0;i<str1.length();i++)
  		{
  			char ch=str1.charAt(i);
  			if(ch==' ')
  			{
  				cnt++;
  			}
  			else if(ch==','||ch=='.'||ch=='?')
  			{
  				continue;
  			}
  		}
  		String dd=String.valueOf(cnt+1);
  		result.setText(" Total Words: "+dd);
 	}	
    public static void main (String[] args) {
 		wordcount t=new wordcount();	
    }
}