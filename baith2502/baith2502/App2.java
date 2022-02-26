import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        do{
        System.out.println("nhâp vao so a");
        float a=ip.nextFloat();
        System.out.println("nhap vao so b");
        float b=ip.nextFloat();
        System.out.println("nhap vao so c");
        int c=ip.nextFloat();
    }while(a<=0||b<=0||c<=0);
        int i=0;
        if((a*a)==(b*b)+(c*c) || (b*b)==(a*a)+(c*c) ||(c*c)==(a*a)+(b*b))
   {
    System.out.println("la tam giac vuong");
    i++;
   }
    if(a==b&&a==c)
   {
    System.out.println("la tam giac deu");
    i++;
   }
  else if(a==b||a==c||b==c)
   {
    System.out.println("la tam giac can");
    i++;
   }

   if(i==0)
   System.out.println("la tam giac thuong ");
   if(i==2)
   System.out.println("la tam giac vuong can ");

    }
}