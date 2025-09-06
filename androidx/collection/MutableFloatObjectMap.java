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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000B\u001A\u00028\u00002\u0006\u0010\b\u001A\u00020\u00072\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0011\u001A\u0004\u0018\u00018\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001B\u0010\u0014\u001A\u00020\u000E2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001E\u0010\u0016\u001A\u00020\u000E2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001A\u0004\u0018\u00018\u00002\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001D\u0010\u0017\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0017\u0010\u001AJ-\u0010\u001D\u001A\u00020\u000E2\u0018\u0010\u001C\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0018\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\u0007H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010 J\u0018\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020!H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010#J\u0018\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020$H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010%J\u0018\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020&H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010\'J\u0019\u0010)\u001A\u0004\u0018\u00018\u00002\u0006\u0010(\u001A\u00020\u0003H\u0001\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020\u000E\u00A2\u0006\u0004\b+\u0010,J\r\u0010-\u001A\u00020\u0003\u00A2\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006/"}, d2 = {"Landroidx/collection/MutableFloatObjectMap;", "V", "Landroidx/collection/FloatObjectMap;", "", "initialCapacity", "<init>", "(I)V", "", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(FLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "value", "", "set", "(FLjava/lang/Object;)V", "put", "(FLjava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Landroidx/collection/FloatObjectMap;)V", "plusAssign", "remove", "(F)Ljava/lang/Object;", "", "(FLjava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "minusAssign", "(F)V", "", "keys", "([F)V", "Landroidx/collection/FloatSet;", "(Landroidx/collection/FloatSet;)V", "Landroidx/collection/FloatList;", "(Landroidx/collection/FloatList;)V", "index", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "()V", "trim", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/MutableFloatObjectMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,1018:1\n820#1,2:1171\n820#1,2:1185\n1008#1,2:1188\n1012#1,5:1196\n1008#1,2:1227\n1012#1,5:1235\n1008#1,2:1252\n1012#1,5:1260\n1#2:1019\n1656#3,6:1020\n1810#3:1036\n1672#3:1040\n1603#3:1057\n1599#3:1060\n1779#3,3:1065\n1793#3,3:1069\n1717#3:1073\n1705#3:1075\n1699#3:1076\n1712#3:1081\n1802#3:1083\n1603#3:1097\n1599#3:1100\n1779#3,3:1105\n1793#3,3:1109\n1717#3:1113\n1705#3:1115\n1699#3:1116\n1712#3:1121\n1802#3:1123\n1810#3:1138\n1672#3:1142\n1810#3:1163\n1672#3:1167\n1656#3,6:1190\n1656#3,6:1201\n1599#3:1210\n1603#3:1211\n1779#3,3:1212\n1793#3,3:1215\n1717#3:1218\n1705#3:1219\n1699#3:1220\n1712#3:1221\n1802#3:1222\n1666#3:1223\n1645#3:1224\n1664#3:1225\n1645#3:1226\n1656#3,6:1229\n1779#3,3:1240\n1810#3:1243\n1699#3:1244\n1669#3:1245\n1645#3:1246\n1599#3:1250\n1603#3:1251\n1656#3,6:1254\n1656#3,6:1265\n1656#3,6:1271\n382#4,4:1026\n354#4,6:1030\n364#4,3:1037\n367#4,2:1041\n387#4,2:1043\n370#4,6:1045\n389#4:1051\n619#4:1052\n620#4:1056\n622#4,2:1058\n624#4,4:1061\n628#4:1068\n629#4:1072\n630#4:1074\n631#4,4:1077\n637#4:1082\n638#4,8:1084\n619#4:1092\n620#4:1096\n622#4,2:1098\n624#4,4:1101\n628#4:1108\n629#4:1112\n630#4:1114\n631#4,4:1117\n637#4:1122\n638#4,8:1124\n354#4,6:1132\n364#4,3:1139\n367#4,9:1143\n833#5,3:1053\n833#5,3:1093\n833#5,3:1207\n833#5,3:1247\n262#6,4:1152\n232#6,7:1156\n243#6,3:1164\n246#6,2:1168\n266#6:1170\n267#6:1173\n249#6,6:1174\n268#6:1180\n253#7,4:1181\n258#7:1187\n*S KotlinDebug\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/MutableFloatObjectMap\n*L\n837#1:1171,2\n846#1:1185,2\n856#1:1188,2\n856#1:1196,5\n920#1:1227,2\n920#1:1235,5\n995#1:1252,2\n995#1:1260,5\n713#1:1020,6\n766#1:1036\n766#1:1040\n782#1:1057\n782#1:1060\n782#1:1065,3\n782#1:1069,3\n782#1:1073\n782#1:1075\n782#1:1076\n782#1:1081\n782#1:1083\n794#1:1097\n794#1:1100\n794#1:1105,3\n794#1:1109,3\n794#1:1113\n794#1:1115\n794#1:1116\n794#1:1121\n794#1:1123\n808#1:1138\n808#1:1142\n836#1:1163\n836#1:1167\n856#1:1190,6\n871#1:1201,6\n886#1:1210\n887#1:1211\n894#1:1212,3\n895#1:1215,3\n896#1:1218\n897#1:1219\n897#1:1220\n901#1:1221\n904#1:1222\n913#1:1223\n913#1:1224\n919#1:1225\n919#1:1226\n920#1:1229,6\n935#1:1240,3\n936#1:1243\n938#1:1244\n990#1:1245\n990#1:1246\n993#1:1250\n995#1:1251\n995#1:1254,6\n1009#1:1265,6\n1015#1:1271,6\n766#1:1026,4\n766#1:1030,6\n766#1:1037,3\n766#1:1041,2\n766#1:1043,2\n766#1:1045,6\n766#1:1051\n782#1:1052\n782#1:1056\n782#1:1058,2\n782#1:1061,4\n782#1:1068\n782#1:1072\n782#1:1074\n782#1:1077,4\n782#1:1082\n782#1:1084,8\n794#1:1092\n794#1:1096\n794#1:1098,2\n794#1:1101,4\n794#1:1108\n794#1:1112\n794#1:1114\n794#1:1117,4\n794#1:1122\n794#1:1124,8\n808#1:1132,6\n808#1:1139,3\n808#1:1143,9\n782#1:1053,3\n794#1:1093,3\n885#1:1207,3\n992#1:1247,3\n836#1:1152,4\n836#1:1156,7\n836#1:1164,3\n836#1:1168,2\n836#1:1170\n836#1:1173\n836#1:1174,6\n836#1:1180\n845#1:1181,4\n845#1:1187\n*E\n"})
public final class MutableFloatObjectMap extends FloatObjectMap {
    public int a;

