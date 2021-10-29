package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args){

        List<Gato> meusGatos = new ArrayList<>(){
            {
                add(new Gato("Jujuba", 13, "frajola"));
                add(new Gato("Helga", 5, "preto"));
                add(new Gato("Jujuba", 2, "branco"));
            }
        };

        class ComparatorIdade implements Comparator<Gato> {

            @Override
            public int compare(Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        }

        class ComparatorCor implements Comparator<Gato>{

            @Override
            public int compare(Gato g1, Gato g2) {
                return g1.getCor().compareToIgnoreCase(g2.getCor());
            }
        }

        class ComparatorNomeCorIdade implements Comparator<Gato>{

            @Override
            public int compare(Gato g1, Gato g2) {
                int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
                if(nome != 0) return nome;

                int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
                if(cor != 0) return cor;

                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        }

        System.out.println("Esses são os meus gatos: " + meusGatos);

        System.out.println("Ordem de inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de idade");
        Collections.sort(meusGatos, new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade()); funciona das duas maneiras
        System.out.println(meusGatos);

        System.out.println("Ordem cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome/Cor/Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
