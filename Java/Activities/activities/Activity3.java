package activities;

public class Activity3 {
    public static void main(String args[]){
        double seconds = 1000000000;
        double earthSec = 31557600;
        double mercurySec = 0.2408467;
        double venusSec = 0.61519726;
        double marsSec = 1.8808158;
        double jupiterSec = 11.862615;
        double saturnSec = 29.447498;
        double uranusSec = 84.016846;
        double neptuneSec = 164.79132;

        System.out.println("Age on Mercury: " + seconds / earthSec / mercurySec);
        System.out.println("Age on Venus: " + seconds / earthSec / venusSec);
        System.out.println("Age on Earth: " + seconds / earthSec);
        System.out.println("Age on Mars: " + seconds / earthSec / marsSec);
        System.out.println("Age on Jupiter: " + seconds / earthSec / jupiterSec);
        System.out.println("Age on Saturn: " + seconds / earthSec / saturnSec);
        System.out.println("Age on Uranus: " + seconds / earthSec / uranusSec);
        System.out.println("Age on Neptune: " + seconds / earthSec / neptuneSec);
    }
}
