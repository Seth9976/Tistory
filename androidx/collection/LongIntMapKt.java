package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\b\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000B\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000E\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0011\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0014\u001A\r\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u001D\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A-\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001A=\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AM\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001A]\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"Landroidx/collection/LongIntMap;", "emptyLongIntMap", "()Landroidx/collection/LongIntMap;", "longIntMapOf", "", "key1", "", "value1", "(JI)Landroidx/collection/LongIntMap;", "key2", "value2", "(JIJI)Landroidx/collection/LongIntMap;", "key3", "value3", "(JIJIJI)Landroidx/collection/LongIntMap;", "key4", "value4", "(JIJIJIJI)Landroidx/collection/LongIntMap;", "key5", "value5", "(JIJIJIJIJI)Landroidx/collection/LongIntMap;", "Landroidx/collection/MutableLongIntMap;", "mutableLongIntMapOf", "()Landroidx/collection/MutableLongIntMap;", "(JI)Landroidx/collection/MutableLongIntMap;", "(JIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJIJIJI)Landroidx/collection/MutableLongIntMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LongIntMapKt {
    public static final MutableLongIntMap a;

    static {
        LongIntMapKt.a = new MutableLongIntMap(0);
    }

    @NotNull
    public static final LongIntMap emptyLongIntMap() {
        return LongIntMapKt.a;
    }

    @NotNull
    public static final LongIntMap longIntMapOf() {
        return LongIntMapKt.a;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long v, int v1) {
        LongIntMap longIntMap0 = new MutableLongIntMap(0, 1, null);
        ((MutableLongIntMap)longIntMap0).set(v, v1);
        return longIntMap0;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long v, int v1, long v2, int v3) {
        LongIntMap longIntMap0 = new MutableLongIntMap(0, 1, null);
        ((MutableLongIntMap)longIntMap0).set(v, v1);
        ((MutableLongIntMap)longIntMap0).set(v2, v3);
        return longIntMap0;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long v, int v1, long v2, int v3, long v4, int v5) {
        LongIntMap longIntMap0 = new MutableLongIntMap(0, 1, null);
        ((MutableLongIntMap)longIntMap0).set(v, v1);
        ((MutableLongIntMap)longIntMap0).set(v2, v3);
        ((MutableLongIntMap)longIntMap0).set(v4, v5);
        return longIntMap0;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long v, int v1, long v2, int v3, long v4, int v5, long v6, int v7) {
        LongIntMap longIntMap0 = new MutableLongIntMap(0, 1, null);
        ((MutableLongIntMap)longIntMap0).set(v, v1);
        ((MutableLongIntMap)longIntMap0).set(v2, v3);
        ((MutableLongIntMap)longIntMap0).set(v4, v5);
        ((MutableLongIntMap)longIntMap0).set(v6, v7);
        return longIntMap0;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long v, int v1, long v2, int v3, long v4, int v5, long v6, int v7, long v8, int v9) {
        LongIntMap longIntMap0 = new MutableLongIntMap(0, 1, null);
        ((MutableLongIntMap)longIntMap0).set(v, v1);
        ((MutableLongIntMap)longIntMap0).set(v2, v3);
        ((MutableLongIntMap)longIntMap0).set(v4, v5);
        ((MutableLongIntMap)longIntMap0).set(v6, v7);
        ((MutableLongIntMap)longIntMap0).set(v8, v9);
        return longIntMap0;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf() {
        return new MutableLongIntMap(0, 1, null);
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long v, int v1) {
        MutableLongIntMap mutableLongIntMap0 = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap0.set(v, v1);
        return mutableLongIntMap0;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long v, int v1, long v2, int v3) {
        MutableLongIntMap mutableLongIntMap0 = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap0.set(v, v1);
        mutableLongIntMap0.set(v2, v3);
        return mutableLongIntMap0;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long v, int v1, long v2, int v3, long v4, int v5) {
        MutableLongIntMap mutableLongIntMap0 = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap0.set(v, v1);
        mutableLongIntMap0.set(v2, v3);
        mutableLongIntMap0.set(v4, v5);
        return mutableLongIntMap0;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long v, int v1, long v2, int v3, long v4, int v5, long v6, int v7) {
        MutableLongIntMap mutableLongIntMap0 = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap0.set(v, v1);
        mutableLongIntMap0.set(v2, v3);
        mutableLongIntMap0.set(v4, v5);
        mutableLongIntMap0.set(v6, v7);
        return mutableLongIntMap0;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long v, int v1, long v2, int v3, long v4, int v5, long v6, int v7, long v8, int v9) {
        MutableLongIntMap mutableLongIntMap0 = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap0.set(v, v1);
        mutableLongIntMap0.set(v2, v3);
        mutableLongIntMap0.set(v4, v5);
        mutableLongIntMap0.set(v6, v7);
        mutableLongIntMap0.set(v8, v9);
        return mutableLongIntMap0;
    }
}

