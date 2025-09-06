package androidx.collection;

import kotlin.Metadata;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000B\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00028\u00002\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\tH\u0086\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\t\u00A2\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\t\u00A2\u0006\u0004\b\u0011\u0010\u0013J\u001B\u0010\u0015\u001A\u00020\u000E2\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001E\u0010\u0017\u001A\u00020\u000E2\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001D\u0010\u0018\u001A\u00020\u001A2\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\t\u00A2\u0006\u0004\b\u0018\u0010\u001BJ-\u0010\u001E\u001A\u00020\u000E2\u0018\u0010\u001D\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001A0\u001CH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0018\u0010 \u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0004\b \u0010\u0019J \u0010 \u001A\u00020\u000E2\u000E\u0010\"\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000!H\u0086\n\u00A2\u0006\u0004\b \u0010#J\u001E\u0010 \u001A\u00020\u000E2\f\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000$H\u0086\n\u00A2\u0006\u0004\b \u0010%J\u001E\u0010 \u001A\u00020\u000E2\f\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000&H\u0086\n\u00A2\u0006\u0004\b \u0010\'J\u001E\u0010 \u001A\u00020\u000E2\f\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000(H\u0086\n\u00A2\u0006\u0004\b \u0010)J\u0017\u0010+\u001A\u00020\u000E2\u0006\u0010*\u001A\u00020\u0003H\u0001\u00A2\u0006\u0004\b+\u0010\u0006J\r\u0010,\u001A\u00020\u000E\u00A2\u0006\u0004\b,\u0010-J\r\u0010.\u001A\u00020\u0003\u00A2\u0006\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u00060"}, d2 = {"Landroidx/collection/MutableObjectFloatMap;", "K", "Landroidx/collection/ObjectFloatMap;", "", "initialCapacity", "<init>", "(I)V", "key", "Lkotlin/Function0;", "", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)F", "value", "", "set", "(Ljava/lang/Object;F)V", "put", "default", "(Ljava/lang/Object;FF)F", "from", "putAll", "(Landroidx/collection/ObjectFloatMap;)V", "plusAssign", "remove", "(Ljava/lang/Object;)V", "", "(Ljava/lang/Object;F)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "minusAssign", "", "keys", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "index", "removeValueAt", "clear", "()V", "trim", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nObjectFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1058:1\n1048#1,2:1139\n1052#1,5:1147\n1048#1,2:1178\n1052#1,5:1186\n1048#1,2:1203\n1052#1,5:1211\n1#2:1059\n1656#3,6:1060\n1810#3:1076\n1672#3:1080\n1810#3:1098\n1672#3:1102\n1810#3:1123\n1672#3:1127\n1656#3,6:1141\n1656#3,6:1152\n1589#3,3:1158\n1599#3:1161\n1603#3:1162\n1779#3,3:1163\n1793#3,3:1166\n1717#3:1169\n1705#3:1170\n1699#3:1171\n1712#3:1172\n1802#3:1173\n1666#3:1174\n1645#3:1175\n1664#3:1176\n1645#3:1177\n1656#3,6:1180\n1779#3,3:1191\n1810#3:1194\n1699#3:1195\n1669#3:1196\n1645#3:1197\n1589#3,3:1198\n1599#3:1201\n1603#3:1202\n1656#3,6:1205\n1656#3,6:1216\n1656#3,6:1222\n401#4,4:1066\n373#4,6:1070\n383#4,3:1077\n386#4,2:1081\n406#4,2:1083\n389#4,6:1085\n408#4:1091\n373#4,6:1092\n383#4,3:1099\n386#4,9:1103\n267#5,4:1112\n237#5,7:1116\n248#5,3:1124\n251#5,2:1128\n272#5,2:1130\n254#5,6:1132\n274#5:1138\n*S KotlinDebug\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/MutableObjectFloatMap\n*L\n900#1:1139,2\n900#1:1147,5\n960#1:1178,2\n960#1:1186,5\n1035#1:1203,2\n1035#1:1211,5\n728#1:1060,6\n804#1:1076\n804#1:1080\n843#1:1098\n843#1:1102\n889#1:1123\n889#1:1127\n900#1:1141,6\n911#1:1152,6\n925#1:1158,3\n926#1:1161\n927#1:1162\n934#1:1163,3\n935#1:1166,3\n936#1:1169\n937#1:1170\n937#1:1171\n941#1:1172\n944#1:1173\n953#1:1174\n953#1:1175\n959#1:1176\n959#1:1177\n960#1:1180,6\n975#1:1191,3\n976#1:1194\n978#1:1195\n1030#1:1196\n1030#1:1197\n1032#1:1198,3\n1033#1:1201\n1035#1:1202\n1035#1:1205,6\n1049#1:1216,6\n1055#1:1222,6\n804#1:1066,4\n804#1:1070,6\n804#1:1077,3\n804#1:1081,2\n804#1:1083,2\n804#1:1085,6\n804#1:1091\n843#1:1092,6\n843#1:1099,3\n843#1:1103,9\n889#1:1112,4\n889#1:1116,7\n889#1:1124,3\n889#1:1128,2\n889#1:1130,2\n889#1:1132,6\n889#1:1138\n*E\n"})
public final class MutableObjectFloatMap extends ObjectFloatMap {
    public int a;

