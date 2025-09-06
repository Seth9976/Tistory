package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r.a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001F\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0014\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001LB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007B\u001B\b\u0016\u0012\u0010\u0010\b\u001A\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000\u00A2\u0006\u0004\b\u0006\u0010\tB\u0019\b\u0016\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u00A2\u0006\u0004\b\u0006\u0010\u000BB\u001B\b\u0016\u0012\u0010\u0010\r\u001A\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\f\u00A2\u0006\u0004\b\u0006\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0013\u0010\u0007J\u0018\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001A\u001A\u00020\u00042\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0015\u0010\u001D\u001A\u00028\u00002\u0006\u0010\u001C\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010!\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b!\u0010\u0017J\u001D\u0010\"\u001A\u00020\u000F2\u000E\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000\u00A2\u0006\u0004\b\"\u0010\tJ\u0017\u0010#\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b#\u0010\u0017J\u0015\u0010$\u001A\u00028\u00002\u0006\u0010\u001C\u001A\u00020\u0004\u00A2\u0006\u0004\b$\u0010\u001EJ\u001D\u0010%\u001A\u00020\u00152\u000E\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000\u00A2\u0006\u0004\b%\u0010&J\u0015\u0010\'\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f\u00A2\u0006\u0004\b\'\u0010(J\'\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0001\u0010)2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00010\f\u00A2\u0006\u0004\b\'\u0010*J\u001A\u0010,\u001A\u00020\u00152\b\u0010+\u001A\u0004\u0018\u00010\u0018H\u0096\u0002\u00A2\u0006\u0004\b,\u0010\u0017J\u000F\u0010-\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b-\u0010.J\u000F\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b0\u00101J\u0016\u00103\u001A\b\u0012\u0004\u0012\u00028\u000002H\u0096\u0002\u00A2\u0006\u0004\b3\u00104J\u001D\u00106\u001A\u00020\u00152\f\u00105\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00A2\u0006\u0004\b6\u00107J\u001D\u0010\"\u001A\u00020\u00152\f\u00105\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00A2\u0006\u0004\b\"\u00107J\u001D\u0010%\u001A\u00020\u00152\f\u00105\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00A2\u0006\u0004\b%\u00107J\u001D\u00108\u001A\u00020\u00152\f\u00105\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00A2\u0006\u0004\b8\u00107R\"\u0010@\u001A\u0002098\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010(\"\u0004\bD\u0010\u000ER\"\u0010I\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bE\u0010F\u001A\u0004\bG\u0010.\"\u0004\bH\u0010\u0007R\u0014\u0010K\u001A\u00020\u00048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bJ\u0010.\u00A8\u0006M"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "", "capacity", "<init>", "(I)V", "set", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "", "array", "([Ljava/lang/Object;)V", "", "clear", "()V", "minimumCapacity", "ensureCapacity", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "valueAt", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "addAll", "remove", "removeAt", "removeAll", "(Landroidx/collection/ArraySet;)Z", "toArray", "()[Ljava/lang/Object;", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "elements", "containsAll", "(Ljava/util/Collection;)Z", "retainAll", "", "a", "[I", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "hashes", "b", "[Ljava/lang/Object;", "getArray$collection", "setArray$collection", "c", "I", "get_size$collection", "set_size$collection", "_size", "getSize", "size", "r/a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
public final class ArraySet implements Collection, Set, KMutableCollection, KMutableSet {
    public int[] a;
    public Object[] b;
    public int c;

    @JvmOverloads
    public ArraySet() {
        this(0, 1, null);
    }

    @JvmOverloads
    public ArraySet(int v) {
        this.a = ContainerHelpersKt.EMPTY_INTS;
        this.b = ContainerHelpersKt.EMPTY_OBJECTS;
        if(v > 0) {
            ArraySetKt.allocArrays(this, v);
        }
    }

