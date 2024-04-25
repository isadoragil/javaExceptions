package exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o dividendo: ");
        int n1 = sc.nextInt();
        System.out.printf("Digite o divisor: ");
        int n2 = sc.nextInt();

        try {
            /*if (n2 == 0) {
                throw new ErroDivisorException("Divisor igual a zero, verifique!");
            }*/

            double resultado = n1 / n2;
            System.out.printf("O resultado é %.2f", resultado );
        } /*catch (ErroDivisorException e) {
            System.out.println(e.getMensagem());
        }*/catch (ArithmeticException e) {
            System.out.println("Divisor igual a zero, verifique!");
        }
    }
}
