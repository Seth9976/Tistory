package kotlin.collections.builders;

import i1.f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\b\u000E\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001EB\t\b\u0016\u00A2\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\b\u0010\fJ\u0013\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u0013\u001A\u00020\nH\u0096\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001A\u00028\u00002\u0006\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001AJ\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001CH\u0096\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016\u00A2\u0006\u0004\b \u0010!J\u001D\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\u0006\u0010\u0013\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b \u0010\"J\u0017\u0010#\u001A\u00020\u00102\u0006\u0010\u0016\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b#\u0010$J\u001F\u0010#\u001A\u00020%2\u0006\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b#\u0010&J\u001D\u0010)\u001A\u00020\u00102\f\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\'H\u0016\u00A2\u0006\u0004\b)\u0010*J%\u0010)\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\n2\f\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\'H\u0016\u00A2\u0006\u0004\b)\u0010+J\u000F\u0010,\u001A\u00020%H\u0016\u00A2\u0006\u0004\b,\u0010\tJ\u0017\u0010-\u001A\u00028\u00002\u0006\u0010\u0013\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b-\u0010\u0015J\u0017\u0010.\u001A\u00020\u00102\u0006\u0010\u0016\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b.\u0010$J\u001D\u0010/\u001A\u00020\u00102\f\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\'H\u0016\u00A2\u0006\u0004\b/\u0010*J\u001D\u00100\u001A\u00020\u00102\f\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\'H\u0016\u00A2\u0006\u0004\b0\u0010*J%\u00103\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001A\u00020\n2\u0006\u00102\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b3\u00104J)\u00108\u001A\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001A\b\u0012\u0004\u0012\u00028\u000106H\u0016\u00A2\u0006\u0004\b8\u00109J\u0017\u00108\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016\u00A2\u0006\u0004\b8\u0010;J\u001A\u0010=\u001A\u00020\u00102\b\u0010<\u001A\u0004\u0018\u00010:H\u0096\u0002\u00A2\u0006\u0004\b=\u0010$J\u000F\u0010>\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b>\u0010?J\u000F\u0010A\u001A\u00020@H\u0016\u00A2\u0006\u0004\bA\u0010BR\u0014\u0010D\u001A\u00020\n8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010?\u00A8\u0006F"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "build", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getSize", "size", "i1/f", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
public final class ListBuilder extends AbstractMutableList implements Serializable, List, RandomAccess, KMutableList {
    public Object[] a;
    public final int b;
    public int c;
    public boolean d;
    public final ListBuilder e;
    public final ListBuilder f;
    public static final ListBuilder g;

    static {
        ListBuilder listBuilder0 = new ListBuilder(0);
        listBuilder0.d = true;
        ListBuilder.g = listBuilder0;
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int v) {
        this(ListBuilderKt.arrayOfUninitializedElements(v), 0, 0, false, null, null);
    }

    public ListBuilder(Object[] arr_object, int v, int v1, boolean z, ListBuilder listBuilder0, ListBuilder listBuilder1) {
        this.a = arr_object;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = listBuilder0;
        this.f = listBuilder1;
        if(listBuilder0 != null) {
            this.modCount = listBuilder0.modCount;
        }
    }

