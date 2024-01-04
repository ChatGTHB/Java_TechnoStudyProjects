package practises.practise_03;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        int number;
        int[] numbers = new int[10];
        ArrayList<Integer> list = new ArrayList<>();

        TreeSet<Integer>treeSet=new TreeSet<>();
        treeSet.add(11);
        treeSet.add(23);
        treeSet.add(06);
        treeSet.add(11);

        for(Integer i:treeSet){ // 6 11 23
            System.out.print(i+" ");
        }

        System.out.println("treeSet = " + treeSet); // treeSet = [6, 11, 23]


        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(11);
        linkedHashSet.add(23);
        linkedHashSet.add(06);
        linkedHashSet.add(11);

        for(Integer i:linkedHashSet){ // 11 23 6
            System.out.print(i+" ");
        }

        System.out.println("linkedHashSet = " + linkedHashSet); // linkedHashSet = [11, 23, 6]


       HashSet<Integer> hashSet=new HashSet<>();
       hashSet.add(11);
       hashSet.add(23);
       hashSet.add(06);
       hashSet.add(11);

        for(Integer i:hashSet){ // 6 23 11
            System.out.print(i+" ");
        }

        System.out.println("hashSet = " + hashSet); // hashSet = [6, 23, 11]

    }
}
