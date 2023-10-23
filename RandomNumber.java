import java.util.*;
public class RandomNumber {


        public static void main(String[] args){
            System.out.println("Your Score Is: "+guessNumber()+" Out Of 100");
        }
        public static int guessNumber(){

            Scanner s = new Scanner(System.in);
            int min=1,max=100;
            int Random = (int) (Math.random() * (max)) + min;
            System.out.println("***The Game Of Guessing A Random Number***");
            System.out.println("/* Rules: You Need To Guess The Number Which Is In Between 1-100 */" +
                    " \n/* Enter Your Guess For The Randomly Generated Number. */" +
                    " \n/* You Have Given Five Chances. */" +
                    " \n/* In Those 5 Chances You Need To Guess The Number Else You Will Lose */");
            int score=0,count=5;
            int Chances=5;
            System.out.println("A Random Number Is Chosen \nNow ");
            for(int i=0;i<Chances;i++) {
                System.out.println("Take A Guess: ");
                int Guess=s.nextInt();
                if(Guess<Random) {
                    System.out.println("The Guess is lower than the value");
                    count--;
                    System.out.println("Chances Remaining Are: "+ count);
                }
                else if(Guess>Random){
                    System.out.println("The Guess is higher than value");
                    count--;
                    System.out.println("Chances Remaining Are: "+ count);
                }
                else {
                    System.out.println(Guess+" Is The Answer CONGRATULATIONS!!");
                    score=count*20;
                    break;
                }
                if(count==0){
                    System.out.println("You are out of Chances");
                    System.out.println("The answer is "+Random+" \nBetter luck next time");
                    break;
                }
            }
            return score;
        }

}
