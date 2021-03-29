package gameCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayTheGame {
    static List<String> deck = new ArrayList<String>();
    static public String[] spades = {"2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS", "AS"};//created arrays for spades
    static public String[] hearts = {"2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH", "AH"};//created arrays for hearts
    static public String[] diamonds = {"2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD", "AD"};//created arrays for diamonds
    static public String[] clubs = {"2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC", "AC"};//created arrays for clubs

    static {


        Collections.addAll(deck, hearts);//added hearts to deck ArrayList
        Collections.addAll(deck, spades);//added spades to deck ArrayList
        Collections.addAll(deck, diamonds);//added diamonds to deck ArrayList
        Collections.addAll(deck, clubs);//added clubs to deck ArrayList
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerNum;
        System.out.println("Welcome to the game!\nEnter the number of players to begin: ");
        while (!(input.hasNextInt())){//created while loop till players enter valid number
        System.out.println("Please enter valid number");
        input.next();

        }
        playerNum= input.nextInt();
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
