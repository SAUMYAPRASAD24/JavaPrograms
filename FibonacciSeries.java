class FibonacciSeries{
	public static void main(String[] args) {
		int n = 11, firstTerm =1, secondTerm = 1;
		for (int i = 1; i<=n ; ++i) {
			System.out.print(firstTerm + " ");
			int sum = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = sum;
			
		}
	}
}