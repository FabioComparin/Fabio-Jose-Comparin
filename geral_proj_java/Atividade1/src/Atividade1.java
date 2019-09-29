import javax.swing.*;

public class Atividade1 {

    public static int main(String[] args) {

        int n1, n2;

        n1 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero")));
        n2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero")));

        if (n1 == n2) {
            System.out.println("os numeros são iguais");
        } else if (n1 > n2) {
            System.out.printf("o primeiro numero e maior: %d", (n1));
            System.out.printf("o segundo numero e menor %d", (n2));
        } else {
            System.out.printf("o segundo numero e maior %d", (n2));
            System.out.printf("o primeiro numero e menor %d", (n1));
        }
        return 0;
    }
}
