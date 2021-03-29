package gameCard;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static gameCard.PlayTheGame.*;

class PlayTheGameTest {



        @BeforeClass
        public static void beforeTestsMessage(){
            System.out.println("Unit test starts ");
        }

        @AfterClass
        public static void afterTestsMessage(){
            System.out.println("Unit test is end");
        }

        @Test
        public void numberOfCards() {//numbers of card is equals 52;
            int numOfCardsInDeck = 52;
            int actual = deck.size();
            assertEquals(numOfCardsInDeck, actual);
        }

        @Test
        public void deckContainsSuits() {//will test deck suits
            assertTrue(deck.containsAll(Arrays.asList(PlayTheGame.spades)));
            assertTrue(deck.containsAll(Arrays.asList(PlayTheGame.hearts)));
            assertTrue(deck.containsAll(Arrays.asList(PlayTheGame.diamonds)));
            assertTrue(deck.containsAll(Arrays.asList(PlayTheGame.clubs)));

        }

        @Test
        public void suitesSize() {//will test suits size
            int suitSize = 13;

            assertEquals(suitSize, spades.length);
            assertEquals(suitSize, hearts.length);
            assertEquals(suitSize, diamonds.length);
            assertEquals(suitSize, clubs.length);

        }




    }
