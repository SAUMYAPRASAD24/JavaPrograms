class ReverseThisString {
   public static void main(String[] args) {

      String str = "This is will reverse your string";
      System.out.println("original: " + str);
      System.out.print("Reverse: ");
      
      char []revStr = str.toCharArray();

      for (int i = revStr.length - 1 ; i >= 0 ; i--) 
        System.out.print(revStr[i]);
   }
}




