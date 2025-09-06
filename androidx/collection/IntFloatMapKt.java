package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\b\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000B\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000E\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0011\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0014\u001A\r\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u001D\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A-\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001A=\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AM\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001A]\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"Landroidx/collection/IntFloatMap;", "emptyIntFloatMap", "()Landroidx/collection/IntFloatMap;", "intFloatMapOf", "", "key1", "", "value1", "(IF)Landroidx/collection/IntFloatMap;", "key2", "value2", "(IFIF)Landroidx/collection/IntFloatMap;", "key3", "value3", "(IFIFIF)Landroidx/collection/IntFloatMap;", "key4", "value4", "(IFIFIFIF)Landroidx/collection/IntFloatMap;", "key5", "value5", "(IFIFIFIFIF)Landroidx/collection/IntFloatMap;", "Landroidx/collection/MutableIntFloatMap;", "mutableIntFloatMapOf", "()Landroidx/collection/MutableIntFloatMap;", "(IF)Landroidx/collection/MutableIntFloatMap;", "(IFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class IntFloatMapKt {
    public static final MutableIntFloatMap a;

    static {
        IntFloatMapKt.a = new MutableIntFloatMap(0);
    }

    @NotNull
    public static final IntFloatMap emptyIntFloatMap() {
        return IntFloatMapKt.a;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf() {
        return IntFloatMapKt.a;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int v, float f) {
        IntFloatMap intFloatMap0 = new MutableIntFloatMap(0, 1, null);
        ((MutableIntFloatMap)intFloatMap0).set(v, f);
        return intFloatMap0;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int v, float f, int v1, float f1) {
        IntFloatMap intFloatMap0 = new MutableIntFloatMap(0, 1, null);
        ((MutableIntFloatMap)intFloatMap0).set(v, f);
        ((MutableIntFloatMap)intFloatMap0).set(v1, f1);
        return intFloatMap0;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int v, float f, int v1, float f1, int v2, float f2) {
        IntFloatMap intFloatMap0 = new MutableIntFloatMap(0, 1, null);
        ((MutableIntFloatMap)intFloatMap0).set(v, f);
        ((MutableIntFloatMap)intFloatMap0).set(v1, f1);
        ((MutableIntFloatMap)intFloatMap0).set(v2, f2);
        return intFloatMap0;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int v, float f, int v1, float f1, int v2, float f2, int v3, float f3) {
        IntFloatMap intFloatMap0 = new MutableIntFloatMap(0, 1, null);
        ((MutableIntFloatMap)intFloatMap0).set(v, f);
        ((MutableIntFloatMap)intFloatMap0).set(v1, f1);
        ((MutableIntFloatMap)intFloatMap0).set(v2, f2);
        ((MutableIntFloatMap)intFloatMap0).set(v3, f3);
        return intFloatMap0;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int v, float f, int v1, float f1, int v2, float f2, int v3, float f3, int v4, float f4) {
        IntFloatMap intFloatMap0 = new MutableIntFloatMap(0, 1, null);
        ((MutableIntFloatMap)intFloatMap0).set(v, f);
        ((MutableIntFloatMap)intFloatMap0).set(v1, f1);
        ((MutableIntFloatMap)intFloatMap0).set(v2, f2);
        ((MutableIntFloatMap)intFloatMap0).set(v3, f3);
        ((MutableIntFloatMap)intFloatMap0).set(v4, f4);
        return intFloatMap0;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf() {
        return new MutableIntFloatMap(0, 1, null);
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int v, float f) {
        MutableIntFloatMap mutableIntFloatMap0 = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap0.set(v, f);
        return mutableIntFloatMap0;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int v, float f, int v1, float f1) {
        MutableIntFloatMap mutableIntFloatMap0 = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap0.set(v, f);
        mutableIntFloatMap0.set(v1, f1);
        return mutableIntFloatMap0;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int v, float f, int v1, float f1, int v2, float f2) {
        MutableIntFloatMap mutableIntFloatMap0 = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap0.set(v, f);
        mutableIntFloatMap0.set(v1, f1);
        mutableIntFloatMap0.set(v2, f2);
        return mutableIntFloatMap0;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int v, float f, int v1, float f1, int v2, float f2, int v3, float f3) {
        MutableIntFloatMap mutableIntFloatMap0 = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap0.set(v, f);
        mutableIntFloatMap0.set(v1, f1);
        mutableIntFloatMap0.set(v2, f2);
        mutableIntFloatMap0.set(v3, f3);
        return mutableIntFloatMap0;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int v, float f, int v1, float f1, int v2, float f2, int v3, float f3, int v4, float f4) {
        MutableIntFloatMap mutableIntFloatMap0 = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap0.set(v, f);
        mutableIntFloatMap0.set(v1, f1);
        mutableIntFloatMap0.set(v2, f2);
        mutableIntFloatMap0.set(v3, f3);
        mutableIntFloatMap0.set(v4, f4);
        return mutableIntFloatMap0;
    }
}

