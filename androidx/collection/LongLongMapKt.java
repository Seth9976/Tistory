package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0007\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\n\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\r\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0010\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0003\u0010\u0013\u001A\r\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u001D\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0017\u001A-\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0018\u001A=\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0019\u001AM\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u001A\u001A]\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0015\u0010\u001B\u00A8\u0006\u001C"}, d2 = {"Landroidx/collection/LongLongMap;", "emptyLongLongMap", "()Landroidx/collection/LongLongMap;", "longLongMapOf", "", "key1", "value1", "(JJ)Landroidx/collection/LongLongMap;", "key2", "value2", "(JJJJ)Landroidx/collection/LongLongMap;", "key3", "value3", "(JJJJJJ)Landroidx/collection/LongLongMap;", "key4", "value4", "(JJJJJJJJ)Landroidx/collection/LongLongMap;", "key5", "value5", "(JJJJJJJJJJ)Landroidx/collection/LongLongMap;", "Landroidx/collection/MutableLongLongMap;", "mutableLongLongMapOf", "()Landroidx/collection/MutableLongLongMap;", "(JJ)Landroidx/collection/MutableLongLongMap;", "(JJJJ)Landroidx/collection/MutableLongLongMap;", "(JJJJJJ)Landroidx/collection/MutableLongLongMap;", "(JJJJJJJJ)Landroidx/collection/MutableLongLongMap;", "(JJJJJJJJJJ)Landroidx/collection/MutableLongLongMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LongLongMapKt {
    public static final MutableLongLongMap a;

    static {
        LongLongMapKt.a = new MutableLongLongMap(0);
    }

    @NotNull
    public static final LongLongMap emptyLongLongMap() {
        return LongLongMapKt.a;
    }

    @NotNull
    public static final LongLongMap longLongMapOf() {
        return LongLongMapKt.a;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long v, long v1) {
        LongLongMap longLongMap0 = new MutableLongLongMap(0, 1, null);
        ((MutableLongLongMap)longLongMap0).set(v, v1);
        return longLongMap0;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long v, long v1, long v2, long v3) {
        LongLongMap longLongMap0 = new MutableLongLongMap(0, 1, null);
        ((MutableLongLongMap)longLongMap0).set(v, v1);
        ((MutableLongLongMap)longLongMap0).set(v2, v3);
        return longLongMap0;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long v, long v1, long v2, long v3, long v4, long v5) {
        LongLongMap longLongMap0 = new MutableLongLongMap(0, 1, null);
        ((MutableLongLongMap)longLongMap0).set(v, v1);
        ((MutableLongLongMap)longLongMap0).set(v2, v3);
        ((MutableLongLongMap)longLongMap0).set(v4, v5);
        return longLongMap0;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7) {
        LongLongMap longLongMap0 = new MutableLongLongMap(0, 1, null);
        ((MutableLongLongMap)longLongMap0).set(v, v1);
        ((MutableLongLongMap)longLongMap0).set(v2, v3);
        ((MutableLongLongMap)longLongMap0).set(v4, v5);
        ((MutableLongLongMap)longLongMap0).set(v6, v7);
        return longLongMap0;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9) {
        LongLongMap longLongMap0 = new MutableLongLongMap(0, 1, null);
        ((MutableLongLongMap)longLongMap0).set(v, v1);
        ((MutableLongLongMap)longLongMap0).set(v2, v3);
        ((MutableLongLongMap)longLongMap0).set(v4, v5);
        ((MutableLongLongMap)longLongMap0).set(v6, v7);
        ((MutableLongLongMap)longLongMap0).set(v8, v9);
        return longLongMap0;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf() {
        return new MutableLongLongMap(0, 1, null);
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long v, long v1) {
        MutableLongLongMap mutableLongLongMap0 = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap0.set(v, v1);
        return mutableLongLongMap0;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long v, long v1, long v2, long v3) {
        MutableLongLongMap mutableLongLongMap0 = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap0.set(v, v1);
        mutableLongLongMap0.set(v2, v3);
        return mutableLongLongMap0;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long v, long v1, long v2, long v3, long v4, long v5) {
        MutableLongLongMap mutableLongLongMap0 = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap0.set(v, v1);
        mutableLongLongMap0.set(v2, v3);
        mutableLongLongMap0.set(v4, v5);
        return mutableLongLongMap0;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7) {
        MutableLongLongMap mutableLongLongMap0 = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap0.set(v, v1);
        mutableLongLongMap0.set(v2, v3);
        mutableLongLongMap0.set(v4, v5);
        mutableLongLongMap0.set(v6, v7);
        return mutableLongLongMap0;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9) {
        MutableLongLongMap mutableLongLongMap0 = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap0.set(v, v1);
        mutableLongLongMap0.set(v2, v3);
        mutableLongLongMap0.set(v4, v5);
        mutableLongLongMap0.set(v6, v7);
        mutableLongLongMap0.set(v8, v9);
        return mutableLongLongMap0;
    }
}

