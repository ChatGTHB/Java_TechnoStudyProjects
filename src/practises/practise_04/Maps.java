package practises.practise_04;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        int array[] = new int[10];              // Length fixed, speed degree : 1
        List<Integer> list = new ArrayList<>(); // Size dynamic, speed degree : 2
        Set<Integer> treeSet = new TreeSet<>(); // The size variable is not again, serried, speed degree: 3

        // HashMap

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "Hakan Mert");
        hashMap.put(1002, "Kubilay Alp");
        hashMap.put(1010, "Yiğit Efe");

        System.out.println("hashMap.get(1010) = " + hashMap.get(1010)); // Yiğit Efe
        System.out.println("hashMap = " + hashMap); // {1010=Yiğit Efe, 1001=Hakan Mert, 1002=Kubilay Alp}
        System.out.println("hashMap.keySet() = " + hashMap.keySet()); // [1010, 1001, 1002]

        // TreeMap

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1001, "Hakan Mert");
        treeMap.put(1002, "Kubilay Alp");
        treeMap.put(1010, "Yiğit Efe");

        System.out.println("treeMap.get(1010) = " + treeMap.get(1010)); // Yiğit Efe
        System.out.println("treeMap = " + treeMap); // {1001=Hakan Mert, 1002=Kubilay Alp, 1010=Yiğit Efe}
        System.out.println("treeMap.keySet() = " + treeMap.keySet()); // [1001, 1002, 1010]
        System.out.println("treeMap.values() = " + treeMap.values()); // [Hakan Mert, Kubilay Alp, Yiğit Efe]

        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            System.out.println("key,value = " + e.getKey() + " - " + e.getValue());
        }
    }
}
