package rocks.zipcode.io.quiz4.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {
    private List<String> list;

    public SimpleStringGroup(){
        this.list = new LinkedList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(String string) {
        list.add(string);
    }

    public Boolean has(String string) {
        return list.contains(string);
    }

    public String fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(String string) {
        list.remove(string);
    }

    public void clear() {
        list.clear();
    }
}
