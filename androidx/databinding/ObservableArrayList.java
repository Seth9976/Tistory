package androidx.databinding;

import java.util.ArrayList;
import java.util.Collection;

public class ObservableArrayList extends ArrayList implements ObservableList {
    public transient ListChangeRegistry a;

    public ObservableArrayList() {
        this.a = new ListChangeRegistry();
    }

    @Override
    public void add(int v, Object object0) {
        super.add(v, object0);
        ListChangeRegistry listChangeRegistry0 = this.a;
        if(listChangeRegistry0 != null) {
            listChangeRegistry0.notifyInserted(this, v, 1);
        }
    }

    @Override
    public boolean add(Object object0) {
        super.add(object0);
        int v = this.size();
        ListChangeRegistry listChangeRegistry0 = this.a;
        if(listChangeRegistry0 != null) {
            listChangeRegistry0.notifyInserted(this, v - 1, 1);
        }
        return true;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        boolean z = super.addAll(v, collection0);
        if(z) {
            int v1 = collection0.size();
            ListChangeRegistry listChangeRegistry0 = this.a;
            if(listChangeRegistry0 != null) {
                listChangeRegistry0.notifyInserted(this, v, v1);
            }
        }
        return z;
    }

    @Override
    public boolean addAll(Collection collection0) {
        int v = this.size();
        boolean z = super.addAll(collection0);
        if(z) {
            int v1 = this.size();
            ListChangeRegistry listChangeRegistry0 = this.a;
            if(listChangeRegistry0 != null) {
                listChangeRegistry0.notifyInserted(this, v, v1 - v);
            }
        }
        return z;
    }

    @Override  // androidx.databinding.ObservableList
    public void addOnListChangedCallback(OnListChangedCallback observableList$OnListChangedCallback0) {
        if(this.a == null) {
            this.a = new ListChangeRegistry();
        }
        this.a.add(observableList$OnListChangedCallback0);
    }

    @Override
    public void clear() {
        int v = this.size();
        super.clear();
        if(v != 0) {
            ListChangeRegistry listChangeRegistry0 = this.a;
            if(listChangeRegistry0 != null) {
                listChangeRegistry0.notifyRemoved(this, 0, v);
            }
        }
    }

    @Override
    public Object remove(int v) {
        Object object0 = super.remove(v);
        ListChangeRegistry listChangeRegistry0 = this.a;
        if(listChangeRegistry0 != null) {
            listChangeRegistry0.notifyRemoved(this, v, 1);
        }
        return object0;
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
            return true;
        }
        return false;
    }

    @Override  // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(OnListChangedCallback observableList$OnListChangedCallback0) {
        ListChangeRegistry listChangeRegistry0 = this.a;
        if(listChangeRegistry0 != null) {
            listChangeRegistry0.remove(observableList$OnListChangedCallback0);
        }
    }

    @Override
    public void removeRange(int v, int v1) {
        super.removeRange(v, v1);
        ListChangeRegistry listChangeRegistry0 = this.a;
        if(listChangeRegistry0 != null) {
            listChangeRegistry0.notifyRemoved(this, v, v1 - v);
        }
    }

    @Override
    public Object set(int v, Object object0) {
        Object object1 = super.set(v, object0);
        ListChangeRegistry listChangeRegistry0 = this.a;
        if(listChangeRegistry0 != null) {
            listChangeRegistry0.notifyChanged(this, v, 1);
        }
        return object1;
    }
}

