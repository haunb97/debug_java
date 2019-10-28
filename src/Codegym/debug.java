package Codegym;

import java.util.Scanner;

public class Simple_equation  {
    public static void main(String[] args) {
        // phuong trinh co dang ax +b = 0
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.printf("a :");
        a = sc.nextDouble();
        System.out.printf("b :");
        b = sc.nextDouble();
//        System.out.printf("c :");
//        c = sc.nextDouble();
        if (a != 0) {
            double answer = (- b) / a;
            System.out.printf("equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.printf("The solution is all x! ");
            } else {
                System.out.print("no solution!");
            }

        }

    }
}
