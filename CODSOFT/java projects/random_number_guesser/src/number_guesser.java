//task 1
import java.util.*;
public class number_guesser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int gen;
        String term="Y",ch="",outer_ch="";
        System.out.println("guess a number within 1 and 100");
        do{
            gen=rand.nextInt(100);
            do{
                System.out.println("enter your guess");
                int guess=sc.nextInt();
                if(guess>gen){
                    System.out.println("oops! your guess is too high");
                }
                else if(guess<gen){
                    System.out.println("oops! your guess is too low");
                }
                else{
                    System.out.println("wow! you guessed right");
                    break;
                }
                System.out.println("wanna try guessing again? \ny/n");
                ch=sc.next();
            }while(term.equalsIgnoreCase(ch));
            System.out.println("want to guess a new number? \ny/n");
            outer_ch=sc.next();
        }while(term.equalsIgnoreCase(outer_ch));
        sc.close();
    }
}
