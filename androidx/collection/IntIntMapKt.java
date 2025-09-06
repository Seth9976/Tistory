package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0007\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\n\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\r\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0010\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0013\u001A\r\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u001D\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0017\u001A-\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0018\u001A=\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0019\u001AM\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u001A\u001A]\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u001B\u00A8\u0006\u001C"}, d2 = {"Landroidx/collection/IntIntMap;", "emptyIntIntMap", "()Landroidx/collection/IntIntMap;", "intIntMapOf", "", "key1", "value1", "(II)Landroidx/collection/IntIntMap;", "key2", "value2", "(IIII)Landroidx/collection/IntIntMap;", "key3", "value3", "(IIIIII)Landroidx/collection/IntIntMap;", "key4", "value4", "(IIIIIIII)Landroidx/collection/IntIntMap;", "key5", "value5", "(IIIIIIIIII)Landroidx/collection/IntIntMap;", "Landroidx/collection/MutableIntIntMap;", "mutableIntIntMapOf", "()Landroidx/collection/MutableIntIntMap;", "(II)Landroidx/collection/MutableIntIntMap;", "(IIII)Landroidx/collection/MutableIntIntMap;", "(IIIIII)Landroidx/collection/MutableIntIntMap;", "(IIIIIIII)Landroidx/collection/MutableIntIntMap;", "(IIIIIIIIII)Landroidx/collection/MutableIntIntMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class IntIntMapKt {
    public static final MutableIntIntMap a;

    static {
        IntIntMapKt.a = new MutableIntIntMap(0);
    }

    @NotNull
    public static final IntIntMap emptyIntIntMap() {
        return IntIntMapKt.a;
    }

    @NotNull
    public static final IntIntMap intIntMapOf() {
        return IntIntMapKt.a;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int v, int v1) {
        IntIntMap intIntMap0 = new MutableIntIntMap(0, 1, null);
        ((MutableIntIntMap)intIntMap0).set(v, v1);
        return intIntMap0;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int v, int v1, int v2, int v3) {
        IntIntMap intIntMap0 = new MutableIntIntMap(0, 1, null);
        ((MutableIntIntMap)intIntMap0).set(v, v1);
        ((MutableIntIntMap)intIntMap0).set(v2, v3);
        return intIntMap0;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int v, int v1, int v2, int v3, int v4, int v5) {
        IntIntMap intIntMap0 = new MutableIntIntMap(0, 1, null);
        ((MutableIntIntMap)intIntMap0).set(v, v1);
        ((MutableIntIntMap)intIntMap0).set(v2, v3);
        ((MutableIntIntMap)intIntMap0).set(v4, v5);
        return intIntMap0;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        IntIntMap intIntMap0 = new MutableIntIntMap(0, 1, null);
        ((MutableIntIntMap)intIntMap0).set(v, v1);
        ((MutableIntIntMap)intIntMap0).set(v2, v3);
        ((MutableIntIntMap)intIntMap0).set(v4, v5);
        ((MutableIntIntMap)intIntMap0).set(v6, v7);
        return intIntMap0;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        IntIntMap intIntMap0 = new MutableIntIntMap(0, 1, null);
        ((MutableIntIntMap)intIntMap0).set(v, v1);
        ((MutableIntIntMap)intIntMap0).set(v2, v3);
        ((MutableIntIntMap)intIntMap0).set(v4, v5);
        ((MutableIntIntMap)intIntMap0).set(v6, v7);
        ((MutableIntIntMap)intIntMap0).set(v8, v9);
        return intIntMap0;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf() {
        return new MutableIntIntMap(0, 1, null);
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int v, int v1) {
        MutableIntIntMap mutableIntIntMap0 = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap0.set(v, v1);
        return mutableIntIntMap0;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int v, int v1, int v2, int v3) {
        MutableIntIntMap mutableIntIntMap0 = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap0.set(v, v1);
        mutableIntIntMap0.set(v2, v3);
        return mutableIntIntMap0;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int v, int v1, int v2, int v3, int v4, int v5) {
        MutableIntIntMap mutableIntIntMap0 = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap0.set(v, v1);
        mutableIntIntMap0.set(v2, v3);
        mutableIntIntMap0.set(v4, v5);
        return mutableIntIntMap0;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        MutableIntIntMap mutableIntIntMap0 = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap0.set(v, v1);
        mutableIntIntMap0.set(v2, v3);
        mutableIntIntMap0.set(v4, v5);
        mutableIntIntMap0.set(v6, v7);
        return mutableIntIntMap0;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        MutableIntIntMap mutableIntIntMap0 = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap0.set(v, v1);
        mutableIntIntMap0.set(v2, v3);
        mutableIntIntMap0.set(v4, v5);
        mutableIntIntMap0.set(v6, v7);
        mutableIntIntMap0.set(v8, v9);
        return mutableIntIntMap0;
    }
}

