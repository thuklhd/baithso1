import java.util.Scanner;
public class App30 {
    public static void main(String[] args) throws Exception {
        int n,a=0,b=0,c=0;
        Scanner ip= new Scanner(System.in);
        System.out.println("nhap vao so ban muon tinh");
        n = ip.nextInt();
        if(n<10)
        {
            System.out.println("tong la"+n);
        }
        else
        {
            while(n>0)
            {
               a = n%10;
               b= n/10;
               c=c+a;
               n=b;
            }
            System.out.println("tong la"+c);
        }


    }
}
