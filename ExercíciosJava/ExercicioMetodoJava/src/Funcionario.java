public class Funcionario {

    public String nome;
    public int idade;
    public double salario;



    public void imprime(){
        System.out.println("Nome do funcionário é: " + this.nome);
        System.out.println("Idade do funcionário é: " + this.idade);
        System.out.println("Salario do funcionário é: " + this.salario);
    }

    public double mediasalario(Funcionario func1, Funcionario func2) {

        double media = (func1.salario + func2.salario) / 2;

        return media;


    }



}
