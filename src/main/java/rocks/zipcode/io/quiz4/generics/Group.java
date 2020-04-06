package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> {
    private List<T> list;
    private Iterator<T> iterator;


    public Group() {
        this.list = new LinkedList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(T value) {
        list.add(value);
    }

    public Boolean has(T value) {
        return list.contains(value);
    }

    public T fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(T value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<T> iterator() {
      while (iterator.hasNext()){
          list.add(iterator.next());
      }
        return iterator;
    }
}