    public final void a(int v, Collection collection0, int v1) {
        ++this.modCount;
        ListBuilder listBuilder0 = this.e;
        if(listBuilder0 != null) {
            listBuilder0.a(v, collection0, v1);
            this.a = listBuilder0.a;
            this.c += v1;
            return;
        }
        this.e(v, v1);
        Iterator iterator0 = collection0.iterator();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object[] arr_object = this.a;
            Object object0 = iterator0.next();
            arr_object[v + v2] = object0;
        }
    }

    public static final Object[] access$getArray$p(ListBuilder listBuilder0) {
        return listBuilder0.a;
    }

    public static final int access$getLength$p(ListBuilder listBuilder0) {
        return listBuilder0.c;
    }

    public static final int access$getModCount$p$s-2084097795(ListBuilder listBuilder0) {
        return listBuilder0.modCount;
    }

    public static final int access$getOffset$p(ListBuilder listBuilder0) {
        return listBuilder0.b;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public void add(int v, Object object0) {
        this.d();
        this.c();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, this.c);
        this.b(this.b + v, object0);
    }

    @Override
    public boolean add(Object object0) {
        this.d();
        this.c();
        this.b(this.b + this.c, object0);
        return true;
    }

    @Override
    public boolean addAll(int v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.d();
        this.c();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, this.c);
        int v1 = collection0.size();
        this.a(this.b + v, collection0, v1);
        return v1 > 0;
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.d();
        this.c();
        int v = collection0.size();
        this.a(this.b + this.c, collection0, v);
        return v > 0;
    }

    public final void b(int v, Object object0) {
        ++this.modCount;
        ListBuilder listBuilder0 = this.e;
        if(listBuilder0 != null) {
            listBuilder0.b(v, object0);
            this.a = listBuilder0.a;
            ++this.c;
            return;
        }
        this.e(v, 1);
        this.a[v] = object0;
    }

    @NotNull
    public final List build() {
        if(this.e != null) {
            throw new IllegalStateException();
        }
        this.d();
        this.d = true;
        return this.c <= 0 ? ListBuilder.g : this;
    }

    public final void c() {
        if(this.f != null && this.f.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public void clear() {
        this.d();
        this.c();
        this.g(this.b, this.c);
    }

    public final void d() {
        if(this.d || this.f != null && this.f.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(int v, int v1) {
        int v2 = this.c + v1;
        if(v2 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] arr_object = this.a;
        if(v2 > arr_object.length) {
            this.a = ListBuilderKt.copyOfUninitializedElements(this.a, AbstractList.Companion.newCapacity$kotlin_stdlib(arr_object.length, v2));
        }
        ArraysKt___ArraysJvmKt.copyInto(this.a, this.a, v + v1, v, this.b + this.c);
        this.c += v1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        this.c();
        return object0 == this || object0 instanceof List && ListBuilderKt.access$subarrayContentEquals(this.a, this.b, this.c, ((List)object0));
    }

    public final Object f(int v) {
        ++this.modCount;
        ListBuilder listBuilder0 = this.e;
        if(listBuilder0 != null) {
            Object object0 = listBuilder0.f(v);
            --this.c;
            return object0;
        }
        Object[] arr_object = this.a;
        Object object1 = arr_object[v];
        ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v, v + 1, this.c + this.b);
        ListBuilderKt.resetAt(this.a, this.b + this.c - 1);
        --this.c;
        return object1;
    }

    public final void g(int v, int v1) {
        if(v1 > 0) {
            ++this.modCount;
        }
        ListBuilder listBuilder0 = this.e;
        if(listBuilder0 == null) {
            ArraysKt___ArraysJvmKt.copyInto(this.a, this.a, v, v + v1, this.c);
            ListBuilderKt.resetRange(this.a, this.c - v1, this.c);
        }
        else {
            listBuilder0.g(v, v1);
        }
        this.c -= v1;
    }

    @Override
    public Object get(int v) {
        this.c();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.c);
        return this.a[this.b + v];
    }

    @Override  // kotlin.collections.AbstractMutableList
    public int getSize() {
        this.c();
        return this.c;
    }

    public final int h(int v, int v1, Collection collection0, boolean z) {
        int v2;
        ListBuilder listBuilder0 = this.e;
        if(listBuilder0 == null) {
            int v3 = 0;
            int v4 = 0;
            while(v3 < v1) {
                int v5 = v + v3;
                if(collection0.contains(this.a[v5]) == z) {
                    ++v3;
                    this.a[v4 + v] = this.a[v5];
                    ++v4;
                }
                else {
                    ++v3;
                }
            }
            int v6 = v1 - v4;
            ArraysKt___ArraysJvmKt.copyInto(this.a, this.a, v + v4, v1 + v, this.c);
            ListBuilderKt.resetRange(this.a, this.c - v6, this.c);
            v2 = v6;
        }
        else {
            v2 = listBuilder0.h(v, v1, collection0, z);
        }
        if(v2 > 0) {
            ++this.modCount;
        }
        this.c -= v2;
        return v2;
    }

    @Override
    public int hashCode() {
        this.c();
        return ListBuilderKt.access$subarrayContentHashCode(this.a, this.b, this.c);
    }

    @Override
    public int indexOf(Object object0) {
        this.c();
        for(int v = 0; v < this.c; ++v) {
            if(Intrinsics.areEqual(this.a[this.b + v], object0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        this.c();
        return this.c == 0;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.listIterator(0);
    }

    @Override
    public int lastIndexOf(Object object0) {
        this.c();
        for(int v = this.c - 1; v >= 0; --v) {
            if(Intrinsics.areEqual(this.a[this.b + v], object0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        this.c();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, this.c);
        return new f(this, v);
    }

    @Override
    public boolean remove(Object object0) {
        this.d();
        this.c();
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
        }
        return v >= 0;
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.d();
        this.c();
        return this.h(this.b, this.c, collection0, false) > 0;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object removeAt(int v) {
        this.d();
        this.c();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.c);
        return this.f(this.b + v);
    }

    @Override
    public boolean retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.d();
        this.c();
        return this.h(this.b, this.c, collection0, true) > 0;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object set(int v, Object object0) {
        this.d();
        this.c();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.c);
        Object[] arr_object = this.a;
        Object object1 = arr_object[this.b + v];
        arr_object[this.b + v] = object0;
        return object1;
    }

    @Override
    @NotNull
    public List subList(int v, int v1) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, this.c);
        Object[] arr_object = this.a;
        int v2 = this.b + v;
        boolean z = this.d;
        return this.f == null ? new ListBuilder(arr_object, v2, v1 - v, z, this, this) : new ListBuilder(arr_object, v2, v1 - v, z, this, this.f);
    }

    @Override
    @NotNull
    public Object[] toArray() {
        this.c();
        return ArraysKt___ArraysJvmKt.copyOfRange(this.a, this.b, this.c + this.b);
    }

    @Override
    @NotNull
    public Object[] toArray(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "destination");
        this.c();
        int v = this.c;
        int v1 = this.b;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOfRange(this.a, v1, v + v1, arr_object.getClass());
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOfRange(...)");
            return arr_object1;
        }
        ArraysKt___ArraysJvmKt.copyInto(this.a, arr_object, 0, v1, v + v1);
        return k.terminateCollectionToArray(this.c, arr_object);
    }

    @Override
    @NotNull
    public String toString() {
        this.c();
        return ListBuilderKt.access$subarrayContentToString(this.a, this.b, this.c, this);
    }
}

