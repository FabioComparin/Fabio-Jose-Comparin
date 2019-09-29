public class Vip extends Ingresso {
    public float valorAdd;

    public float valorAdd(){
        return super.valor + valorAdd;
    }

    public Vip() {
        this.valorAdd = valorAdd;
    }

    public Vip(float valor, float valorAdd) {
        super(valor);
        this.valorAdd = valorAdd;
    }

    public float getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(float valorAdd) {
        this.valorAdd = valorAdd;
    }

    @Override
    public void imprimeValor() {
        System.out.println("valor do Ingresso Vip: " + valorAdd());
    }
}
