// Importing myInterface package
import myInterface.*;
class Demonstration_911 implements SharedConstants{
	static void answer(int result){
		switch(result){
			case NO:
			System.out.println("NO");
			break;
			case YES:
			System.out.println("YES");
			break;
			case MAYBE:
			System.out.println("MAYBE");
			break;
			case LATTER:
			System.out.println("LATTER");
			break;
			case SOON:
			System.out.println("SOON");
			break;
			case NEVER:
			System.out.println("NEVER");
			break;
		}
	}
	public static void main(String[] args){
		Question q=new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}
		
			