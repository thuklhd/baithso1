import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     float a2,b2,c2,a1,b1,c1;
      Scanner ip= new Scanner(System.in);
      System.out.println("nhap he so a1");
      a1 = ip.nextFloat();
      System.out.println("nhap he so b1");
      b1 = ip.nextFloat();
      System.out.println("nhap he so c1");
      c1 = ip.nextFloat();
      System.out.println("nhap he so a2");
      a2 = ip.nextFloat();
      System.out.println("nhap he so b2");
      b2 = ip.nextFloat();
      System.out.println("nhap he so c2");
      c2 = ip.nextFloat();
      if((a1/a2)==(b1/b2) &&(a1/a2)!=(c1/c2))
      {
        System.out.println("he pt vo nghiem");
      }
      else if((a1/a2)==(b1/b2)&&(a1/a2)==(c1/c2))
      {
        System.out.println("he pt vo so nghiem");
      }
      else
      {
      float y=((a1*c2-c1*a2)/(a1*b2-a2*b1));
      float x=((c1-b1*y)/a1);
      System.out.println("x ="+x);
      System.out.println("y ="+y);
    }
    }
    }
