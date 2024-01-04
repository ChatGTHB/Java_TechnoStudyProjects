package practises.practise_03;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        int number;
        int[]array=new int[10];

        ArrayList<Integer> list=new ArrayList<>();
        list.add(71);
        list.add(91);
        list.add(81);
        list.add(47);

        System.out.println(list.size());
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        for(Integer i:list){
            System.out.println("Number = "+i);
        }


    }
}
