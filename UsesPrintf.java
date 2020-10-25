//Uses of printf()
class UsesPrintf{
	public static void main(String args[]){
		int x=100;
		System.out.printf("printing simple integer:x=%d\n",x);
		System.out.printf("Formated with precition:PI=%.2f\n",Math.PI);
		
		float n=5.2f;
		System.out.printf("formatted to spacific with:n=%.2f\n",n);
		
		n=2324435.2f;
		System.out.printf("Formatted to right margine:n=%6.2f\n",n);
	}
}