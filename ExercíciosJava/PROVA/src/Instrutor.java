public class Instrutor extends Funcionario {
    private String disciplina;

    public Instrutor(String nome, String mail, String disciplina) {
        super(nome, mail);
        this.disciplina = disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibeDados() {

        System.out.println("O nome do funcionário é: " + this.nome + " seu email é " + mail +  "a disciplina é" + this.disciplina);

    }
}
