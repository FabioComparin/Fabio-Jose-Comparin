public class Vip extends Ingresso {
    public float valorAdd = 50;



    public float ingVip(){
        return this.valor+this.valorAdd;
    }

    public void imprimeValor(){
        System.out.println("valor Ingrsso:" + ingVip());
    }
}
