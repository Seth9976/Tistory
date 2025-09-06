package androidx.collection;

import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001DB\u0011\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000B\u001A\u00028\u00012\u0006\u0010\b\u001A\u00028\u00002\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00010\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJU\u0010\u0012\u001A\u00028\u00012\u0006\u0010\b\u001A\u00028\u000028\u0010\u0011\u001A4\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00018\u0001\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00010\rH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001A\u00020\u00142\u0006\u0010\b\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00028\u0001H\u0086\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001F\u0010\u0017\u001A\u0004\u0018\u00018\u00012\u0006\u0010\b\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00028\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001C\u001A\u00020\u00142\u001A\u0010\u001B\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001A0\u0019\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\'\u0010\u001C\u001A\u00020\u00142\u0018\u0010\u001B\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001A0\u001E\u00A2\u0006\u0004\b\u001C\u0010\u001FJ\'\u0010\u001C\u001A\u00020\u00142\u0018\u0010\u001B\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001A0 \u00A2\u0006\u0004\b\u001C\u0010!J!\u0010\u001C\u001A\u00020\u00142\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"\u00A2\u0006\u0004\b\u001C\u0010$J!\u0010\u001C\u001A\u00020\u00142\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u00A2\u0006\u0004\b\u001C\u0010%J$\u0010\'\u001A\u00020\u00142\u0012\u0010&\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001AH\u0086\n\u00A2\u0006\u0004\b\'\u0010(J,\u0010\'\u001A\u00020\u00142\u001A\u0010\u001B\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001A0\u0019H\u0086\n\u00A2\u0006\u0004\b\'\u0010\u001DJ*\u0010\'\u001A\u00020\u00142\u0018\u0010\u001B\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001A0\u001EH\u0086\n\u00A2\u0006\u0004\b\'\u0010\u001FJ*\u0010\'\u001A\u00020\u00142\u0018\u0010\u001B\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001A0 H\u0086\n\u00A2\u0006\u0004\b\'\u0010!J$\u0010\'\u001A\u00020\u00142\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0086\n\u00A2\u0006\u0004\b\'\u0010$J$\u0010\'\u001A\u00020\u00142\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\n\u00A2\u0006\u0004\b\'\u0010%J\u0017\u0010)\u001A\u0004\u0018\u00018\u00012\u0006\u0010\b\u001A\u00028\u0000\u00A2\u0006\u0004\b)\u0010*J\u001D\u0010)\u001A\u00020+2\u0006\u0010\b\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00028\u0001\u00A2\u0006\u0004\b)\u0010,J-\u0010.\u001A\u00020\u00142\u0018\u0010-\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020+0\rH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/J\u0018\u00100\u001A\u00020\u00142\u0006\u0010\b\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0004\b0\u00101J \u00100\u001A\u00020\u00142\u000E\u00102\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0086\n\u00A2\u0006\u0004\b0\u00103J\u001E\u00100\u001A\u00020\u00142\f\u00102\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0086\n\u00A2\u0006\u0004\b0\u0010\u001FJ\u001E\u00100\u001A\u00020\u00142\f\u00102\u001A\b\u0012\u0004\u0012\u00028\u00000 H\u0086\n\u00A2\u0006\u0004\b0\u0010!J\u001E\u00100\u001A\u00020\u00142\f\u00102\u001A\b\u0012\u0004\u0012\u00028\u000004H\u0086\n\u00A2\u0006\u0004\b0\u00105J\u001E\u00100\u001A\u00020\u00142\f\u00102\u001A\b\u0012\u0004\u0012\u00028\u000006H\u0086\n\u00A2\u0006\u0004\b0\u00107J\u0019\u00109\u001A\u0004\u0018\u00018\u00012\u0006\u00108\u001A\u00020\u0004H\u0001\u00A2\u0006\u0004\b9\u0010:J\r\u0010;\u001A\u00020\u0014\u00A2\u0006\u0004\b;\u0010<J\u0017\u0010=\u001A\u00020\u00042\u0006\u0010\b\u001A\u00028\u0000H\u0001\u00A2\u0006\u0004\b=\u0010>J\r\u0010?\u001A\u00020\u0004\u00A2\u0006\u0004\b?\u0010@J\u0019\u0010B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A\u00A2\u0006\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006E"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "", "initialCapacity", "<init>", "(I)V", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "computeBlock", "compute", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "pairs", "putAll", "([Lkotlin/Pair;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)V", "", "from", "(Ljava/util/Map;)V", "(Landroidx/collection/ScatterMap;)V", "pair", "plusAssign", "(Lkotlin/Pair;)V", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "minusAssign", "(Ljava/lang/Object;)V", "keys", "([Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)V", "index", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "()V", "findInsertIndex", "(Ljava/lang/Object;)I", "trim", "()I", "", "asMutableMap", "()Ljava/util/Map;", "androidx/collection/a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1834:1\n1268#1,2:2003\n1272#1,5:2011\n1268#1,2:2042\n1272#1,5:2050\n1268#1,2:2067\n1272#1,5:2075\n1#2:1835\n1656#3,6:1836\n1810#3:1854\n1672#3:1858\n1589#3,3:1871\n1603#3:1875\n1599#3:1878\n1779#3,3:1883\n1793#3,3:1887\n1717#3:1891\n1705#3:1893\n1699#3:1894\n1712#3:1899\n1802#3:1901\n1589#3,3:1911\n1603#3:1915\n1599#3:1918\n1779#3,3:1923\n1793#3,3:1927\n1717#3:1931\n1705#3:1933\n1699#3:1934\n1712#3:1939\n1802#3:1941\n1810#3:1956\n1672#3:1960\n1810#3:1981\n1672#3:1985\n1656#3,6:2005\n1656#3,6:2016\n1589#3,3:2022\n1599#3:2025\n1603#3:2026\n1779#3,3:2027\n1793#3,3:2030\n1717#3:2033\n1705#3:2034\n1699#3:2035\n1712#3:2036\n1802#3:2037\n1666#3:2038\n1645#3:2039\n1664#3:2040\n1645#3:2041\n1656#3,6:2044\n1779#3,3:2055\n1810#3:2058\n1699#3:2059\n1669#3:2060\n1645#3:2061\n1589#3,3:2062\n1599#3:2065\n1603#3:2066\n1656#3,6:2069\n1656#3,6:2080\n1656#3,6:2086\n215#4,2:1842\n391#5,4:1844\n363#5,6:1848\n373#5,3:1855\n376#5,2:1859\n396#5,2:1861\n379#5,6:1863\n398#5:1869\n633#5:1870\n634#5:1874\n636#5,2:1876\n638#5,4:1879\n642#5:1886\n643#5:1890\n644#5:1892\n645#5,4:1895\n651#5:1900\n652#5,8:1902\n633#5:1910\n634#5:1914\n636#5,2:1916\n638#5,4:1919\n642#5:1926\n643#5:1930\n644#5:1932\n645#5,4:1935\n651#5:1940\n652#5,8:1942\n363#5,6:1950\n373#5,3:1957\n376#5,9:1961\n267#6,4:1970\n237#6,7:1974\n248#6,3:1982\n251#6,2:1986\n272#6,2:1988\n254#6,6:1990\n274#6:1996\n305#7,6:1997\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2003,2\n1113#1:2011,5\n1180#1:2042,2\n1180#1:2050,5\n1255#1:2067,2\n1255#1:2075,5\n848#1:1836,6\n972#1:1854\n972#1:1858\n1021#1:1871,3\n1021#1:1875\n1021#1:1878\n1021#1:1883,3\n1021#1:1887,3\n1021#1:1891\n1021#1:1893\n1021#1:1894\n1021#1:1899\n1021#1:1901\n1033#1:1911,3\n1033#1:1915\n1033#1:1918\n1033#1:1923,3\n1033#1:1927,3\n1033#1:1931\n1033#1:1933\n1033#1:1934\n1033#1:1939\n1033#1:1941\n1047#1:1956\n1047#1:1960\n1093#1:1981\n1093#1:1985\n1113#1:2005,6\n1129#1:2016,6\n1145#1:2022,3\n1146#1:2025\n1147#1:2026\n1154#1:2027,3\n1155#1:2030,3\n1156#1:2033\n1157#1:2034\n1157#1:2035\n1161#1:2036\n1164#1:2037\n1173#1:2038\n1173#1:2039\n1179#1:2040\n1179#1:2041\n1180#1:2044,6\n1195#1:2055,3\n1196#1:2058\n1198#1:2059\n1250#1:2060\n1250#1:2061\n1252#1:2062,3\n1253#1:2065\n1255#1:2066\n1255#1:2069,6\n1269#1:2080,6\n1275#1:2086,6\n963#1:1842,2\n972#1:1844,4\n972#1:1848,6\n972#1:1855,3\n972#1:1859,2\n972#1:1861,2\n972#1:1863,6\n972#1:1869\n1021#1:1870\n1021#1:1874\n1021#1:1876,2\n1021#1:1879,4\n1021#1:1886\n1021#1:1890\n1021#1:1892\n1021#1:1895,4\n1021#1:1900\n1021#1:1902,8\n1033#1:1910\n1033#1:1914\n1033#1:1916,2\n1033#1:1919,4\n1033#1:1926\n1033#1:1930\n1033#1:1932\n1033#1:1935,4\n1033#1:1940\n1033#1:1942,8\n1047#1:1950,6\n1047#1:1957,3\n1047#1:1961,9\n1093#1:1970,4\n1093#1:1974,7\n1093#1:1982,3\n1093#1:1986,2\n1093#1:1988,2\n1093#1:1990,6\n1093#1:1996\n1102#1:1997,6\n*E\n"})
public final class MutableScatterMap extends ScatterMap {
    public int a;

