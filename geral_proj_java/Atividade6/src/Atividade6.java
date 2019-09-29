public class Atividade6 {
    Ingresso ingresso = new Ingresso();
    Vip vip = new Vip();
    CamaroteInferior camaroteInferior = new CamaroteInferior();
    CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
    Normal normal = new Normal();

    public void imprimeValor() {
        ingresso.imprimeValor();
        vip.imprimeValor();
        camaroteInferior.imprimeValor();
        camaroteSuperior.imprimeValor();
    }


}
