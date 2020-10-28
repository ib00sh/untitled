package HW;

import java.util.*;

public class LinkedListDemo {
    public static void main(String args[]) {

//        LinkedList<String> w = new LinkedList();
//        w.add("F");
//        w.add("B");
//        w.add("D");
//        w.add("E");
//        w.add("C");
//        w.addLast("Z");
//        w.addFirst("A");
//        w.add(1, "A2");
//        System.out.println("1. LinledList w: " + w);
//        w.remove("F");
//        w.remove(2);
//        System.out.println("2. LinledList w: " + w);
//        w.removeFirst();
//        w.removeLast();
//        System.out.println("3. Linkedlist w: " + w);
//        String val = w.get(2);
//        w.set(2, val + " измененно");
//        System.out.println("4. LinkedList w: " + w);
//
//        TreeSet<String> hs = new TreeSet<>();
//        hs.add("Бета");
//        hs.add("Альфа");
//        hs.add("Эта");
//        hs.add("Гамма");
//        hs.add("Эпсилон");
//        hs.add("Омега");
//        System.out.println(hs);

//        HashMap<String, String> hm = new HashMap<>();
//        hm.put("Russia", "Moscow");
//        hm.put("France", "Paris");
//        hm.put("Germany", "Berlin");
//        hm.put("Norway", "Oslo");
//        Set<Map.Entry<String, String>> set = hm.entrySet();
//        for (Map.Entry<String, String> o: set) {
//            System.out.print(o.getKey() + ": ");
//            System.out.println(o.getValue());
//        }
//
//        hm.put("Germany", "Berlin2");
//        System.out.println("New Germany Entry: " + hm.get("Germany"));


//
//
//        HashMap<String, Integer> hm = new HashMap<>();
//        hm.put("Макс", 1);
//        hm.put("Иван", 1);
//        hm.put("Лич", 1);
//        hm.put("Артес", 1);
//        hm.put("Макс", 1);
//        hm.put("Борис", 1);
//
//        Set<Map.Entry<String, Integer>> set = hm.entrySet();
//        for (Map.Entry<String, Integer> o: set) {
//            System.out.print(o.getValue() + " : ");
//            System.out.println(o.getKey() );
//        }
//
//
    String[] arr = {"Abc" , "Bob", "Abc", "Tree" , "Tree", "Abc"};
    HashMap<String, Integer> hm = new HashMap<>();
        for (String o: arr ) {
            hm.put(o, hm.getOrDefault(o, 0) + 1);
        }
        System.out.println(hm);



    }
}
