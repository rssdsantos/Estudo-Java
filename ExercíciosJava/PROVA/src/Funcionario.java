public class Funcionario {
    protected String nome;
    protected String mail;
    protected int idade;

    public Funcionario(String nome, String mail){
        this.nome = nome;
        this.mail = mail;
    }

    public Funcionario(String nome, String mail, int idade){
        this.nome = nome;
        this.mail = mail;
        this.idade = idade;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void exibeDados(){
        System.out.println("O nome do funcionário é: " + nome + " seu email é " + mail + " e sua idade é" + idade);
    }

}
