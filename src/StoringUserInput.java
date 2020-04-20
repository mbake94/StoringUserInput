import java.util.Scanner;

public class StoringUserInput {
    public static void main (String[]args){
        String firstName, lastName, streetName, streetType, cityName, houseNumber;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        firstName = keybd.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = keybd.nextLine();
        System.out.println("Please enter your street name: ");
        streetName = keybd.nextLine();
        System.out.println("Please enter your street type: ");
        streetType = keybd.nextLine();
        System.out.println("Please enter your house number: ");
        houseNumber = keybd.nextLine();
        System.out.println("Please enter your city name: ");
        cityName = keybd.nextLine();

        System.out.printf("%s %s, %s\n%s %s %s ", firstName, lastName, houseNumber, streetName, streetType, cityName);

    }
}
