package city.ahrensburg;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int wahl = 0;
        do {
            System.out.println("Bitte w#hlen Sie eine Option");
            

            wahl = scanner.nextInt();


        } while (wahl != 0);
        scanner.close();
    }
}
