package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class z1 extends b implements LongList, PrimitiveNonBoxingCollection, RandomAccess {
    public long[] b;
    public int c;
    public static final z1 d;

    static {
        z1 z10 = new z1(new long[0], 0);
        z1.d = z10;
        z10.makeImmutable();
    }

    public z1() {
        this(new long[10], 0);
    }

    public z1(long[] arr_v, int v) {
        this.b = arr_v;
        this.c = v;
    }

    public final void a(int v) {
        if(v >= 0 && v < this.c) {
            return;
        }
        StringBuilder stringBuilder0 = a5.b.s(v, "Index:", ", Size:");
        stringBuilder0.append(this.c);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override
    public final void add(int v, Object object0) {
        long v1 = (long)(((Long)object0));
        this.ensureIsMutable();
        if(v >= 0) {
            int v2 = this.c;
            if(v <= v2) {
                long[] arr_v = this.b;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    long[] arr_v1 = new long[v2 * 3 / 2 + 1];
                    System.arraycopy(arr_v, 0, arr_v1, 0, v);
                    System.arraycopy(this.b, v, arr_v1, v + 1, this.c - v);
                    this.b = arr_v1;
                }
                this.b[v] = v1;
                ++this.c;
                ++this.modCount;
                return;
            }
        }
        StringBuilder stringBuilder0 = a5.b.s(v, "Index:", ", Size:");
        stringBuilder0.append(this.c);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final boolean add(Object object0) {
        this.addLong(((long)(((Long)object0))));
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final boolean addAll(Collection collection0) {
        this.ensureIsMutable();
        collection0.getClass();
        if(!(collection0 instanceof z1)) {
            return super.addAll(collection0);
        }
        int v = ((z1)collection0).c;
        if(v == 0) {
            return false;
        }
        int v1 = this.c;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        long[] arr_v = this.b;
        if(v2 > arr_v.length) {
            this.b = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((z1)collection0).b, 0, this.b, this.c, ((z1)collection0).c);
        this.c = v2;
        ++this.modCount;
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList
    public final void addLong(long v) {
        this.ensureIsMutable();
        int v1 = this.c;
        long[] arr_v = this.b;
        if(v1 == arr_v.length) {
            long[] arr_v1 = new long[v1 * 3 / 2 + 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            this.b = arr_v1;
        }
        int v2 = this.c;
        this.c = v2 + 1;
        this.b[v2] = v;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z1)) {
            return super.equals(object0);
        }
        if(this.c != ((z1)object0).c) {
            return false;
        }
        long[] arr_v = ((z1)object0).b;
        for(int v = 0; v < this.c; ++v) {
            if(this.b[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        return this.getLong(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList
    public final long getLong(int v) {
        this.a(v);
        return this.b[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.c; ++v1) {
            v = v * 0x1F + Internal.hashLong(this.b[v1]);
        }
        return v;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Long)) {
            return -1;
        }
        long v = (long)(((Long)object0));
        int v1 = this.c;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.b[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList
    public final LongList mutableCopyWithCapacity(int v) {
        if(v < this.c) {
            throw new IllegalArgumentException();
        }
        return new z1(Arrays.copyOf(this.b, v), this.c);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList, androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public final ProtobufList mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final Object remove(int v) {
        this.ensureIsMutable();
        this.a(v);
        long[] arr_v = this.b;
        long v1 = arr_v[v];
        int v2 = this.c;
        if(v < v2 - 1) {
            System.arraycopy(arr_v, v + 1, arr_v, v, v2 - v - 1);
        }
        --this.c;
        ++this.modCount;
        return v1;
    }

    @Override
    public final void removeRange(int v, int v1) {
        this.ensureIsMutable();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.b, v1, this.b, v, this.c - v1);
        this.c -= v1 - v;
        ++this.modCount;
    }

    @Override
    public final Object set(int v, Object object0) {
        return this.setLong(v, ((long)(((Long)object0))));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList
    public final long setLong(int v, long v1) {
        this.ensureIsMutable();
        this.a(v);
        long[] arr_v = this.b;
        long v2 = arr_v[v];
        arr_v[v] = v1;
        return v2;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

