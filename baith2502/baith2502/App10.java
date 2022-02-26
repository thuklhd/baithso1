import java.util.Scanner;


public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        int a; 
        int k =0;
       do{
        System.out.println("nhâp vao so a");
         a=ip.nextInt();
       }while(a>=0);
         if(a<10)
         {
            System.out.println("so co mot chu so");
         }
        
      else
      {
         while(a%10>=1)
         {
            k++;
            a=a/10;
         }
         System.out.println("so vua nhap co "+k+"chu so");
      }
     
    }
}