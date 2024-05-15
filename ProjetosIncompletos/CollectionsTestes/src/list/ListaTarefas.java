package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefasLista;

    public ListaTarefas() {
        this.tarefasLista = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao){
        tarefasLista.add(new Tarefas(descricao));
    }
    public void removerTarefas(String descricao){
        List<Tarefas> tarefasParaRemorver = new ArrayList<>();
        for(Tarefas t : tarefasLista){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemorver.add(t);
            }
        }
        tarefasLista.removeAll(tarefasParaRemorver);
    }
    public int obterNumeroTotal(){
        return tarefasLista.size();
    }
    public void  obterDescricoesTarefas(){
        System.out.println(tarefasLista);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefas("Tarefa 1 ");
        listaTarefas.adicionarTarefas("Tarefa 1 ");
        listaTarefas.adicionarTarefas("Tarefa 2 ");
        listaTarefas.removerTarefas("Tarefa 2 ");
        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterNumeroTotal());
        listaTarefas.obterDescricoesTarefas();
    }
}
