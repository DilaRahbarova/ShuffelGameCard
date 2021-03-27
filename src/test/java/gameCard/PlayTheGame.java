package gameCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayTheGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the game!\nEnter the number of players to begin: ");
        int playerNum = input.nextInt();
        String[] spades = { "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS","AS"};//created arrays for spades
        String[] hearts = { "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH","AH"};//created arrays for hearts
        String[] diamonds = { "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD","AD"};//created arrays for diamonds
        String[] clubs = { "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC","AC"};//created arrays for clubs
        List<String> deck = new ArrayList<String>();//created Arraylist deck
        Collections.addAll(deck, hearts);//added hearts to deck ArrayList
        Collections.addAll(deck, spades);//added spades to deck ArrayList
        Collections.addAll(deck, diamonds);//added diamonds to deck ArrayList
        Collections.addAll(deck, clubs);//added clubs to deck ArrayList
    }

}
