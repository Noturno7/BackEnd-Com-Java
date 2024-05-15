package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public Livro pesquisaPorTitulo (String titulo){
        Livro pesquisaPorTitulos = null;
        if(!livrosList.isEmpty()){
            for(Livro L : livrosList){
                if(L.getTitulo().equalsIgnoreCase(titulo)){
                    pesquisaPorTitulos = L;
                    break;
                }
            }
            return pesquisaPorTitulos;
        } else {
        throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Livro> pesquisandoPorAutor(String autor){
        List<Livro> pesquisaPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for(Livro L: livrosList){
                if(L.getAutor().equalsIgnoreCase(autor)){
                    pesquisaPorAutor.add(L);
                }
            }
            return pesquisaPorAutor;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> getPesquisaPorAno(int anoInicial, int anoFinal){
        List<Livro> pesquisaPorAno = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for(Livro L: livrosList){
                if(L.getAnoDePublicacao() >= anoInicial && L.getAnoDePublicacao() <= anoFinal){
                    pesquisaPorAno.add(L);
                }
            }
            return pesquisaPorAno;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivros("Céu estrelado","Gabriel",2020);
        catalogoLivros.adicionarLivros("Cabide","Gabriel", 2020);
        System.out.println(catalogoLivros.getPesquisaPorAno(2020,2021));
    }
}
