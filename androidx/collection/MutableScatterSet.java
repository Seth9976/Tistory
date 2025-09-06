package androidx.collection;

import androidx.annotation.IntRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001.B\u0011\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u0010\u001A\u00020\b2\u000E\u0010\u000F\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012\u00A2\u0006\u0004\b\u0010\u0010\u0013J\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014\u00A2\u0006\u0004\b\u0010\u0010\u0015J\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0016J\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017\u00A2\u0006\u0004\b\u0010\u0010\u0018J \u0010\f\u001A\u00020\u000B2\u000E\u0010\u000F\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000EH\u0086\u0002\u00A2\u0006\u0004\b\f\u0010\u0019J\u001E\u0010\f\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002\u00A2\u0006\u0004\b\f\u0010\u001AJ\u001E\u0010\f\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002\u00A2\u0006\u0004\b\f\u0010\u001BJ\u001E\u0010\f\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002\u00A2\u0006\u0004\b\f\u0010\u001CJ\u001E\u0010\f\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\u0002\u00A2\u0006\u0004\b\f\u0010\u001DJ\u0015\u0010\u001E\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\u001E\u0010\nJ\u0018\u0010\u001F\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010\rJ\u001D\u0010 \u001A\u00020\b2\u000E\u0010\u000F\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000E\u00A2\u0006\u0004\b \u0010\u0011J\u001B\u0010 \u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014\u00A2\u0006\u0004\b \u0010\u0015J\u001B\u0010 \u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012\u00A2\u0006\u0004\b \u0010\u0013J\u001B\u0010 \u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b \u0010\u0016J\u001B\u0010 \u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017\u00A2\u0006\u0004\b \u0010\u0018J \u0010\u001F\u001A\u00020\u000B2\u000E\u0010\u000F\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000EH\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010\u0019J\u001E\u0010\u001F\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010\u001BJ\u001E\u0010\u001F\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010\u001AJ\u001E\u0010\u001F\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u001E\u0010\u001F\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\'\u0010#\u001A\u00020\u000B2\u0012\u0010\"\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0!H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001A\u00020\u000B2\u0006\u0010%\u001A\u00020\u0003H\u0001\u00A2\u0006\u0004\b&\u0010\u0006J\r\u0010\'\u001A\u00020\u000B\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010)\u001A\u00020\u0003H\u0007\u00A2\u0006\u0004\b)\u0010*J\u0013\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000+\u00A2\u0006\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006/"}, d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "", "initialCapacity", "<init>", "(I)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "plusAssign", "(Ljava/lang/Object;)V", "", "elements", "addAll", "([Ljava/lang/Object;)Z", "", "(Ljava/lang/Iterable;)Z", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Z", "(Landroidx/collection/ScatterSet;)Z", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)Z", "([Ljava/lang/Object;)V", "(Ljava/lang/Iterable;)V", "(Lkotlin/sequences/Sequence;)V", "(Landroidx/collection/ScatterSet;)V", "(Landroidx/collection/ObjectList;)V", "remove", "minusAssign", "removeAll", "Lkotlin/Function1;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "index", "removeElementAt", "clear", "()V", "trim", "()I", "", "asMutableSet", "()Ljava/util/Set;", "androidx/collection/b", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1084:1\n1002#1,2:1269\n1006#1,5:1277\n1002#1,2:1308\n1006#1,5:1316\n1002#1,2:1333\n1006#1,5:1341\n1#2:1085\n1656#3,6:1086\n1810#3:1109\n1672#3:1113\n1589#3,3:1132\n1603#3:1136\n1599#3:1139\n1779#3,3:1143\n1793#3,3:1147\n1717#3:1151\n1705#3:1153\n1699#3:1154\n1712#3:1159\n1802#3:1161\n1589#3,3:1171\n1603#3:1175\n1599#3:1178\n1779#3,3:1182\n1793#3,3:1186\n1717#3:1190\n1705#3:1192\n1699#3:1193\n1712#3:1198\n1802#3:1200\n1810#3:1226\n1672#3:1230\n1810#3:1255\n1672#3:1259\n1656#3,6:1271\n1656#3,6:1282\n1589#3,3:1288\n1599#3:1291\n1603#3:1292\n1779#3,3:1293\n1793#3,3:1296\n1717#3:1299\n1705#3:1300\n1699#3:1301\n1712#3:1302\n1802#3:1303\n1666#3:1304\n1645#3:1305\n1664#3:1306\n1645#3:1307\n1656#3,6:1310\n1779#3,3:1321\n1810#3:1324\n1699#3:1325\n1669#3:1326\n1645#3:1327\n1589#3,3:1328\n1599#3:1331\n1603#3:1332\n1656#3,6:1335\n1656#3,6:1346\n1656#3,6:1352\n13579#4,2:1092\n13579#4,2:1209\n1855#5,2:1094\n1855#5,2:1213\n1295#6,2:1096\n1295#6,2:1211\n267#7,4:1098\n237#7,7:1102\n248#7,3:1110\n251#7,2:1114\n272#7,2:1116\n254#7,6:1118\n274#7:1124\n433#7:1131\n434#7:1135\n436#7,2:1137\n438#7,3:1140\n441#7:1146\n442#7:1150\n443#7:1152\n444#7,4:1155\n450#7:1160\n451#7,8:1162\n433#7:1170\n434#7:1174\n436#7,2:1176\n438#7,3:1179\n441#7:1185\n442#7:1189\n443#7:1191\n444#7,4:1194\n450#7:1199\n451#7,8:1201\n267#7,4:1215\n237#7,7:1219\n248#7,3:1227\n251#7,2:1231\n272#7,2:1233\n254#7,6:1235\n274#7:1241\n237#7,7:1248\n248#7,3:1256\n251#7,9:1260\n305#8,6:1125\n305#8,6:1242\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n857#1:1269,2\n857#1:1277,5\n917#1:1308,2\n917#1:1316,5\n990#1:1333,2\n990#1:1341,5\n567#1:1086,6\n692#1:1109\n692#1:1113\n714#1:1132,3\n714#1:1136\n714#1:1139\n714#1:1143,3\n714#1:1147,3\n714#1:1151\n714#1:1153\n714#1:1154\n714#1:1159\n714#1:1161\n727#1:1171,3\n727#1:1175\n727#1:1178\n727#1:1182,3\n727#1:1186,3\n727#1:1190\n727#1:1192\n727#1:1193\n727#1:1198\n727#1:1200\n823#1:1226\n823#1:1230\n843#1:1255\n843#1:1259\n857#1:1271,6\n868#1:1282,6\n882#1:1288,3\n883#1:1291\n884#1:1292\n891#1:1293,3\n892#1:1296,3\n893#1:1299\n894#1:1300\n894#1:1301\n898#1:1302\n901#1:1303\n910#1:1304\n910#1:1305\n916#1:1306\n916#1:1307\n917#1:1310,6\n931#1:1321,3\n932#1:1324\n934#1:1325\n985#1:1326\n985#1:1327\n987#1:1328,3\n988#1:1331\n990#1:1332\n990#1:1335,6\n1003#1:1346,6\n1009#1:1352,6\n662#1:1092,2\n793#1:1209,2\n672#1:1094,2\n813#1:1213,2\n682#1:1096,2\n803#1:1211,2\n692#1:1098,4\n692#1:1102,7\n692#1:1110,3\n692#1:1114,2\n692#1:1116,2\n692#1:1118,6\n692#1:1124\n714#1:1131\n714#1:1135\n714#1:1137,2\n714#1:1140,3\n714#1:1146\n714#1:1150\n714#1:1152\n714#1:1155,4\n714#1:1160\n714#1:1162,8\n727#1:1170\n727#1:1174\n727#1:1176,2\n727#1:1179,3\n727#1:1185\n727#1:1189\n727#1:1191\n727#1:1194,4\n727#1:1199\n727#1:1201,8\n823#1:1215,4\n823#1:1219,7\n823#1:1227,3\n823#1:1231,2\n823#1:1233,2\n823#1:1235,6\n823#1:1241\n843#1:1248,7\n843#1:1256,3\n843#1:1260,9\n702#1:1125,6\n833#1:1242,6\n*E\n"})
public final class MutableScatterSet extends ScatterSet {
    public int a;

