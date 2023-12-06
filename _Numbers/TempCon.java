package _Numbers;

public class TempCon {
    public static void main(String[] args) {
    CelToFer(45);
    FerToCel(113);
    }

    public static void CelToFer(float celsius){
        float fahrenheit;
        System.out.println("Program to convert Celsius to Fahrenheit" );
        System.out.println("Please give the Celsius Temperature");
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Fahrenheit = %.2f",fahrenheit);
    }

    public static void FerToCel(float fahrenheit){
        float celsius;
        System.out.println("Program to convert Fahrenheit to Celsius" );
        System.out.println("Please give the Fahrenheit Temperature");
        celsius = ((fahrenheit-32)*5)/9;
        System.out.printf("Celsius = %.2f",celsius);
    }
}
