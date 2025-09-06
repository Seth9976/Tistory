package cd;

import java.util.Comparator;

public enum l implements Comparator {
    INSTANCE;

    @Override
    public final int compare(Object object0, Object object1) {
        return ((Comparable)object0).compareTo(object1);
    }
}

