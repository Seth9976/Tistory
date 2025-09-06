package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b$\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001A\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000\u00A2\u0006\u0004\b\u0006\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000E\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u0007J\u0017\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00028\u0001H\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0012J\u001A\u0010\u0019\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0019\u0010\u001AJ!\u0010\u001C\u001A\u00028\u00012\b\u0010\u000F\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u001B\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001F\u001A\u00028\u00002\u0006\u0010\u001E\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010!\u001A\u00028\u00012\u0006\u0010\u001E\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b!\u0010 J\u001F\u0010\"\u001A\u00028\u00012\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b\"\u0010#J\u000F\u0010$\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b$\u0010%J!\u0010&\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b&\u0010\u001DJ\'\u0010\'\u001A\u00020\n2\u0016\u0010\b\u001A\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016\u00A2\u0006\u0004\b\'\u0010\tJ!\u0010(\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b(\u0010\u001DJ\u0019\u0010)\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b)\u0010\u001AJ\u001F\u0010)\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001A\u00028\u00012\u0006\u0010\u001E\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b+\u0010 J!\u0010,\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u0015\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b,\u0010\u001DJ\'\u0010,\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00028\u00002\u0006\u0010-\u001A\u00028\u00012\u0006\u0010.\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\b,\u0010/J\u000F\u00100\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b0\u00101J\u001A\u00103\u001A\u00020\u00102\b\u00102\u001A\u0004\u0018\u00010\u0003H\u0096\u0002\u00A2\u0006\u0004\b3\u0010\u0012J\u000F\u00104\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b4\u00101J\u000F\u00106\u001A\u000205H\u0016\u00A2\u0006\u0004\b6\u00107\u00A8\u00068"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/collection/SimpleArrayMap;)V", "", "clear", "()V", "minimumCapacity", "ensureCapacity", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "indexOfKey", "(Ljava/lang/Object;)I", "value", "__restricted$indexOfValue", "indexOfValue", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n297#1,5:770\n297#1,5:775\n1#2:780\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n276#1:770,5\n291#1:775,5\n*E\n"})
public class SimpleArrayMap {
    public int[] a;
    public Object[] b;
    public int c;

    @JvmOverloads
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    @JvmOverloads
    public SimpleArrayMap(int v) {
        this.a = v == 0 ? ContainerHelpersKt.EMPTY_INTS : new int[v];
        this.b = v == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[v << 1];
    }

