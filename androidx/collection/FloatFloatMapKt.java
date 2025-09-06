package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0007\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\n\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\r\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0010\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0013\u001A\r\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u001D\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0017\u001A-\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0018\u001A=\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0019\u001AM\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u001A\u001A]\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u001B\u00A8\u0006\u001C"}, d2 = {"Landroidx/collection/FloatFloatMap;", "emptyFloatFloatMap", "()Landroidx/collection/FloatFloatMap;", "floatFloatMapOf", "", "key1", "value1", "(FF)Landroidx/collection/FloatFloatMap;", "key2", "value2", "(FFFF)Landroidx/collection/FloatFloatMap;", "key3", "value3", "(FFFFFF)Landroidx/collection/FloatFloatMap;", "key4", "value4", "(FFFFFFFF)Landroidx/collection/FloatFloatMap;", "key5", "value5", "(FFFFFFFFFF)Landroidx/collection/FloatFloatMap;", "Landroidx/collection/MutableFloatFloatMap;", "mutableFloatFloatMapOf", "()Landroidx/collection/MutableFloatFloatMap;", "(FF)Landroidx/collection/MutableFloatFloatMap;", "(FFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFFFFFF)Landroidx/collection/MutableFloatFloatMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FloatFloatMapKt {
    public static final MutableFloatFloatMap a;

    static {
        FloatFloatMapKt.a = new MutableFloatFloatMap(0);
    }

    @NotNull
    public static final FloatFloatMap emptyFloatFloatMap() {
        return FloatFloatMapKt.a;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf() {
        return FloatFloatMapKt.a;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f, float f1) {
        FloatFloatMap floatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        ((MutableFloatFloatMap)floatFloatMap0).set(f, f1);
        return floatFloatMap0;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f, float f1, float f2, float f3) {
        FloatFloatMap floatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        ((MutableFloatFloatMap)floatFloatMap0).set(f, f1);
        ((MutableFloatFloatMap)floatFloatMap0).set(f2, f3);
        return floatFloatMap0;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f, float f1, float f2, float f3, float f4, float f5) {
        FloatFloatMap floatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        ((MutableFloatFloatMap)floatFloatMap0).set(f, f1);
        ((MutableFloatFloatMap)floatFloatMap0).set(f2, f3);
        ((MutableFloatFloatMap)floatFloatMap0).set(f4, f5);
        return floatFloatMap0;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        FloatFloatMap floatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        ((MutableFloatFloatMap)floatFloatMap0).set(f, f1);
        ((MutableFloatFloatMap)floatFloatMap0).set(f2, f3);
        ((MutableFloatFloatMap)floatFloatMap0).set(f4, f5);
        ((MutableFloatFloatMap)floatFloatMap0).set(f6, f7);
        return floatFloatMap0;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        FloatFloatMap floatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        ((MutableFloatFloatMap)floatFloatMap0).set(f, f1);
        ((MutableFloatFloatMap)floatFloatMap0).set(f2, f3);
        ((MutableFloatFloatMap)floatFloatMap0).set(f4, f5);
        ((MutableFloatFloatMap)floatFloatMap0).set(f6, f7);
        ((MutableFloatFloatMap)floatFloatMap0).set(f8, f9);
        return floatFloatMap0;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new MutableFloatFloatMap(0, 1, null);
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f1) {
        MutableFloatFloatMap mutableFloatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap0.set(f, f1);
        return mutableFloatFloatMap0;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f1, float f2, float f3) {
        MutableFloatFloatMap mutableFloatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap0.set(f, f1);
        mutableFloatFloatMap0.set(f2, f3);
        return mutableFloatFloatMap0;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f1, float f2, float f3, float f4, float f5) {
        MutableFloatFloatMap mutableFloatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap0.set(f, f1);
        mutableFloatFloatMap0.set(f2, f3);
        mutableFloatFloatMap0.set(f4, f5);
        return mutableFloatFloatMap0;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        MutableFloatFloatMap mutableFloatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap0.set(f, f1);
        mutableFloatFloatMap0.set(f2, f3);
        mutableFloatFloatMap0.set(f4, f5);
        mutableFloatFloatMap0.set(f6, f7);
        return mutableFloatFloatMap0;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        MutableFloatFloatMap mutableFloatFloatMap0 = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap0.set(f, f1);
        mutableFloatFloatMap0.set(f2, f3);
        mutableFloatFloatMap0.set(f4, f5);
        mutableFloatFloatMap0.set(f6, f7);
        mutableFloatFloatMap0.set(f8, f9);
        return mutableFloatFloatMap0;
    }
}

