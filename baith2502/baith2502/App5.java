import java.util.Scanner;


public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        do{
        System.out.println("nhâp vao so a");
        int a=ip.nextInt();
    }while(a<=0);
        int i=1;
        int n=0;
        while(i<a)
        {
if(a%i==0)
{
    n=n+i;

}
    i++;

        }
        if(n==a){
            System.out.println(a+" la so hh");
        }
        else
        System.out.println(a+" kp la so hh");
   
    }
}
