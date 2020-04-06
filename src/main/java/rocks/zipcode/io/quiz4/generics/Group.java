package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> {
    private List<_> list;
    private Iterator<_> iterator;


    public Group() {
        this.list = new LinkedList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(_ value) {
        list.add(value);
    }

    public Boolean has(_ value) {
        return list.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(_ value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<_> iterator() {
      while (iterator.hasNext()){
          list.add(iterator.next());
      }
        return iterator;
    }
}
