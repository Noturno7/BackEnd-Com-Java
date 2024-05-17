package Map.PesquisaEmMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProdutos(String nome, long cod, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorEstoque += p.getQuantidade()* p.getPreco();
            }
        }
        return valorEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotal(){
        Produto produtoMaiorValorTotal = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values())
                if(p.getPreco() * p.getQuantidade() > maiorValor){
                    produtoMaiorValorTotal = p;
                }
        }
        return  produtoMaiorValorTotal;
    }

    public static void main(String[] args) {
     EstoqueProdutos estoque = new EstoqueProdutos();

     estoque.adicionarProdutos("Macarrão", 1L, 1, 5);
     estoque.adicionarProdutos("Franguin", 3L, 2, 1);
     estoque.adicionarProdutos("Sardinha",2L, 1, 4);

        System.out.println("Valor total do estoque é de: R$"+estoque.calcularValorTotalEstoque());
        estoque.exibirProdutos();
        System.out.println("O produto de valor mais alto é o: "+ estoque.obterProdutoMaisCaro());
        System.out.println("O produto de menor valor é o: "+ estoque.obterProdutoMaisBarato());
        System.out.println("O produto de maior valor de estoque é o: "+ estoque.obterProdutoMaiorQuantidadeValorTotal());
    }
}
