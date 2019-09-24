import javax.swing.*;
import java.util.Scanner;

public class Atividade01 {


    public static int main(String[] args) {
         Scanner ler = new Scanner(System.in);
        int n1, n2;

        System.out.printf("informe o primeiro numero");

        n1 = ler.nextInt();

        System.out.printf("informe o primeiro numero");

        n2 = ler.nextInt();

        if (n1 == n2) {
            System.out.println("os numeros são iguais");
        }
            else if (n1 > n2) {
            System.out.printf("o primeiro numero e maior: %d", (n1));
            System.out.printf("o segundo numero e menor %d", (n2));
        }
        else {
            System.out.printf("o segundo numero e maior %d", (n2));
            System.out.printf("o primeiro numero e menor %d", (n1));
        }
        return 0;
    }
}
