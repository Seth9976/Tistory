package androidx.databinding;

import androidx.collection.ArrayMap;
import java.util.Collection;

public class ObservableArrayMap extends ArrayMap implements ObservableMap {
    public transient MapChangeRegistry g;

    @Override  // androidx.databinding.ObservableMap
    public void addOnMapChangedCallback(OnMapChangedCallback observableMap$OnMapChangedCallback0) {
        if(this.g == null) {
            this.g = new MapChangeRegistry();
        }
        this.g.add(observableMap$OnMapChangedCallback0);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public void clear() {
        if(!this.isEmpty()) {
            super.clear();
            MapChangeRegistry mapChangeRegistry0 = this.g;
            if(mapChangeRegistry0 != null) {
                mapChangeRegistry0.notifyCallbacks(this, 0, null);
            }
        }
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object put(Object object0, Object object1) {
        super.put(object0, object1);
        MapChangeRegistry mapChangeRegistry0 = this.g;
        if(mapChangeRegistry0 != null) {
            mapChangeRegistry0.notifyCallbacks(this, 0, object0);
        }
        return object1;
    }

    @Override  // androidx.collection.ArrayMap
    public boolean removeAll(Collection collection0) {
        boolean z = false;
        for(Object object0: collection0) {
            int v = this.indexOfKey(object0);
            if(v >= 0) {
                this.removeAt(v);
                z = true;
            }
        }
        return z;
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object removeAt(int v) {
        Object object0 = this.keyAt(v);
        Object object1 = super.removeAt(v);
        if(object1 != null) {
            MapChangeRegistry mapChangeRegistry0 = this.g;
            if(mapChangeRegistry0 != null) {
                mapChangeRegistry0.notifyCallbacks(this, 0, object0);
            }
        }
        return object1;
    }

    @Override  // androidx.databinding.ObservableMap
    public void removeOnMapChangedCallback(OnMapChangedCallback observableMap$OnMapChangedCallback0) {
        MapChangeRegistry mapChangeRegistry0 = this.g;
        if(mapChangeRegistry0 != null) {
            mapChangeRegistry0.remove(observableMap$OnMapChangedCallback0);
        }
    }

    @Override  // androidx.collection.ArrayMap
    public boolean retainAll(Collection collection0) {
        int v = this.size() - 1;
        boolean z = false;
        while(v >= 0) {
            if(!collection0.contains(this.keyAt(v))) {
                this.removeAt(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object setValueAt(int v, Object object0) {
        Object object1 = this.keyAt(v);
        Object object2 = super.setValueAt(v, object0);
        MapChangeRegistry mapChangeRegistry0 = this.g;
        if(mapChangeRegistry0 != null) {
            mapChangeRegistry0.notifyCallbacks(this, 0, object1);
        }
        return object2;
    }
}

