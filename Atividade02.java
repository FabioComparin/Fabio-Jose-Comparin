import java.util.Scanner;

public class Atividade02 {

    public static int main(String[] args){

    Scanner ler = new Scanner(System.in);

    int n1, cont, ver;

         System.out.printf("informe um numero inteiro");

        n1 = ler.nextInt();
        cont = 0;
        ver = 0;
        while (n1<cont){

            while (cont<ver){
                if(cont % ver == 0) {
                    System.out.printf("%d", cont);
                }
                ver++;
            }
            cont++;
        }
        return 0;
    }
}