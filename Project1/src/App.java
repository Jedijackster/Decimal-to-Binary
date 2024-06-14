import java.util.Scanner;

// Takes user input for Decimal and will translate to Binary output

public class App {

    public static String decToBin(int dec) {
        StringBuilder binOut= new StringBuilder();
        while (dec > 0) {
            int rem = dec % 2;
            binOut.insert(0, rem); 
            dec = dec / 2;
        }
        return binOut.toString();
    }


    public static void main(String[] args) throws Exception {

        Scanner obj = new Scanner(System.in);
        String userInput;
        
        System.out.println("Give Decimal input: ");
        userInput = obj.nextLine();

        // Verifies the user input a valid int
        try {
            int userInputAsInt = Integer.parseInt(userInput);
            System.out.println("You entered a valid integer: " + userInputAsInt);
            System.out.println("Your binary number is: " + decToBin(userInputAsInt));

        } catch (NumberFormatException e) {
            System.out.println("The input is not a valid integer.");
            System.exit(0);
        }



        obj.close();
    }
}
