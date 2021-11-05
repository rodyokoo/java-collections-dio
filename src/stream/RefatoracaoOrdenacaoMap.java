package stream;

import com.sun.javadoc.SeeTag;

import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args){
        System.out.println("Ordem aleatória");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for(Map.Entry<Integer, Contato> entry: agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println("Ordem número telefona");
        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
        });*/
        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>
                (Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));*/
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()
        ));
        set.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": "
                    + entry.getValue().getNome());
        }
    }
}
