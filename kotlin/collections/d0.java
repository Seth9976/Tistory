package kotlin.collections;

import a5.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

public final class d0 extends AbstractList implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public d0(Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        super();
        this.a = arr_object;
        if(v < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + v).toString());
        }
        if(v <= arr_object.length) {
            this.b = arr_object.length;
            this.d = v;
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
        stringBuilder0.append(arr_object.length);
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    public final void a(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("n shouldn\'t be negative but it is " + v).toString());
        }
        if(v <= this.size()) {
            if(v > 0) {
                int v1 = this.c;
                int v2 = this.b;
                int v3 = (v1 + v) % v2;
                Object[] arr_object = this.a;
                if(v1 > v3) {
                    ArraysKt___ArraysJvmKt.fill(arr_object, null, v1, v2);
                    ArraysKt___ArraysJvmKt.fill(arr_object, null, 0, v3);
                }
                else {
                    ArraysKt___ArraysJvmKt.fill(arr_object, null, v1, v3);
                }
                this.c = v3;
                this.d = this.size() - v;
            }
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "n shouldn\'t be greater than the buffer size: n = ", ", size = ");
        stringBuilder0.append(this.size());
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @Override  // kotlin.collections.AbstractList
    public final Object get(int v) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.size());
        return this.a[(this.c + v) % this.b];
    }

    @Override  // kotlin.collections.AbstractList
    public final int getSize() {
        return this.d;
    }

    @Override  // kotlin.collections.AbstractList
    public final Iterator iterator() {
        return new RingBuffer.iterator.1(this);
    }

    @Override  // kotlin.collections.AbstractCollection
    public final Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override  // kotlin.collections.AbstractCollection
    public final Object[] toArray(Object[] arr_object) {
        Object[] arr_object1;
        Intrinsics.checkNotNullParameter(arr_object, "array");
        if(arr_object.length < this.size()) {
            arr_object = Arrays.copyOf(arr_object, this.size());
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
        }
        int v = this.size();
        int v1 = this.c;
        int v3 = 0;
        while(true) {
            arr_object1 = this.a;
            if(v3 >= v || v1 >= this.b) {
                break;
            }
            arr_object[v3] = arr_object1[v1];
            ++v3;
            ++v1;
        }
        for(int v2 = 0; v3 < v; ++v2) {
            arr_object[v3] = arr_object1[v2];
            ++v3;
        }
        return k.terminateCollectionToArray(v, arr_object);
    }
}

