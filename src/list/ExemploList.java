package list;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(5d);
        notas.add(10d);
        notas.add(8.5);
        notas.add(9.5);
        notas.add(8.2);
        notas.add(3.9);
        notas.add(7.3);
        System.out.println(notas);

        System.out.print("Exiba a posição da nota 9.5: ");
        System.out.println(notas.indexOf(9.5));
        System.out.println("Adicione na lista a note 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println("Substitua a nota 8.0 pela nota 7.0: ");
        notas.set(notas.indexOf(8.0), 7.0);
        System.out.println(notas);
        System.out.print("Confira se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5.1));
        //System.out.println("Exiba todas as notas a ordem em que foram informados: ");
        //for(Double nota: notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));
        System.out.print("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.print("Exiba a soma dos valotes: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 3.9: ");
        notas.remove(3.9);
        System.out.println(notas);
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);
        System.out.println("Remova as notas menores que 8.5 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 8.5) iterator1.remove();
        }
        System.out.println(notas);
       /* System.out.println("Apague toda a lista!");
        notas.clear();
        System.out.println(notas);
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());*/

        //utilizar o método LinkedList
        System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list ArrayList nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<>(notas);
        System.out.println("notas2: "+ notas2);
        System.out.println("notas: " + notas);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.peekFirst());
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista removendo-o: " + notas2.pollFirst());
        System.out.println(notas2);
    }
}
