public class SumDoWhileLoop {
    public static void main(String[] args){
        int s = 0,i = 1;
        do
        {
            s+=i;
            i++;
        }while(i<=100);
        System.out.println("The sum of numbers between 1 and 100 is: "+s);
    }
}
