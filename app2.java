import java.util.Scanner;

import javax.lang.model.util.ElementScanner14; 
public class app2 {
    
    public static void main(String[] args) throws Exception {
       float a=0,b=0,c=0;
       float delta;
       Scanner ip= new Scanner(System.in);
       System.out.println("nhap he so a");
       a = ip.nextFloat();
       System.out.println("nhap he so b");
       b = ip.nextFloat();
       System.out.println("nhap he so c");
       c = ip.nextFloat();
       delta=(b*b)-(4*a*c);
       if(a==0)
       {
           if(b==0)
           {
               if(c==0)
               {
                System.out.println("pt co vo so nghiem");
               }
               else
               {
                System.out.println("pt vo nghiem");
               }
            }
            else
            {
                if(c==0)
                {
                    System.out.println("pt co nghiem x = 0");
                }
                else
                {
                    System.out.println("pt co nghiem x = " + -c/b);
                }
            }
        }
       else
       {
           if(delta<0)
           {
            System.out.println("pt vo nghiem");   
           }
           else if(delta==0)
           {
               float x3= (float)(-b/(2*a));
            System.out.println("pt co nghiem kep x =" + x3); 
           }
           else 
           {
            float x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            float x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("pt co nghiem  x1 =" + x1); 
            System.out.println("pt co nghiem  x2 =" + x2); 
            
           }
       }
    }
}