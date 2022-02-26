import java.util.Scanner;


public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        int a,c;
        int e=0; 
        int k =0;
        do{
        System.out.println("nhâp vao so a");
         a=ip.nextInt();}while(a>=0);
         
         int b=a;
         if(a<10)
         {
            System.out.println("so khong doi");
         }
        
      else
      {
         while(a%10>=1)
         {
            k++;
            a=a/10;
         }
      
      while(k>=1)
      {
c=b%10;
e=(int) (e+(c*Math.pow(10, k)));
b=b/10;
k--;
      }
      e=e/10;
         System.out.println(e);
      }
     
    }
}