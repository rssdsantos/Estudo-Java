public class Programador extends Funcionario {

    private String linguagem;
    private String sistOper;

    public Programador(String nome, String mail, String linguagem) {
        super(nome, mail);
        this.linguagem = linguagem;

    }

    public void setLinguagem(String ling) {
        this.linguagem = ling;
    }

    public void setSO(String sistOper) {
        this.sistOper = sistOper;
    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.mail);
        System.out.println("Linguagem " + this.linguagem);
        System.out.println("Sistema Operacional: " + this.sistOper);
    }


}
