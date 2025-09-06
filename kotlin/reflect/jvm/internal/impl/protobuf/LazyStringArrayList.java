package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends AbstractList implements RandomAccess, LazyStringList {
    public static final LazyStringList EMPTY;
    public final ArrayList a;

    static {
        LazyStringArrayList.EMPTY = new LazyStringArrayList().getUnmodifiableView();
    }

    public LazyStringArrayList() {
        this.a = new ArrayList();
    }

    public LazyStringArrayList(LazyStringList lazyStringList0) {
        this.a = new ArrayList(lazyStringList0.size());
        this.addAll(lazyStringList0);
    }

    @Override
    public void add(int v, Object object0) {
        this.add(v, ((String)object0));
    }

    public void add(int v, String s) {
        this.a.add(v, s);
        ++this.modCount;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString0) {
        this.a.add(byteString0);
        ++this.modCount;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        if(collection0 instanceof LazyStringList) {
            collection0 = ((LazyStringList)collection0).getUnderlyingElements();
        }
        boolean z = this.a.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override
    public boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override
    public void clear() {
        this.a.clear();
        ++this.modCount;
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    public String get(int v) {
        ArrayList arrayList0 = this.a;
        Object object0 = arrayList0.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof ByteString) {
            String s = ((ByteString)object0).toStringUtf8();
            if(((ByteString)object0).isValidUtf8()) {
                arrayList0.set(v, s);
            }
            return s;
        }
        String s1 = Internal.toStringUtf8(((byte[])object0));
        if(Internal.isValidUtf8(((byte[])object0))) {
            arrayList0.set(v, s1);
        }
        return s1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int v) {
        ByteString byteString0;
        ArrayList arrayList0 = this.a;
        Object object0 = arrayList0.get(v);
        if(object0 instanceof ByteString) {
            byteString0 = (ByteString)object0;
        }
        else {
            byteString0 = object0 instanceof String ? ByteString.copyFromUtf8(((String)object0)) : ByteString.copyFrom(((byte[])object0));
        }
        if(byteString0 != object0) {
            arrayList0.set(v, byteString0);
        }
        return byteString0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.a);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override
    public Object remove(int v) {
        return this.remove(v);
    }

    public String remove(int v) {
        Object object0 = this.a.remove(v);
        ++this.modCount;
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof ByteString ? ((ByteString)object0).toStringUtf8() : Internal.toStringUtf8(((byte[])object0));
    }

    @Override
    public Object set(int v, Object object0) {
        return this.set(v, ((String)object0));
    }

    public String set(int v, String s) {
        Object object0 = this.a.set(v, s);
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof ByteString ? ((ByteString)object0).toStringUtf8() : Internal.toStringUtf8(((byte[])object0));
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

