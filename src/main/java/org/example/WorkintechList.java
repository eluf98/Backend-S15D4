package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class WorkintechList extends ArrayList{
    @Override
    public boolean add(Object element) {
        if (!this.contains(element)) { // Eğer eleman yoksa ekle
            boolean added = super.add(element);
            sort();
            return added;
        }
        return false;
    }

    public void sort() {
        Object firstItem = this.get(0);

        if (firstItem instanceof Number) {
            sort(Comparator.comparingInt(a -> ((Number) a).intValue()));
        } else if (firstItem instanceof String) {
            sort(Comparator.comparing(a -> ((String) a)));
        }
    }
    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            sort();
        }
        return removed;
    }

}
