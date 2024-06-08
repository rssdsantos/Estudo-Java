import com.google.gson.annotations.SerializedName;

public class MeuObjeto {


    String nome;
    int Year;

    String Released;

    public MeuObjeto(TituloOmdb filme) {
        this.nome = filme.title();
        this.Year = filme.year();
        this.Released = filme.released();

    }


    public String getTitle() {
        return nome;
    }

    public void setTitle(String title) {
        nome = title;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public String getReleased() {
        return Released;
    }

    public void setReleased(String released) {
        Released = released;
    }

    @Override
    public String toString() {
        return "MeuObjeto{" +
                "Title='" + nome + '\n' +
                ", Year=" + Year + '\n' +
                ", Released='" + Released + '\'' +
                '}';
    }
}