    public MutableObjectFloatMap() {
        this(0, 1, null);
    }

    public MutableObjectFloatMap(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.c(ScatterMapKt.unloadedCapacity(v));
    }

    public MutableObjectFloatMap(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
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

    public final int b(Object object0) {
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
                    this.d(ScatterMapKt.nextCapacity(this._capacity));
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

    public final void c(int v) {
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
        this.values = new float[v1];
    }

    public final void clear() {
        this._size = 0;
        long[] arr_v = this.metadata;
        if(arr_v != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this._capacity >> 3;
            this.metadata[v] |= 0xFFL << ((this._capacity & 7) << 3);
        }
        ArraysKt___ArraysJvmKt.fill(this.keys, null, 0, this._capacity);
        this.a = ScatterMapKt.loadedCapacity(this.getCapacity()) - this._size;
    }

    public final void d(int v) {
        int v7;
        long[] arr_v = this.metadata;
        Object[] arr_object = this.keys;
        float[] arr_f = this.values;
        int v1 = this._capacity;
        this.c(v);
        Object[] arr_object1 = this.keys;
        float[] arr_f1 = this.values;
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
                arr_object1[v5] = object0;
                arr_f1[v5] = arr_f[v7];
            }
            else {
                v7 = v2;
            }
        }
    }

    public final float getOrPut(Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        int v = this.findKeyIndex(object0);
        if(v >= 0) {
            return this.values[v];
        }
        float f = ((Number)function00.invoke()).floatValue();
        this.set(object0, f);
        return f;
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

    public final void plusAssign(@NotNull ObjectFloatMap objectFloatMap0) {
        Intrinsics.checkNotNullParameter(objectFloatMap0, "from");
        this.putAll(objectFloatMap0);
    }

    public final float put(Object object0, float f, float f1) {
        int v = this.b(object0);
        if(v < 0) {
            v = ~v;
        }
        else {
            f1 = this.values[v];
        }
        this.keys[v] = object0;
        this.values[v] = f;
        return f1;
    }

    public final void put(Object object0, float f) {
        this.set(object0, f);
    }

    public final void putAll(@NotNull ObjectFloatMap objectFloatMap0) {
        Intrinsics.checkNotNullParameter(objectFloatMap0, "from");
        Object[] arr_object = objectFloatMap0.keys;
        float[] arr_f = objectFloatMap0.values;
        long[] arr_v = objectFloatMap0.metadata;
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
                            this.set(arr_object[v5], arr_f[v5]);
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

    public final void remove(Object object0) {
        int v = this.findKeyIndex(object0);
        if(v >= 0) {
            this.removeValueAt(v);
        }
    }

    public final boolean remove(Object object0, float f) {
        int v = this.findKeyIndex(object0);
        if(v >= 0 && this.values[v] == f) {
            this.removeValueAt(v);
            return true;
        }
        return false;
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
                            if(((Boolean)function20.invoke(this.keys[v5], ((float)this.values[v5]))).booleanValue()) {
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
    public final void removeValueAt(int v) {
        --this._size;
        long[] arr_v = this.metadata;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this._capacity) + (this._capacity & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
        this.keys[v] = null;
    }

    public final void set(Object object0, float f) {
        int v = this.b(object0);
        if(v < 0) {
            v = ~v;
        }
        this.keys[v] = object0;
        this.values[v] = f;
    }

    public final int trim() {
        int v = this._capacity;
        int v1 = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if(v1 < v) {
            this.d(v1);
            return v - this._capacity;
        }
        return 0;
    }
}