    public ArraySet(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public ArraySet(@Nullable ArraySet arraySet0) {
        this(0);
        if(arraySet0 != null) {
            this.addAll(arraySet0);
        }
    }

    public ArraySet(@Nullable Collection collection0) {
        this(0);
        if(collection0 != null) {
            this.addAll(collection0);
        }
    }

    public ArraySet(@Nullable Object[] arr_object) {
        this(0);
        if(arr_object != null) {
            for(Object object0: arr_object) {
                this.add(object0);
            }
        }
    }

    @Override
    public boolean add(Object object0) {
        int v2;
        int v1;
        int v = this.get_size$collection();
        if(object0 == null) {
            v1 = ArraySetKt.indexOfNull(this);
            v2 = 0;
        }
        else {
            int v3 = object0.hashCode();
            v2 = v3;
            v1 = ArraySetKt.indexOf(this, object0, v3);
        }
        int v4 = 8;
        if(v1 < 0) {
            if(v >= this.getHashes$collection().length) {
                if(v >= 8) {
                    v4 = (v >> 1) + v;
                }
                else if(v < 4) {
                    v4 = 4;
                }
                int[] arr_v = this.getHashes$collection();
                Object[] arr_object = this.getArray$collection();
                ArraySetKt.allocArrays(this, v4);
                if(v != this.get_size$collection()) {
                    throw new ConcurrentModificationException();
                }
                if(this.getHashes$collection().length != 0) {
                    ArraysKt___ArraysJvmKt.copyInto$default(arr_v, this.getHashes$collection(), 0, 0, arr_v.length, 6, null);
                    ArraysKt___ArraysJvmKt.copyInto$default(arr_object, this.getArray$collection(), 0, 0, arr_object.length, 6, null);
                }
            }
            if(~v1 < v) {
                ArraysKt___ArraysJvmKt.copyInto(this.getHashes$collection(), this.getHashes$collection(), -v1, ~v1, v);
                ArraysKt___ArraysJvmKt.copyInto(this.getArray$collection(), this.getArray$collection(), -v1, ~v1, v);
            }
            if(v != this.get_size$collection() || ~v1 >= this.getHashes$collection().length) {
                throw new ConcurrentModificationException();
            }
            this.getHashes$collection()[~v1] = v2;
            this.getArray$collection()[~v1] = object0;
            this.set_size$collection(this.get_size$collection() + 1);
            return true;
        }
        return false;
    }

    public final void addAll(@NotNull ArraySet arraySet0) {
        Intrinsics.checkNotNullParameter(arraySet0, "array");
        int v = arraySet0.get_size$collection();
        this.ensureCapacity(this.get_size$collection() + v);
        if(this.get_size$collection() != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.add(arraySet0.valueAt(v1));
            }
        }
        else if(v > 0) {
            ArraysKt___ArraysJvmKt.copyInto$default(arraySet0.getHashes$collection(), this.getHashes$collection(), 0, 0, v, 6, null);
            ArraysKt___ArraysJvmKt.copyInto$default(arraySet0.getArray$collection(), this.getArray$collection(), 0, 0, v, 6, null);
            if(this.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            this.set_size$collection(v);
        }
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.ensureCapacity(collection0.size() + this.get_size$collection());
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.add(object0);
        }
        return z;
    }

    @Override
    public void clear() {
        if(this.get_size$collection() != 0) {
            this.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            this.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            this.set_size$collection(0);
        }
        if(this.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final void ensureCapacity(int v) {
        int v1 = this.get_size$collection();
        if(this.getHashes$collection().length < v) {
            int[] arr_v = this.getHashes$collection();
            Object[] arr_object = this.getArray$collection();
            ArraySetKt.allocArrays(this, v);
            if(this.get_size$collection() > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(arr_v, this.getHashes$collection(), 0, 0, this.get_size$collection(), 6, null);
                ArraysKt___ArraysJvmKt.copyInto$default(arr_object, this.getArray$collection(), 0, 0, this.get_size$collection(), 6, null);
            }
        }
        if(this.get_size$collection() != v1) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof Set && this.size() == ((Set)object0).size()) {
            try {
                int v = this.get_size$collection();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(!((Set)object0).contains(this.valueAt(v1))) {
                        return false;
                    }
                }
                return true;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @NotNull
    public final Object[] getArray$collection() {
        return this.b;
    }

    @NotNull
    public final int[] getHashes$collection() {
        return this.a;
    }

    public int getSize() {
        return this.c;
    }

    public final int get_size$collection() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.getHashes$collection();
        int v = this.get_size$collection();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1];
        }
        return v2;
    }

