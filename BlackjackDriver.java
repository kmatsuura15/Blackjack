
import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackDriver 
{
  
  public static void main(String args[])
  {
   Scanner kb = new Scanner(System.in); 
   int computerSum = 0;  
   boolean move = true; // if it's the player's move or not
   int numberofCards = 4;  //There are four cards in play 0-3.  If player or computer wants to hit,
                           //i can put deck[numberofCards] to give them the next card.  then just do numberofCards++ so if they hit again, it will give
                           // next card.
   Card hand;
   Card[] deck = new Card[52];
   deck[0] = new Card("Ace of Hearts", 1);
   deck[1] = new Card("Ace of Clovers", 1);
   deck[2] = new Card("Ace of Clubs", 1);
   deck[3] = new Card("Ace of Diamonds", 1);
   deck[4] = new Card("2 of Hearts", 2);
   deck[5] = new Card("2 of Clovers", 2);
   deck[6] = new Card("2 of Clubs", 2);
   deck[7] = new Card("2 of Diamonds", 2);
   deck[8] = new Card("3 of Hearts", 3);
   deck[9] = new Card("3 of Clovers", 3);
   deck[10] = new Card("3 of Clubs", 3);
   deck[11] = new Card("3 of Diamonds", 3);   
   deck[12] = new Card("4 of Hearts", 4);
   deck[13] = new Card("4 of Clovers", 4);
   deck[14] = new Card("4 of Clubs", 4);
   deck[15] = new Card("4 of Diamonds", 4);   
   deck[16] = new Card("5 of Hearts", 5);
   deck[17] = new Card("5 of Clovers", 5);
   deck[18] = new Card("5 of Clubs", 5);
   deck[19] = new Card("5 of Diamonds", 5);   
   deck[20] = new Card("6 of Hearts", 6);
   deck[21] = new Card("6 of Clovers", 6);
   deck[22] = new Card("6 of Clubs", 6);
   deck[23] = new Card("6 of Diamonds", 6);   
   deck[24] = new Card("7 of Hearts", 7);
   deck[25] = new Card("7 of Clovers", 7);
   deck[26] = new Card("7 of Clubs", 7);
   deck[27] = new Card("7 of Diamonds", 7);   
   deck[28] = new Card("8 of Hearts", 8);
   deck[29] = new Card("8 of Clovers", 8);
   deck[30] = new Card("8 of Clubs", 8);
   deck[31] = new Card("8 of Diamonds", 8);  
   deck[32] = new Card("9 of Hearts", 9);
   deck[33] = new Card("9 of Clovers", 9);
   deck[34] = new Card("9 of Clubs", 9);
   deck[35] = new Card("9 of Diamonds", 9);   
   deck[36] = new Card("10 of Hearts", 10);
   deck[37] = new Card("10 of Clovers", 10);
   deck[38] = new Card("10 of Clubs", 10);
   deck[39] = new Card("10 of Diamonds", 10);   
   deck[40] = new Card("Jack of Hearts", 10);
   deck[41] = new Card("Jack of Clovers", 10);
   deck[42] = new Card("Jack of Clubs", 10);
   deck[43] = new Card("Jack of Diamonds", 10);  
   deck[44] = new Card("Queen of Hearts", 10);
   deck[45] = new Card("Queen of Clovers", 10);
   deck[46] = new Card("Queen of Clubs", 10);
   deck[47] = new Card("Queen of Diamonds", 10); 
   deck[48] = new Card("King of Hearts", 10);
   deck[49] = new Card("King of Clovers", 10);
   deck[50] = new Card("King of Clubs", 10);
   deck[51] = new Card("King of Diamonds", 10);
   
   
   Scanner in = new Scanner(System.in);

   System.out.println(" Blackjack ");
   Dealer.shuffle(deck); //calls shuffle method

   if (move == true)  // if it's the players turn.
   { 

     System.out.println(" Your cards are " + deck[0].getStr() + " and " + deck[1].getStr());
     playerSum = deck[0].getNum() + deck[1].getNum();
     System.out.println(" Sum: " + playerSum );  //hand and sum of player's cards
     while (move == true)
     {
       if (playerSum == 21)
       {
         System.out.println("You got 21! Let's see if the computer can match you!");
         move = false;
       }
       if (playerSum > 21)
       {
         System.out.println("You bust! Try again.");
         move = false;
       }
       if (playerSum < 21)  
       {
         System.out.println(" Hit or Stand? " +  "press 1 to hit, 2 to stand. ");
         int hitorStand = kb.nextInt();
         if (hitorStand == 1)  //if player hits
         {
           System.out.println("You recieved " + deck[numberofCards].getStr());  //add card to player's hand.
           playerSum += deck[numberofCards].getNum();  //add to sum
           System.out.println("Sum: " + playerSum);
           numberofCards++; 
         }
         if (hitorStand == 2)  // if player stands
         {
           move = false;
           System.out.println("You stand. Computers turn");
         }         
       }  

     }

   }
   
   
   if (move == false && playerSum <= 21)  //if they player finished their turn and didn't bust, computer's turn.
   {
     computerSum = deck[2].getNum() + deck[3].getNum();  //computers hand
     System.out.println("Computer's hand is " + deck[2].getStr() + " and " + deck[3].getStr());
     System.out.println("Computer's sum: " + computerSum);
     while (computerSum < 17)  //hit if computer's hand is less than 17.
     {
       computerSum += deck[numberofCards].getNum();
       numberofCards++;
       System.out.println("Computer hits. Computer gets " + deck[numberofCards].getStr());
       System.out.println("Computer sum: " + computerSum);
     }
     if (computerSum == 21 && playerSum == 21)
     {
       System.out.println("You both tied!");
     }
     if (computerSum > playerSum && computerSum <= 21)
     {
       System.out.println("Computer won!");
     }
     if (playerSum > computerSum)
     {
       System.out.println("You won!");
     }
     
     if (computerSum > 21)
     {
       System.out.println("You win!");
     }
     
       
   }
  }
}