class OOPCarFeatures
{
    public static void main(String[] args) {
        // Create object of char
        Car vehicle = new Car();
        vehicle.AutoSteer();
        vehicle.Navigate();
        vehicle.ChatBot();
        vehicle.DisplayScreen();
        vehicle.ChildLock();
        vehicle.seats = 2;
        System.out.println("Number of seats: " + vehicle.seats);
    }
}
class Car{
    int seats;
    void AutoSteer(){
        System.out.println("Make your life easy!!");
    }
    void Navigate(){
        System.out.println("your destination...");
    }
    void ChatBot(){
        System.out.println("Hi Sam");
    }
    void DisplayScreen(){
        System.out.println("display addition of number 12 & 8: " + (12+8));
    }
    void ChildLock(){
        System.out.println("Autolock featurs...");
    }
}