//task 2
import java.util.*;
public class graded {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks in physics out of 100");
        int phy=sc.nextInt();
        System.out.println("enter marks in chemistry out of 100");
        int chem=sc.nextInt();
        System.out.println("enter marks in maths out of 100");
        int maths=sc.nextInt();
        int total=phy+chem+maths;
        if(phy>100 || chem>100 || maths>100){
            System.out.println("marks greater than 100 is not acceptable");
            sc.close();
            return;
        }
        int average=total/3;
        System.out.println("total marks = "+total);
        System.out.println("average marks = "+average+"%");
        if(average>90){
            System.out.println("grade = A");
        }
        else if(average>75){
            System.out.println("grade = B");
        }
        else if(average>60){
            System.out.println("grade = C");
        }
        else if(average>45){
            System.out.println("grade = D");
        }
        else{
            System.out.println("grade = F");
        }
        sc.close();
    }
}

