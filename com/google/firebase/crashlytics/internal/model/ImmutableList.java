package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class ImmutableList implements List, RandomAccess {
    public final List a;

    public ImmutableList(List list0) {
        this.a = Collections.unmodifiableList(list0);
    }

    @Override
    public void add(int v, @NonNull Object object0) {
        this.a.add(v, object0);
    }

    @Override
    public boolean add(@NonNull Object object0) {
        return this.a.add(object0);
    }

    @Override
    public boolean addAll(int v, @NonNull Collection collection0) {
        return this.a.addAll(v, collection0);
    }

    @Override
    public boolean addAll(@NonNull Collection collection0) {
        return this.a.addAll(collection0);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(@Nullable Object object0) {
        return this.a.contains(object0);
    }

    @Override
    public boolean containsAll(@NonNull Collection collection0) {
        return this.a.containsAll(collection0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return this.a.equals(object0);
    }

    @NonNull
    public static ImmutableList from(@NonNull List list0) {
        return new ImmutableList(list0);
    }

    @NonNull
    public static ImmutableList from(Object[] arr_object) {
        return new ImmutableList(Arrays.asList(arr_object));
    }

    @Override
    @NonNull
    public Object get(int v) {
        return this.a.get(v);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public int indexOf(@Nullable Object object0) {
        return this.a.indexOf(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @NonNull
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public int lastIndexOf(@Nullable Object object0) {
        return this.a.lastIndexOf(object0);
    }

    @Override
    @NonNull
    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override
    @NonNull
    public ListIterator listIterator(int v) {
        return this.a.listIterator(v);
    }

    @Override
    public Object remove(int v) {
        return this.a.remove(v);
    }

    @Override
    public boolean remove(@Nullable Object object0) {
        return this.a.remove(object0);
    }

    @Override
    public boolean removeAll(@NonNull Collection collection0) {
        return this.a.removeAll(collection0);
    }

    @Override
    public boolean retainAll(@NonNull Collection collection0) {
        return this.a.retainAll(collection0);
    }

    @Override
    @NonNull
    public Object set(int v, @NonNull Object object0) {
        return this.a.set(v, object0);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    @NonNull
    public List subList(int v, int v1) {
        return this.a.subList(v, v1);
    }

    @Override
    @Nullable
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override
    public Object[] toArray(@Nullable Object[] arr_object) {
        return this.a.toArray(arr_object);
    }
}

