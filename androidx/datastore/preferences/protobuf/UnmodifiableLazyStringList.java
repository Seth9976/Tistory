package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public class UnmodifiableLazyStringList extends AbstractList implements LazyStringList, RandomAccess {
    public final LazyStringList a;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList0) {
        this.a = lazyStringList0;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] arr_b) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public List asByteArrayList() {
        return Collections.unmodifiableList(this.a.asByteArrayList());
    }

    @Override  // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List asByteStringList() {
        return Collections.unmodifiableList(this.a.asByteStringList());
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    public String get(int v) {
        return (String)this.a.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int v) {
        return this.a.getByteArray(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int v) {
        return this.a.getByteString(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int v) {
        return this.a.getRaw(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public List getUnderlyingElements() {
        return this.a.getUnderlyingElements();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    @Override
    public Iterator iterator() {
        return new t1(this);
    }

    @Override
    public ListIterator listIterator(int v) {
        return new y3(this, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int v, ByteString byteString0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int v, byte[] arr_b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

