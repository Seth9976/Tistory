package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\nJ\r\u0010\f\u001A\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00028\u0000¢\u0006\u0004\b\u000E\u0010\rJ\r\u0010\u000F\u001A\u00020\b¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0012\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\u0018\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001A\u001A\u00020\u0019¢\u0006\u0004\b\u001A\u0010\u001BR\u0011\u0010\u001D\u001A\u00028\u00008F¢\u0006\u0006\u001A\u0004\b\u001C\u0010\rR\u0011\u0010\u001F\u001A\u00028\u00008F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\r¨\u0006 "}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "", "minCapacity", "<init>", "(I)V", "element", "", "addFirst", "(Ljava/lang/Object;)V", "addLast", "popFirst", "()Ljava/lang/Object;", "popLast", "clear", "()V", "count", "removeFromStart", "removeFromEnd", "index", "get", "(I)Ljava/lang/Object;", "size", "()I", "", "isEmpty", "()Z", "getFirst", "first", "getLast", "last", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
public final class CircularArray {
    public Object[] a;
    public int b;
    public int c;
    public int d;

    @JvmOverloads
    public CircularArray() {
        this(0, 1, null);
    }

    @JvmOverloads
    public CircularArray(int v) {
        if(v < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if(v > 0x40000000) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        if(Integer.bitCount(v) != 1) {
            v = Integer.highestOneBit(v - 1) << 1;
        }
        this.d = v - 1;
        this.a = new Object[v];
    }

    public CircularArray(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 8;
        }
        this(v);
    }

    public final void a() {
        Object[] arr_object = this.a;
        int v = this.b;
        int v1 = arr_object.length - v;
        int v2 = arr_object.length << 1;
        if(v2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] arr_object1 = new Object[v2];
        ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, 0, v, arr_object.length);
        ArraysKt___ArraysJvmKt.copyInto(this.a, arr_object1, v1, 0, this.b);
        this.a = arr_object1;
        this.b = 0;
        this.c = arr_object.length;
        this.d = v2 - 1;
    }

    public final void addFirst(Object object0) {
        int v = this.b - 1 & this.d;
        this.b = v;
        this.a[v] = object0;
        if(v == this.c) {
            this.a();
        }
    }

    public final void addLast(Object object0) {
        int v = this.c;
        this.a[v] = object0;
        int v1 = this.d & v + 1;
        this.c = v1;
        if(v1 == this.b) {
            this.a();
        }
    }

    public final void clear() {
        this.removeFromStart(this.size());
    }

    public final Object get(int v) {
        if(v < 0 || v >= this.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object object0 = this.a[this.d & this.b + v];
        Intrinsics.checkNotNull(object0);
        return object0;
    }

    public final Object getFirst() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object object0 = this.a[v];
        Intrinsics.checkNotNull(object0);
        return object0;
    }

    public final Object getLast() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object object0 = this.a[v - 1 & this.d];
        Intrinsics.checkNotNull(object0);
        return object0;
    }

    public final boolean isEmpty() {
        return this.b == this.c;
    }

    public final Object popFirst() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] arr_object = this.a;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.b = v + 1 & this.d;
        return object0;
    }

    public final Object popLast() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.d & v - 1;
        Object[] arr_object = this.a;
        Object object0 = arr_object[v1];
        arr_object[v1] = null;
        this.c = v1;
        return object0;
    }

    public final void removeFromEnd(int v) {
        if(v <= 0) {
            return;
        }
        if(v > this.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.c;
        int v2 = v >= v1 ? 0 : v1 - v;
        for(int v3 = v2; v3 < v1; ++v3) {
            this.a[v3] = null;
        }
        int v4 = this.c - v2;
        int v5 = v - v4;
        this.c -= v4;
        if(v5 > 0) {
            int v6 = this.a.length;
            this.c = v6;
            int v7 = v6 - v5;
            for(int v8 = v7; v8 < v6; ++v8) {
                this.a[v8] = null;
            }
            this.c = v7;
        }
    }

    public final void removeFromStart(int v) {
        if(v <= 0) {
            return;
        }
        if(v > this.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.a.length;
        int v2 = this.b;
        if(v < v1 - v2) {
            v1 = v2 + v;
        }
        while(v2 < v1) {
            this.a[v2] = null;
            ++v2;
        }
        int v3 = v1 - this.b;
        int v4 = v - v3;
        this.b = this.d & this.b + v3;
        if(v4 > 0) {
            for(int v5 = 0; v5 < v4; ++v5) {
                this.a[v5] = null;
            }
            this.b = v4;
        }
    }

    public final int size() {
        return this.c - this.b & this.d;
    }
}

