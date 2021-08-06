public class SumDoubleNumbers {
    public static void main(String[] args){
        int s=0;
        for (int i=2;i<=10;i+=2){
            System.out.println("s = " + s + " + " + i + " = " + (s + i));
            s += i;
        }
    }
}
