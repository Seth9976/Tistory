package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

public final class CachedHashCodeArrayMap extends ArrayMap {
    public int g;

    @Override  // androidx.collection.SimpleArrayMap
    public void clear() {
        this.g = 0;
        super.clear();
    }

    @Override  // androidx.collection.SimpleArrayMap
    public int hashCode() {
        if(this.g == 0) {
            this.g = super.hashCode();
        }
        return this.g;
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object put(Object object0, Object object1) {
        this.g = 0;
        return super.put(object0, object1);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public void putAll(SimpleArrayMap simpleArrayMap0) {
        this.g = 0;
        super.putAll(simpleArrayMap0);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object removeAt(int v) {
        this.g = 0;
        return super.removeAt(v);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object setValueAt(int v, Object object0) {
        this.g = 0;
        return super.setValueAt(v, object0);
    }
}

