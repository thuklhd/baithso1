import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        int n;
        int k=0;
        System.out.println("nhap so pt mang");
        n = ip.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap pt thu "+(i+1));
            a[i] = ip.nextInt();
        }
        for(int i=0;i<n;i++){
           if(a[i]%2==0)
           {
              
               k=k+a[i];
           }
        }
       
        System.out.println("tong cac pt chan la "+k);
    }
}
