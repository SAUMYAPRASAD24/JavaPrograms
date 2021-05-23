class CheckPallindrome
{
    public static void main(String[] args) {
        String str = "radar";
        //String str = "saumya";
        
        //String rev;         // don't forget to initialise
        //String rev = null;  //doesn't work for strings
        String rev = " ";     //empty string works

        int length = str.length();
 
        for ( int i = length - 1 ; i >= 0; i-- )   // if int i = length, then StringIndexOutOfBoundsException
            rev = rev + str.charAt(i);
 
        if (str.equals(rev))                        
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
 
    }
}






