package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends b implements LazyStringList, RandomAccess {
    @Deprecated
    public static final LazyStringList EMPTY;
    public final ArrayList b;
    public static final LazyStringArrayList c;

    static {
        LazyStringArrayList lazyStringArrayList0 = new LazyStringArrayList();
        LazyStringArrayList.c = lazyStringArrayList0;
        lazyStringArrayList0.makeImmutable();
        LazyStringArrayList.EMPTY = lazyStringArrayList0;
    }

    public LazyStringArrayList() {
        this(10);
    }

    public LazyStringArrayList(int v) {
        this(new ArrayList(v));
    }

    public LazyStringArrayList(LazyStringList lazyStringList0) {
        this.b = new ArrayList(lazyStringList0.size());
        this.addAll(lazyStringList0);
    }

    public LazyStringArrayList(ArrayList arrayList0) {
        this.b = arrayList0;
    }

    public LazyStringArrayList(List list0) {
        this(new ArrayList(list0));
    }

    public static void a(LazyStringArrayList lazyStringArrayList0, int v, byte[] arr_b) {
        lazyStringArrayList0.ensureIsMutable();
        lazyStringArrayList0.b.add(v, arr_b);
        ++lazyStringArrayList0.modCount;
    }

    @Override
    public void add(int v, Object object0) {
        this.add(v, ((String)object0));
    }

    public void add(int v, String s) {
        this.ensureIsMutable();
        this.b.add(v, s);
        ++this.modCount;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString0) {
        this.ensureIsMutable();
        this.b.add(byteString0);
        ++this.modCount;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] arr_b) {
        this.ensureIsMutable();
        this.b.add(arr_b);
        ++this.modCount;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public boolean add(Object object0) {
        return super.add(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public boolean addAll(int v, Collection collection0) {
        this.ensureIsMutable();
        if(collection0 instanceof LazyStringList) {
            collection0 = ((LazyStringList)collection0).getUnderlyingElements();
        }
        boolean z = this.b.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection collection0) {
        this.ensureIsMutable();
        boolean z = this.b.addAll(collection0);
        ++this.modCount;
        return z;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection collection0) {
        this.ensureIsMutable();
        boolean z = this.b.addAll(collection0);
        ++this.modCount;
        return z;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public List asByteArrayList() {
        return new u1(this, 0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List asByteStringList() {
        return new u1(this, 1);
    }

    public static void b(LazyStringArrayList lazyStringArrayList0, int v, ByteString byteString0) {
        lazyStringArrayList0.ensureIsMutable();
        lazyStringArrayList0.b.add(v, byteString0);
        ++lazyStringArrayList0.modCount;
    }

    public static byte[] c(Object object0) {
        if(object0 instanceof byte[]) {
            return (byte[])object0;
        }
        return object0 instanceof String ? Internal.toByteArray(((String)object0)) : ((ByteString)object0).toByteArray();
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public void clear() {
        this.ensureIsMutable();
        this.b.clear();
        ++this.modCount;
    }

    public static ByteString d(Object object0) {
        if(object0 instanceof ByteString) {
            return (ByteString)object0;
        }
        return object0 instanceof String ? ByteString.copyFromUtf8(((String)object0)) : ByteString.copyFrom(((byte[])object0));
    }

    public static LazyStringArrayList emptyList() {
        return LazyStringArrayList.c;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public boolean equals(Object object0) {
        return super.equals(object0);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    public String get(int v) {
        ArrayList arrayList0 = this.b;
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

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int v) {
        ArrayList arrayList0 = this.b;
        Object object0 = arrayList0.get(v);
        byte[] arr_b = LazyStringArrayList.c(object0);
        if(arr_b != object0) {
            arrayList0.set(v, arr_b);
        }
        return arr_b;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int v) {
        ArrayList arrayList0 = this.b;
        Object object0 = arrayList0.get(v);
        ByteString byteString0 = LazyStringArrayList.d(object0);
        if(byteString0 != object0) {
            arrayList0.set(v, byteString0);
        }
        return byteString0;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int v) {
        return this.b.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.b);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this.isModifiable() ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public boolean isModifiable() {
        return this.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList0) {
        this.ensureIsMutable();
        for(Object object0: lazyStringList0.getUnderlyingElements()) {
            ArrayList arrayList0 = this.b;
            if(object0 instanceof byte[]) {
                arrayList0.add(Arrays.copyOf(((byte[])object0), ((byte[])object0).length));
            }
            else {
                arrayList0.add(object0);
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public ProtobufList mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    public LazyStringArrayList mutableCopyWithCapacity(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.b);
        return new LazyStringArrayList(arrayList0);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public Object remove(int v) {
        return this.remove(v);
    }

    public String remove(int v) {
        this.ensureIsMutable();
        Object object0 = this.b.remove(v);
        ++this.modCount;
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof ByteString ? ((ByteString)object0).toStringUtf8() : Internal.toStringUtf8(((byte[])object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override
    public Object set(int v, Object object0) {
        return this.set(v, ((String)object0));
    }

    public String set(int v, String s) {
        this.ensureIsMutable();
        Object object0 = this.b.set(v, s);
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof ByteString ? ((ByteString)object0).toStringUtf8() : Internal.toStringUtf8(((byte[])object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int v, ByteString byteString0) {
        this.ensureIsMutable();
        this.b.set(v, byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int v, byte[] arr_b) {
        this.ensureIsMutable();
        this.b.set(v, arr_b);
    }

    @Override
    public int size() {
        return this.b.size();
    }
}