    public MutableFloatObjectMap() {
        this(0, 1, null);
    }

    public MutableFloatObjectMap(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.c(ScatterMapKt.unloadedCapacity(v));
    }

    public MutableFloatObjectMap(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    public final int a(float f) {
        int v = Float.hashCode(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = v6 ^ ((long)(v1 & 0x7F)) * 0x101010101010101L;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.keys[v9] == f) {
                    return v9;
                }
            }
            if(Long.compare(~v6 << 6 & v6 & 0x8080808080808080L, 0L) != 0) {
                int v10 = this.b(v1 >>> 7);
                if(this.a == 0 && (this.metadata[v10 >> 3] >> ((v10 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this._capacity > 8 && Long.compareUnsigned(q.f(this._size, 0x20L), q.f(this._capacity, 25L)) <= 0) {
                    }
                    this.d(ScatterMapKt.nextCapacity(this._capacity));
                    v10 = this.b(v1 >>> 7);
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
                arr_v[v14 >> 3] = arr_v[v14 >> 3] & ~(0xFFL << v15) | ((long)(v1 & 0x7F)) << v15;
                return v10;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
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
        this.keys = new float[v1];
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
        float[] arr_f = this.keys;
        Object[] arr_object = this.values;
        int v1 = this._capacity;
        this.c(v);
        float[] arr_f1 = this.keys;
        Object[] arr_object1 = this.values;
        for(int v2 = 0; v2 < v1; ++v2) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                float f = arr_f[v2];
                int v3 = Float.hashCode(f);
                int v4 = v3 * 0xCC9E2D51 ^ v3 * 0xCC9E2D51 << 16;
                int v5 = this.b(v4 >>> 7);
                long[] arr_v1 = this.metadata;
                int v6 = (v5 & 7) << 3;
                arr_v1[v5 >> 3] = arr_v1[v5 >> 3] & ~(0xFFL << v6) | ((long)(v4 & 0x7F)) << v6;
                int v7 = (v5 - 7 & this._capacity) + (this._capacity & 7);
                int v8 = (v7 & 7) << 3;
                arr_v1[v7 >> 3] = ~(0xFFL << v8) & arr_v1[v7 >> 3] | ((long)(v4 & 0x7F)) << v8;
                arr_f1[v5] = f;
                arr_object1[v5] = arr_object[v2];
            }
        }
    }

    public final Object getOrPut(float f, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object0 = this.get(f);
        if(object0 == null) {
            object0 = function00.invoke();
            this.set(f, object0);
        }
        return object0;
    }

    public final void minusAssign(float f) {
        this.remove(f);
    }

    public final void minusAssign(@NotNull FloatList floatList0) {
        Intrinsics.checkNotNullParameter(floatList0, "keys");
        float[] arr_f = floatList0.content;
        int v = floatList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            this.remove(arr_f[v1]);
        }
    }

    public final void minusAssign(@NotNull FloatSet floatSet0) {
        Intrinsics.checkNotNullParameter(floatSet0, "keys");
        float[] arr_f = floatSet0.elements;
        long[] arr_v = floatSet0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.remove(arr_f[(v1 << 3) + v4]);
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

    public final void minusAssign(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "keys");
        for(int v = 0; v < arr_f.length; ++v) {
            this.remove(arr_f[v]);
        }
    }

    public final void plusAssign(@NotNull FloatObjectMap floatObjectMap0) {
        Intrinsics.checkNotNullParameter(floatObjectMap0, "from");
        this.putAll(floatObjectMap0);
    }

    @Nullable
    public final Object put(float f, Object object0) {
        int v = this.a(f);
        Object[] arr_object = this.values;
        Object object1 = arr_object[v];
        this.keys[v] = f;
        arr_object[v] = object0;
        return object1;
    }

    public final void putAll(@NotNull FloatObjectMap floatObjectMap0) {
        Intrinsics.checkNotNullParameter(floatObjectMap0, "from");
        float[] arr_f = floatObjectMap0.keys;
        Object[] arr_object = floatObjectMap0.values;
        long[] arr_v = floatObjectMap0.metadata;
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
                            this.set(arr_f[v5], arr_object[v5]);
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
    public final Object remove(float f) {
        int v = Float.hashCode(f);
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.keys[v9] == f) {
                    return v9 < 0 ? null : this.removeValueAt(v9);
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean remove(float f, Object object0) {
        int v10;
        int v = Float.hashCode(f);
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
                if(this.keys[v9] == f) {
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
            if(v10 >= 0 && Intrinsics.areEqual(this.values[v10], object0)) {
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
                            if(((Boolean)function20.invoke(((float)this.keys[v5]), this.values[v5])).booleanValue()) {
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

    public final void set(float f, Object object0) {
        int v = this.a(f);
        this.keys[v] = f;
        this.values[v] = object0;
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

