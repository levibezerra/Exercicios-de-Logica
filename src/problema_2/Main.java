package problema_2;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        SomaSimples s = new SomaSimples();

        System.out.println("Informe um número: ");
        int A = input.nextInt();

        System.out.println("Informe um número: ");
        int B = input.nextInt();

        System.out.println("SOMA = " + s.soma(A,B));
    }
}
