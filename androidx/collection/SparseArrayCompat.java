package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001A\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001F\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\u0005J\u001D\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001A\u00020\u0013H\u0016J\u000E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0010\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u0004H\u0016J\u0015\u0010\u001A\u001A\u00020\u00072\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0004H\u0017J\u0018\u0010\u001D\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001A\u00020\u0004H\u0096\u0002\u00A2\u0006\u0002\u0010\u001EJ\u001D\u0010\u001D\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010 J\u0010\u0010!\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u0004H\u0016J\u0015\u0010\"\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010#J\b\u0010\b\u001A\u00020\u0007H\u0016J\u0010\u0010$\u001A\u00020\u00042\u0006\u0010%\u001A\u00020\u0004H\u0016J\u001D\u0010&\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0016J\u0018\u0010\'\u001A\u00020\u00132\u000E\u0010(\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J\u001F\u0010)\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010 J\u0010\u0010*\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0004H\u0016J\u001A\u0010*\u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u00042\b\u0010\u0015\u001A\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010+\u001A\u00020\u00132\u0006\u0010%\u001A\u00020\u0004H\u0016J\u0018\u0010,\u001A\u00020\u00132\u0006\u0010%\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0004H\u0016J\u001F\u0010-\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010 J%\u0010-\u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010.\u001A\u00028\u00002\u0006\u0010/\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u00100J\u001D\u00101\u001A\u00020\u00132\u0006\u0010%\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0016J\b\u0010\r\u001A\u00020\u0004H\u0016J\b\u00102\u001A\u000203H\u0016J\u0015\u00104\u001A\u00028\u00002\u0006\u0010%\u001A\u00020\u0004H\u0016\u00A2\u0006\u0002\u0010\u001ER\u0012\u0010\u0006\u001A\u00020\u00078\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\b\u001A\u00020\u00078G\u00A2\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0012\u0010\u000B\u001A\u00020\f8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0002\n\u0000R\u0012\u0010\r\u001A\u00020\u00048\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u000E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000F8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0004\n\u0002\u0010\u0011\u00A8\u00065"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "initialCapacity", "", "(I)V", "garbage", "", "isEmpty", "getIsEmpty", "()Z", "keys", "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", "key", "value", "(ILjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(I)Ljava/lang/Object;", "defaultValue", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "keyAt", "index", "put", "putAll", "other", "putIfAbsent", "remove", "removeAt", "removeAtRange", "replace", "oldValue", "newValue", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "toString", "", "valueAt", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
public class SparseArrayCompat implements Cloneable {
    @JvmField
    public boolean garbage;
    @JvmField
    public int[] keys;
    @JvmField
    public int size;
    @JvmField
    public Object[] values;

    @JvmOverloads
    public SparseArrayCompat() {
        this(0, 1, null);
    }

    @JvmOverloads
    public SparseArrayCompat(int v) {
        if(v == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
            return;
        }
        int v1 = ContainerHelpersKt.idealIntArraySize(v);
        this.keys = new int[v1];
        this.values = new Object[v1];
    }

