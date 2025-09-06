package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class m1 extends b implements IntList, PrimitiveNonBoxingCollection, RandomAccess {
    public int[] b;
    public int c;
    public static final m1 d;

    static {
        m1 m10 = new m1(0, new int[0]);
        m1.d = m10;
        m10.makeImmutable();
    }

    public m1() {
        this(0, new int[10]);
    }

    public m1(int v, int[] arr_v) {
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
        int v1 = (int)(((Integer)object0));
        this.ensureIsMutable();
        if(v >= 0) {
            int v2 = this.c;
            if(v <= v2) {
                int[] arr_v = this.b;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    int[] arr_v1 = new int[v2 * 3 / 2 + 1];
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
        this.addInt(((int)(((Integer)object0))));
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final boolean addAll(Collection collection0) {
        this.ensureIsMutable();
        collection0.getClass();
        if(!(collection0 instanceof m1)) {
            return super.addAll(collection0);
        }
        int v = ((m1)collection0).c;
        if(v == 0) {
            return false;
        }
        int v1 = this.c;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        int[] arr_v = this.b;
        if(v2 > arr_v.length) {
            this.b = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((m1)collection0).b, 0, this.b, this.c, ((m1)collection0).c);
        this.c = v2;
        ++this.modCount;
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$IntList
    public final void addInt(int v) {
        this.ensureIsMutable();
        int v1 = this.c;
        int[] arr_v = this.b;
        if(v1 == arr_v.length) {
            int[] arr_v1 = new int[v1 * 3 / 2 + 1];
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
        if(!(object0 instanceof m1)) {
            return super.equals(object0);
        }
        if(this.c != ((m1)object0).c) {
            return false;
        }
        int[] arr_v = ((m1)object0).b;
        for(int v = 0; v < this.c; ++v) {
            if(this.b[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        return this.getInt(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$IntList
    public final int getInt(int v) {
        this.a(v);
        return this.b[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.c; ++v1) {
            v = v * 0x1F + this.b[v1];
        }
        return v;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Integer)) {
            return -1;
        }
        int v = (int)(((Integer)object0));
        int v1 = this.c;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.b[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$IntList
    public final IntList mutableCopyWithCapacity(int v) {
        if(v < this.c) {
            throw new IllegalArgumentException();
        }
        int[] arr_v = Arrays.copyOf(this.b, v);
        return new m1(this.c, arr_v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$IntList, androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public final ProtobufList mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final Object remove(int v) {
        this.ensureIsMutable();
        this.a(v);
        int[] arr_v = this.b;
        int v1 = arr_v[v];
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
        return this.setInt(v, ((int)(((Integer)object0))));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$IntList
    public final int setInt(int v, int v1) {
        this.ensureIsMutable();
        this.a(v);
        int[] arr_v = this.b;
        int v2 = arr_v[v];
        arr_v[v] = v1;
        return v2;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

