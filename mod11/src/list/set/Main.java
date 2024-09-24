package list.set;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        // Hashset
        // doesn't have order
        // Fast read and write
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // Duplicate will be ignored

        System.out.println("linkedSet " + set);


        // LinkedHashSet
        // Ordered
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("apple");
        linkedSet.add("banana");
        linkedSet.add("apple"); // Duplicate will be ignored

        System.out.println("linkedSet " +linkedSet);

        // TreeSet
        // Sorted

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);

        System.out.println("treeSet " + treeSet); // [1, 2, 3]
    }
}
