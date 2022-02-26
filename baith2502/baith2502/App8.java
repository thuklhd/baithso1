import java.util.Scanner;


public class App8 {
   
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        int a;
        int i=0;
        int n=0;
        int b[]=new int[100];
        do{
        System.out.println("nhâp vao so a");
        System.out.println("nhâp vao so 0 đe dung");
         a=ip.nextInt();
        b[i]=a;
      i++;
      n++;
        }while(a!=0);
        i=0;
       int k =0;
        while(i<n-1)
        {
         if(b[i]%5==0&&b[i]>k)
            {k=b[i];}
            i++;
        }
        System.out.println("so can tim la "+k);
    }
}
