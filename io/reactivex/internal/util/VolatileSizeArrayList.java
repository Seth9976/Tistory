package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

public final class VolatileSizeArrayList extends AtomicInteger implements List, RandomAccess {
    public final ArrayList a;

    public VolatileSizeArrayList() {
        this.a = new ArrayList();
    }

    public VolatileSizeArrayList(int v) {
        this.a = new ArrayList(v);
    }

    @Override
    public void add(int v, Object object0) {
        this.a.add(v, object0);
        this.lazySet(this.a.size());
    }

    @Override
    public boolean add(Object object0) {
        boolean z = this.a.add(object0);
        this.lazySet(this.a.size());
        return z;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        boolean z = this.a.addAll(v, collection0);
        this.lazySet(this.a.size());
        return z;
    }

    @Override
    public boolean addAll(Collection collection0) {
        boolean z = this.a.addAll(collection0);
        this.lazySet(this.a.size());
        return z;
    }

    @Override
    public void clear() {
        this.a.clear();
        this.lazySet(0);
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.contains(object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        return this.a.containsAll(collection0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof VolatileSizeArrayList ? this.a.equals(((VolatileSizeArrayList)object0).a) : this.a.equals(object0);
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
    public boolean isEmpty() {
        return this.get() == 0;
    }

    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public int lastIndexOf(Object object0) {
        return this.a.lastIndexOf(object0);
    }

    @Override
    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override
    public ListIterator listIterator(int v) {
        return this.a.listIterator(v);
    }

    @Override
    public Object remove(int v) {
        Object object0 = this.a.remove(v);
        this.lazySet(this.a.size());
        return object0;
    }

    @Override
    public boolean remove(Object object0) {
        boolean z = this.a.remove(object0);
        this.lazySet(this.a.size());
        return z;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        boolean z = this.a.removeAll(collection0);
        this.lazySet(this.a.size());
        return z;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        boolean z = this.a.retainAll(collection0);
        this.lazySet(this.a.size());
        return z;
    }

    @Override
    public Object set(int v, Object object0) {
        return this.a.set(v, object0);
    }

    @Override
    public int size() {
        return this.get();
    }

    @Override
    public List subList(int v, int v1) {
        return this.a.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return this.a.toArray(arr_object);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

