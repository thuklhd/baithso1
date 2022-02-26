import java.util.Scanner;


public class App4 {
   public static int ktsont(int x)
    {
        int i=2;
        int n=0;
        while(i<x)
        {
if(x%i==0)
{
    n++;
}
    i++;
        }
        if(n==0){
            return 1;
        }
        else
        return 0;
       
       
    }
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        do{
        System.out.println("nhâp vao so a");
        int a=ip.nextInt();
        }while(a<=0);
        int j=2;
        System.out.println("ds cac so nt nho hon "+a);
       while(j<a)
       {
           if(ktsont(j)==1)
           {
            
            System.out.println(j);
           }
           j++;
       }
    }
}