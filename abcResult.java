class abcResult {

	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]); 
		int c = Integer.parseInt(args[2]);

		int result = a + b + c;
		if(a>=40)
			System.out.println("pass, Total marks: " + result);
		else
			System.out.println("fail in a, Total marks:" + result);
		if(b>=40)
			System.out.println("pass, Total marks: " + result);
		else
			System.out.println("fail in b, Total marks:" + result);
		if(c>=40)
			System.out.println("pass, Total marks: " + result);
		else
			System.out.println("fail in c, Total marks:" + result);
}

//		if(a>=40){
//			if(b>=40)
//				if(c>=40)
//					if(result>=125)
//						System.out.println("pass, marks:" + result);
//		else
//			System.out.println("fail, marks:" + result);


