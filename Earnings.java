import java.util.Scanner;

public class Earnings
{
 public static void main(String args[])
 {
  Scanner JKS = new Scanner(System.in);
  
  double hours, GrossPay, NetPay, rate = 16.5, tax;
  
  System.out.println("Enter the amout hours you worked");
  hours = JKS.nextDouble();
  
  GrossPay = hours * rate;
  tax = GrossPay * .1306;
  NetPay = GrossPay - tax;
  
  System.out.printf("Your Net Pay for your "+ hours+" hours shifts is $%,1.2f\n",NetPay);
   
 }//end main
}//end class