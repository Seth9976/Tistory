package androidx.collection;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJ \u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006H\u0086\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0010\u0010\u000FJ%\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0010\u0010\u0012J\u0015\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\u0001H\u0086\n\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001D\u0010\u0017\u001A\u00020\u00192\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001AJ-\u0010\u001D\u001A\u00020\r2\u0018\u0010\u001C\u001A\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0018\u0010\u001F\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010\u0018J\u0018\u0010\u001F\u001A\u00020\r2\u0006\u0010!\u001A\u00020 H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010\"J\u0018\u0010\u001F\u001A\u00020\r2\u0006\u0010!\u001A\u00020#H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010$J\u0018\u0010\u001F\u001A\u00020\r2\u0006\u0010!\u001A\u00020%H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010&J\u0017\u0010(\u001A\u00020\r2\u0006\u0010\'\u001A\u00020\u0002H\u0001\u00A2\u0006\u0004\b(\u0010\u0005J\r\u0010)\u001A\u00020\r\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020\u0002\u00A2\u0006\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006-"}, d2 = {"Landroidx/collection/MutableLongLongMap;", "Landroidx/collection/LongLongMap;", "", "initialCapacity", "<init>", "(I)V", "", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(JLkotlin/jvm/functions/Function0;)J", "value", "", "set", "(JJ)V", "put", "default", "(JJJ)J", "from", "putAll", "(Landroidx/collection/LongLongMap;)V", "plusAssign", "remove", "(J)V", "", "(JJ)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "minusAssign", "", "keys", "([J)V", "Landroidx/collection/LongSet;", "(Landroidx/collection/LongSet;)V", "Landroidx/collection/LongList;", "(Landroidx/collection/LongList;)V", "index", "removeValueAt", "clear", "()V", "trim", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLongLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/MutableLongLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 LongLongMap.kt\nandroidx/collection/LongLongMap\n+ 5 LongSet.kt\nandroidx/collection/LongSet\n+ 6 LongList.kt\nandroidx/collection/LongList\n+ 7 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1031:1\n1021#1,2:1118\n1025#1,5:1126\n1021#1,2:1157\n1025#1,5:1165\n1021#1,2:1182\n1025#1,5:1190\n1#2:1032\n1656#3,6:1033\n1810#3:1049\n1672#3:1053\n1810#3:1071\n1672#3:1075\n1810#3:1096\n1672#3:1100\n1656#3,6:1120\n1656#3,6:1131\n1599#3:1140\n1603#3:1141\n1779#3,3:1142\n1793#3,3:1145\n1717#3:1148\n1705#3:1149\n1699#3:1150\n1712#3:1151\n1802#3:1152\n1666#3:1153\n1645#3:1154\n1664#3:1155\n1645#3:1156\n1656#3,6:1159\n1779#3,3:1170\n1810#3:1173\n1699#3:1174\n1669#3:1175\n1645#3:1176\n1599#3:1180\n1603#3:1181\n1656#3,6:1184\n1656#3,6:1195\n1656#3,6:1201\n385#4,4:1039\n357#4,6:1043\n367#4,3:1050\n370#4,2:1054\n389#4,2:1056\n373#4,6:1058\n391#4:1064\n357#4,6:1065\n367#4,3:1072\n370#4,9:1076\n262#5,4:1085\n232#5,7:1089\n243#5,3:1097\n246#5,2:1101\n266#5,2:1103\n249#5,6:1105\n268#5:1111\n253#6,6:1112\n833#7,3:1137\n833#7,3:1177\n*S KotlinDebug\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/MutableLongLongMap\n*L\n875#1:1118,2\n875#1:1126,5\n933#1:1157,2\n933#1:1165,5\n1008#1:1182,2\n1008#1:1190,5\n711#1:1033,6\n789#1:1049\n789#1:1053\n828#1:1071\n828#1:1075\n855#1:1096\n855#1:1100\n875#1:1120,6\n885#1:1131,6\n899#1:1140\n900#1:1141\n907#1:1142,3\n908#1:1145,3\n909#1:1148\n910#1:1149\n910#1:1150\n914#1:1151\n917#1:1152\n926#1:1153\n926#1:1154\n932#1:1155\n932#1:1156\n933#1:1159,6\n948#1:1170,3\n949#1:1173\n951#1:1174\n1003#1:1175\n1003#1:1176\n1006#1:1180\n1008#1:1181\n1008#1:1184,6\n1022#1:1195,6\n1028#1:1201,6\n789#1:1039,4\n789#1:1043,6\n789#1:1050,3\n789#1:1054,2\n789#1:1056,2\n789#1:1058,6\n789#1:1064\n828#1:1065,6\n828#1:1072,3\n828#1:1076,9\n855#1:1085,4\n855#1:1089,7\n855#1:1097,3\n855#1:1101,2\n855#1:1103,2\n855#1:1105,6\n855#1:1111\n864#1:1112,6\n898#1:1137,3\n1005#1:1177,3\n*E\n"})
public final class MutableLongLongMap extends LongLongMap {
    public int a;

    public MutableLongLongMap() {
        this(0, 1, null);
    }

    public MutableLongLongMap(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.c(ScatterMapKt.unloadedCapacity(v));
    }

    public MutableLongLongMap(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
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

    public final int b(long v) {
        int v1 = Long.hashCode(v);
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.metadata[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v4 >> 3] >>> v6;
            long v8 = v7 ^ ((long)(v2 & 0x7F)) * 0x101010101010101L;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.keys[v10] == v) {
                    return v10;
                }
            }
            if(Long.compare(~v7 << 6 & v7 & 0x8080808080808080L, 0L) != 0) {
                int v11 = this.a(v2 >>> 7);
                if(this.a == 0 && (this.metadata[v11 >> 3] >> ((v11 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this._capacity > 8 && Long.compareUnsigned(q.f(this._size, 0x20L), q.f(this._capacity, 25L)) <= 0) {
                    }
                    this.d(ScatterMapKt.nextCapacity(this._capacity));
                    v11 = this.a(v2 >>> 7);
                }
                ++this._size;
                int v12 = this.a;
                long[] arr_v = this.metadata;
                long v13 = arr_v[v11 >> 3];
                int v14 = (v11 & 7) << 3;
                this.a = v12 - ((v13 >> v14 & 0xFFL) == 0x80L ? 1 : 0);
                arr_v[v11 >> 3] = v13 & ~(0xFFL << v14) | ((long)(v2 & 0x7F)) << v14;
                int v15 = (v11 - 7 & this._capacity) + (this._capacity & 7);
                int v16 = (v15 & 7) << 3;
                arr_v[v15 >> 3] = arr_v[v15 >> 3] & ~(0xFFL << v16) | ((long)(v2 & 0x7F)) << v16;
                return ~v11;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
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
        this.keys = new long[v1];
        this.values = new long[v1];
    }

    public final void clear() {
        this._size = 0;
        long[] arr_v = this.metadata;
        if(arr_v != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this._capacity >> 3;
            this.metadata[v] |= 0xFFL << ((this._capacity & 7) << 3);
        }
        this.a = ScatterMapKt.loadedCapacity(this.getCapacity()) - this._size;
    }

    public final void d(int v) {
        long[] arr_v = this.metadata;
        long[] arr_v1 = this.keys;
        long[] arr_v2 = this.values;
        int v1 = this._capacity;
        this.c(v);
        long[] arr_v3 = this.keys;
        long[] arr_v4 = this.values;
        for(int v2 = 0; v2 < v1; ++v2) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                long v3 = arr_v1[v2];
                int v4 = Long.hashCode(v3);
                int v5 = v4 * 0xCC9E2D51 ^ v4 * 0xCC9E2D51 << 16;
                int v6 = this.a(v5 >>> 7);
                long[] arr_v5 = this.metadata;
                int v7 = (v6 & 7) << 3;
                arr_v5[v6 >> 3] = arr_v5[v6 >> 3] & ~(0xFFL << v7) | ((long)(v5 & 0x7F)) << v7;
                int v8 = (v6 - 7 & this._capacity) + (this._capacity & 7);
                int v9 = (v8 & 7) << 3;
                arr_v5[v8 >> 3] = arr_v5[v8 >> 3] & ~(0xFFL << v9) | ((long)(v5 & 0x7F)) << v9;
                arr_v3[v6] = v3;
                arr_v4[v6] = arr_v2[v2];
            }
        }
    }

    public final long getOrPut(long v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        int v1 = this.findKeyIndex(v);
        if(v1 < 0) {
            long v2 = ((Number)function00.invoke()).longValue();
            this.put(v, v2);
            return v2;
        }
        return this.values[v1];
    }

    public final void minusAssign(long v) {
        this.remove(v);
    }

    public final void minusAssign(@NotNull LongList longList0) {
        Intrinsics.checkNotNullParameter(longList0, "keys");
        long[] arr_v = longList0.content;
        int v = longList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            this.remove(arr_v[v1]);
        }
    }

    public final void minusAssign(@NotNull LongSet longSet0) {
        Intrinsics.checkNotNullParameter(longSet0, "keys");
        long[] arr_v = longSet0.elements;
        long[] arr_v1 = longSet0.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.remove(arr_v[(v1 << 3) + v4]);
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

    public final void minusAssign(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "keys");
        for(int v = 0; v < arr_v.length; ++v) {
            this.remove(arr_v[v]);
        }
    }

    public final void plusAssign(@NotNull LongLongMap longLongMap0) {
        Intrinsics.checkNotNullParameter(longLongMap0, "from");
        this.putAll(longLongMap0);
    }

    public final long put(long v, long v1, long v2) {
        int v3 = this.b(v);
        if(v3 < 0) {
            v3 = ~v3;
        }
        else {
            v2 = this.values[v3];
        }
        this.keys[v3] = v;
        this.values[v3] = v1;
        return v2;
    }

    public final void put(long v, long v1) {
        this.set(v, v1);
    }

    public final void putAll(@NotNull LongLongMap longLongMap0) {
        Intrinsics.checkNotNullParameter(longLongMap0, "from");
        long[] arr_v = longLongMap0.keys;
        long[] arr_v1 = longLongMap0.values;
        long[] arr_v2 = longLongMap0.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            this.set(arr_v[v5], arr_v1[v5]);
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

    public final void remove(long v) {
        int v1 = this.findKeyIndex(v);
        if(v1 >= 0) {
            this.removeValueAt(v1);
        }
    }

    public final boolean remove(long v, long v1) {
        int v2 = this.findKeyIndex(v);
        if(v2 >= 0 && this.values[v2] == v1) {
            this.removeValueAt(v2);
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
                            if(((Boolean)function20.invoke(((long)this.keys[v5]), ((long)this.values[v5]))).booleanValue()) {
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
    }

    public final void set(long v, long v1) {
        int v2 = this.b(v);
        if(v2 < 0) {
            v2 = ~v2;
        }
        this.keys[v2] = v;
        this.values[v2] = v1;
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

