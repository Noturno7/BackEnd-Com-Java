package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemslist;

    public CarrinhoDeCompras(){
        this.itemslist = new ArrayList<>();
    }

    public void adicionarItems(String item){
        itemslist.add(new Item(item));
    }
    public void removerItems(String item){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item I: itemslist){
            if(I.getItems().equalsIgnoreCase(item)){
                itemsParaRemover.add(I);
            }
        }
        itemslist.removeAll(itemsParaRemover);
    }
    public int obterNumeroTotal(){
        return itemslist.size();
    }
    public void obterItemsDaLista() {
    System.out.println(itemslist);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItems("Cebola");
        carrinhoDeCompras.adicionarItems("Alface");
        carrinhoDeCompras.obterItemsDaLista();
        System.out.println("O número total de items no seu carrinho é de "+ carrinhoDeCompras.obterNumeroTotal() + " items.");
    }
}
