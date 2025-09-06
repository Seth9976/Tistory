package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\b\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000B\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000E\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0011\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0014\u001A\r\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u001D\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A-\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001A=\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AM\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001A]\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"Landroidx/collection/FloatIntMap;", "emptyFloatIntMap", "()Landroidx/collection/FloatIntMap;", "floatIntMapOf", "", "key1", "", "value1", "(FI)Landroidx/collection/FloatIntMap;", "key2", "value2", "(FIFI)Landroidx/collection/FloatIntMap;", "key3", "value3", "(FIFIFI)Landroidx/collection/FloatIntMap;", "key4", "value4", "(FIFIFIFI)Landroidx/collection/FloatIntMap;", "key5", "value5", "(FIFIFIFIFI)Landroidx/collection/FloatIntMap;", "Landroidx/collection/MutableFloatIntMap;", "mutableFloatIntMapOf", "()Landroidx/collection/MutableFloatIntMap;", "(FI)Landroidx/collection/MutableFloatIntMap;", "(FIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFIFIFI)Landroidx/collection/MutableFloatIntMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FloatIntMapKt {
    public static final MutableFloatIntMap a;

    static {
        FloatIntMapKt.a = new MutableFloatIntMap(0);
    }

    @NotNull
    public static final FloatIntMap emptyFloatIntMap() {
        return FloatIntMapKt.a;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf() {
        return FloatIntMapKt.a;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f, int v) {
        FloatIntMap floatIntMap0 = new MutableFloatIntMap(0, 1, null);
        ((MutableFloatIntMap)floatIntMap0).set(f, v);
        return floatIntMap0;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f, int v, float f1, int v1) {
        FloatIntMap floatIntMap0 = new MutableFloatIntMap(0, 1, null);
        ((MutableFloatIntMap)floatIntMap0).set(f, v);
        ((MutableFloatIntMap)floatIntMap0).set(f1, v1);
        return floatIntMap0;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f, int v, float f1, int v1, float f2, int v2) {
        FloatIntMap floatIntMap0 = new MutableFloatIntMap(0, 1, null);
        ((MutableFloatIntMap)floatIntMap0).set(f, v);
        ((MutableFloatIntMap)floatIntMap0).set(f1, v1);
        ((MutableFloatIntMap)floatIntMap0).set(f2, v2);
        return floatIntMap0;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f, int v, float f1, int v1, float f2, int v2, float f3, int v3) {
        FloatIntMap floatIntMap0 = new MutableFloatIntMap(0, 1, null);
        ((MutableFloatIntMap)floatIntMap0).set(f, v);
        ((MutableFloatIntMap)floatIntMap0).set(f1, v1);
        ((MutableFloatIntMap)floatIntMap0).set(f2, v2);
        ((MutableFloatIntMap)floatIntMap0).set(f3, v3);
        return floatIntMap0;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f, int v, float f1, int v1, float f2, int v2, float f3, int v3, float f4, int v4) {
        FloatIntMap floatIntMap0 = new MutableFloatIntMap(0, 1, null);
        ((MutableFloatIntMap)floatIntMap0).set(f, v);
        ((MutableFloatIntMap)floatIntMap0).set(f1, v1);
        ((MutableFloatIntMap)floatIntMap0).set(f2, v2);
        ((MutableFloatIntMap)floatIntMap0).set(f3, v3);
        ((MutableFloatIntMap)floatIntMap0).set(f4, v4);
        return floatIntMap0;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf() {
        return new MutableFloatIntMap(0, 1, null);
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int v) {
        MutableFloatIntMap mutableFloatIntMap0 = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap0.set(f, v);
        return mutableFloatIntMap0;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int v, float f1, int v1) {
        MutableFloatIntMap mutableFloatIntMap0 = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap0.set(f, v);
        mutableFloatIntMap0.set(f1, v1);
        return mutableFloatIntMap0;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int v, float f1, int v1, float f2, int v2) {
        MutableFloatIntMap mutableFloatIntMap0 = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap0.set(f, v);
        mutableFloatIntMap0.set(f1, v1);
        mutableFloatIntMap0.set(f2, v2);
        return mutableFloatIntMap0;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int v, float f1, int v1, float f2, int v2, float f3, int v3) {
        MutableFloatIntMap mutableFloatIntMap0 = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap0.set(f, v);
        mutableFloatIntMap0.set(f1, v1);
        mutableFloatIntMap0.set(f2, v2);
        mutableFloatIntMap0.set(f3, v3);
        return mutableFloatIntMap0;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int v, float f1, int v1, float f2, int v2, float f3, int v3, float f4, int v4) {
        MutableFloatIntMap mutableFloatIntMap0 = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap0.set(f, v);
        mutableFloatIntMap0.set(f1, v1);
        mutableFloatIntMap0.set(f2, v2);
        mutableFloatIntMap0.set(f3, v3);
        mutableFloatIntMap0.set(f4, v4);
        return mutableFloatIntMap0;
    }
}

