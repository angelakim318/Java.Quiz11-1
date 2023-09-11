package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {

    List<T> list;

    public SortedGroup() {
        list = new ArrayList<>();
    }
    @Override
    public void insert(T value) {
        list.add(value);
        Collections.sort(list);
    }


    @Override
    public void delete(T value) {
        list.remove(value);
    }

    public Integer indexOf(T value) {
        return list.indexOf(value);
    }


}
