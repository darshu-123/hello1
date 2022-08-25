class Boxing{
	public static void main(String args[]){
		int a=10,b=5,c=5;
		int x,y;
		try{
			x=a/(b-c);
			System.out.println("Result:"+x);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		y=a/(b+c);
		System.out.println("Sum:"+x);
	}
}