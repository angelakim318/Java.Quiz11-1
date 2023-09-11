package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T> {

    List<T> list;
    public Group() {
        list = new ArrayList<>();
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
        return null;
    }

    @Override
    public String toString() {
        return "" + list + "";

    }
}
