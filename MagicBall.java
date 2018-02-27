import java.util.*;

public class MagicBall
{

    boolean exit = false;
    String[] responses = {"Don't Bet on It", "You Wish", "Dumb Question Ask Another", "Oh Please", "Fo Sho!", "Indubitably", "The Stars Say So", "Of Course... not"};
    public MagicBall()
    {
        while(!exit){
           System.out.println("Enter Your Question (Press X to Exit).");
           Scanner sc = new Scanner(System.in);
           String question = sc.next();
           if(question.equals("X"))
              break;
           int answer = (int)(Math.random() * responses.length);
           String answerString = responses[answer];
           System.out.println(answerString);
        }
    }
}
