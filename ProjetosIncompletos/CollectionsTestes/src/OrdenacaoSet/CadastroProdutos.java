package OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }
    public void adicionarProdutos(long codigo, String nome, double preco, int quantidade){
        produtosSet.add(new Produtos(nome, codigo, preco, quantidade));
    }
    public Set<Produtos> exibirPorNome(){
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produtos> exibirPorPreco (){
        Set<Produtos> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtosSet.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastrarProdutos = new CadastroProdutos();
        cadastrarProdutos.adicionarProdutos(12354, "Laranja", 2,20);

        System.out.println(cadastrarProdutos.exibirPorNome());
    }
}
