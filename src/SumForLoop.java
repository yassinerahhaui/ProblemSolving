import javax.swing.*;

public class SumForLoop {
    public static void main(String[] args){
        int s=0;
        for (int i = 1; i <= 100; i++) {
            s = s + i;
        }
        System.out.println("The sum of numbers between 1 and 100 is: "+s);
    }
}
