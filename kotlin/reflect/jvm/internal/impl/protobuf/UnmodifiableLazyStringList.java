package kotlin.reflect.jvm.internal.impl.protobuf;

import gd.w;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class UnmodifiableLazyStringList extends AbstractList implements RandomAccess, LazyStringList {
    public final LazyStringList a;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList0) {
        this.a = lazyStringList0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    public String get(int v) {
        return (String)this.a.get(v);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int v) {
        return this.a.getByteString(v);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List getUnderlyingElements() {
        return this.a.getUnderlyingElements();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    @Override
    public Iterator iterator() {
        return new w(this);
    }

    @Override
    public ListIterator listIterator(int v) {
        return new q(this, v);
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

