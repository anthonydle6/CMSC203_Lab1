package movie;

/*
 * Class: CMSC203 23488 
 * Instructor: Huseyin Aygun
 * Description: CMSC203 Lab 1 Task 2
 * Due: 09/30/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Anthony Le
*/

import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Movie movie = new Movie();
        int tries = 1;

        while (tries > 0) {
            System.out.println("Enter title of movie:");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            System.out.println("Enter rating of movie:");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            System.out.println("Enter number of tickets sold for this movie:");
            int movies_sold = keyboard.nextInt();
            movie.setSoldTickets(movies_sold);

            System.out.println(movie.toString());

            System.out.println("Do you want to enter another? (y or n)");
            keyboard.nextLine(); 
            String input = keyboard.nextLine();

            if (input.equals("n"))
                tries = 0;
            else
                tries++;
        }
        System.out.println("Goodbye");
        keyboard.close();
    }
}
