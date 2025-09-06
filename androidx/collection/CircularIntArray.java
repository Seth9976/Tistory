package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0015\u0010\t\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005J\r\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\u000BJ\r\u0010\r\u001A\u00020\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u0015\u0010\u0011\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0018\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001A\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u000BJ\r\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001A\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u000BR\u0011\u0010\u001C\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001D"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "", "minCapacity", "<init>", "(I)V", "element", "", "addFirst", "addLast", "popFirst", "()I", "popLast", "clear", "()V", "count", "removeFromStart", "removeFromEnd", "index", "get", "(I)I", "size", "", "isEmpty", "()Z", "getFirst", "first", "getLast", "last", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
public final class CircularIntArray {
    public int[] a;
    public int b;
    public int c;
    public int d;

    @JvmOverloads
    public CircularIntArray() {
        this(0, 1, null);
    }

    @JvmOverloads
    public CircularIntArray(int v) {
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
        this.a = new int[v];
    }

    public CircularIntArray(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 8;
        }
        this(v);
    }

    public final void a() {
        int[] arr_v = this.a;
        int v = this.b;
        int v1 = arr_v.length - v;
        int v2 = arr_v.length << 1;
        if(v2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] arr_v1 = new int[v2];
        ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v1, 0, v, arr_v.length);
        ArraysKt___ArraysJvmKt.copyInto(this.a, arr_v1, v1, 0, this.b);
        this.a = arr_v1;
        this.b = 0;
        this.c = arr_v.length;
        this.d = v2 - 1;
    }

    public final void addFirst(int v) {
        int v1 = this.b - 1 & this.d;
        this.b = v1;
        this.a[v1] = v;
        if(v1 == this.c) {
            this.a();
        }
    }

    public final void addLast(int v) {
        int v1 = this.c;
        this.a[v1] = v;
        int v2 = this.d & v1 + 1;
        this.c = v2;
        if(v2 == this.b) {
            this.a();
        }
    }

    public final void clear() {
        this.c = this.b;
    }

    public final int get(int v) {
        if(v < 0 || v >= this.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[this.d & this.b + v];
    }

    public final int getFirst() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[v];
    }

    public final int getLast() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[v - 1 & this.d];
    }

    public final boolean isEmpty() {
        return this.b == this.c;
    }

    public final int popFirst() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.b = v + 1 & this.d;
        return this.a[v];
    }

    public final int popLast() {
        int v = this.c;
        if(this.b == v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v1 = this.d & v - 1;
        this.c = v1;
        return this.a[v1];
    }

    public final void removeFromEnd(int v) {
        if(v <= 0) {
            return;
        }
        if(v > this.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.c = this.d & this.c - v;
    }

    public final void removeFromStart(int v) {
        if(v <= 0) {
            return;
        }
        if(v > this.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.b = this.d & this.b + v;
    }

    public final int size() {
        return this.c - this.b & this.d;
    }
}

