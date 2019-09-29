public class CamaroteInferior extends Vip {

    public float valorCamInf(){
        return super.valor + super.valorAdd;
    }

    public CamaroteInferior() {
        super();
        this.localizacao = localizacao;
    }

    public String localizacao = "local";

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public void imprimeValor() {
        System.out.println("valor do Ingresso Camarote Inferior: " + valorCamInf());
        System.out.println("Localização do ingresso: " + localizacao);
    }
}
