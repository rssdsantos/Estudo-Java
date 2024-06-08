public class Aluno extends Pessoa {
    private int matricula;
    private int serie;


    public void apresentar(){
        System.out.println("ALUNO:  " + this.getNome());
        System.out.println("IDADE:  " + this.getIdade());
        System.out.println("MATRICULA:  " + this.getMatricula());
        System.out.println("SERIE:  " + this.getSerie());

    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

}
