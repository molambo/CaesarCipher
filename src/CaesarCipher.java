import java.util.*;

// Class that performs a Caesar Cipher on
public class CaesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the plain text message that you would like encrypted: ");
        String message = scanner.next();

        int length = message.length();

        System.out.println("Enter the Key: ");
        int key = scanner.nextInt();

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String special = "!@#$%^&*(){}|[]:;',.<>/?~`-=+";
        String numbers = "0123456789";

        System.out.print("The encrypted text is: ");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 26; j++) {
                if (j < special.length() && message.charAt(i) == special.charAt(j)) {
                    System.out.print(special.charAt((j + key) % special.length()));
                }

                else if (j < numbers.length() && message.charAt(i) == numbers.charAt(j)) {
                    System.out.print(numbers.charAt((j + key) % numbers.length()));
                }

                else if (message.charAt(i) == lowerCase.charAt(j)) {
                    System.out.print(lowerCase.charAt((j + key) % 26));
                }

                else if (message.charAt(i) == upperCase.charAt(j)) {
                    System.out.print(upperCase.charAt((j + key) % 26));
                }
            }
        }

        System.out.println();

    }

}
