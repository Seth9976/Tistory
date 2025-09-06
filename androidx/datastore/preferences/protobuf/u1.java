package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

public final class u1 extends AbstractList implements RandomAccess {
    public final int a;
    public final LazyStringArrayList b;

    public u1(LazyStringArrayList lazyStringArrayList0, int v) {
        this.a = v;
        super();
        this.b = lazyStringArrayList0;
    }

    @Override
    public final void add(int v, Object object0) {
        if(this.a != 0) {
            LazyStringArrayList.b(this.b, v, ((ByteString)object0));
            ++this.modCount;
            return;
        }
        LazyStringArrayList.a(this.b, v, ((byte[])object0));
        ++this.modCount;
    }

    @Override
    public final Object get(int v) {
        return this.a != 0 ? this.b.getByteString(v) : this.b.getByteArray(v);
    }

    @Override
    public final Object remove(int v) {
        if(this.a != 0) {
            String s = this.b.remove(v);
            ++this.modCount;
            return LazyStringArrayList.d(s);
        }
        String s1 = this.b.remove(v);
        ++this.modCount;
        return LazyStringArrayList.c(s1);
    }

    @Override
    public final Object set(int v, Object object0) {
        LazyStringArrayList lazyStringArrayList0 = this.b;
        if(this.a != 0) {
            lazyStringArrayList0.ensureIsMutable();
            Object object1 = lazyStringArrayList0.b.set(v, ((ByteString)object0));
            ++this.modCount;
            return LazyStringArrayList.d(object1);
        }
        lazyStringArrayList0.ensureIsMutable();
        Object object2 = lazyStringArrayList0.b.set(v, ((byte[])object0));
        ++this.modCount;
        return LazyStringArrayList.c(object2);
    }

    @Override
    public final int size() {
        return this.b.size();
    }
}

