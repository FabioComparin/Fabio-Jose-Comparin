public class Atividade6 {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        Vip vip = new Vip();
        CamaroteInferior camaroteInferior = new CamaroteInferior();
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        Normal normal = new Normal();

        ingresso.valor = 100f;
        vip.valorAdd = 50f;
        vip.valor = ingresso.valor;
        camaroteSuperior.valorAdd = vip.valorAdd();
        camaroteSuperior.camaroteAdd = 100f;
        camaroteInferior.valor = vip.valorAdd();
        normal.valor = ingresso.valor;

        ingresso.imprimeValor();
        vip.imprimeValor();
        camaroteInferior.imprimeValor();
        camaroteSuperior.imprimeValor();
        normal.imprimeValor();

    }
}
