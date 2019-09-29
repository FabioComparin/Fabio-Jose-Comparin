import javax.swing.*;

public class Atividade03 {

    public static void main(String[] args) {

        String p1 = JOptionPane.showInputDialog("Digite a primeira palavra");
        String p2 = JOptionPane.showInputDialog("Digite a segunda palavra");
        String p3 = JOptionPane.showInputDialog("Digite a terceira palavra");

        if (p1.compareTo(p2) < 0 && p1.compareTo(p3) < 0) {
            System.out.println(p1);
            if (p2.compareTo(p3) < 0) {
                System.out.println(p2);
                System.out.println(p3);
            } else {
                System.out.println(p3);
                System.out.println(p2);
            }
        } else if (p2.compareTo(p1) < 0 && p2.compareTo(p3) < 0) {
            System.out.println(p2);
            if (p1.compareTo(p3) < 0) {
                System.out.println(p1);
                System.out.println(p3);
            } else {
                System.out.println(p3);
                System.out.println(p1);
            }
        } else {
            System.out.println(p3);
            if (p1.compareTo(p2) < 0) {
                System.out.println(p1);
                System.out.println(p2);
            } else {
                System.out.println(p2);
                System.out.println(p1);
            }
        }
    }
}