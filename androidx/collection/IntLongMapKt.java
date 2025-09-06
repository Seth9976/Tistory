package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\b\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000B\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000E\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0011\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0014\u001A\r\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u001D\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A-\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001A=\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AM\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001A]\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"Landroidx/collection/IntLongMap;", "emptyIntLongMap", "()Landroidx/collection/IntLongMap;", "intLongMapOf", "", "key1", "", "value1", "(IJ)Landroidx/collection/IntLongMap;", "key2", "value2", "(IJIJ)Landroidx/collection/IntLongMap;", "key3", "value3", "(IJIJIJ)Landroidx/collection/IntLongMap;", "key4", "value4", "(IJIJIJIJ)Landroidx/collection/IntLongMap;", "key5", "value5", "(IJIJIJIJIJ)Landroidx/collection/IntLongMap;", "Landroidx/collection/MutableIntLongMap;", "mutableIntLongMapOf", "()Landroidx/collection/MutableIntLongMap;", "(IJ)Landroidx/collection/MutableIntLongMap;", "(IJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJIJ)Landroidx/collection/MutableIntLongMap;", "(IJIJIJIJIJ)Landroidx/collection/MutableIntLongMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class IntLongMapKt {
    public static final MutableIntLongMap a;

    static {
        IntLongMapKt.a = new MutableIntLongMap(0);
    }

    @NotNull
    public static final IntLongMap emptyIntLongMap() {
        return IntLongMapKt.a;
    }

    @NotNull
    public static final IntLongMap intLongMapOf() {
        return IntLongMapKt.a;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int v, long v1) {
        IntLongMap intLongMap0 = new MutableIntLongMap(0, 1, null);
        ((MutableIntLongMap)intLongMap0).set(v, v1);
        return intLongMap0;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int v, long v1, int v2, long v3) {
        IntLongMap intLongMap0 = new MutableIntLongMap(0, 1, null);
        ((MutableIntLongMap)intLongMap0).set(v, v1);
        ((MutableIntLongMap)intLongMap0).set(v2, v3);
        return intLongMap0;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int v, long v1, int v2, long v3, int v4, long v5) {
        IntLongMap intLongMap0 = new MutableIntLongMap(0, 1, null);
        ((MutableIntLongMap)intLongMap0).set(v, v1);
        ((MutableIntLongMap)intLongMap0).set(v2, v3);
        ((MutableIntLongMap)intLongMap0).set(v4, v5);
        return intLongMap0;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int v, long v1, int v2, long v3, int v4, long v5, int v6, long v7) {
        IntLongMap intLongMap0 = new MutableIntLongMap(0, 1, null);
        ((MutableIntLongMap)intLongMap0).set(v, v1);
        ((MutableIntLongMap)intLongMap0).set(v2, v3);
        ((MutableIntLongMap)intLongMap0).set(v4, v5);
        ((MutableIntLongMap)intLongMap0).set(v6, v7);
        return intLongMap0;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int v, long v1, int v2, long v3, int v4, long v5, int v6, long v7, int v8, long v9) {
        IntLongMap intLongMap0 = new MutableIntLongMap(0, 1, null);
        ((MutableIntLongMap)intLongMap0).set(v, v1);
        ((MutableIntLongMap)intLongMap0).set(v2, v3);
        ((MutableIntLongMap)intLongMap0).set(v4, v5);
        ((MutableIntLongMap)intLongMap0).set(v6, v7);
        ((MutableIntLongMap)intLongMap0).set(v8, v9);
        return intLongMap0;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf() {
        return new MutableIntLongMap(0, 1, null);
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int v, long v1) {
        MutableIntLongMap mutableIntLongMap0 = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap0.set(v, v1);
        return mutableIntLongMap0;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int v, long v1, int v2, long v3) {
        MutableIntLongMap mutableIntLongMap0 = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap0.set(v, v1);
        mutableIntLongMap0.set(v2, v3);
        return mutableIntLongMap0;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int v, long v1, int v2, long v3, int v4, long v5) {
        MutableIntLongMap mutableIntLongMap0 = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap0.set(v, v1);
        mutableIntLongMap0.set(v2, v3);
        mutableIntLongMap0.set(v4, v5);
        return mutableIntLongMap0;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int v, long v1, int v2, long v3, int v4, long v5, int v6, long v7) {
        MutableIntLongMap mutableIntLongMap0 = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap0.set(v, v1);
        mutableIntLongMap0.set(v2, v3);
        mutableIntLongMap0.set(v4, v5);
        mutableIntLongMap0.set(v6, v7);
        return mutableIntLongMap0;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int v, long v1, int v2, long v3, int v4, long v5, int v6, long v7, int v8, long v9) {
        MutableIntLongMap mutableIntLongMap0 = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap0.set(v, v1);
        mutableIntLongMap0.set(v2, v3);
        mutableIntLongMap0.set(v4, v5);
        mutableIntLongMap0.set(v6, v7);
        mutableIntLongMap0.set(v8, v9);
        return mutableIntLongMap0;
    }
}

