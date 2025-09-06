package androidx.collection;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0019\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001A!\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0006\u001A)\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\b\u001A1\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\n\u001A-\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\f\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000B\"\u00028\u0000¢\u0006\u0004\b\u0004\u0010\r\u001A\u001C\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u0000H\u0086\b¢\u0006\u0004\b\u000F\u0010\u0010\u001A!\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0011\u001A)\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0012\u001A1\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0013\u001A0\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00002\u0012\u0010\f\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000B\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000F\u0010\u0014¨\u0006\u0015"}, d2 = {"E", "Landroidx/collection/ObjectList;", "emptyObjectList", "()Landroidx/collection/ObjectList;", "objectListOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "", "elements", "([Ljava/lang/Object;)Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "mutableObjectListOf", "()Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "([Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
public final class ObjectListKt {
    public static final Object[] a;
    public static final MutableObjectList b;

    static {
        ObjectListKt.a = new Object[0];
        ObjectListKt.b = new MutableObjectList(0);
    }

    public static final void access$checkIndex(List list0, int v) {
        int v1 = list0.size();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("Index " + v + " is out of bounds. The list has " + v1 + " elements.");
        }
    }

    public static final void access$checkSubIndex(List list0, int v, int v1) {
        int v2 = list0.size();
        if(v > v1) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + v + ") is greater than toIndex (" + v1 + ").");
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + v + ") is less than 0.");
        }
        if(v1 > v2) {
            throw new IndexOutOfBoundsException("toIndex (" + v1 + ") is more than than the list size (" + v2 + ')');
        }
    }

    @NotNull
    public static final ObjectList emptyObjectList() {
        Intrinsics.checkNotNull(ObjectListKt.b, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return ObjectListKt.b;
    }

    @NotNull
    public static final MutableObjectList mutableObjectListOf() {
        return new MutableObjectList(0, 1, null);
    }

    @NotNull
    public static final MutableObjectList mutableObjectListOf(Object object0) {
        MutableObjectList mutableObjectList0 = new MutableObjectList(1);
        mutableObjectList0.add(object0);
        return mutableObjectList0;
    }

    @NotNull
    public static final MutableObjectList mutableObjectListOf(Object object0, Object object1) {
        MutableObjectList mutableObjectList0 = new MutableObjectList(2);
        mutableObjectList0.add(object0);
        mutableObjectList0.add(object1);
        return mutableObjectList0;
    }

    @NotNull
    public static final MutableObjectList mutableObjectListOf(Object object0, Object object1, Object object2) {
        MutableObjectList mutableObjectList0 = new MutableObjectList(3);
        mutableObjectList0.add(object0);
        mutableObjectList0.add(object1);
        mutableObjectList0.add(object2);
        return mutableObjectList0;
    }

    @NotNull
    public static final MutableObjectList mutableObjectListOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        MutableObjectList mutableObjectList0 = new MutableObjectList(arr_object.length);
        mutableObjectList0.plusAssign(arr_object);
        return mutableObjectList0;
    }

    @NotNull
    public static final ObjectList objectListOf() {
        Intrinsics.checkNotNull(ObjectListKt.b, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return ObjectListKt.b;
    }

    @NotNull
    public static final ObjectList objectListOf(Object object0) {
        return ObjectListKt.mutableObjectListOf(object0);
    }

    @NotNull
    public static final ObjectList objectListOf(Object object0, Object object1) {
        return ObjectListKt.mutableObjectListOf(object0, object1);
    }

    @NotNull
    public static final ObjectList objectListOf(Object object0, Object object1, Object object2) {
        return ObjectListKt.mutableObjectListOf(object0, object1, object2);
    }

    @NotNull
    public static final ObjectList objectListOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        ObjectList objectList0 = new MutableObjectList(arr_object.length);
        ((MutableObjectList)objectList0).plusAssign(arr_object);
        return objectList0;
    }
}

