package Teste;

public class Aluno {
    private String nome;
    private int idade;
    private String serie;
    private float nota1;
    private float nota2;
    private float media;
    public Aluno(String nome, int idade, float nota1, float nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        this.setSerie();
    }

    private void setSerie() {
        if (this.idade > 14) {
            this.serie = "Ensino Médio";
        } else {
            this.serie = "Ensino fundamental";
        }

    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setMedia(float media) {

        this.media = media;
        this.media = (this.getNota1() + this.getNota2()) /2;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSerie() {
       return serie;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getMedia() {

        return media;
    }



    public void apresentar() {
        this.setMedia(media);
        System.out.println("O aluno " + this.getNome());
        System.out.println("Tem " + this.getIdade() + " e esta na " + this.getSerie());
        System.out.println("Com as notas " + this.getNota1() + " e " + this.getNota2() + " ele obteve a media: " + this.getMedia());

    }

}