    public final int indexOf(@Nullable Object object0) {
        return object0 == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, object0, object0.hashCode());
    }

    @Override
    public boolean isEmpty() {
        return this.get_size$collection() <= 0;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new a(this);
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.removeAt(v);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@NotNull ArraySet arraySet0) {
        Intrinsics.checkNotNullParameter(arraySet0, "array");
        int v = arraySet0.get_size$collection();
        int v1 = this.get_size$collection();
        for(int v2 = 0; v2 < v; ++v2) {
            this.remove(arraySet0.valueAt(v2));
        }
        return v1 != this.get_size$collection();
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.remove(object0);
        }
        return z;
    }

    public final Object removeAt(int v) {
        int v1 = 8;
        int v2 = this.get_size$collection();
        Object object0 = this.getArray$collection()[v];
        if(v2 <= 1) {
            this.clear();
            return object0;
        }
        if(this.getHashes$collection().length <= 8 || this.get_size$collection() >= this.getHashes$collection().length / 3) {
            if(v < v2 - 1) {
                ArraysKt___ArraysJvmKt.copyInto(this.getHashes$collection(), this.getHashes$collection(), v, v + 1, v2);
                ArraysKt___ArraysJvmKt.copyInto(this.getArray$collection(), this.getArray$collection(), v, v + 1, v2);
            }
            this.getArray$collection()[v2 - 1] = null;
        }
        else {
            if(this.get_size$collection() > 8) {
                v1 = this.get_size$collection() + (this.get_size$collection() >> 1);
            }
            int[] arr_v = this.getHashes$collection();
            Object[] arr_object = this.getArray$collection();
            ArraySetKt.allocArrays(this, v1);
            if(v > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(arr_v, this.getHashes$collection(), 0, 0, v, 6, null);
                ArraysKt___ArraysJvmKt.copyInto$default(arr_object, this.getArray$collection(), 0, 0, v, 6, null);
            }
            if(v < v2 - 1) {
                ArraysKt___ArraysJvmKt.copyInto(arr_v, this.getHashes$collection(), v, v + 1, v2);
                ArraysKt___ArraysJvmKt.copyInto(arr_object, this.getArray$collection(), v, v + 1, v2);
            }
        }
        if(v2 != this.get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        this.set_size$collection(v2 - 1);
        return object0;
    }

    @Override
    public boolean retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = this.get_size$collection() - 1;
        boolean z = false;
        while(-1 < v) {
            if(!CollectionsKt___CollectionsKt.contains(collection0, this.getArray$collection()[v])) {
                this.removeAt(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    public final void setArray$collection(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.b = arr_object;
    }

    public final void setHashes$collection(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<set-?>");
        this.a = arr_v;
    }

    public final void set_size$collection(int v) {
        this.c = v;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    @NotNull
    public final Object[] toArray() {
        return ArraysKt___ArraysJvmKt.copyOfRange(this.b, 0, this.c);
    }

    @Override
    @NotNull
    public final Object[] toArray(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        int v = this.c;
        if(arr_object.length < v) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        ArraysKt___ArraysJvmKt.copyInto(this.b, arr_object, 0, 0, this.c);
        Intrinsics.checkNotNullExpressionValue(arr_object, "result");
        return arr_object;
    }

    @Override
    @NotNull
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.get_size$collection() * 14);
        stringBuilder0.append('{');
        int v = this.get_size$collection();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.valueAt(v1);
            if(object0 == this) {
                stringBuilder0.append("(this Set)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        return q.l('}', "StringBuilder(capacity).…builderAction).toString()", stringBuilder0);
    }

    public final Object valueAt(int v) {
        return this.getArray$collection()[v];
    }
}