    public SimpleArrayMap(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public SimpleArrayMap(@Nullable SimpleArrayMap simpleArrayMap0) {
        this(0, 1, null);
        if(simpleArrayMap0 != null) {
            this.putAll(simpleArrayMap0);
        }
    }

    @JvmName(name = "__restricted$indexOfValue")
    public final int __restricted$indexOfValue(Object object0) {
        int v = this.c * 2;
        Object[] arr_object = this.b;
        if(object0 == null) {
            for(int v1 = 1; v1 < v; v1 += 2) {
                if(arr_object[v1] == null) {
                    return v1 >> 1;
                }
            }
            return -1;
        }
        for(int v2 = 1; v2 < v; v2 += 2) {
            if(Intrinsics.areEqual(object0, arr_object[v2])) {
                return v2 >> 1;
            }
        }
        return -1;
    }

    public final int a(Object object0, int v) {
        int v1 = this.c;
        if(v1 == 0) {
            return -1;
        }
        int v2 = ContainerHelpersKt.binarySearch(this.a, v1, v);
        if(v2 < 0) {
            return v2;
        }
        if(Intrinsics.areEqual(object0, this.b[v2 << 1])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.a[v3] == v; ++v3) {
            if(Intrinsics.areEqual(object0, this.b[v3 << 1])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.a[v4] == v; --v4) {
            if(Intrinsics.areEqual(object0, this.b[v4 << 1])) {
                return v4;
            }
        }
        return ~v3;
    }

    public final int b() {
        int v = this.c;
        if(v == 0) {
            return -1;
        }
        int v1 = ContainerHelpersKt.binarySearch(this.a, v, 0);
        if(v1 < 0) {
            return v1;
        }
        if(this.b[v1 << 1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.a[v2] == 0; ++v2) {
            if(this.b[v2 << 1] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.a[v3] == 0; --v3) {
            if(this.b[v3 << 1] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    public void clear() {
        if(this.c > 0) {
            this.a = ContainerHelpersKt.EMPTY_INTS;
            this.b = ContainerHelpersKt.EMPTY_OBJECTS;
            this.c = 0;
        }
        if(this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object object0) {
        return this.indexOfKey(object0) >= 0;
    }

    public boolean containsValue(Object object0) {
        return this.__restricted$indexOfValue(object0) >= 0;
    }

    public void ensureCapacity(int v) {
        int v1 = this.c;
        int[] arr_v = this.a;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, v);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.b, v * 2);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            this.b = arr_object;
        }
        if(this.c != v1) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        try {
            if(object0 instanceof SimpleArrayMap) {
                if(this.size() != ((SimpleArrayMap)object0).size()) {
                    return false;
                }
                int v = this.c;
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object1 = this.keyAt(v1);
                    Object object2 = this.valueAt(v1);
                    Object object3 = ((SimpleArrayMap)object0).get(object1);
                    if(object2 == null) {
                        if(object3 != null || !((SimpleArrayMap)object0).containsKey(object1)) {
                            return false;
                        }
                    }
                    else if(!Intrinsics.areEqual(object2, object3)) {
                        return false;
                    }
                }
                return true;
            }
            if(!(object0 instanceof Map) || this.size() != ((Map)object0).size()) {
                return false;
            }
            int v2 = this.c;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object4 = this.keyAt(v3);
                Object object5 = this.valueAt(v3);
                Object object6 = ((Map)object0).get(object4);
                if(object5 == null) {
                    if(object6 != null || !((Map)object0).containsKey(object4)) {
                        return false;
                    }
                }
                else if(!Intrinsics.areEqual(object5, object6)) {
                    return false;
                }
            }
            return true;
        }
        catch(NullPointerException | ClassCastException unused_ex) {
        }
        return false;
    }

    @Nullable
    public Object get(Object object0) {
        int v = this.indexOfKey(object0);
        return v < 0 ? null : this.b[(v << 1) + 1];
    }

    public Object getOrDefault(@Nullable Object object0, Object object1) {
        int v = this.indexOfKey(object0);
        return v < 0 ? object1 : this.b[(v << 1) + 1];
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.a;
        Object[] arr_object = this.b;
        int v = this.c;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 1; v2 < v; v1 += 2) {
            Object object0 = arr_object[v1];
            v3 += (object0 == null ? 0 : object0.hashCode()) ^ arr_v[v2];
            ++v2;
        }
        return v3;
    }

    public int indexOfKey(Object object0) {
        return object0 == null ? this.b() : this.a(object0, object0.hashCode());
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public Object keyAt(int v) {
        if(v < 0 || v >= this.c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
        }
        return this.b[v << 1];
    }

    @Nullable
    public Object put(Object object0, Object object1) {
        int v = this.c;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = object0 == null ? this.b() : this.a(object0, v1);
        if(v2 >= 0) {
            int v3 = (v2 << 1) + 1;
            Object[] arr_object = this.b;
            Object object2 = arr_object[v3];
            arr_object[v3] = object1;
            return object2;
        }
        int v4 = 8;
        int[] arr_v = this.a;
        if(v >= arr_v.length) {
            if(v >= 8) {
                v4 = (v >> 1) + v;
            }
            else if(v < 4) {
                v4 = 4;
            }
            int[] arr_v1 = Arrays.copyOf(arr_v, v4);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.b, v4 << 1);
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            this.b = arr_object1;
            if(v != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if(~v2 < v) {
            ArraysKt___ArraysJvmKt.copyInto(this.a, this.a, -v2, ~v2, v);
            ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, -v2 << 1, ~v2 << 1, this.c << 1);
        }
        int v5 = this.c;
        if(v == v5) {
            int[] arr_v2 = this.a;
            if(~v2 < arr_v2.length) {
                arr_v2[~v2] = v1;
                Object[] arr_object2 = this.b;
                arr_object2[~v2 << 1] = object0;
                arr_object2[(~v2 << 1) + 1] = object1;
                this.c = v5 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@NotNull SimpleArrayMap simpleArrayMap0) {
        Intrinsics.checkNotNullParameter(simpleArrayMap0, "map");
        int v = simpleArrayMap0.c;
        this.ensureCapacity(this.c + v);
        if(this.c != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.put(simpleArrayMap0.keyAt(v1), simpleArrayMap0.valueAt(v1));
            }
        }
        else if(v > 0) {
            ArraysKt___ArraysJvmKt.copyInto(simpleArrayMap0.a, this.a, 0, 0, v);
            ArraysKt___ArraysJvmKt.copyInto(simpleArrayMap0.b, this.b, 0, 0, v << 1);
            this.c = v;
        }
    }

    @Nullable
    public Object putIfAbsent(Object object0, Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? this.put(object0, object1) : object2;
    }

    @Nullable
    public Object remove(Object object0) {
        int v = this.indexOfKey(object0);
        return v < 0 ? null : this.removeAt(v);
    }

    public boolean remove(Object object0, Object object1) {
        int v = this.indexOfKey(object0);
        if(v >= 0 && Intrinsics.areEqual(object1, this.valueAt(v))) {
            this.removeAt(v);
            return true;
        }
        return false;
    }

    public Object removeAt(int v) {
        if(v >= 0) {
            int v1 = this.c;
            if(v < v1) {
                Object[] arr_object = this.b;
                Object object0 = arr_object[(v << 1) + 1];
                if(v1 <= 1) {
                    this.clear();
                    return object0;
                }
                int[] arr_v = this.a;
                int v2 = 8;
                if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
                    if(v < v1 - 1) {
                        ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, v, v + 1, v1);
                        ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v << 1, v + 1 << 1, v1 << 1);
                    }
                    Object[] arr_object2 = this.b;
                    int v3 = v1 - 1 << 1;
                    arr_object2[v3] = null;
                    arr_object2[v3 + 1] = null;
                }
                else {
                    if(v1 > 8) {
                        v2 = v1 + (v1 >> 1);
                    }
                    int[] arr_v1 = Arrays.copyOf(arr_v, v2);
                    Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
                    this.a = arr_v1;
                    Object[] arr_object1 = Arrays.copyOf(this.b, v2 << 1);
                    Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
                    this.b = arr_object1;
                    if(v1 != this.c) {
                        throw new ConcurrentModificationException();
                    }
                    if(v > 0) {
                        ArraysKt___ArraysJvmKt.copyInto(arr_v, this.a, 0, 0, v);
                        ArraysKt___ArraysJvmKt.copyInto(arr_object, this.b, 0, 0, v << 1);
                    }
                    if(v < v1 - 1) {
                        ArraysKt___ArraysJvmKt.copyInto(arr_v, this.a, v, v + 1, v1);
                        ArraysKt___ArraysJvmKt.copyInto(arr_object, this.b, v << 1, v + 1 << 1, v1 << 1);
                    }
                }
                if(v1 != this.c) {
                    throw new ConcurrentModificationException();
                }
                this.c = v1 - 1;
                return object0;
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    @Nullable
    public Object replace(Object object0, Object object1) {
        int v = this.indexOfKey(object0);
        return v < 0 ? null : this.setValueAt(v, object1);
    }

    public boolean replace(Object object0, Object object1, Object object2) {
        int v = this.indexOfKey(object0);
        if(v >= 0 && Intrinsics.areEqual(object1, this.valueAt(v))) {
            this.setValueAt(v, object2);
            return true;
        }
        return false;
    }

    public Object setValueAt(int v, Object object0) {
        if(v < 0 || v >= this.c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
        }
        int v1 = (v << 1) + 1;
        Object[] arr_object = this.b;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }

    public int size() {
        return this.c;
    }

    @Override
    @NotNull
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.c * 28);
        stringBuilder0.append('{');
        int v = this.c;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.keyAt(v1);
            if(object0 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object object1 = this.valueAt(v1);
            if(object1 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
        }
        return q.l('}', "StringBuilder(capacity).…builderAction).toString()", stringBuilder0);
    }

    public Object valueAt(int v) {
        if(v < 0 || v >= this.c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
        }
        return this.b[(v << 1) + 1];
    }
}

