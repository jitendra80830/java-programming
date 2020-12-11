//Menu selection using do-while loop and switch-case

public class Switching1{
	public static void main(String args[]) throws java.io.IOException{
		
		char choice;
		do{
			System.out.println("Help on");
			System.out.println("2.switch");
			System.out.println("3.while");
			System.out.println("4.d0-while");
			System.out.println("5.for");
			System.out.println("choose one");
			
			choice=(char) System.in.read();
		}while(choice<'1' || choice>'5');
		
		
		System.out.println("\n");
		switch(choice){
			case '1':
			System.out.println("the.if:\n");
			System.out.println("if (condition) statement;");
			System.out.println("else statement");
			break;
			case '2':
			System.out.println("The switch:\n");
			System.out.println("switch expression");
			System.out.println("case constatnt");
			System.out.println("statement sequnce");
			System.out.println("break;");
			System.out.println("//");
			System.out.println(" }");
			break;
			case'3':
			System.out.println("The while");
			System.out.println("while(condition) satatement;");
			break;
			case'4':
			System.out.println("the do-while:");
			System.out.println("do {");
			System.out.println("statements;");
			System.out.println("} while (condition);");
			break;
			case'5':
			System.out.println("the for:");
			System.out.println("for (int; condition; iteration:");
			System.out.println("statements:");
			break;
		}
	}
}