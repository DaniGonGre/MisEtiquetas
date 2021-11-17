package eCondicionais;
import java.util.Scanner;

public class CondicionalSimple {
    //dados 2 números visualizar se o primeiro é maior que o segundo
    Scanner sc;
    public void coSimple() {
        sc = new Scanner(System.in);
        System.out.println("teclea número enteiro: ");
        int num1 = sc.nextInt();
        System.out.println("tecle número enteiro: ");
        int num2 = sc.nextInt();

        //condicional
        if (num1 > num2) {
            System.out.println(num1 + " e maior que " + num2);
        }
        System.out.println(" remata o if ");

    }
}
