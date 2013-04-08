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
        float amount;
        float rate;
        float time;
        float interest;
        float total;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. Welcome to the Java Loan and Interest Calculator!");
        System.out.print("Enter your loan amount: ");
        amount = input.nextFloat();
        System.out.print("Enter your interest rate: ");
        rate = (float) (input.nextFloat() * 0.01);
        System.out.print("Enter your time: ");
        time = input.nextFloat();
        interest = amount * rate * time;
        System.out.println("The interest is " + interest + ".");
        total = amount + interest;
        System.out.println("The total cost is " + total + ".");
        System.out.println("Created by Jangsoft");
    }
}
