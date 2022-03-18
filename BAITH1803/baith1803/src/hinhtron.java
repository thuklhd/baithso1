import java.util.Scanner;
public class hinhtron {
        private float bankinh;
        Scanner ip= new Scanner(System.in);
        public void setBankinh(float bankinh) {
            this.bankinh = bankinh;
        }
        public float getBankinh() {
            return bankinh;
        }
        float tinhcv()
        {
            float cv=0;
            System.out.println("chu vi hinh tron a"+((getBankinh()+getBankinh())*3.14));

            return cv;
        }
        float tinhdt()
        {
            float dt=0;
            System.out.println("chu vi hinh tron a"+((getBankinh()*getBankinh())*3.14));

            return dt;
        }
        }