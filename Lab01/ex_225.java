import java.util.Scanner;
/**
 * ex_225
 */
public class ex_225 {

    public static void main(String[] args) {
        double v1, v2;
        Scanner sc = new Scanner(System.in);
        
        v1 = sc.nextDouble();
        v2 = sc.nextDouble();

        sc.close();

        double sum = v1 + v2;
        double dif = Math.abs(v1) - Math.abs(v2);
        double prod = v1 * v2;
        double quotient = v1 / v2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + dif);
        System.out.println("Product: " + prod);
        if(v2 == 0){
            System.out.println("cant be devided by zero!");
        }
        else{
            System.out.println("Quotient: " + quotient);
        }
        
    }
}
