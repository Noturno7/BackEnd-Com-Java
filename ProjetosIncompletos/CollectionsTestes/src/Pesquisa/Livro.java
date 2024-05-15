package Pesquisa;

public class Livro {
    private String titulo;

    private String autor;

    private int anoDePublicacao;

    public Livro(String autor, String titulo, int anoDePublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                '}';
    }
}
