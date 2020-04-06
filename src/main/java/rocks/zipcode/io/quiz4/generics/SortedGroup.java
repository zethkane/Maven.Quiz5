package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> {
    private TreeSet<T> treeSet = new TreeSet<>();

    @Override
    public void insert(T value) {
        treeSet.add(value);
    }

    @Override
    public void delete(T value) {
        treeSet.remove(value);
    }

    public Integer indexOf(T value) {
       List<T> set = new ArrayList<>(treeSet);
       return set.indexOf(value);
    }

    @Override
    public String toString() {
        return "SortedGroup{" +
                "set=" + treeSet +
                '}';
    }
}
