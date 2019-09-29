public class Aluno {

    private String nome;
    private float nota1;
    private float nota2;

    public Aluno(String nome, float nota1, float nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    static float calcularMedia ( float nota1, float nota2){
        float media = (nota1 + nota2) / 2;
        return media;
    }

    public static void situacao(float media){
        if (media < 4) {
            System.out.printf("Reprovado");
        } else if (media >= 4 && media < 7) {
            System.out.printf("Final");
        } else
            System.out.printf("Aprovado");
    }

    public static float validacao (float nota1, float nota2) {

        if (nota1 < 0 || nota1 > 10) {
            System.out.print("NotaInvalidaException"+"\n");
            return 1;
        }
        else if (nota2 < 0 || nota2 > 10) {
            System.out.print("NotaInvalidaException"+"\n");
            return 2;
        }
        return 0;
    }
}
