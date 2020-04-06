package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    private List<_> list = new ArrayList<>();

    @Override
    public void insert(_ value) {
        list.add(value);
    }

    @Override
    public void delete(_ value) {
        list.remove(value);
    }

    public Integer indexOf(_ value) {
        Integer place = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value){
                place = i;
            }
        }
        return place;
    }
}
