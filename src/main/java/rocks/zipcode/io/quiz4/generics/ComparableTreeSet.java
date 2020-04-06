package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<T> {
    private Set<T> set;

    public ComparableTreeSet(T... arr) {
        this.set.addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
        this.set = new TreeSet<>();
    }

    public int compareTo(ComparableTreeSet<T> o) {
        return Integer.valueOf(String.valueOf(o));
    }
}
