public class Main {
    public static void main(String[] args) {


        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        func1.idade = 28;
        func1.salario = 2.500;
        func1.nome = "Rodrigo";

        func2.nome = "Allan";
        func2.idade = 22;
        func2.salario = 1.600;


//            func1.imprime();
//            System.out.println("\n");
//            func2.imprime();
//            System.out.println("\n");


        System.out.println(func1.mediasalario(func1, func2));



    }
}