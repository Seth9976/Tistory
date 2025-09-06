package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class f1 extends b implements FloatList, PrimitiveNonBoxingCollection, RandomAccess {
    public float[] b;
    public int c;
    public static final f1 d;

    static {
        f1 f10 = new f1(0, new float[0]);
        f1.d = f10;
        f10.makeImmutable();
    }

    public f1(int v, float[] arr_f) {
        this.b = arr_f;
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
        float f = (float)(((Float)object0));
        this.ensureIsMutable();
        if(v >= 0) {
            int v1 = this.c;
            if(v <= v1) {
                float[] arr_f = this.b;
                if(v1 < arr_f.length) {
                    System.arraycopy(arr_f, v, arr_f, v + 1, v1 - v);
                }
                else {
                    float[] arr_f1 = new float[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_f, 0, arr_f1, 0, v);
                    System.arraycopy(this.b, v, arr_f1, v + 1, this.c - v);
                    this.b = arr_f1;
                }
                this.b[v] = f;
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
        this.addFloat(((float)(((Float)object0))));
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final boolean addAll(Collection collection0) {
        this.ensureIsMutable();
        collection0.getClass();
        if(!(collection0 instanceof f1)) {
            return super.addAll(collection0);
        }
        int v = ((f1)collection0).c;
        if(v == 0) {
            return false;
        }
        int v1 = this.c;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        float[] arr_f = this.b;
        if(v2 > arr_f.length) {
            this.b = Arrays.copyOf(arr_f, v2);
        }
        System.arraycopy(((f1)collection0).b, 0, this.b, this.c, ((f1)collection0).c);
        this.c = v2;
        ++this.modCount;
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList
    public final void addFloat(float f) {
        this.ensureIsMutable();
        int v = this.c;
        float[] arr_f = this.b;
        if(v == arr_f.length) {
            float[] arr_f1 = new float[v * 3 / 2 + 1];
            System.arraycopy(arr_f, 0, arr_f1, 0, v);
            this.b = arr_f1;
        }
        int v1 = this.c;
        this.c = v1 + 1;
        this.b[v1] = f;
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
        if(!(object0 instanceof f1)) {
            return super.equals(object0);
        }
        if(this.c != ((f1)object0).c) {
            return false;
        }
        float[] arr_f = ((f1)object0).b;
        for(int v = 0; v < this.c; ++v) {
            if(Float.floatToIntBits(this.b[v]) != Float.floatToIntBits(arr_f[v])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        return this.getFloat(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList
    public final float getFloat(int v) {
        this.a(v);
        return this.b[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.c; ++v1) {
            v = v * 0x1F + Float.floatToIntBits(this.b[v1]);
        }
        return v;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Float)) {
            return -1;
        }
        float f = (float)(((Float)object0));
        int v = this.c;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.b[v1] == f) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList
    public final FloatList mutableCopyWithCapacity(int v) {
        if(v < this.c) {
            throw new IllegalArgumentException();
        }
        float[] arr_f = Arrays.copyOf(this.b, v);
        return new f1(this.c, arr_f);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList, androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public final ProtobufList mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.b
    public final Object remove(int v) {
        this.ensureIsMutable();
        this.a(v);
        float[] arr_f = this.b;
        float f = arr_f[v];
        int v1 = this.c;
        if(v < v1 - 1) {
            System.arraycopy(arr_f, v + 1, arr_f, v, v1 - v - 1);
        }
        --this.c;
        ++this.modCount;
        return f;
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
        return this.setFloat(v, ((float)(((Float)object0))));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList
    public final float setFloat(int v, float f) {
        this.ensureIsMutable();
        this.a(v);
        float[] arr_f = this.b;
        float f1 = arr_f[v];
        arr_f[v] = f;
        return f1;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

