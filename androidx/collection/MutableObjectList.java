package androidx.collection;

import a1.a;
import a5.b;
import androidx.annotation.IntRange;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003FGHB\u0011\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\t\u0010\nJ\u001F\u0010\t\u001A\u00020\f2\b\b\u0001\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\t\u0010\rJ%\u0010\u0010\u001A\u00020\b2\b\b\u0001\u0010\u000B\u001A\u00020\u00032\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0010\u001A\u00020\b2\b\b\u0001\u0010\u000B\u001A\u00020\u00032\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012\u00A2\u0006\u0004\b\u0010\u0010\u0013J%\u0010\u0010\u001A\u00020\b2\b\b\u0001\u0010\u000B\u001A\u00020\u00032\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0014J\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0015J\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0017J\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0018J\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\u00A2\u0006\u0004\b\u0010\u0010\u001AJ\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001B\u00A2\u0006\u0004\b\u0010\u0010\u001CJ\u001B\u0010\u0010\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001D\u00A2\u0006\u0004\b\u0010\u0010\u001EJ\u001E\u0010\u001F\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\u001E\u0010\u001F\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010!J\u001E\u0010\u001F\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010\"J\u001E\u0010\u001F\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010#J\u001E\u0010\u001F\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001BH\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010$J\u001E\u0010\u001F\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001DH\u0086\u0002\u00A2\u0006\u0004\b\u001F\u0010%J\r\u0010&\u001A\u00020\f\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010)\u001A\u00020\f2\b\b\u0002\u0010(\u001A\u00020\u0003\u00A2\u0006\u0004\b)\u0010\u0006J\u0015\u0010+\u001A\u00020\f2\u0006\u0010*\u001A\u00020\u0003\u00A2\u0006\u0004\b+\u0010\u0006J\u0018\u0010\u001F\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0004\b\u001F\u0010,J\u0018\u0010-\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0004\b-\u0010,J\u0015\u0010.\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b.\u0010\nJ6\u00103\u001A\u00020\f2!\u00102\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0/H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104J\u001B\u00105\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\u00A2\u0006\u0004\b5\u0010\u0018J\u001B\u00105\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b5\u0010\u0015J\u001B\u00105\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\u00A2\u0006\u0004\b5\u0010\u0017J\u001B\u00105\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\u00A2\u0006\u0004\b5\u0010\u001AJ\u001B\u00105\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001B\u00A2\u0006\u0004\b5\u0010\u001CJ\u001B\u00105\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001D\u00A2\u0006\u0004\b5\u0010\u001EJ\u001E\u0010-\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0086\u0002\u00A2\u0006\u0004\b-\u0010\"J\u001E\u0010-\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002\u00A2\u0006\u0004\b-\u0010 J\u001E\u0010-\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\u0002\u00A2\u0006\u0004\b-\u0010!J\u001E\u0010-\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002\u00A2\u0006\u0004\b-\u0010#J\u001E\u0010-\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001BH\u0086\u0002\u00A2\u0006\u0004\b-\u0010$J\u001E\u0010-\u001A\u00020\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001DH\u0086\u0002\u00A2\u0006\u0004\b-\u0010%J\u0017\u00106\u001A\u00028\u00002\b\b\u0001\u0010\u000B\u001A\u00020\u0003\u00A2\u0006\u0004\b6\u00107J!\u0010:\u001A\u00020\f2\b\b\u0001\u00108\u001A\u00020\u00032\b\b\u0001\u00109\u001A\u00020\u0003\u00A2\u0006\u0004\b:\u0010;J\u001B\u0010<\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\u00A2\u0006\u0004\b<\u0010\u0018J\u001B\u0010<\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u00A2\u0006\u0004\b<\u0010\u0015J\u001B\u0010<\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012\u00A2\u0006\u0004\b<\u0010=J\u001B\u0010<\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001B\u00A2\u0006\u0004\b<\u0010\u001CJ\u001B\u0010<\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001D\u00A2\u0006\u0004\b<\u0010\u001EJ\"\u0010>\u001A\u00028\u00002\b\b\u0001\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b>\u0010?J\u0015\u0010@\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016\u00A2\u0006\u0004\b@\u0010AJ\u0013\u0010C\u001A\b\u0012\u0004\u0012\u00028\u00000B\u00A2\u0006\u0004\bC\u0010AR\u0012\u0010*\u001A\u00020\u00038\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006I"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "", "initialCapacity", "<init>", "(I)V", "element", "", "add", "(Ljava/lang/Object;)Z", "index", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(I[Ljava/lang/Object;)Z", "", "(ILjava/util/Collection;)Z", "(ILandroidx/collection/ObjectList;)Z", "(Landroidx/collection/ObjectList;)Z", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)Z", "([Ljava/lang/Object;)Z", "", "(Ljava/util/List;)Z", "", "(Ljava/lang/Iterable;)Z", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Z", "plusAssign", "(Landroidx/collection/ObjectList;)V", "(Landroidx/collection/ScatterSet;)V", "([Ljava/lang/Object;)V", "(Ljava/util/List;)V", "(Ljava/lang/Iterable;)V", "(Lkotlin/sequences/Sequence;)V", "clear", "()V", "minCapacity", "trim", "capacity", "ensureCapacity", "(Ljava/lang/Object;)V", "minusAssign", "remove", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "start", "end", "removeRange", "(II)V", "retainAll", "(Ljava/util/Collection;)Z", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "asList", "()Ljava/util/List;", "", "asMutableList", "getCapacity", "()I", "a1/c", "a1/a", "a1/b", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1810#4:1633\n1672#4:1637\n1810#4:1683\n1672#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
public final class MutableObjectList extends ObjectList {
    public a a;

    public MutableObjectList() {
        this(0, 1, null);
    }

    public MutableObjectList(int v) {
        super(v, null);
    }

    public MutableObjectList(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        this(v);
    }

    public final void add(@IntRange(from = 0L) int v, Object object0) {
        if(v >= 0) {
            int v1 = this._size;
            if(v <= v1) {
                this.ensureCapacity(v1 + 1);
                Object[] arr_object = this.content;
                int v2 = this._size;
                if(v != v2) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v + 1, v, v2);
                }
                arr_object[v] = object0;
                ++this._size;
                return;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean add(Object object0) {
        this.ensureCapacity(this._size + 1);
        int v = this._size;
        this.content[v] = object0;
        this._size = v + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0L) int v, @NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        if(v >= 0 && v <= this._size) {
            if(objectList0.isEmpty()) {
                return false;
            }
            this.ensureCapacity(this._size + objectList0._size);
            Object[] arr_object = this.content;
            int v1 = this._size;
            if(v != v1) {
                ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, objectList0._size + v, v, v1);
            }
            ArraysKt___ArraysJvmKt.copyInto(objectList0.content, arr_object, v, 0, objectList0._size);
            this._size += objectList0._size;
            return true;
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean addAll(@IntRange(from = 0L) int v, @NotNull Collection collection0) {
        int v1 = 0;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(v >= 0 && v <= this._size) {
            if(collection0.isEmpty()) {
                return false;
            }
            this.ensureCapacity(collection0.size() + this._size);
            Object[] arr_object = this.content;
            if(v != this._size) {
                ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, collection0.size() + v, v, this._size);
            }
            for(Object object0: collection0) {
                if(v1 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arr_object[v1 + v] = object0;
                ++v1;
            }
            this._size = collection0.size() + this._size;
            return true;
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean addAll(@IntRange(from = 0L) int v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        if(v >= 0) {
            int v1 = this._size;
            if(v <= v1) {
                if(arr_object.length == 0) {
                    return false;
                }
                this.ensureCapacity(v1 + arr_object.length);
                Object[] arr_object1 = this.content;
                int v2 = this._size;
                if(v != v2) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_object1, arr_object1, arr_object.length + v, v, v2);
                }
                ArraysKt___ArraysJvmKt.copyInto$default(arr_object, arr_object1, v, 0, 0, 12, null);
                this._size += arr_object.length;
                return true;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean addAll(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        int v = this._size;
        this.plusAssign(objectList0);
        return v != this._size;
    }

    public final boolean addAll(@NotNull ScatterSet scatterSet0) {
        Intrinsics.checkNotNullParameter(scatterSet0, "elements");
        int v = this._size;
        this.plusAssign(scatterSet0);
        return v != this._size;
    }

    public final boolean addAll(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        int v = this._size;
        this.plusAssign(iterable0);
        return v != this._size;
    }

    public final boolean addAll(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        int v = this._size;
        this.plusAssign(list0);
        return v != this._size;
    }

    public final boolean addAll(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        int v = this._size;
        this.plusAssign(sequence0);
        return v != this._size;
    }

    public final boolean addAll(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        int v = this._size;
        this.plusAssign(arr_object);
        return v != this._size;
    }

    @Override  // androidx.collection.ObjectList
    @NotNull
    public List asList() {
        return this.asMutableList();
    }

    @NotNull
    public final List asMutableList() {
        a a0 = this.a;
        if(a0 == null) {
            a0 = new a(this);
            this.a = a0;
        }
        return a0;
    }

    public final void clear() {
        ArraysKt___ArraysJvmKt.fill(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int v) {
        Object[] arr_object = this.content;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, Math.max(v, arr_object.length * 3 / 2));
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            this.content = arr_object1;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        Object[] arr_object = objectList0.content;
        int v = objectList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            this.remove(arr_object[v1]);
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
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        for(Object object0: iterable0) {
            this.remove(object0);
        }
    }

    public final void minusAssign(Object object0) {
        this.remove(object0);
    }

    public final void minusAssign(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.remove(list0.get(v1));
        }
    }

    public final void minusAssign(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        for(Object object0: sequence0) {
            this.remove(object0);
        }
    }

    public final void minusAssign(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        for(int v = 0; v < arr_object.length; ++v) {
            this.remove(arr_object[v]);
        }
    }

    public final void plusAssign(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        if(objectList0.isEmpty()) {
            return;
        }
        this.ensureCapacity(this._size + objectList0._size);
        ArraysKt___ArraysJvmKt.copyInto(objectList0.content, this.content, this._size, 0, objectList0._size);
        this._size += objectList0._size;
    }

    public final void plusAssign(@NotNull ScatterSet scatterSet0) {
        Intrinsics.checkNotNullParameter(scatterSet0, "elements");
        if(scatterSet0.isEmpty()) {
            return;
        }
        this.ensureCapacity(scatterSet0.getSize() + this._size);
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
                            this.add(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_20;
                    }
                    break;
                }
            label_20:
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
            this.add(object0);
        }
    }

    public final void plusAssign(Object object0) {
        this.add(object0);
    }

    public final void plusAssign(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        if(list0.isEmpty()) {
            return;
        }
        int v = this._size;
        this.ensureCapacity(list0.size() + v);
        Object[] arr_object = this.content;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2 + v] = list0.get(v2);
        }
        this._size = list0.size() + this._size;
    }

    public final void plusAssign(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        for(Object object0: sequence0) {
            this.add(object0);
        }
    }

    public final void plusAssign(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        if(arr_object.length == 0) {
            return;
        }
        this.ensureCapacity(this._size + arr_object.length);
        ArraysKt___ArraysJvmKt.copyInto$default(arr_object, this.content, this._size, 0, 0, 12, null);
        this._size += arr_object.length;
    }

    public final boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.removeAt(v);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        int v = this._size;
        this.minusAssign(objectList0);
        return v != this._size;
    }

    public final boolean removeAll(@NotNull ScatterSet scatterSet0) {
        Intrinsics.checkNotNullParameter(scatterSet0, "elements");
        int v = this._size;
        this.minusAssign(scatterSet0);
        return v != this._size;
    }

    public final boolean removeAll(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        int v = this._size;
        this.minusAssign(iterable0);
        return v != this._size;
    }

    public final boolean removeAll(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        int v = this._size;
        this.minusAssign(list0);
        return v != this._size;
    }

    public final boolean removeAll(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        int v = this._size;
        this.minusAssign(sequence0);
        return v != this._size;
    }

    public final boolean removeAll(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        int v = this._size;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            this.remove(arr_object[v1]);
        }
        return v != this._size;
    }

    public final Object removeAt(@IntRange(from = 0L) int v) {
        if(v >= 0) {
            int v1 = this._size;
            if(v < v1) {
                Object[] arr_object = this.content;
                Object object0 = arr_object[v];
                if(v != v1 - 1) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v, v + 1, v1);
                }
                int v2 = this._size - 1;
                this._size = v2;
                arr_object[v2] = null;
                return object0;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final void removeIf(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this._size;
        Object[] arr_object = this.content;
        int v1 = 0;
        kotlin.ranges.IntRange intRange0 = c.until(0, v);
        int v2 = intRange0.getFirst();
        int v3 = intRange0.getLast();
        if(v2 <= v3) {
            while(true) {
                arr_object[v2 - v1] = arr_object[v2];
                if(((Boolean)function10.invoke(arr_object[v2])).booleanValue()) {
                    ++v1;
                }
                if(v2 == v3) {
                    break;
                }
                ++v2;
            }
        }
        ArraysKt___ArraysJvmKt.fill(arr_object, null, v - v1, v);
        this._size -= v1;
    }

    public final void removeRange(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        if(v >= 0) {
            int v2 = this._size;
            if(v <= v2 && v1 >= 0 && v1 <= v2) {
                if(v1 < v) {
                    throw new IllegalArgumentException("Start (" + v + ") is more than end (" + v1 + ')');
                }
                if(v1 != v) {
                    if(v1 < v2) {
                        ArraysKt___ArraysJvmKt.copyInto(this.content, this.content, v, v1, v2);
                    }
                    int v3 = this._size - (v1 - v);
                    ArraysKt___ArraysJvmKt.fill(this.content, null, v3, this._size);
                    this._size = v3;
                }
                return;
            }
        }
        StringBuilder stringBuilder0 = q.u("Start (", v, ") and end (", v1, ") must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean retainAll(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        int v = this._size;
        Object[] arr_object = this.content;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!objectList0.contains(arr_object[v1])) {
                this.removeAt(v1);
            }
        }
        return v != this._size;
    }

    public final boolean retainAll(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        int v = this._size;
        Object[] arr_object = this.content;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!CollectionsKt___CollectionsKt.contains(iterable0, arr_object[v1])) {
                this.removeAt(v1);
            }
        }
        return v != this._size;
    }

    public final boolean retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = this._size;
        Object[] arr_object = this.content;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!collection0.contains(arr_object[v1])) {
                this.removeAt(v1);
            }
        }
        return v != this._size;
    }

    public final boolean retainAll(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        int v = this._size;
        Object[] arr_object = this.content;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!SequencesKt___SequencesKt.contains(sequence0, arr_object[v1])) {
                this.removeAt(v1);
            }
        }
        return v != this._size;
    }

    public final boolean retainAll(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        int v = this._size;
        Object[] arr_object1 = this.content;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(ArraysKt___ArraysKt.indexOf(arr_object, arr_object1[v1]) < 0) {
                this.removeAt(v1);
            }
        }
        return v != this._size;
    }

    public final Object set(@IntRange(from = 0L) int v, Object object0) {
        if(v >= 0 && v < this._size) {
            Object[] arr_object = this.content;
            Object object1 = arr_object[v];
            arr_object[v] = object0;
            return object1;
        }
        StringBuilder stringBuilder0 = b.s(v, "set index ", " must be between 0 .. ");
        stringBuilder0.append(this._size - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final void trim(int v) {
        int v1 = Math.max(v, this._size);
        Object[] arr_object = this.content;
        if(arr_object.length > v1) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, v1);
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            this.content = arr_object1;
        }
    }

    public static void trim$default(MutableObjectList mutableObjectList0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = mutableObjectList0._size;
        }
        mutableObjectList0.trim(v);
    }
}

