import java.util.Scanner;

public class Counting_occurrences {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        System.out.println("Enter the number for which the occurrences has to be found ");
        int f=in.nextInt();
        int count=0;
        while(n>0){
            int d=n%10;
            if(d==f){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
