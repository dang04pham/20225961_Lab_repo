import java.util.Scanner;

public class ex_226 {
    public static void main(String[] args) {
        System.out.println("choose an option:");
        System.out.println("1.linear equation");
        System.out.println("2.linear system");
        System.out.println("3.second-degree equation");

        int opt;
        Scanner sc = new Scanner(System.in);
        opt = sc.nextInt();

        if(opt == 1){
            double a, b;
            a = sc.nextDouble();
            b = sc.nextDouble();
            if(a == 0){
                if(b == 0){
                    System.out.println("infinite values of x");
                }
                else if(b != 0){
                    System.out.println("No value of x");
                }
            }
            else if(a != 0){
                double x = ((-1)*b)/a;
                System.out.println(x);
            }
            sc.close();
        }

        /*
         * {a11*x + a12*y = b1;
         * {a21*x + a22*y = b2;
         */

        else if(opt == 2){
            double a11, a12, a21, a22, b1, b2;
            a11 = sc.nextDouble();
            a12 = sc.nextDouble();
            b1 = sc.nextDouble();

            a21 = sc.nextDouble();
            a22 = sc.nextDouble();
            b2 = sc.nextDouble();
        
            double D = a11 * a22 - a21 * a12;
            if(D == 0){
                System.out.println("No values of (x1, x2)");
            }
            else if(D != 0){
                double D1 = b1*a22 - b2*a12;
                double D2 = a11*b2 - a21*b1;
                
                double res1 = D1/D;
                double res2 = D2/D;

                if(res1 == 0) res1 = Math.abs(res1);
                if(res2 == 0) res2 = Math.abs(res2);

                System.out.println("(" + res1 + ", " + res2 + ")");
            }
            sc.close();
        }

        else if(opt == 3){
                double a, b, c;
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();

                double delta = b*b - 4*a*c;

                if(delta < 0){
                    System.out.println("No real solutions");
                }
                else if(delta == 0){
                    double res = ((-1)*b)/(2*a);
                    System.out.println("Solutions: " + res);
                }
                else if(delta > 0){
                    double res1 = ((-1)*b + Math.sqrt(delta))/(2*a);
                    double res2 = ((-1)*b - Math.sqrt(delta))/(2*a);

                    System.out.println("solutions: " + res1 + " " + res2);
                }
        }
    }
}
