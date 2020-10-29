/*Input with datainputstream Interest culculater program*/
import java.io.*;
class InterestCul{
	public static void main(String args[]) throws Exception{
		Float principalAmount=new Float(0);
		Float rateOfInterest=new Float(0);
		int numberOfYear=0;
		DataInputStream in=new DataInputStream(System.in);
		String tempString;
		System.out.println("Enter the principal amount: ");
		System.out.flush();
		tempString=in.readLine();
		
		principalAmount=Float.valueOf(tempString);
		System.out.println("Enter rate of interest: ");
		
		System.out.flush();
		tempString=in.readLine();
		rateOfInterest=Float.valueOf(tempString);
		System.out.println("Enter number of years: ");
		System.out.flush();
		tempString=in.readLine();
		numberOfYear=Integer.parseInt(tempString);
		//input is over now culculate the interest
		Float interestTotal=principalAmount*rateOfInterest*numberOfYear;
		System.out.println("Total inteset= "+interestTotal);
	}
}