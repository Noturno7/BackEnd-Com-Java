package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }
    public void RemoverConvidados(int codigoConvite){
        Convidados convidadoParaRemover = null;
        for (Convidados c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" dentro do set de convidados");

        conjuntoConvidados.adicionarConvidado("Gabriel", 1234);
        conjuntoConvidados.adicionarConvidado("Craudio", 1235);
        conjuntoConvidados.adicionarConvidado("vacilão", 1234);
        conjuntoConvidados.RemoverConvidados(1235);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+" dentro do set de convidados");
    }
}
