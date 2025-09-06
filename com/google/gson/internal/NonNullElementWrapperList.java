package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public class NonNullElementWrapperList extends AbstractList implements RandomAccess {
    public final ArrayList a;

    public NonNullElementWrapperList(ArrayList arrayList0) {
        Objects.requireNonNull(arrayList0);
        this.a = arrayList0;
    }

    @Override
    public void add(int v, Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Element must be non-null");
        }
        this.a.add(v, object0);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.contains(object0);
    }

    @Override
    public boolean equals(Object object0) {
        return this.a.equals(object0);
    }

    @Override
    public Object get(int v) {
        return this.a.get(v);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public int indexOf(Object object0) {
        return this.a.indexOf(object0);
    }

    @Override
    public int lastIndexOf(Object object0) {
        return this.a.lastIndexOf(object0);
    }

    @Override
    public Object remove(int v) {
        return this.a.remove(v);
    }

    @Override
    public boolean remove(Object object0) {
        return this.a.remove(object0);
    }

    @Override
    public boolean removeAll(Collection collection0) {
        return this.a.removeAll(collection0);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        return this.a.retainAll(collection0);
    }

    @Override
    public Object set(int v, Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Element must be non-null");
        }
        return this.a.set(v, object0);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return this.a.toArray(arr_object);
    }
}

