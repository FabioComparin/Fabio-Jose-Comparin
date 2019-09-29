import javax.swing.*;

public class Atividade2 {

    public static void main(String[] args) {

        boolean verificador;
        int n1 = -1;

        while (n1 < 0) {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro positivo:"));
        }

        System.out.println("Inicio for");
        for (int i = 2; i <= n1; i++) {
            verificador=true;
            for(int j = 2; j <= i; j++){
                if(i!=j && i%j==0){
                    verificador = false;
                }
            }
            if (verificador == true){
                System.out.println("Primo:"+i);
            }
        }
        System.out.println("Fim for");
    }
}
