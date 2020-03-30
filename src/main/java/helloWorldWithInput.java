/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
import java.util.Scanner;

public class helloWorldWithInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number 1 to 10");

        int number = keyboard.nextInt();

        System.out.println("You chose " + number + " as your number!");

        for (int i = 1; i <= number; i++) {
            System.out.println(i + "." + "  Hello World!");
        }
    }
}
