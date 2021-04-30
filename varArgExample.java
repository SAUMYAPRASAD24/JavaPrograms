class varArgExample
{
    public static void main(String[] args) {
        varArgExample ref = new varArgExample();
        System.out.println("result: " + ref.sumOfNumbers(6,4));
        System.out.println("result: " + ref.sumOfNumbers(16,44));
    }
    int sumOfNumbers(int... numbers){
        int sum = 0;  // Initialise for local variable
        //  for loop used becoz it works as an array....
        for(int i: numbers){
            sum += i;
        }
        return sum;
    }
}