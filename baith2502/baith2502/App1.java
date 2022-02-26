
import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        int b;
        int a;
        do{
        System.out.println("nhâp vao so a");
        a=ip.nextInt();
        System.out.println("nhap vao so b");
        b=ip.nextInt();
    }while(a<=0||b<=0);
     int n,i;
     i=1;
    n=0;
     while(i<(a+b)/2)
     {
        if(a%i==0  &&   b%i==0)
        {
      
         n=i;
        }
        i++;
     }
     System.out.println("uoc chung ln la"+n);
    
    }
}