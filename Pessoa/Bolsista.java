public class Bolsista extends Aluno {
    private float Bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ nome);

    }
    public void pagarMensalidade(){
        System.out.println(this.nome+ "é bolsista, pagamento facilitado!");
    }
    public float getBolsa() {
        return Bolsa;
    }
    public void setBolsa(float bolsa) {
        Bolsa = bolsa;
    }
}