    public MutableScatterMap() {
        this(0, 1, null);
    }

    public MutableScatterMap(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.b(ScatterMapKt.unloadedCapacity(v));
    }

    public MutableScatterMap(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    public final int a(int v) {
        long v6;
        int v1 = this._capacity;
        int v2 = v & v1;
        int v3 = 0;
        while(true) {
            int v4 = (v2 & 7) << 3;
            long v5 = this.metadata[(v2 >> 3) + 1] << 0x40 - v4 & -((long)v4) >> 0x3F | this.metadata[v2 >> 3] >>> v4;
            v6 = v5 & ~v5 << 7 & 0x8080808080808080L;
            if(v6 != 0L) {
                break;
            }
            v3 += 8;
            v2 = v2 + v3 & v1;
        }
        return v2 + (Long.numberOfTrailingZeros(v6) >> 3) & v1;
    }

    @NotNull
    public final Map asMutableMap() {
        return new a(this);
    }

    public final void b(int v) {
        long[] arr_v;
        int v1 = v <= 0 ? 0 : Math.max(7, ScatterMapKt.normalizeCapacity(v));
        this._capacity = v1;
        if(v1 == 0) {
            arr_v = ScatterMapKt.EmptyGroup;
        }
        else {
            arr_v = new long[(v1 + 15 & -8) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(arr_v, 0x8080808080808080L, 0, 0, 6, null);
        }
        this.metadata = arr_v;
        arr_v[v1 >> 3] |= 0xFFL << ((v1 & 7) << 3);
        this.a = ScatterMapKt.loadedCapacity(this.getCapacity()) - this._size;
        this.keys = new Object[v1];
        this.values = new Object[v1];
    }

    public final void c(int v) {
        int v7;
        long[] arr_v = this.metadata;
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        int v1 = this._capacity;
        this.b(v);
        Object[] arr_object2 = this.keys;
        Object[] arr_object3 = this.values;
        for(int v2 = 0; v2 < v1; v2 = v7 + 1) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                Object object0 = arr_object[v2];
                int v3 = object0 == null ? 0 : object0.hashCode();
                int v4 = v3 * 0xCC9E2D51 ^ v3 * 0xCC9E2D51 << 16;
                int v5 = this.a(v4 >>> 7);
                long[] arr_v1 = this.metadata;
                int v6 = (v5 & 7) << 3;
                v7 = v2;
                arr_v1[v5 >> 3] = arr_v1[v5 >> 3] & ~(0xFFL << v6) | ((long)(v4 & 0x7F)) << v6;
                int v8 = (v5 - 7 & this._capacity) + (this._capacity & 7);
                int v9 = (v8 & 7) << 3;
                arr_v1[v8 >> 3] = arr_v1[v8 >> 3] & ~(0xFFL << v9) | ((long)(v4 & 0x7F)) << v9;
                arr_object2[v5] = object0;
                arr_object3[v5] = arr_object1[v7];
            }
            else {
                v7 = v2;
            }
        }
    }

