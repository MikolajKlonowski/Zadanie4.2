import java.util.Scanner;

import static java.lang.Math.*;


public class MathQuiz {
    Scanner input = new Scanner(System.in);

    void question1() {

        System.out.println("Jaki jest wynik monożenie 3*5 ?");
        int answer1 = input.nextInt();
        boolean a = answer1 == 3 * 5;
        System.out.println(a);
        int a1 = 3 * 5;

        if (a == false) {
            System.out.println("Zła odpowiedź, poprawna to : " + a1);
        } else {
            System.out.println("Gratulacje !!");
        }

    }


    void question2() {

        System.out.println("Jakie jest pole kwadratu o boku 12 ?");
        int answer2 = input.nextInt();
        boolean b = answer2 == 12 * 12;
        System.out.println(b);
        int b1 = 12 * 12;
        if (b == false) {
            System.out.println("Zła odpowiedź, poprawna to: " + b1);
        } else {
            System.out.println("Gratulacje!!");
        }

    }

    void question3() {

        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129 ?");
        int answer3 = input.nextInt();
        boolean c = answer3 == Math.sqrt(15129.00);
        System.out.println(c);
        double c1 = Math.sqrt(15129.00);
        if (c == false) {
            System.out.println("Zła odpowiedź, poprawna to: " + c1);
        } else {
            System.out.println("Gratulacje !!");
        }


    }


}


