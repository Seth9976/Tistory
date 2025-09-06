package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.text.q;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001EJ\r\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0007\u0010\u0005J\r\u0010\b\u001A\u00020\u0003\u00A2\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\t\u001A\u00028\u0000H\u0086\b\u00A2\u0006\u0004\b\t\u0010\nJA\u0010\t\u001A\u00028\u00002!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00030\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\t\u0010\u0010JC\u0010\u0011\u001A\u0004\u0018\u00018\u00002!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00030\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0010JA\u0010\u0016\u001A\u00020\u00142!\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000BH\u0081\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0018\u001A\u00020\u00142!\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00140\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0017JA\u0010\u0019\u001A\u00020\u00032!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00030\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJA\u0010\u0004\u001A\u00020\u00032!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00030\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0004\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0012H\u0007\u00A2\u0006\u0004\b\u001B\u0010\u001CJA\u0010\u001B\u001A\u00020\u00122!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00030\u000BH\u0087\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001DJ\u0018\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u001E\u0010\u001FJY\u0010(\u001A\u00020\'2\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\"\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020 2\b\b\u0002\u0010$\u001A\u00020\u00122\b\b\u0002\u0010%\u001A\u00020 2\u0016\b\u0002\u0010&\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 \u0018\u00010\u000BH\u0007\u00A2\u0006\u0004\b(\u0010)J\u000F\u0010*\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b*\u0010\u001CJ\u001A\u0010,\u001A\u00020\u00032\b\u0010+\u001A\u0004\u0018\u00010\u0002H\u0096\u0002\u00A2\u0006\u0004\b,\u0010\u001FJ\u000F\u0010-\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0018\u00101\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b/\u00100J\u0013\u00103\u001A\b\u0012\u0004\u0012\u00028\u000002\u00A2\u0006\u0004\b3\u00104R\u001C\u00106\u001A\u0002058\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u00109R$\u0010;\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020:8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\b;\u0010<\u0012\u0004\b=\u00109R\u0016\u0010>\u001A\u00020\u00128\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001A\u00020\u00128\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0006\n\u0004\b@\u0010?R\u0011\u0010B\u001A\u00020\u00128G\u00A2\u0006\u0006\u001A\u0004\bA\u0010\u001CR\u0011\u0010D\u001A\u00020\u00128G\u00A2\u0006\u0006\u001A\u0004\bC\u0010\u001C\u0082\u0001\u0001F\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006G"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", "first", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "", "index", "", "block", "forEachIndex", "(Lkotlin/jvm/functions/Function1;)V", "forEach", "all", "(Lkotlin/jvm/functions/Function1;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "contains", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "findElementIndex$collection", "(Ljava/lang/Object;)I", "findElementIndex", "", "asSet", "()Ljava/util/Set;", "", "metadata", "[J", "getMetadata$annotations", "()V", "", "elements", "[Ljava/lang/Object;", "getElements$annotations", "_capacity", "I", "_size", "getCapacity", "capacity", "getSize", "size", "SetWrapper", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#1,4:1085\n237#1,7:1089\n248#1,3:1097\n251#1,2:1101\n272#1,2:1103\n254#1,6:1105\n274#1:1111\n267#1,4:1112\n237#1,7:1116\n248#1,3:1124\n251#1,2:1128\n272#1,2:1130\n254#1,6:1132\n274#1:1138\n267#1,4:1139\n237#1,7:1143\n248#1,3:1151\n251#1,2:1155\n272#1,2:1157\n254#1,6:1159\n274#1:1165\n237#1,7:1168\n248#1,3:1176\n251#1,9:1180\n267#1,4:1189\n237#1,7:1193\n248#1,3:1201\n251#1,2:1205\n272#1,2:1207\n254#1,6:1209\n274#1:1215\n267#1,4:1216\n237#1,7:1220\n248#1,3:1228\n251#1,2:1232\n272#1,2:1234\n254#1,6:1236\n274#1:1242\n267#1,4:1243\n237#1,7:1247\n248#1,3:1255\n251#1,2:1259\n272#1,2:1261\n254#1,6:1263\n274#1:1269\n433#1:1270\n434#1:1274\n436#1,2:1276\n438#1,3:1279\n441#1:1285\n442#1:1289\n443#1:1291\n444#1,4:1294\n450#1:1299\n451#1,8:1301\n267#1,4:1309\n237#1,7:1313\n248#1,3:1321\n251#1,2:1325\n272#1,2:1327\n254#1,6:1329\n274#1:1335\n267#1,4:1336\n237#1,7:1340\n248#1,3:1348\n251#1,2:1352\n272#1,2:1354\n254#1,6:1356\n274#1:1362\n267#1,4:1363\n237#1,7:1367\n248#1,3:1375\n251#1,2:1379\n272#1,2:1381\n254#1,6:1383\n274#1:1389\n1810#2:1096\n1672#2:1100\n1810#2:1123\n1672#2:1127\n1810#2:1150\n1672#2:1154\n1810#2:1166\n1672#2:1167\n1810#2:1175\n1672#2:1179\n1810#2:1200\n1672#2:1204\n1810#2:1227\n1672#2:1231\n1810#2:1254\n1672#2:1258\n1589#2,3:1271\n1603#2:1275\n1599#2:1278\n1779#2,3:1282\n1793#2,3:1286\n1717#2:1290\n1705#2:1292\n1699#2:1293\n1712#2:1298\n1802#2:1300\n1810#2:1320\n1672#2:1324\n1810#2:1347\n1672#2:1351\n1810#2:1374\n1672#2:1378\n1589#2,3:1390\n1603#2:1393\n1599#2:1394\n1779#2,3:1395\n1793#2,3:1398\n1717#2:1401\n1705#2:1402\n1699#2:1403\n1712#2:1404\n1802#2:1405\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n201#1:1085,4\n201#1:1089,7\n201#1:1097,3\n201#1:1101,2\n201#1:1103,2\n201#1:1105,6\n201#1:1111\n214#1:1112,4\n214#1:1116,7\n214#1:1124,3\n214#1:1128,2\n214#1:1130,2\n214#1:1132,6\n214#1:1138\n227#1:1139,4\n227#1:1143,7\n227#1:1151,3\n227#1:1155,2\n227#1:1157,2\n227#1:1159,6\n227#1:1165\n270#1:1168,7\n270#1:1176,3\n270#1:1180,9\n284#1:1189,4\n284#1:1193,7\n284#1:1201,3\n284#1:1205,2\n284#1:1207,2\n284#1:1209,6\n284#1:1215\n297#1:1216,4\n297#1:1220,7\n297#1:1228,3\n297#1:1232,2\n297#1:1234,2\n297#1:1236,6\n297#1:1242\n318#1:1243,4\n318#1:1247,7\n318#1:1255,3\n318#1:1259,2\n318#1:1261,2\n318#1:1263,6\n318#1:1269\n329#1:1270\n329#1:1274\n329#1:1276,2\n329#1:1279,3\n329#1:1285\n329#1:1289\n329#1:1291\n329#1:1294,4\n329#1:1299\n329#1:1301,8\n352#1:1309,4\n352#1:1313,7\n352#1:1321,3\n352#1:1325,2\n352#1:1327,2\n352#1:1329,6\n352#1:1335\n378#1:1336,4\n378#1:1340,7\n378#1:1348,3\n378#1:1352,2\n378#1:1354,2\n378#1:1356,6\n378#1:1362\n407#1:1363,4\n407#1:1367,7\n407#1:1375,3\n407#1:1379,2\n407#1:1381,2\n407#1:1383,6\n407#1:1389\n201#1:1096\n201#1:1100\n214#1:1123\n214#1:1127\n227#1:1150\n227#1:1154\n243#1:1166\n250#1:1167\n270#1:1175\n270#1:1179\n284#1:1200\n284#1:1204\n297#1:1227\n297#1:1231\n318#1:1254\n318#1:1258\n329#1:1271,3\n329#1:1275\n329#1:1278\n329#1:1282,3\n329#1:1286,3\n329#1:1290\n329#1:1292\n329#1:1293\n329#1:1298\n329#1:1300\n352#1:1320\n352#1:1324\n378#1:1347\n378#1:1351\n407#1:1374\n407#1:1378\n433#1:1390,3\n434#1:1393\n437#1:1394\n440#1:1395,3\n441#1:1398,3\n442#1:1401\n443#1:1402\n443#1:1403\n447#1:1404\n450#1:1405\n*E\n"})
public abstract class ScatterSet {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0090\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\u0016\u0010\u000B\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\b\u0010\u000E\u001A\u00020\bH\u0016J\u000F\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/collection/ScatterSet$SetWrapper;", "", "(Landroidx/collection/ScatterSet;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1084:1\n1855#2,2:1085\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n478#1:1085,2\n*E\n"})
    public class SetWrapper implements Set, KMappedMarker {
        public final ScatterSet a;

        @Override
        public boolean add(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean addAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean contains(Object object0) {
            return ScatterSet.this.contains(object0);
        }

        @Override
        public boolean containsAll(@NotNull Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            for(Object object0: collection0) {
                if(!ScatterSet.this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        public int getSize() {
            return ScatterSet.this._size;
        }

        @Override
        public boolean isEmpty() {
            return ScatterSet.this.isEmpty();
        }

        @Override
        @NotNull
        public Iterator iterator() {
            return SequencesKt__SequenceBuilderKt.iterator(new f(ScatterSet.this, null));
        }

        @Override
        public boolean remove(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean removeAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean retainAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public final int size() {
            return this.getSize();
        }

        @Override
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "array");
            return CollectionToArray.toArray(this, arr_object);
        }
    }

    @JvmField
    public int _capacity;
    @JvmField
    public int _size;
    @JvmField
    @NotNull
    public Object[] elements;
    @JvmField
    @NotNull
    public long[] metadata;

    public ScatterSet(DefaultConstructorMarker defaultConstructorMarker0) {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final boolean all(@NotNull Function1 function10) {
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
                        if((0xFFL & v2) < 0x80L && !((Boolean)function10.invoke(arr_object[(v1 << 3) + v4])).booleanValue()) {
                            return false;
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
        return true;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean any(@NotNull Function1 function10) {
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
                        if((0xFFL & v2) < 0x80L && ((Boolean)function10.invoke(arr_object[(v1 << 3) + v4])).booleanValue()) {
                            return true;
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
        return false;
    }

    @NotNull
    public final Set asSet() {
        return new SetWrapper(this);
    }

    public final boolean contains(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
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
                if(Intrinsics.areEqual(this.elements[v9], object0)) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    @IntRange(from = 0L)
    public final int count() {
        return this.getSize();
    }

    @IntRange(from = 0L)
    public final int count(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.elements;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L && ((Boolean)function10.invoke(arr_object[(v1 << 3) + v5])).booleanValue()) {
                            ++v2;
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ScatterSet)) {
            return false;
        }
        if(((ScatterSet)object0).getSize() != this.getSize()) {
            return false;
        }
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
                        if((0xFFL & v2) < 0x80L && !((ScatterSet)object0).contains(arr_object[(v1 << 3) + v4])) {
                            return false;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final int findElementIndex$collection(Object object0) {
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
                if(Intrinsics.areEqual(this.elements[v10], object0)) {
                    return v10;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v += 8;
        }
    }

    public final Object first() {
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
                            return arr_object[(v1 << 3) + v4];
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_16;
                    }
                    break;
                }
            label_16:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    public final Object first(@NotNull Function1 function10) {
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
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                                return object0;
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
        throw new NoSuchElementException("Could not find a match");
    }

    @Nullable
    public final Object firstOrNull(@NotNull Function1 function10) {
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
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                                return object0;
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
        return null;
    }

    public final void forEach(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
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
                            function10.invoke(arr_object[(v1 << 3) + v4]);
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

    @PublishedApi
    public final void forEachIndex(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            q.w(v1 << 3, v4, function10);
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    @IntRange(from = 0L)
    public final int getCapacity() {
        return this._capacity;
    }

    @PublishedApi
    public static void getElements$annotations() {
    }

    @PublishedApi
    public static void getMetadata$annotations() {
    }

    @IntRange(from = 0L)
    public final int getSize() {
        return this._size;
    }

    @Override
    public int hashCode() {
        Object[] arr_object = this.elements;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            Object object0 = arr_object[(v1 << 3) + v5];
                            v2 += (object0 == null ? 0 : object0.hashCode());
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return ScatterSet.joinToString$default(this, null, null, null, 0, null, null, 0x3F, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        return ScatterSet.joinToString$default(this, charSequence0, null, null, 0, null, null, 62, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return ScatterSet.joinToString$default(this, charSequence0, charSequence1, null, 0, null, null, 60, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return ScatterSet.joinToString$default(this, charSequence0, charSequence1, charSequence2, 0, null, null, 56, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return ScatterSet.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, null, null, 0x30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        return ScatterSet.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, charSequence3, null, 0x20, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.r(charSequence2, "postfix", charSequence3, "truncated", charSequence1);
        Object[] arr_object = this.elements;
        long[] arr_v = this.metadata;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        Object object0 = arr_object[(v2 << 3) + v6];
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_38;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        if(function10 == null) {
                            stringBuilder0.append(object0);
                        }
                        else {
                            stringBuilder0.append(((CharSequence)function10.invoke(object0)));
                        }
                        ++v3;
                    }
                    v4 >>= 8;
                    ++v6;
                }
                if(v5 == 8) {
                label_32:
                    if(v2 != v1) {
                        ++v2;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_38;
            }
        }
        stringBuilder0.append(charSequence2);
    label_38:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String joinToString$default(ScatterSet scatterSet0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 8) != 0) {
            v = -1;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return scatterSet0.joinToString(charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public final boolean none() {
        return this._size == 0;
    }

    @Override
    @NotNull
    public String toString() {
        return ScatterSet.joinToString$default(this, null, "[", "]", 0, null, new b0(this, 24), 25, null);
    }
}

