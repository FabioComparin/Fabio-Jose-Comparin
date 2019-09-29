public class CamaroteSuperior extends Vip {
    public float camaroteAdd = 50;

    public float ingCam(){
        return this.ingVip()+this.camaroteAdd;
    }

    public void imprimeValor(){
        System.out.println("valor Ingrsso:" + ingCam());
    }
}
