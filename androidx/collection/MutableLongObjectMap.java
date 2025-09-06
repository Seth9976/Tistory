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
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000B\u001A\u00028\u00002\u0006\u0010\b\u001A\u00020\u00072\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0011\u001A\u0004\u0018\u00018\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001B\u0010\u0014\u001A\u00020\u000E2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001E\u0010\u0016\u001A\u00020\u000E2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001A\u0004\u0018\u00018\u00002\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001D\u0010\u0017\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0017\u0010\u001AJ-\u0010\u001D\u001A\u00020\u000E2\u0018\u0010\u001C\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0018\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\u0007H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010 J\u0018\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020!H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010#J\u0018\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020$H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010%J\u0018\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020&H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010\'J\u0019\u0010)\u001A\u0004\u0018\u00018\u00002\u0006\u0010(\u001A\u00020\u0003H\u0001\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020\u000E\u00A2\u0006\u0004\b+\u0010,J\r\u0010-\u001A\u00020\u0003\u00A2\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006/"}, d2 = {"Landroidx/collection/MutableLongObjectMap;", "V", "Landroidx/collection/LongObjectMap;", "", "initialCapacity", "<init>", "(I)V", "", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "value", "", "set", "(JLjava/lang/Object;)V", "put", "(JLjava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Landroidx/collection/LongObjectMap;)V", "plusAssign", "remove", "(J)Ljava/lang/Object;", "", "(JLjava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "minusAssign", "(J)V", "", "keys", "([J)V", "Landroidx/collection/LongSet;", "(Landroidx/collection/LongSet;)V", "Landroidx/collection/LongList;", "(Landroidx/collection/LongList;)V", "index", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "()V", "trim", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLongObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 5 LongSet.kt\nandroidx/collection/LongSetKt\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,1018:1\n820#1,2:1171\n820#1,2:1185\n1008#1,2:1188\n1012#1,5:1196\n1008#1,2:1227\n1012#1,5:1235\n1008#1,2:1252\n1012#1,5:1260\n1#2:1019\n1656#3,6:1020\n1810#3:1036\n1672#3:1040\n1603#3:1057\n1599#3:1060\n1779#3,3:1065\n1793#3,3:1069\n1717#3:1073\n1705#3:1075\n1699#3:1076\n1712#3:1081\n1802#3:1083\n1603#3:1097\n1599#3:1100\n1779#3,3:1105\n1793#3,3:1109\n1717#3:1113\n1705#3:1115\n1699#3:1116\n1712#3:1121\n1802#3:1123\n1810#3:1138\n1672#3:1142\n1810#3:1163\n1672#3:1167\n1656#3,6:1190\n1656#3,6:1201\n1599#3:1210\n1603#3:1211\n1779#3,3:1212\n1793#3,3:1215\n1717#3:1218\n1705#3:1219\n1699#3:1220\n1712#3:1221\n1802#3:1222\n1666#3:1223\n1645#3:1224\n1664#3:1225\n1645#3:1226\n1656#3,6:1229\n1779#3,3:1240\n1810#3:1243\n1699#3:1244\n1669#3:1245\n1645#3:1246\n1599#3:1250\n1603#3:1251\n1656#3,6:1254\n1656#3,6:1265\n1656#3,6:1271\n382#4,4:1026\n354#4,6:1030\n364#4,3:1037\n367#4,2:1041\n387#4,2:1043\n370#4,6:1045\n389#4:1051\n619#4:1052\n620#4:1056\n622#4,2:1058\n624#4,4:1061\n628#4:1068\n629#4:1072\n630#4:1074\n631#4,4:1077\n637#4:1082\n638#4,8:1084\n619#4:1092\n620#4:1096\n622#4,2:1098\n624#4,4:1101\n628#4:1108\n629#4:1112\n630#4:1114\n631#4,4:1117\n637#4:1122\n638#4,8:1124\n354#4,6:1132\n364#4,3:1139\n367#4,9:1143\n833#5,3:1053\n833#5,3:1093\n833#5,3:1207\n833#5,3:1247\n262#6,4:1152\n232#6,7:1156\n243#6,3:1164\n246#6,2:1168\n266#6:1170\n267#6:1173\n249#6,6:1174\n268#6:1180\n253#7,4:1181\n258#7:1187\n*S KotlinDebug\n*F\n+ 1 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n*L\n837#1:1171,2\n846#1:1185,2\n856#1:1188,2\n856#1:1196,5\n920#1:1227,2\n920#1:1235,5\n995#1:1252,2\n995#1:1260,5\n713#1:1020,6\n766#1:1036\n766#1:1040\n782#1:1057\n782#1:1060\n782#1:1065,3\n782#1:1069,3\n782#1:1073\n782#1:1075\n782#1:1076\n782#1:1081\n782#1:1083\n794#1:1097\n794#1:1100\n794#1:1105,3\n794#1:1109,3\n794#1:1113\n794#1:1115\n794#1:1116\n794#1:1121\n794#1:1123\n808#1:1138\n808#1:1142\n836#1:1163\n836#1:1167\n856#1:1190,6\n871#1:1201,6\n886#1:1210\n887#1:1211\n894#1:1212,3\n895#1:1215,3\n896#1:1218\n897#1:1219\n897#1:1220\n901#1:1221\n904#1:1222\n913#1:1223\n913#1:1224\n919#1:1225\n919#1:1226\n920#1:1229,6\n935#1:1240,3\n936#1:1243\n938#1:1244\n990#1:1245\n990#1:1246\n993#1:1250\n995#1:1251\n995#1:1254,6\n1009#1:1265,6\n1015#1:1271,6\n766#1:1026,4\n766#1:1030,6\n766#1:1037,3\n766#1:1041,2\n766#1:1043,2\n766#1:1045,6\n766#1:1051\n782#1:1052\n782#1:1056\n782#1:1058,2\n782#1:1061,4\n782#1:1068\n782#1:1072\n782#1:1074\n782#1:1077,4\n782#1:1082\n782#1:1084,8\n794#1:1092\n794#1:1096\n794#1:1098,2\n794#1:1101,4\n794#1:1108\n794#1:1112\n794#1:1114\n794#1:1117,4\n794#1:1122\n794#1:1124,8\n808#1:1132,6\n808#1:1139,3\n808#1:1143,9\n782#1:1053,3\n794#1:1093,3\n885#1:1207,3\n992#1:1247,3\n836#1:1152,4\n836#1:1156,7\n836#1:1164,3\n836#1:1168,2\n836#1:1170\n836#1:1173\n836#1:1174,6\n836#1:1180\n845#1:1181,4\n845#1:1187\n*E\n"})
public final class MutableLongObjectMap extends LongObjectMap {
    public int a;

