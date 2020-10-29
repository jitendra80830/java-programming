//program to check for command line arguments
class CommandLine{
	public static void main(String args[]){
		//check length of array if greater than 0
		if(args.length>0)
		{
			System.out.println("The command line "+"arguments are:");
			
			for (String val:args)
				System.out.println(val);
		}
		else
			System.out.println("No aergument line"+"argument found");
	}
}