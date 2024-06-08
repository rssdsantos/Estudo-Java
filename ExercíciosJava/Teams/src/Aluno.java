public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.curso = curso;
    }

    public void apresentar(){
        System.out.println("O aluno: " + this.getNome() );
        System.out.println("Tem " + this.getIdade() + " anos");
        System.out.println("É do sexo " + this.getSexo());
        System.out.println("E está matriculado no curso: " + curso);

    }
}
