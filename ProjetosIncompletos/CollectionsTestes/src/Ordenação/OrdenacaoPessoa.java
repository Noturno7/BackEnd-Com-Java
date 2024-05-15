package Ordenação;

import java.util.*;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }
    public void adicionarPessoas(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenacaoIdade(){
        List<Pessoa> ordenacaoIdades = new ArrayList<>(listaPessoas);
        Collections.sort(ordenacaoIdades);
        return ordenacaoIdades;
    }
    public List<Pessoa> ordenacaoAltura(){
        List<Pessoa> ordenacaoAlturas = new ArrayList<>(listaPessoas);
            Collections.sort(ordenacaoAlturas , new comparePorAltura());
            return ordenacaoAlturas;
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoas("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoas("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoas("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoas("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.listaPessoas);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenacaoIdade());

        // Ordenando e exibindo por altura
        //System.out.println(ordenacaoPessoas.ordenacaoAltura());
    }
}
