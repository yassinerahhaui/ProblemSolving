public class FirstFraction {
    public static void main(String[] args){
        double s=0,i;

        for(i=1;i<=100;i++)
        {
            s+=1/i;
        }
        System.out.println("The sum is: "+s);
    }
}
