/**
 * Created by a on 08/11/2016.
 */

import java.util.Random;

import java.util.Scanner;

public class Ch_5_7 {

    public static void kordus(int number) {

        Scanner uus= new Scanner(System.in);
        int guessedNumber=uus.nextInt();

        if (number>guessedNumber){
            System.out.println("The number is bigger! Guess again");
            kordus(number);
        }else {
            if (number<guessedNumber){
                System.out.println("The number is smaller! Guess again ");
                kordus(number);
            }else{
                System.out.println("Congratulation! "+number+" is correct.");
            }
        }
    }

    public static void main(String[] args){
        // pick a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Guess a number from 1 to 100 ");
        kordus(randomNumber);

    }}
