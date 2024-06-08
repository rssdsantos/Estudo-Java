public class Banco {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco();
        cliente1.setNumConta(1111);
        cliente1.setDono("Jorge");
        cliente1.abirConta("CC");

        ContaBanco cliente2 = new ContaBanco();
        cliente2.setNumConta(2222);
        cliente2.setDono("Creuza");
        cliente2.abirConta("CP");

        cliente1.depositar(100);
        cliente2.depositar(150);

        cliente1.estadoAtual();
        cliente2.estadoAtual();
    }


}