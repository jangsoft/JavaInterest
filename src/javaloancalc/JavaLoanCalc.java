/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaloancalc;

/**
 *
 * @author Jangsoft
 */
import java.util.Scanner;
public class JavaLoanCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. Welcome to the Java Loan and Interest Calculator!");
        System.out.print("Enter your loan amount: ");
        int amount = input.nextInt();
        System.out.print("Enter your interest rate: ");
        float rate = (float) (input.nextFloat() * 0.01);
        System.out.print("Enter your time: ");
        float time = input.nextFloat();
        float interest = amount * rate * time;
        System.out.println("The interest is " + interest + ".");
        float total = amount + interest;
        System.out.println("The total cost is " + total + ".");
        System.out.println("Created by Jangsoft");
    }
}
