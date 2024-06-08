public class Pessoa {
        private String nome;
        private int idade;
        private double altura;
        private double peso;

    public Pessoa(String n, int i, double a, double p){
        this.nome = n;
        this.idade = i;
        this.altura = a;
        this.peso = p;

    }
    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    double calculaImc(){
        return peso / (altura * altura);
    }
}


