import java.util.Scanner;


public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        do{
        System.out.println("nhâp vao so a");
        int a=ip.nextInt();
    }while(a<=0);
        int i=2;
        int n=0;
        while(i<a)
        {
if(a%i==0)
{
    n++;

}
    i++;

        }
        if(n==0){
            System.out.println("a la so nguyen to");
        }
        else
        {
            System.out.println("a khong phai so nguyen to");
        }
   
    }
}