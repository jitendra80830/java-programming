/*Code Sharing through super concept*/
class cat{
	void speak(){
		System.out.println("Meaon!");
	}
}
class petcat extends cat{//this type ov cat
	void speak(){
		System.out.println("Mean");
	}
}
class magicCat extends cat{ // this is also type of cat class
	static boolean noOne;
	void speak(){
		if(noOne){
			super.speak();
		}else{
			System.out.println("HelloWorld");
		}
	}
}
class Demonstration_66{
	public static void main(String[] args){
		petcat c1=new petcat();
		magicCat c2=new magicCat();
		c2.noOne=true;
		c2.speak();
		c1.speak();
		c2.noOne=false;
		c2.speak();
	}
}
	
	

