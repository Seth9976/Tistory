package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

public final class w2 extends b implements RandomAccess {
    public Object[] b;
    public int c;
    public static final w2 d;

    static {
        w2 w20 = new w2(new Object[0], 0);
        w2.d = w20;
        w20.makeImmutable();
    }

    public w2(Object[] arr_object, int v) {
        this.b = arr_object;
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
        this.ensureIsMutable();
        if(v >= 0) {
            int v1 = this.c;
            if(v <= v1) {
                Object[] arr_object = this.b;
                if(v1 < arr_object.length) {
                    System.arraycopy(arr_object, v, arr_object, v + 1, v1 - v);
                }
                else {
                    Object[] arr_object1 = new Object[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_object, 0, arr_object1, 0, v);
                    System.arraycopy(this.b, v, arr_object1, v + 1, this.c - v);
                    this.b = arr_object1;
                }
                this.b[v] = object0;
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
        this.ensureIsMutable();
        int v = this.c;
        Object[] arr_object = this.b;
        if(v == arr_object.length) {
            this.b = Arrays.copyOf(arr_object, v * 3 / 2 + 1);
        }
        int v1 = this.c;
        this.c = v1 + 1;
        this.b[v1] = object0;
        ++this.modCount;
        return true;
    }

    @Override
    public final Object get(int v) {
        this.a(v);
        return this.b[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public final ProtobufList mutableCopyWithCapacity(int v) {
        if(v < this.c) {
            throw new IllegalArgumentException();
        }
        return new w2(Arrays.copyOf(this.b, v), this.c);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final Object remove(int v) {
        this.ensureIsMutable();
        this.a(v);
        Object[] arr_object = this.b;
        Object object0 = arr_object[v];
        int v1 = this.c;
        if(v < v1 - 1) {
            System.arraycopy(arr_object, v + 1, arr_object, v, v1 - v - 1);
        }
        --this.c;
        ++this.modCount;
        return object0;
    }

    @Override
    public final Object set(int v, Object object0) {
        this.ensureIsMutable();
        this.a(v);
        Object[] arr_object = this.b;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        ++this.modCount;
        return object1;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

