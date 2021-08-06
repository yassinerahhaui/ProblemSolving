public class MultipleLoops {
    public static void main(String[] args){
        int s=1,i=1;
        while(i<=10)
        {
            s*=i;
            i++;
        }
        System.out.println("The multiple is: "+s);
        System.out.println("---------------------");
        s=1;
        i=1;
        do {
            s*=i;
            i++;
        }while(i<=10);
        System.out.println("The multiple is: "+s);
    }
}
