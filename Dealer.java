public class Dealer
{
  public Card[] getDeck(Card[] a)  
  {
   Card[] b = new Card[52];
   for (int i = 0; i < a.length; i++)
   {
    b[i] = a[i];
   }
   return b;
  }
  
  public static void shuffle(Card[] ar) //shuffles the cards
  {
    for (int i = 0; i < ar.length; i++)
    {
     int index = (int)(Math.random()*51)+0;
     Card a = ar[index];
     ar[index] = ar[i];
   
     ar[i] = a;
     
    }
  }  
  
 /*deal method i dont use public Card[] getDeal(Card[] a)  
  {
    Card[] b = new Card[52];
    for (int i = 0; i < 4; i++)
    {

      b[i] = a[i];
    }
    return b;
  } */
}  
