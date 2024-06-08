import java.util.Scanner;
public class Paciente {

    public static void main(String [] args){
        Pessoa paciente1 = new Pessoa("Laura", 25, 1.69f, 87f);
        //Pessoa paciente2 = new Pessoa();


        Scanner leitura = new Scanner(System.in);

        /*
        System.out.println("Digite o nome do paciente: ");
        paciente2.setNome(leitura.nextLine());
        System.out.println("Digite a altura: ");
        paciente2.setAltura(leitura.nextDouble());
        System.out.println("Digite o peso: ");
        paciente2.setPeso(leitura.nextDouble());
        */



        //double imc = calculadora.calcularIMC(paciente1.getAltura(), paciente1.getPeso());
        double imc = paciente2.calculaImc();



        System.out.println("O imc desse camarada é: " + imc );


        //System.out.println("o paciente 1 é o " + paciente1.getNome() + "e ele tem " + paciente1.getAltura() + "de altura e  " + paciente1.getPeso() + "de peso");





    }

}
