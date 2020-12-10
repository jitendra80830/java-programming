//Break statement
class Break1{
	public static void main(String[] args){
		for(int i=1; ; i++){
			if(i%10==0)break; //terminated loop
			System.out.println("i:"+i);
		}
		System.out.println("Loop is completed");
	}
}
			