    public MutableScatterSet() {
        this(0, 1, null);
    }

    public MutableScatterSet(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.c(ScatterMapKt.unloadedCapacity(v));
    }

    public MutableScatterSet(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    public final int a(Object object0) {
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
                if(Intrinsics.areEqual(this.elements[v9], object0)) {
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
                arr_v[v14 >> 3] = ~(0xFFL << v15) & arr_v[v14 >> 3] | ((long)(v1 & 0x7F)) << v15;
                return v10;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean add(Object object0) {
        this.elements[this.a(object0)] = object0;
        return false;
    }

    public final boolean addAll(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        this.plusAssign(objectList0);
        return false;
    }

    public final boolean addAll(@NotNull ScatterSet scatterSet0) {
        Intrinsics.checkNotNullParameter(scatterSet0, "elements");
        this.plusAssign(scatterSet0);
        return false;
    }

    public final boolean addAll(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        this.plusAssign(iterable0);
        return false;
    }

    public final boolean addAll(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        this.plusAssign(sequence0);
        return false;
    }

    public final boolean addAll(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        this.plusAssign(arr_object);
        return false;
    }

    @NotNull
    public final Set asMutableSet() {
        return new b(this);
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
        this.elements = new Object[v1];
    }

    public final void clear() {
        this._size = 0;
        long[] arr_v = this.metadata;
        if(arr_v != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this._capacity >> 3;
            this.metadata[v] |= 0xFFL << ((this._capacity & 7) << 3);
        }
        ArraysKt___ArraysJvmKt.fill(this.elements, null, 0, this._capacity);
        this.a = ScatterMapKt.loadedCapacity(this.getCapacity()) - this._size;
    }

    public final void d(int v) {
        int v7;
        long[] arr_v = this.metadata;
        Object[] arr_object = this.elements;
        int v1 = this._capacity;
        this.c(v);
        Object[] arr_object1 = this.elements;
        for(int v2 = 0; v2 < v1; v2 = v7 + 1) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                Object object0 = arr_object[v2];
                int v3 = object0 == null ? 0 : object0.hashCode();
                int v4 = v3 * 0xCC9E2D51 ^ v3 * 0xCC9E2D51 << 16;
                int v5 = this.b(v4 >>> 7);
                long[] arr_v1 = this.metadata;
                int v6 = (v5 & 7) << 3;
                v7 = v2;
                arr_v1[v5 >> 3] = arr_v1[v5 >> 3] & ~(0xFFL << v6) | ((long)(v4 & 0x7F)) << v6;
                int v8 = (v5 - 7 & this._capacity) + (this._capacity & 7);
                int v9 = (v8 & 7) << 3;
                arr_v1[v8 >> 3] = ~(0xFFL << v9) & arr_v1[v8 >> 3] | ((long)(v4 & 0x7F)) << v9;
                arr_object1[v5] = object0;
            }
            else {
                v7 = v2;
            }
        }
    }

    public final void minusAssign(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        Object[] arr_object = objectList0.content;
        int v = objectList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            this.minusAssign(arr_object[v1]);
        }
    }

