public class Ingresso {

    public  float valor;

    public Ingresso() {

    }


    public void imprimeValor(){
        System.out.println("valor do Ingresso: " + valor);
    }

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
