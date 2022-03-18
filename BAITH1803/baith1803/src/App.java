import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        hinhtron ht =new hinhtron();
        float a;
        Scanner ip= new Scanner(System.in);
        System.out.println("nhap vao ban kinh");
        a=ip.nextFloat();
        ht.setBankinh(a);
       ht.tinhcv();
       ht.tinhdt();
        
       
    }

    
}
