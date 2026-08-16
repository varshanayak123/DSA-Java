import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int a = 234445674;
   int rev = 0;
   int i = 0;
   while(a>0){
       int rem = a % 10;
       rev  = rev * 10 +rem;
       a = a/10;
       i++;
   }

    System.out.println(rev);
}
}
