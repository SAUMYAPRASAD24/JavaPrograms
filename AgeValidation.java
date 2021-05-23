class AgeValidation{  
    void TestValidAge(int age)throws InvalidAgeException{  
        if(age<15)  
            throw new InvalidAgeException("not valid age");  
        else  
            System.out.println("valid age");  
   }  
   
public static void main(String[] args){  
    try{  
        TestValidAge(25);  
    }catch(Exception e){
        System.out.println("Exception occured: " + e);
      }  
 
  }  
} 
class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  




