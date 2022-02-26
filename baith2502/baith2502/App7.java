import java.util.Scanner;


public class App7 {
   
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        float a;
        int i=0;
        int n=0;
        float b[]=new float[100];
        do{
        System.out.println("nhâp vao so a");
        System.out.println("nhâp vao so 0 để dừng");
         a=ip.nextFloat();
        b[i]=a;
      i++;
      n++;
        }while(a!=0);
        i=0;
        System.out.println("day vua nhap la");
        while(i<n-1)
        {
         
            System.out.println(b[i]);
            i++;
        }
    }
}