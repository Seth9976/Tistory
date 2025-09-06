package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\b\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000B\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000E\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0011\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0014\u001A\r\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u001D\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A-\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001A=\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AM\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001A]\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"Landroidx/collection/FloatLongMap;", "emptyFloatLongMap", "()Landroidx/collection/FloatLongMap;", "floatLongMapOf", "", "key1", "", "value1", "(FJ)Landroidx/collection/FloatLongMap;", "key2", "value2", "(FJFJ)Landroidx/collection/FloatLongMap;", "key3", "value3", "(FJFJFJ)Landroidx/collection/FloatLongMap;", "key4", "value4", "(FJFJFJFJ)Landroidx/collection/FloatLongMap;", "key5", "value5", "(FJFJFJFJFJ)Landroidx/collection/FloatLongMap;", "Landroidx/collection/MutableFloatLongMap;", "mutableFloatLongMapOf", "()Landroidx/collection/MutableFloatLongMap;", "(FJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FloatLongMapKt {
    public static final MutableFloatLongMap a;

    static {
        FloatLongMapKt.a = new MutableFloatLongMap(0);
    }

    @NotNull
    public static final FloatLongMap emptyFloatLongMap() {
        return FloatLongMapKt.a;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf() {
        return FloatLongMapKt.a;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long v) {
        FloatLongMap floatLongMap0 = new MutableFloatLongMap(0, 1, null);
        ((MutableFloatLongMap)floatLongMap0).set(f, v);
        return floatLongMap0;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long v, float f1, long v1) {
        FloatLongMap floatLongMap0 = new MutableFloatLongMap(0, 1, null);
        ((MutableFloatLongMap)floatLongMap0).set(f, v);
        ((MutableFloatLongMap)floatLongMap0).set(f1, v1);
        return floatLongMap0;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long v, float f1, long v1, float f2, long v2) {
        FloatLongMap floatLongMap0 = new MutableFloatLongMap(0, 1, null);
        ((MutableFloatLongMap)floatLongMap0).set(f, v);
        ((MutableFloatLongMap)floatLongMap0).set(f1, v1);
        ((MutableFloatLongMap)floatLongMap0).set(f2, v2);
        return floatLongMap0;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long v, float f1, long v1, float f2, long v2, float f3, long v3) {
        FloatLongMap floatLongMap0 = new MutableFloatLongMap(0, 1, null);
        ((MutableFloatLongMap)floatLongMap0).set(f, v);
        ((MutableFloatLongMap)floatLongMap0).set(f1, v1);
        ((MutableFloatLongMap)floatLongMap0).set(f2, v2);
        ((MutableFloatLongMap)floatLongMap0).set(f3, v3);
        return floatLongMap0;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long v, float f1, long v1, float f2, long v2, float f3, long v3, float f4, long v4) {
        FloatLongMap floatLongMap0 = new MutableFloatLongMap(0, 1, null);
        ((MutableFloatLongMap)floatLongMap0).set(f, v);
        ((MutableFloatLongMap)floatLongMap0).set(f1, v1);
        ((MutableFloatLongMap)floatLongMap0).set(f2, v2);
        ((MutableFloatLongMap)floatLongMap0).set(f3, v3);
        ((MutableFloatLongMap)floatLongMap0).set(f4, v4);
        return floatLongMap0;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        return new MutableFloatLongMap(0, 1, null);
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long v) {
        MutableFloatLongMap mutableFloatLongMap0 = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap0.set(f, v);
        return mutableFloatLongMap0;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long v, float f1, long v1) {
        MutableFloatLongMap mutableFloatLongMap0 = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap0.set(f, v);
        mutableFloatLongMap0.set(f1, v1);
        return mutableFloatLongMap0;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long v, float f1, long v1, float f2, long v2) {
        MutableFloatLongMap mutableFloatLongMap0 = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap0.set(f, v);
        mutableFloatLongMap0.set(f1, v1);
        mutableFloatLongMap0.set(f2, v2);
        return mutableFloatLongMap0;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long v, float f1, long v1, float f2, long v2, float f3, long v3) {
        MutableFloatLongMap mutableFloatLongMap0 = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap0.set(f, v);
        mutableFloatLongMap0.set(f1, v1);
        mutableFloatLongMap0.set(f2, v2);
        mutableFloatLongMap0.set(f3, v3);
        return mutableFloatLongMap0;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long v, float f1, long v1, float f2, long v2, float f3, long v3, float f4, long v4) {
        MutableFloatLongMap mutableFloatLongMap0 = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap0.set(f, v);
        mutableFloatLongMap0.set(f1, v1);
        mutableFloatLongMap0.set(f2, v2);
        mutableFloatLongMap0.set(f3, v3);
        mutableFloatLongMap0.set(f4, v4);
        return mutableFloatLongMap0;
    }
}