    public final void clear() {
        this._size = 0;
        long[] arr_v = this.metadata;
        if(arr_v != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this._capacity >> 3;
            this.metadata[v] |= 0xFFL << ((this._capacity & 7) << 3);
        }
        ArraysKt___ArraysJvmKt.fill(this.values, null, 0, this._capacity);
        ArraysKt___ArraysJvmKt.fill(this.keys, null, 0, this._capacity);
        this.a = ScatterMapKt.loadedCapacity(this.getCapacity()) - this._size;
    }

    public final Object compute(Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "computeBlock");
        int v = this.findInsertIndex(object0);
        Object object1 = function20.invoke(object0, (v >= 0 ? null : this.values[v]));
        if(v < 0) {
            this.keys[~v] = object0;
            this.values[~v] = object1;
            return object1;
        }
        this.values[v] = object1;
        return object1;
    }

    @PublishedApi
    public final int findInsertIndex(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = v6 ^ ((long)(v1 & 0x7F)) * 0x101010101010101L;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = v3 + (Long.numberOfTrailingZeros(v8) >> 3) & v2;
                if(Intrinsics.areEqual(this.keys[v9], object0)) {
                    return v9;
                }
            }
            if(Long.compare(~v6 << 6 & v6 & 0x8080808080808080L, 0L) != 0) {
                int v10 = this.a(v1 >>> 7);
                if(this.a == 0 && (this.metadata[v10 >> 3] >> ((v10 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this._capacity > 8 && Long.compareUnsigned(q.f(this._size, 0x20L), q.f(this._capacity, 25L)) <= 0) {
                    }
                    this.c(ScatterMapKt.nextCapacity(this._capacity));
                    v10 = this.a(v1 >>> 7);
                }
                ++this._size;
                int v11 = this.a;
                long[] arr_v = this.metadata;
                long v12 = arr_v[v10 >> 3];
                int v13 = (v10 & 7) << 3;
                this.a = v11 - ((v12 >> v13 & 0xFFL) == 0x80L ? 1 : 0);
                arr_v[v10 >> 3] = v12 & ~(0xFFL << v13) | ((long)(v1 & 0x7F)) << v13;
                int v14 = (v10 - 7 & this._capacity) + (this._capacity & 7);
                int v15 = (v14 & 7) << 3;
                arr_v[v14 >> 3] = ~(0xFFL << v15) & arr_v[v14 >> 3] | ((long)(v1 & 0x7F)) << v15;
                return ~v10;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final Object getOrPut(Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object1 = this.get(object0);
        if(object1 == null) {
            object1 = function00.invoke();
            this.set(object0, object1);
        }
        return object1;
    }

    public final void minusAssign(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "keys");
        Object[] arr_object = objectList0.content;
        int v = objectList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            this.remove(arr_object[v1]);
        }
    }

    public final void minusAssign(@NotNull ScatterSet scatterSet0) {
        Intrinsics.checkNotNullParameter(scatterSet0, "keys");
        Object[] arr_object = scatterSet0.elements;
        long[] arr_v = scatterSet0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.remove(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void minusAssign(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "keys");
        for(Object object0: iterable0) {
            this.remove(object0);
        }
    }

    public final void minusAssign(Object object0) {
        this.remove(object0);
    }

    public final void minusAssign(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "keys");
        for(Object object0: sequence0) {
            this.remove(object0);
        }
    }

    public final void minusAssign(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        for(int v = 0; v < arr_object.length; ++v) {
            this.remove(arr_object[v]);
        }
    }

    public final void plusAssign(@NotNull ScatterMap scatterMap0) {
        Intrinsics.checkNotNullParameter(scatterMap0, "from");
        this.putAll(scatterMap0);
    }

    public final void plusAssign(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "pairs");
        this.putAll(iterable0);
    }

    public final void plusAssign(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "from");
        this.putAll(map0);
    }

    public final void plusAssign(@NotNull Pair pair0) {
        Intrinsics.checkNotNullParameter(pair0, "pair");
        this.set(pair0.getFirst(), pair0.getSecond());
    }

    public final void plusAssign(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "pairs");
        this.putAll(sequence0);
    }

    public final void plusAssign(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        this.putAll(arr_pair);
    }

    @Nullable
    public final Object put(Object object0, Object object1) {
        int v = this.findInsertIndex(object0);
        if(v < 0) {
            v = ~v;
        }
        Object[] arr_object = this.values;
        Object object2 = arr_object[v];
        this.keys[v] = object0;
        arr_object[v] = object1;
        return object2;
    }

    public final void putAll(@NotNull ScatterMap scatterMap0) {
        Intrinsics.checkNotNullParameter(scatterMap0, "from");
        Object[] arr_object = scatterMap0.keys;
        Object[] arr_object1 = scatterMap0.values;
        long[] arr_v = scatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            this.set(arr_object[v5], arr_object1[v5]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_19;
                    }
                    break;
                }
            label_19:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void putAll(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "pairs");
        for(Object object0: iterable0) {
            this.set(((Pair)object0).component1(), ((Pair)object0).component2());
        }
    }

    public final void putAll(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "from");
        for(Object object0: map0.entrySet()) {
            this.set(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    public final void putAll(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "pairs");
        for(Object object0: sequence0) {
            this.set(((Pair)object0).component1(), ((Pair)object0).component2());
        }
    }

    public final void putAll(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        for(int v = 0; v < arr_pair.length; ++v) {
            Pair pair0 = arr_pair[v];
            this.set(pair0.component1(), pair0.component2());
        }
    }

    @Nullable
    public final Object remove(Object object0) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        for(int v4 = v2 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.metadata[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(Intrinsics.areEqual(this.keys[v10], object0)) {
                    return v10 < 0 ? null : this.removeValueAt(v10);
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v += 8;
        }
    }

    public final boolean remove(Object object0, Object object1) {
        int v10;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(Intrinsics.areEqual(this.keys[v9], object0)) {
                    v10 = v9;
                    goto label_18;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_22;
            }
            else {
                v10 = -1;
            }
        label_18:
            if(v10 >= 0 && Intrinsics.areEqual(this.values[v10], object1)) {
                this.removeValueAt(v10);
                return true;
            }
            return false;
        label_22:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final void removeIf(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(((Boolean)function20.invoke(this.keys[v5], this.values[v5])).booleanValue()) {
                                this.removeValueAt(v5);
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_18;
                    }
                    break;
                }
            label_18:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @PublishedApi
    @Nullable
    public final Object removeValueAt(int v) {
        --this._size;
        long[] arr_v = this.metadata;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this._capacity) + (this._capacity & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
        this.keys[v] = null;
        Object[] arr_object = this.values;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        return object0;
    }

    public final void set(Object object0, Object object1) {
        int v = this.findInsertIndex(object0);
        if(v < 0) {
            v = ~v;
        }
        this.keys[v] = object0;
        this.values[v] = object1;
    }

    public final int trim() {
        int v = this._capacity;
        int v1 = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if(v1 < v) {
            this.c(v1);
            return v - this._capacity;
        }
        return 0;
    }
}

