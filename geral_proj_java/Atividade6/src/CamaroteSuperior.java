public class CamaroteSuperior extends Vip {

    public CamaroteSuperior() {
        super();
        this.camaroteAdd = camaroteAdd;
    }

    public float valorCamSup(){
        return super.valorAdd + camaroteAdd + super.valor;
    }

    public float camaroteAdd;

    public float getCamaroteAdd() {
        return camaroteAdd;
    }

    public void setCamaroteAdd(float camaroteAdd) {
        this.camaroteAdd = camaroteAdd;
    }

    @Override
    public void imprimeValor() {
        System.out.println("valor do Ingresso Camarote Superior: " + valorCamSup());
    }
}
