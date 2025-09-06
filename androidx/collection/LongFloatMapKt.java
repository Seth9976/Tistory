package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0002\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\b\u001A-\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000B\u001A=\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u000E\u001AM\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0011\u001A]\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0003\u0010\u0014\u001A\r\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u001D\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0018\u001A-\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u0019\u001A=\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001A\u001AM\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001B\u001A]\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0016\u0010\u001C\u00A8\u0006\u001D"}, d2 = {"Landroidx/collection/LongFloatMap;", "emptyLongFloatMap", "()Landroidx/collection/LongFloatMap;", "longFloatMapOf", "", "key1", "", "value1", "(JF)Landroidx/collection/LongFloatMap;", "key2", "value2", "(JFJF)Landroidx/collection/LongFloatMap;", "key3", "value3", "(JFJFJF)Landroidx/collection/LongFloatMap;", "key4", "value4", "(JFJFJFJF)Landroidx/collection/LongFloatMap;", "key5", "value5", "(JFJFJFJFJF)Landroidx/collection/LongFloatMap;", "Landroidx/collection/MutableLongFloatMap;", "mutableLongFloatMapOf", "()Landroidx/collection/MutableLongFloatMap;", "(JF)Landroidx/collection/MutableLongFloatMap;", "(JFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJFJF)Landroidx/collection/MutableLongFloatMap;", "(JFJFJFJFJF)Landroidx/collection/MutableLongFloatMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LongFloatMapKt {
    public static final MutableLongFloatMap a;

    static {
        LongFloatMapKt.a = new MutableLongFloatMap(0);
    }

    @NotNull
    public static final LongFloatMap emptyLongFloatMap() {
        return LongFloatMapKt.a;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf() {
        return LongFloatMapKt.a;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long v, float f) {
        LongFloatMap longFloatMap0 = new MutableLongFloatMap(0, 1, null);
        ((MutableLongFloatMap)longFloatMap0).set(v, f);
        return longFloatMap0;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long v, float f, long v1, float f1) {
        LongFloatMap longFloatMap0 = new MutableLongFloatMap(0, 1, null);
        ((MutableLongFloatMap)longFloatMap0).set(v, f);
        ((MutableLongFloatMap)longFloatMap0).set(v1, f1);
        return longFloatMap0;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long v, float f, long v1, float f1, long v2, float f2) {
        LongFloatMap longFloatMap0 = new MutableLongFloatMap(0, 1, null);
        ((MutableLongFloatMap)longFloatMap0).set(v, f);
        ((MutableLongFloatMap)longFloatMap0).set(v1, f1);
        ((MutableLongFloatMap)longFloatMap0).set(v2, f2);
        return longFloatMap0;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long v, float f, long v1, float f1, long v2, float f2, long v3, float f3) {
        LongFloatMap longFloatMap0 = new MutableLongFloatMap(0, 1, null);
        ((MutableLongFloatMap)longFloatMap0).set(v, f);
        ((MutableLongFloatMap)longFloatMap0).set(v1, f1);
        ((MutableLongFloatMap)longFloatMap0).set(v2, f2);
        ((MutableLongFloatMap)longFloatMap0).set(v3, f3);
        return longFloatMap0;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long v, float f, long v1, float f1, long v2, float f2, long v3, float f3, long v4, float f4) {
        LongFloatMap longFloatMap0 = new MutableLongFloatMap(0, 1, null);
        ((MutableLongFloatMap)longFloatMap0).set(v, f);
        ((MutableLongFloatMap)longFloatMap0).set(v1, f1);
        ((MutableLongFloatMap)longFloatMap0).set(v2, f2);
        ((MutableLongFloatMap)longFloatMap0).set(v3, f3);
        ((MutableLongFloatMap)longFloatMap0).set(v4, f4);
        return longFloatMap0;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        return new MutableLongFloatMap(0, 1, null);
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long v, float f) {
        MutableLongFloatMap mutableLongFloatMap0 = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap0.set(v, f);
        return mutableLongFloatMap0;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long v, float f, long v1, float f1) {
        MutableLongFloatMap mutableLongFloatMap0 = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap0.set(v, f);
        mutableLongFloatMap0.set(v1, f1);
        return mutableLongFloatMap0;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long v, float f, long v1, float f1, long v2, float f2) {
        MutableLongFloatMap mutableLongFloatMap0 = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap0.set(v, f);
        mutableLongFloatMap0.set(v1, f1);
        mutableLongFloatMap0.set(v2, f2);
        return mutableLongFloatMap0;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long v, float f, long v1, float f1, long v2, float f2, long v3, float f3) {
        MutableLongFloatMap mutableLongFloatMap0 = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap0.set(v, f);
        mutableLongFloatMap0.set(v1, f1);
        mutableLongFloatMap0.set(v2, f2);
        mutableLongFloatMap0.set(v3, f3);
        return mutableLongFloatMap0;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long v, float f, long v1, float f1, long v2, float f2, long v3, float f3, long v4, float f4) {
        MutableLongFloatMap mutableLongFloatMap0 = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap0.set(v, f);
        mutableLongFloatMap0.set(v1, f1);
        mutableLongFloatMap0.set(v2, f2);
        mutableLongFloatMap0.set(v3, f3);
        mutableLongFloatMap0.set(v4, f4);
        return mutableLongFloatMap0;
    }
}

