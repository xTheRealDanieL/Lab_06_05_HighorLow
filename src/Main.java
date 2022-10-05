import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int random = generator.nextInt(10) + 1;
        int guess = 0;
        String trash="";

        System.out.print("Please enter your guess 1-10: ");

        if(in.hasNextInt())
        {
            guess = in.nextInt();
            in.nextLine();

            if(random == guess)
            {
                System.out.println("The mystery number is: " + random);
                System.out.println("Congratulations!");
            }
            else if(random > guess)
            {
                System.out.println("The mystery number is: " + random);
                System.out.println("Unfortunately, your guess is lower than the mystery number!");
            }
            else if(random < guess)
            {
                System.out.println("The mystery number is: " + random);
                System.out.println("Unfortunately, your guess is higher than the mystery number!");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input");
        }
    }
}