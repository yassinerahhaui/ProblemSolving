public class SumOddNumbersWithModulo {
    public static void main(String[] args){
        int s=0;
        for (int i=1;i<=10;i++)
        {
            if (i % 2 == 1)
            {
                System.out.println("s = "+s+" + "+i+" = "+(s+i));
                s+=i;
            }
        }
    }
}
