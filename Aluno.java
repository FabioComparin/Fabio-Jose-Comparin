import java.util.Scanner;

public class Aluno {

    public Aluno(float nota01, float nota02, String nome) {
        nota01 = 0;
        nota02 = 0;
        nome = "";
    }


    static  float calcularMedia ( float nota01, float nota02){
        float media = (nota01 + nota02) / 2;
        return media;
    }

    public static void situação(float media){
        if (media < 4) {
            System.out.printf("Reprovado");
        } else if (media >= 4 && media < 7) {
            System.out.printf("Final");
        } else
            System.out.printf("Aprovado");
    }

    static void validação (float nota01, float nota02) {
        if (nota01 < 0 || nota01 > 10) {
            System.out.print("Primeira Nota Fora do Intervalo Valido");
        }

        if (nota02 < 0 || nota02 > 10) {
            System.out.print("Segunda Nota Fora do Intervalo Valido");
        }

    }
}