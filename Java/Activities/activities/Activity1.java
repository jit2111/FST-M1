package activities;

public class Activity1 {
    public static void main(String args[]){
        Car bmw = new Car();
        bmw.make = 2014;
        bmw.color = "Black";
        bmw.transmission = "Manual";

        bmw.displayCharacterstics();
        bmw.accelerate();
        bmw.brake();
    }


}
