class Factorial{
    public static void main (String[] args) {
        System.out.println("enter a number: ");
        int inum = new java.util.Scanner(System.in).nextInt();
        int c, factorial = 1;
        for ( c = 1 ; c <= inum ; c++ ){
            factorial = factorial*c;
        }
        System.out.println("Factorial of "+inum+" is = "+factorial);
    }
}