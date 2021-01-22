public class CityGuide{
	public static void main(String[] args){
		char choice;
		System.out.println("Select Your choice");
		System.out.println("M -> Madars");
		System.out.println("B -> Bombay");
		System.out.println("C -> Culcutta");
		System.out.println("choice --->");
		System.out.flush();
		try{
			switch(choice = (char) System.in.read())
			{
				case 'M':
				case 'm': System.out.println("madras: Booklet 5");
				break;
				
				case 'B':
				case 'b': System.out.println("Bombay: Booklet 9");
				break;
				
				case 'C':
				case 'c': System.out.println("Calcutta : Booklet 15");
				break;
				
				default: System.out.println("Invalid choice (IC)");
			}
		}
		catch(Exception e)
		{
			System.out.println("I/o Error");
		}
	}
}
				