    public SparseArrayCompat(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 10;
        }
        this(v);
    }

    public void append(int v, Object object0) {
        int v1 = this.size;
        if(v1 != 0 && v <= this.keys[v1 - 1]) {
            this.put(v, object0);
            return;
        }
        if(this.garbage && v1 >= this.keys.length) {
            SparseArrayCompatKt.access$gc(this);
        }
        int v2 = this.size;
        if(v2 >= this.keys.length) {
            int v3 = ContainerHelpersKt.idealIntArraySize(v2 + 1);
            int[] arr_v = Arrays.copyOf(this.keys, v3);
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
            this.keys = arr_v;
            Object[] arr_object = Arrays.copyOf(this.values, v3);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            this.values = arr_object;
        }
        this.keys[v2] = v;
        this.values[v2] = object0;
        this.size = v2 + 1;
    }

    public void clear() {
        int v = this.size;
        Object[] arr_object = this.values;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    @NotNull
    public SparseArrayCompat clone() {
        Object object0 = super.clone();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        ((SparseArrayCompat)object0).keys = (int[])this.keys.clone();
        ((SparseArrayCompat)object0).values = (Object[])this.values.clone();
        return (SparseArrayCompat)object0;
    }

    @Override
    public Object clone() {
        return this.clone();
    }

    public boolean containsKey(int v) {
        return this.indexOfKey(v) >= 0;
    }

    public boolean containsValue(Object object0) {
        if(this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        int v = this.size;
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(this.values[v1] == object0) {
                break;
            }
        }
        return v1 >= 0;
    }

    @Deprecated(message = "Alias for remove(int).", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(int v) {
        this.remove(v);
    }

    @Nullable
    public Object get(int v) {
        return SparseArrayCompatKt.commonGet(this, v);
    }

    public Object get(int v, Object object0) {
        return SparseArrayCompatKt.commonGet(this, v, object0);
    }

    @JvmName(name = "getIsEmpty")
    public final boolean getIsEmpty() {
        return this.isEmpty();
    }

    public int indexOfKey(int v) {
        if(this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, v);
    }

    public int indexOfValue(Object object0) {
        if(this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        int v = this.size;
        int v1 = 0;
        while(v1 < v) {
            if(this.values[v1] != object0) {
                ++v1;
                continue;
            }
            return v1;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int keyAt(int v) {
        if(this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        return this.keys[v];
    }

    public void put(int v, Object object0) {
        int v1 = ContainerHelpersKt.binarySearch(this.keys, this.size, v);
        if(v1 >= 0) {
            this.values[v1] = object0;
            return;
        }
        int v2 = ~v1;
        if(v2 < this.size && this.values[v2] == SparseArrayCompatKt.a) {
            this.keys[v2] = v;
            this.values[v2] = object0;
            return;
        }
        if(this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.access$gc(this);
            v2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, v);
        }
        int v3 = this.size;
        if(v3 >= this.keys.length) {
            int v4 = ContainerHelpersKt.idealIntArraySize(v3 + 1);
            int[] arr_v = Arrays.copyOf(this.keys, v4);
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
            this.keys = arr_v;
            Object[] arr_object = Arrays.copyOf(this.values, v4);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            this.values = arr_object;
        }
        int v5 = this.size;
        if(v5 - v2 != 0) {
            ArraysKt___ArraysJvmKt.copyInto(this.keys, this.keys, v2 + 1, v2, v5);
            ArraysKt___ArraysJvmKt.copyInto(this.values, this.values, v2 + 1, v2, this.size);
        }
        this.keys[v2] = v;
        this.values[v2] = object0;
        ++this.size;
    }

    public void putAll(@NotNull SparseArrayCompat sparseArrayCompat0) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat0, "other");
        int v = sparseArrayCompat0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseArrayCompat0.keyAt(v1);
            Object object0 = sparseArrayCompat0.valueAt(v1);
            int v3 = ContainerHelpersKt.binarySearch(this.keys, this.size, v2);
            if(v3 >= 0) {
                this.values[v3] = object0;
            }
            else {
                int v4 = ~v3;
                if(v4 >= this.size || this.values[v4] != SparseArrayCompatKt.a) {
                    if(this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.access$gc(this);
                        v4 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, v2);
                    }
                    int v5 = this.size;
                    if(v5 >= this.keys.length) {
                        int v6 = ContainerHelpersKt.idealIntArraySize(v5 + 1);
                        int[] arr_v = Arrays.copyOf(this.keys, v6);
                        Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
                        this.keys = arr_v;
                        Object[] arr_object = Arrays.copyOf(this.values, v6);
                        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
                        this.values = arr_object;
                    }
                    int v7 = this.size;
                    if(v7 - v4 != 0) {
                        ArraysKt___ArraysJvmKt.copyInto(this.keys, this.keys, v4 + 1, v4, v7);
                        ArraysKt___ArraysJvmKt.copyInto(this.values, this.values, v4 + 1, v4, this.size);
                    }
                    this.keys[v4] = v2;
                    this.values[v4] = object0;
                    ++this.size;
                }
                else {
                    this.keys[v4] = v2;
                    this.values[v4] = object0;
                }
            }
        }
    }

    @Nullable
    public Object putIfAbsent(int v, Object object0) {
        Object object1 = SparseArrayCompatKt.commonGet(this, v);
        if(object1 == null) {
            int v1 = ContainerHelpersKt.binarySearch(this.keys, this.size, v);
            if(v1 >= 0) {
                this.values[v1] = object0;
                return null;
            }
            int v2 = ~v1;
            if(v2 < this.size && this.values[v2] == SparseArrayCompatKt.a) {
                this.keys[v2] = v;
                this.values[v2] = object0;
                return null;
            }
            if(this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.access$gc(this);
                v2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, v);
            }
            int v3 = this.size;
            if(v3 >= this.keys.length) {
                int v4 = ContainerHelpersKt.idealIntArraySize(v3 + 1);
                int[] arr_v = Arrays.copyOf(this.keys, v4);
                Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
                this.keys = arr_v;
                Object[] arr_object = Arrays.copyOf(this.values, v4);
                Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
                this.values = arr_object;
            }
            int v5 = this.size;
            if(v5 - v2 != 0) {
                ArraysKt___ArraysJvmKt.copyInto(this.keys, this.keys, v2 + 1, v2, v5);
                ArraysKt___ArraysJvmKt.copyInto(this.values, this.values, v2 + 1, v2, this.size);
            }
            this.keys[v2] = v;
            this.values[v2] = object0;
            ++this.size;
        }
        return object1;
    }

    public void remove(int v) {
        SparseArrayCompatKt.commonRemove(this, v);
    }

    public boolean remove(int v, @Nullable Object object0) {
        int v1 = this.indexOfKey(v);
        if(v1 >= 0 && Intrinsics.areEqual(object0, this.valueAt(v1))) {
            this.removeAt(v1);
            return true;
        }
        return false;
    }

    public void removeAt(int v) {
        if(this.values[v] != SparseArrayCompatKt.a) {
            this.values[v] = SparseArrayCompatKt.a;
            this.garbage = true;
        }
    }

    public void removeAtRange(int v, int v1) {
        int v2 = Math.min(v1, v + v1);
        while(v < v2) {
            this.removeAt(v);
            ++v;
        }
    }

    @Nullable
    public Object replace(int v, Object object0) {
        int v1 = this.indexOfKey(v);
        if(v1 >= 0) {
            Object[] arr_object = this.values;
            Object object1 = arr_object[v1];
            arr_object[v1] = object0;
            return object1;
        }
        return null;
    }

    public boolean replace(int v, Object object0, Object object1) {
        int v1 = this.indexOfKey(v);
        if(v1 >= 0 && Intrinsics.areEqual(this.values[v1], object0)) {
            this.values[v1] = object1;
            return true;
        }
        return false;
    }

    public void setValueAt(int v, Object object0) {
        if(this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        this.values[v] = object0;
    }

    public int size() {
        if(this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        return this.size;
    }

    @Override
    @NotNull
    public String toString() {
        if(this.size() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.size * 28);
        stringBuilder0.append('{');
        int v = this.size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.keyAt(v1));
            stringBuilder0.append('=');
            Object object0 = this.valueAt(v1);
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        return q.l('}', "buffer.toString()", stringBuilder0);
    }

    public Object valueAt(int v) {
        if(this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        return this.values[v];
    }
}

