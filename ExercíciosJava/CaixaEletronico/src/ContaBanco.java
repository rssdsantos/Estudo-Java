public class ContaBanco {
     public int numConta;
     protected String tipo;
     private String dono;
     private float saldo;
     private boolean status;

     public void estadoAtual(){
         System.out.println("Conta: " + getNumConta());
         System.out.println("Dono: " + getDono());
         System.out.println("Tipo: " + getTipo());
         System.out.println("Estado: " + getStatus());
         System.out.println("Saldo: " + getSaldo());
     }

     public void abirConta (String t) {
         this.setTipo(t);
         this.setStatus(true);
         if (t == "CC"){
             this.setSaldo(50);
             } else if (t == "CP"){
             this.setSaldo(150);
         }
        System.out.println("Conta aberta com sucesso!");
     }
    public void fecharConta (){
         if (this.getSaldo() < 0){
             System.out.println("Você tem débito, não podemos fechar a conta!");
         } else if (this.getSaldo() > 0){
             System.out.print("Você precisa sacar o saldo antes!");
         } else {
             this.setStatus(false);
             System.out.println("Conta fechada com sucesso!");
         }
    }
    public void depositar(float v){
         if (this.getStatus()) {
             this.setSaldo(this.getSaldo() + v);
             System.out.println("Deposito realizado com sucesso!");
         } else {
             System.out.println("Impossivel depositar nessa conta!");
         }
    }
    public void sacar (float y){
         if (this.getStatus()){
             if (this.getSaldo() >= y) {
                 this.setSaldo(this.getSaldo() - y);
                 System.out.println("Saque realizado na conta de " + this.getDono() );
             } else if (getSaldo() < y){
                 System.out.println("Você não possui saldo suficiente!");
             }


         } else {
             System.out.println("Impossivel sacar de uma conta inexistente!");
         }

    }
    public void pagarMensal(){
         int mensalidade = 0;
         if (this.getTipo() == "CC"){
             mensalidade = 12;
         } else if (this.getTipo() == "CP"){
             mensalidade = 20;
         }
         if (this.getStatus()){
             this.setSaldo(this.getSaldo() - mensalidade);
             System.out.println("Mensalidade paga por " + getDono());
         } else {
             System.out.println("Impossível pagar mensalidade de conta inexistente!");
         }

    }

    /*public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }*/

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
}
