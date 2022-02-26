import java.util.Scanner;


public class App6 {
   public static int ktsohh(int x)
    {
        int i=1;
        int n=0;
        while(i<x)
        {
if(x%i==0)
{
    n=n+i;

}
    i++;

        }
        if(n==x){
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
        int j=1;
        System.out.println("ds cac so hh la nho hon"+a);
       while(j<a)
       {
           if(ktsohh(j)==1)
           {
            
            System.out.println(j);
           }
           j++;
       }
   
    }
}