    public final void minusAssign(@NotNull ScatterSet scatterSet0) {
        Intrinsics.checkNotNullParameter(scatterSet0, "elements");
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
                            this.minusAssign(arr_object[(v1 << 3) + v4]);
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
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        for(Object object0: iterable0) {
            this.minusAssign(object0);
        }
    }

    public final void minusAssign(Object object0) {
        int v11;
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        int v4 = v2 >>> 7;
        while(true) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.metadata[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L;
            while(v9 != 0L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(Intrinsics.areEqual(this.elements[v10], object0)) {
                    v11 = v10;
                    goto label_19;
                }
                v9 &= v9 - 1L;
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) == 0L) {
                goto label_22;
            }
            else {
                v11 = -1;
            }
        label_19:
            if(v11 >= 0) {
                this.removeElementAt(v11);
            }
            return;
        label_22:
            v += 8;
            v4 = v5 + v;
        }
    }

    public final void minusAssign(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        for(Object object0: sequence0) {
            this.minusAssign(object0);
        }
    }

    public final void minusAssign(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        for(int v = 0; v < arr_object.length; ++v) {
            this.minusAssign(arr_object[v]);
        }
    }

    public final void plusAssign(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        Object[] arr_object = objectList0.content;
        int v = objectList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            this.plusAssign(arr_object[v1]);
        }
    }

    public final void plusAssign(@NotNull ScatterSet scatterSet0) {
        Intrinsics.checkNotNullParameter(scatterSet0, "elements");
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
                            this.plusAssign(arr_object[(v1 << 3) + v4]);
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

    public final void plusAssign(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        for(Object object0: iterable0) {
            this.plusAssign(object0);
        }
    }

    public final void plusAssign(Object object0) {
        this.elements[this.a(object0)] = object0;
    }

    public final void plusAssign(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        for(Object object0: sequence0) {
            this.plusAssign(object0);
        }
    }

    public final void plusAssign(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        for(int v = 0; v < arr_object.length; ++v) {
            this.plusAssign(arr_object[v]);
        }
    }

    public final boolean remove(Object object0) {
        int v10;
        boolean z = false;
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
                if(Intrinsics.areEqual(this.elements[v9], object0)) {
                    v10 = v9;
                    goto label_19;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_23;
            }
            else {
                v10 = -1;
            }
        label_19:
            if(v10 >= 0) {
                z = true;
                this.removeElementAt(v10);
            }
            return z;
        label_23:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean removeAll(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        this.minusAssign(objectList0);
        return false;
    }

    public final boolean removeAll(@NotNull ScatterSet scatterSet0) {
        Intrinsics.checkNotNullParameter(scatterSet0, "elements");
        this.minusAssign(scatterSet0);
        return false;
    }

    public final boolean removeAll(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        this.minusAssign(iterable0);
        return false;
    }

    public final boolean removeAll(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        this.minusAssign(sequence0);
        return false;
    }

    public final boolean removeAll(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        this.minusAssign(arr_object);
        return false;
    }

    @PublishedApi
    public final void removeElementAt(int v) {
        --this._size;
        long[] arr_v = this.metadata;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this._capacity) + (this._capacity & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
        this.elements[v] = null;
    }

    public final void removeIf(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.elements;
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
                            if(((Boolean)function10.invoke(arr_object[v5])).booleanValue()) {
                                this.removeElementAt(v5);
                            }
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

    @IntRange(from = 0L)
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

