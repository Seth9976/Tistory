package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0019\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0003\u001A)\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\b\u001A9\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u000B\u001AI\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u000E\u001AY\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0011\u001Ai\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0014\u001A\u0019\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A)\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A9\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001AI\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AY\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001Ai\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"V", "Landroidx/collection/LongObjectMap;", "emptyLongObjectMap", "()Landroidx/collection/LongObjectMap;", "longObjectMapOf", "", "key1", "value1", "(JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key2", "value2", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key3", "value3", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key4", "value4", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key5", "value5", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "Landroidx/collection/MutableLongObjectMap;", "mutableLongObjectMapOf", "()Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LongObjectMapKt {
    public static final MutableLongObjectMap a;

    static {
        LongObjectMapKt.a = new MutableLongObjectMap(0);
    }

    @NotNull
    public static final LongObjectMap emptyLongObjectMap() {
        Intrinsics.checkNotNull(LongObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return LongObjectMapKt.a;
    }

    @NotNull
    public static final LongObjectMap longObjectMapOf() {
        Intrinsics.checkNotNull(LongObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return LongObjectMapKt.a;
    }

    @NotNull
    public static final LongObjectMap longObjectMapOf(long v, Object object0) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).set(v, object0);
        return longObjectMap0;
    }

    @NotNull
    public static final LongObjectMap longObjectMapOf(long v, Object object0, long v1, Object object1) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).set(v, object0);
        ((MutableLongObjectMap)longObjectMap0).set(v1, object1);
        return longObjectMap0;
    }

    @NotNull
    public static final LongObjectMap longObjectMapOf(long v, Object object0, long v1, Object object1, long v2, Object object2) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).set(v, object0);
        ((MutableLongObjectMap)longObjectMap0).set(v1, object1);
        ((MutableLongObjectMap)longObjectMap0).set(v2, object2);
        return longObjectMap0;
    }

    @NotNull
    public static final LongObjectMap longObjectMapOf(long v, Object object0, long v1, Object object1, long v2, Object object2, long v3, Object object3) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).set(v, object0);
        ((MutableLongObjectMap)longObjectMap0).set(v1, object1);
        ((MutableLongObjectMap)longObjectMap0).set(v2, object2);
        ((MutableLongObjectMap)longObjectMap0).set(v3, object3);
        return longObjectMap0;
    }

    @NotNull
    public static final LongObjectMap longObjectMapOf(long v, Object object0, long v1, Object object1, long v2, Object object2, long v3, Object object3, long v4, Object object4) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).set(v, object0);
        ((MutableLongObjectMap)longObjectMap0).set(v1, object1);
        ((MutableLongObjectMap)longObjectMap0).set(v2, object2);
        ((MutableLongObjectMap)longObjectMap0).set(v3, object3);
        ((MutableLongObjectMap)longObjectMap0).set(v4, object4);
        return longObjectMap0;
    }

    @NotNull
    public static final MutableLongObjectMap mutableLongObjectMapOf() {
        return new MutableLongObjectMap(0, 1, null);
    }

    @NotNull
    public static final MutableLongObjectMap mutableLongObjectMapOf(long v, Object object0) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.set(v, object0);
        return mutableLongObjectMap0;
    }

    @NotNull
    public static final MutableLongObjectMap mutableLongObjectMapOf(long v, Object object0, long v1, Object object1) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.set(v, object0);
        mutableLongObjectMap0.set(v1, object1);
        return mutableLongObjectMap0;
    }

    @NotNull
    public static final MutableLongObjectMap mutableLongObjectMapOf(long v, Object object0, long v1, Object object1, long v2, Object object2) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.set(v, object0);
        mutableLongObjectMap0.set(v1, object1);
        mutableLongObjectMap0.set(v2, object2);
        return mutableLongObjectMap0;
    }

    @NotNull
    public static final MutableLongObjectMap mutableLongObjectMapOf(long v, Object object0, long v1, Object object1, long v2, Object object2, long v3, Object object3) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.set(v, object0);
        mutableLongObjectMap0.set(v1, object1);
        mutableLongObjectMap0.set(v2, object2);
        mutableLongObjectMap0.set(v3, object3);
        return mutableLongObjectMap0;
    }

    @NotNull
    public static final MutableLongObjectMap mutableLongObjectMapOf(long v, Object object0, long v1, Object object1, long v2, Object object2, long v3, Object object3, long v4, Object object4) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.set(v, object0);
        mutableLongObjectMap0.set(v1, object1);
        mutableLongObjectMap0.set(v2, object2);
        mutableLongObjectMap0.set(v3, object3);
        mutableLongObjectMap0.set(v4, object4);
        return mutableLongObjectMap0;
    }
}

