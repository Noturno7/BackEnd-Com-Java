package OrdenacaoSet;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos> {
    private String nome;

    private long codigoProduto;

    private double preco;

    private int quantidade;

    public Produtos(String nome, long codigoProduto, double preco, int quantidade) {
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoProduto());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return getCodigoProduto() == produtos.getCodigoProduto();
    }


    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", codigoProduto=" + codigoProduto +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
class comparatorPorPreco implements Comparator<Produtos>{

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }
}
