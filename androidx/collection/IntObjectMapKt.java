package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0019\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0003\u001A)\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\b\u001A9\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u000B\u001AI\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u000E\u001AY\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0011\u001Ai\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0014\u001A\u0019\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A)\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A9\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001AI\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AY\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001Ai\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"V", "Landroidx/collection/IntObjectMap;", "emptyIntObjectMap", "()Landroidx/collection/IntObjectMap;", "intObjectMapOf", "", "key1", "value1", "(ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key2", "value2", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key3", "value3", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key4", "value4", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key5", "value5", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "Landroidx/collection/MutableIntObjectMap;", "mutableIntObjectMapOf", "()Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class IntObjectMapKt {
    public static final MutableIntObjectMap a;

    static {
        IntObjectMapKt.a = new MutableIntObjectMap(0);
    }

    @NotNull
    public static final IntObjectMap emptyIntObjectMap() {
        Intrinsics.checkNotNull(IntObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return IntObjectMapKt.a;
    }

    @NotNull
    public static final IntObjectMap intObjectMapOf() {
        Intrinsics.checkNotNull(IntObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return IntObjectMapKt.a;
    }

    @NotNull
    public static final IntObjectMap intObjectMapOf(int v, Object object0) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).set(v, object0);
        return intObjectMap0;
    }

    @NotNull
    public static final IntObjectMap intObjectMapOf(int v, Object object0, int v1, Object object1) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).set(v, object0);
        ((MutableIntObjectMap)intObjectMap0).set(v1, object1);
        return intObjectMap0;
    }

    @NotNull
    public static final IntObjectMap intObjectMapOf(int v, Object object0, int v1, Object object1, int v2, Object object2) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).set(v, object0);
        ((MutableIntObjectMap)intObjectMap0).set(v1, object1);
        ((MutableIntObjectMap)intObjectMap0).set(v2, object2);
        return intObjectMap0;
    }

    @NotNull
    public static final IntObjectMap intObjectMapOf(int v, Object object0, int v1, Object object1, int v2, Object object2, int v3, Object object3) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).set(v, object0);
        ((MutableIntObjectMap)intObjectMap0).set(v1, object1);
        ((MutableIntObjectMap)intObjectMap0).set(v2, object2);
        ((MutableIntObjectMap)intObjectMap0).set(v3, object3);
        return intObjectMap0;
    }

    @NotNull
    public static final IntObjectMap intObjectMapOf(int v, Object object0, int v1, Object object1, int v2, Object object2, int v3, Object object3, int v4, Object object4) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).set(v, object0);
        ((MutableIntObjectMap)intObjectMap0).set(v1, object1);
        ((MutableIntObjectMap)intObjectMap0).set(v2, object2);
        ((MutableIntObjectMap)intObjectMap0).set(v3, object3);
        ((MutableIntObjectMap)intObjectMap0).set(v4, object4);
        return intObjectMap0;
    }

    @NotNull
    public static final MutableIntObjectMap mutableIntObjectMapOf() {
        return new MutableIntObjectMap(0, 1, null);
    }

    @NotNull
    public static final MutableIntObjectMap mutableIntObjectMapOf(int v, Object object0) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.set(v, object0);
        return mutableIntObjectMap0;
    }

    @NotNull
    public static final MutableIntObjectMap mutableIntObjectMapOf(int v, Object object0, int v1, Object object1) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.set(v, object0);
        mutableIntObjectMap0.set(v1, object1);
        return mutableIntObjectMap0;
    }

    @NotNull
    public static final MutableIntObjectMap mutableIntObjectMapOf(int v, Object object0, int v1, Object object1, int v2, Object object2) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.set(v, object0);
        mutableIntObjectMap0.set(v1, object1);
        mutableIntObjectMap0.set(v2, object2);
        return mutableIntObjectMap0;
    }

    @NotNull
    public static final MutableIntObjectMap mutableIntObjectMapOf(int v, Object object0, int v1, Object object1, int v2, Object object2, int v3, Object object3) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.set(v, object0);
        mutableIntObjectMap0.set(v1, object1);
        mutableIntObjectMap0.set(v2, object2);
        mutableIntObjectMap0.set(v3, object3);
        return mutableIntObjectMap0;
    }

    @NotNull
    public static final MutableIntObjectMap mutableIntObjectMapOf(int v, Object object0, int v1, Object object1, int v2, Object object2, int v3, Object object3, int v4, Object object4) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.set(v, object0);
        mutableIntObjectMap0.set(v1, object1);
        mutableIntObjectMap0.set(v2, object2);
        mutableIntObjectMap0.set(v3, object3);
        mutableIntObjectMap0.set(v4, object4);
        return mutableIntObjectMap0;
    }
}