    public MutableLongObjectMap() {
        this(0, 1, null);
    }

    public MutableLongObjectMap(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.c(ScatterMapKt.unloadedCapacity(v));
    }

    public MutableLongObjectMap(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    public final int a(long v) {
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
                int v11 = this.b(v2 >>> 7);
                if(this.a == 0 && (this.metadata[v11 >> 3] >> ((v11 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this._capacity > 8 && Long.compareUnsigned(q.f(this._size, 0x20L), q.f(this._capacity, 25L)) <= 0) {
                    }
                    this.d(ScatterMapKt.nextCapacity(this._capacity));
                    v11 = this.b(v2 >>> 7);
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
                return v11;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final int b(int v) {
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
        this.values = new Object[v1];
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
        this.a = ScatterMapKt.loadedCapacity(this.getCapacity()) - this._size;
    }

    public final void d(int v) {
        long[] arr_v = this.metadata;
        long[] arr_v1 = this.keys;
        Object[] arr_object = this.values;
        int v1 = this._capacity;
        this.c(v);
        long[] arr_v2 = this.keys;
        Object[] arr_object1 = this.values;
        for(int v2 = 0; v2 < v1; ++v2) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                long v3 = arr_v1[v2];
                int v4 = Long.hashCode(v3);
                int v5 = v4 * 0xCC9E2D51 ^ v4 * 0xCC9E2D51 << 16;
                int v6 = this.b(v5 >>> 7);
                long[] arr_v3 = this.metadata;
                int v7 = (v6 & 7) << 3;
                arr_v3[v6 >> 3] = arr_v3[v6 >> 3] & ~(0xFFL << v7) | ((long)(v5 & 0x7F)) << v7;
                int v8 = (v6 - 7 & this._capacity) + (this._capacity & 7);
                int v9 = (v8 & 7) << 3;
                arr_v3[v8 >> 3] = arr_v3[v8 >> 3] & ~(0xFFL << v9) | ((long)(v5 & 0x7F)) << v9;
                arr_v2[v6] = v3;
                arr_object1[v6] = arr_object[v2];
            }
        }
    }

    public final Object getOrPut(long v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object0 = this.get(v);
        if(object0 == null) {
            object0 = function00.invoke();
            this.set(v, object0);
        }
        return object0;
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

    public final void plusAssign(@NotNull LongObjectMap longObjectMap0) {
        Intrinsics.checkNotNullParameter(longObjectMap0, "from");
        this.putAll(longObjectMap0);
    }

    @Nullable
    public final Object put(long v, Object object0) {
        int v1 = this.a(v);
        Object[] arr_object = this.values;
        Object object1 = arr_object[v1];
        this.keys[v1] = v;
        arr_object[v1] = object0;
        return object1;
    }

    public final void putAll(@NotNull LongObjectMap longObjectMap0) {
        Intrinsics.checkNotNullParameter(longObjectMap0, "from");
        long[] arr_v = longObjectMap0.keys;
        Object[] arr_object = longObjectMap0.values;
        long[] arr_v1 = longObjectMap0.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            this.set(arr_v[v5], arr_object[v5]);
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

    @Nullable
    public final Object remove(long v) {
        int v1 = Long.hashCode(v);
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.metadata[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.keys[v10] == v) {
                    return v10 < 0 ? null : this.removeValueAt(v10);
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final boolean remove(long v, Object object0) {
        int v11;
        int v1 = Long.hashCode(v);
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.metadata[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L;
            while(v9 != 0L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.keys[v10] == v) {
                    v11 = v10;
                    goto label_18;
                }
                v9 &= v9 - 1L;
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) == 0L) {
                goto label_22;
            }
            else {
                v11 = -1;
            }
        label_18:
            if(v11 >= 0 && Intrinsics.areEqual(this.values[v11], object0)) {
                this.removeValueAt(v11);
                return true;
            }
            return false;
        label_22:
            v5 += 8;
            v4 = v4 + v5 & v3;
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
                            if(((Boolean)function20.invoke(((long)this.keys[v5]), this.values[v5])).booleanValue()) {
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
        Object[] arr_object = this.values;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        return object0;
    }

    public final void set(long v, Object object0) {
        int v1 = this.a(v);
        this.keys[v1] = v;
        this.values[v1] = object0;
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

