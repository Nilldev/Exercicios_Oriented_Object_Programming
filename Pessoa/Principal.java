public class Principal {
    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        v1.setNome("André");
        v1.setIdade(32);
        v1.setSexo("M");

        Aluno a1 = new Aluno();
        a1.setCurso("Engenharia Civil");
        a1.setNome("Paulo");
        a1.setMatricula(6532215);
        a1.setIdade(30);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Ana Paula ");
        b1.setIdade(25);
        b1.setMatricula(8554);
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();

        System.out.println(v1);
        System.out.println(a1);
    }
    
}
