public class SumWhileLoop {
    public static void main(String[] args){
        int s = 0,i = 1;
        while(i<=100)
        {
            s=s+i;
            i++;
        }
        System.out.println("The sum of numbers between 1 and 100 is: "+s);
    }
}
