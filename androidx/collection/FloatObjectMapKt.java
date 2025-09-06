package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0019\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0003\u001A)\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\b\u001A9\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u000B\u001AI\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u000E\u001AY\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0011\u001Ai\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0014\u001A\u0019\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A)\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A9\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001AI\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AY\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001Ai\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"V", "Landroidx/collection/FloatObjectMap;", "emptyFloatObjectMap", "()Landroidx/collection/FloatObjectMap;", "floatObjectMapOf", "", "key1", "value1", "(FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key2", "value2", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key3", "value3", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key4", "value4", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key5", "value5", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "Landroidx/collection/MutableFloatObjectMap;", "mutableFloatObjectMapOf", "()Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FloatObjectMapKt {
    public static final MutableFloatObjectMap a;

    static {
        FloatObjectMapKt.a = new MutableFloatObjectMap(0);
    }

    @NotNull
    public static final FloatObjectMap emptyFloatObjectMap() {
        Intrinsics.checkNotNull(FloatObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return FloatObjectMapKt.a;
    }

    @NotNull
    public static final FloatObjectMap floatObjectMapOf() {
        Intrinsics.checkNotNull(FloatObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return FloatObjectMapKt.a;
    }

    @NotNull
    public static final FloatObjectMap floatObjectMapOf(float f, Object object0) {
        FloatObjectMap floatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        ((MutableFloatObjectMap)floatObjectMap0).set(f, object0);
        return floatObjectMap0;
    }

    @NotNull
    public static final FloatObjectMap floatObjectMapOf(float f, Object object0, float f1, Object object1) {
        FloatObjectMap floatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        ((MutableFloatObjectMap)floatObjectMap0).set(f, object0);
        ((MutableFloatObjectMap)floatObjectMap0).set(f1, object1);
        return floatObjectMap0;
    }

    @NotNull
    public static final FloatObjectMap floatObjectMapOf(float f, Object object0, float f1, Object object1, float f2, Object object2) {
        FloatObjectMap floatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        ((MutableFloatObjectMap)floatObjectMap0).set(f, object0);
        ((MutableFloatObjectMap)floatObjectMap0).set(f1, object1);
        ((MutableFloatObjectMap)floatObjectMap0).set(f2, object2);
        return floatObjectMap0;
    }

    @NotNull
    public static final FloatObjectMap floatObjectMapOf(float f, Object object0, float f1, Object object1, float f2, Object object2, float f3, Object object3) {
        FloatObjectMap floatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        ((MutableFloatObjectMap)floatObjectMap0).set(f, object0);
        ((MutableFloatObjectMap)floatObjectMap0).set(f1, object1);
        ((MutableFloatObjectMap)floatObjectMap0).set(f2, object2);
        ((MutableFloatObjectMap)floatObjectMap0).set(f3, object3);
        return floatObjectMap0;
    }

    @NotNull
    public static final FloatObjectMap floatObjectMapOf(float f, Object object0, float f1, Object object1, float f2, Object object2, float f3, Object object3, float f4, Object object4) {
        FloatObjectMap floatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        ((MutableFloatObjectMap)floatObjectMap0).set(f, object0);
        ((MutableFloatObjectMap)floatObjectMap0).set(f1, object1);
        ((MutableFloatObjectMap)floatObjectMap0).set(f2, object2);
        ((MutableFloatObjectMap)floatObjectMap0).set(f3, object3);
        ((MutableFloatObjectMap)floatObjectMap0).set(f4, object4);
        return floatObjectMap0;
    }

    @NotNull
    public static final MutableFloatObjectMap mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap(0, 1, null);
    }

    @NotNull
    public static final MutableFloatObjectMap mutableFloatObjectMapOf(float f, Object object0) {
        MutableFloatObjectMap mutableFloatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap0.set(f, object0);
        return mutableFloatObjectMap0;
    }

    @NotNull
    public static final MutableFloatObjectMap mutableFloatObjectMapOf(float f, Object object0, float f1, Object object1) {
        MutableFloatObjectMap mutableFloatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap0.set(f, object0);
        mutableFloatObjectMap0.set(f1, object1);
        return mutableFloatObjectMap0;
    }

    @NotNull
    public static final MutableFloatObjectMap mutableFloatObjectMapOf(float f, Object object0, float f1, Object object1, float f2, Object object2) {
        MutableFloatObjectMap mutableFloatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap0.set(f, object0);
        mutableFloatObjectMap0.set(f1, object1);
        mutableFloatObjectMap0.set(f2, object2);
        return mutableFloatObjectMap0;
    }

    @NotNull
    public static final MutableFloatObjectMap mutableFloatObjectMapOf(float f, Object object0, float f1, Object object1, float f2, Object object2, float f3, Object object3) {
        MutableFloatObjectMap mutableFloatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap0.set(f, object0);
        mutableFloatObjectMap0.set(f1, object1);
        mutableFloatObjectMap0.set(f2, object2);
        mutableFloatObjectMap0.set(f3, object3);
        return mutableFloatObjectMap0;
    }

    @NotNull
    public static final MutableFloatObjectMap mutableFloatObjectMapOf(float f, Object object0, float f1, Object object1, float f2, Object object2, float f3, Object object3, float f4, Object object4) {
        MutableFloatObjectMap mutableFloatObjectMap0 = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap0.set(f, object0);
        mutableFloatObjectMap0.set(f1, object1);
        mutableFloatObjectMap0.set(f2, object2);
        mutableFloatObjectMap0.set(f3, object3);
        mutableFloatObjectMap0.set(f4, object4);
        return mutableFloatObjectMap0;
    }
}

