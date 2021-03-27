package gameCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayTheGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerNum=0;
        System.out.println("Welcome to the game!\nEnter the number of players to begin: ");
        while (!(input.hasNextInt())){//created while loop till players enter valid number
        System.out.println("Please enter valid number");
        input.next();

        }
        playerNum = input.nextInt();
        String[] spades = { "2_S", "3_S", "4_S", "5_S", "6_S", "7_S", "8_S", "9_S", "10_S", "J_S", "Q_S", "K_S","A_S"};//created arrays for spades
        String[] hearts = { "2_H", "3_H", "4_H", "5_H", "6_H", "7_H", "8_H", "9_H", "10_H", "J_H", "Q_H", "K_H","A_H"};//created arrays for hearts
        String[] diamonds = { "2_D", "3_D", "4_D", "5_D", "6_D", "7_D", "8_D", "9_D", "10_D", "J_D", "Q_D", "K_D","A_D"};//created arrays for diamonds
        String[] clubs = { "2_C", "3_C", "4_C", "5_C", "6_C", "7_C", "8_C", "9_C", "10_C", "J_C", "Q_C", "K_C","A_C"};//created arrays for clubs
        List<String> deck = new ArrayList<String>();//created Arraylist deck
        Collections.addAll(deck, hearts);//added hearts to deck ArrayList
        Collections.addAll(deck, spades);//added spades to deck ArrayList
        Collections.addAll(deck, diamonds);//added diamonds to deck ArrayList
        Collections.addAll(deck, clubs);//added clubs to deck ArrayList

        if (playerNum > 1 && playerNum < 9) {
            System.out.println("Lets start");
        int numOfCardsforAPlayer = deck.size() / playerNum;
        for (int i = 0; i < playerNum; i++) {
        int initialIindex = i * numOfCardsforAPlayer;
        int lastIndex = initialIindex + numOfCardsforAPlayer;

        List<String> player = deck.subList(initialIindex, lastIndex);

        System.out.println("for player # " + (i + 1) + player);
            }
        } else if (playerNum>=8 &&playerNum<=16) {
            System.out.println("Please divide the players in two groups");
        } else if (playerNum <= 1) {
            System.out.println("Not enough players to continue.Please add more players.");

        } else {
            System.out.println(" Sorry, the number of players has been exceeded.");
        }


    }

}
