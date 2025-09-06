package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class j extends b implements BooleanList, PrimitiveNonBoxingCollection, RandomAccess {
    public boolean[] b;
    public int c;
    public static final j d;

    static {
        j j0 = new j(new boolean[0], 0);
        j.d = j0;
        j0.makeImmutable();
    }

    public j(boolean[] arr_z, int v) {
        this.b = arr_z;
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
        boolean z = ((Boolean)object0).booleanValue();
        this.ensureIsMutable();
        if(v >= 0) {
            int v1 = this.c;
            if(v <= v1) {
                boolean[] arr_z = this.b;
                if(v1 < arr_z.length) {
                    System.arraycopy(arr_z, v, arr_z, v + 1, v1 - v);
                }
                else {
                    boolean[] arr_z1 = new boolean[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_z, 0, arr_z1, 0, v);
                    System.arraycopy(this.b, v, arr_z1, v + 1, this.c - v);
                    this.b = arr_z1;
                }
                this.b[v] = z;
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
        this.addBoolean(((Boolean)object0).booleanValue());
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final boolean addAll(Collection collection0) {
        this.ensureIsMutable();
        collection0.getClass();
        if(!(collection0 instanceof j)) {
            return super.addAll(collection0);
        }
        int v = ((j)collection0).c;
        if(v == 0) {
            return false;
        }
        int v1 = this.c;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        boolean[] arr_z = this.b;
        if(v2 > arr_z.length) {
            this.b = Arrays.copyOf(arr_z, v2);
        }
        System.arraycopy(((j)collection0).b, 0, this.b, this.c, ((j)collection0).c);
        this.c = v2;
        ++this.modCount;
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList
    public final void addBoolean(boolean z) {
        this.ensureIsMutable();
        int v = this.c;
        boolean[] arr_z = this.b;
        if(v == arr_z.length) {
            boolean[] arr_z1 = new boolean[v * 3 / 2 + 1];
            System.arraycopy(arr_z, 0, arr_z1, 0, v);
            this.b = arr_z1;
        }
        int v1 = this.c;
        this.c = v1 + 1;
        this.b[v1] = z;
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
        if(!(object0 instanceof j)) {
            return super.equals(object0);
        }
        if(this.c != ((j)object0).c) {
            return false;
        }
        boolean[] arr_z = ((j)object0).b;
        for(int v = 0; v < this.c; ++v) {
            if(this.b[v] != arr_z[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        return Boolean.valueOf(this.getBoolean(v));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList
    public final boolean getBoolean(int v) {
        this.a(v);
        return this.b[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.c; ++v1) {
            v = v * 0x1F + Internal.hashBoolean(this.b[v1]);
        }
        return v;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Boolean)) {
            return -1;
        }
        boolean z = ((Boolean)object0).booleanValue();
        int v = this.c;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.b[v1] == z) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList
    public final BooleanList mutableCopyWithCapacity(int v) {
        if(v < this.c) {
            throw new IllegalArgumentException();
        }
        return new j(Arrays.copyOf(this.b, v), this.c);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList, androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public final ProtobufList mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final Object remove(int v) {
        this.ensureIsMutable();
        this.a(v);
        boolean[] arr_z = this.b;
        boolean z = arr_z[v];
        int v1 = this.c;
        if(v < v1 - 1) {
            System.arraycopy(arr_z, v + 1, arr_z, v, v1 - v - 1);
        }
        --this.c;
        ++this.modCount;
        return Boolean.valueOf(z);
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
        return Boolean.valueOf(this.setBoolean(v, ((Boolean)object0).booleanValue()));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList
    public final boolean setBoolean(int v, boolean z) {
        this.ensureIsMutable();
        this.a(v);
        boolean[] arr_z = this.b;
        boolean z1 = arr_z[v];
        arr_z[v] = z;
        return z1;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

