package nestedparenthesis;

import java.util.Scanner;

public class NestedParenthesis {
    public static void main(String[] args) {
        System.out.println("Nested Parenthesis:\n");
        System.out.println("Given a string input consisting solely of open and closed parentheses,");
        System.out.println("return true if the parentheses are properly nested and false otherwise.");
        System.out.println("Let the parenthesis be stricted to '(' and ')'\n");

        Scanner scanner = new Scanner(System.in);

        String input = "";
        int check = 0; // Increment for every '(' and decrement for every ')'

        System.out.println("INPUT:");
        System.out.print("Enter string of parenthesis ( i.e. '(' and ')' ): ");
        input = scanner.nextLine();

        if(input.charAt(0) == ')') {
            // Nested parenthesis cannot started with a closing parenthesis: )
            check = -1;
        } else {
            // Check for nested parenthesis
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '(') {
                    check++;
                } else if(input.charAt(i) == ')') {
                    check--;
                }
            }
        }

        System.out.println(); // New line
        System.out.println("OUTPUT:");

        if(check == 0) {
            System.out.println("Input string of parenthesis are properly nested");
        } else {
            System.out.println("Input string of parentheis are NOT properly nested");
        }
    }
}
