import javax.swing.*;

public class Atividade4 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("",-1,-1);
        Aluno a2 = new Aluno("",-1,-1);
        Aluno a3 = new Aluno("",-1,-1);
        int validaNota = 1;

        //RECEBE E VALIDA OS VALORES DO ALUNO 1

        a1.setNome(JOptionPane.showInputDialog("Digite o nome do primeiro: "));
        while (validaNota != 0){

            if(Aluno.validacao(a1.getNota1(),a1.getNota2()) == 1){
                a1.setNota1(Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota")));
                validaNota = 1;
            }
            else if(Aluno.validacao(a1.getNota1(),a1.getNota2()) == 2){
                a1.setNota2(Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota")));
                validaNota = 2;
            }else{
            validaNota = 0;
            }
        }
        System.out.println("Aluno: " + a1.getNome());
        System.out.println("1° Nota: " + a1.getNota1());
        System.out.println("2° Nota: " + a1.getNota2());
        System.out.println("Média: " + Aluno.calcularMedia(a1.getNota1(),a1.getNota2()));
        Aluno.situacao(Aluno.calcularMedia(a1.getNota1(),a1.getNota2()));

        //RECEBE E VALIDA OS VALORES DO ALUNO 2

        a2.setNome(JOptionPane.showInputDialog("Digite o nome do segundo aluno: "));
        validaNota = 1;
        while (validaNota != 0){

            if(Aluno.validacao(a2.getNota1(),a2.getNota2()) == 1){
                a2.setNota1(Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota")));
                validaNota = 1;
            }
            else if(Aluno.validacao(a2.getNota1(),a2.getNota2()) == 2){
                a2.setNota2(Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota")));
                validaNota = 2;
            }else{
                validaNota = 0;
            }
        }
        System.out.println("Aluno: " + a2.getNome());
        System.out.println("1° Nota: " + a2.getNota1());
        System.out.println("2° Nota: " + a2.getNota2());
        System.out.println("Média: " + Aluno.calcularMedia(a2.getNota1(),a2.getNota2()));
        Aluno.situacao(Aluno.calcularMedia(a2.getNota1(),a2.getNota2()));

        //RECEBE E VALIDA OS VALORES DO ALUNO 3

        a3.setNome(JOptionPane.showInputDialog("Digite o nome do terceiro aluno: "));
        validaNota = 1;
        while (validaNota != 0){

            if(Aluno.validacao(a3.getNota1(),a3.getNota2()) == 1){
                a3.setNota1(Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota")));
                validaNota = 1;
            }
            else if(Aluno.validacao(a3.getNota1(),a3.getNota2()) == 2){
                a3.setNota2(Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota")));
                validaNota = 2;
            }else{
                validaNota = 0;
            }
        }
        System.out.println("Aluno: " + a3.getNome());
        System.out.println("1° Nota: " + a3.getNota1());
        System.out.println("2° Nota: " + a3.getNota2());
        System.out.println("Média:" + Aluno.calcularMedia(a3.getNota1(),a3.getNota2()));
        Aluno.situacao(Aluno.calcularMedia(a3.getNota1(),a3.getNota2()));


    }
}