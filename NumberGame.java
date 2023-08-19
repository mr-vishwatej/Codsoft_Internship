import java.util.*;

class NumberGame
{
public static void main(String args[])
{
System.out.println("Welcome to Guess NumberGame ");
System.out.println("You will be asked to guess a Number to win the game ");
System.out.println("You have maximum 10 attempt limit");
Scanner sc=new Scanner(System.in);

Random no=new Random();
int k=no.nextInt(100);
int cnt=0;


for(int i=1;i<=10;i++)
{
 System.out.println("Enter The No: ");
 

 int n=sc.nextInt();
 
 if(n==k)
 {
  System.out.println("OOhhOO!,Your number is correct you win the game in "+i+"th attempt");
  cnt=1;
  break;
 }
 else if (n<k)
 {
  System.out.println("your guess number is Smaller");
 }
 else
 {
  System.out.println("your guess number is Greater");
 }
 
 }
 if(cnt!=1)
 {
  System.out.println("Sorry ! you loss the game");
 }
}
}
