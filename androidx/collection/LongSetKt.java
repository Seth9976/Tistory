package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0015\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001A%\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0003\u001A\u00020\u00002\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001A\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0011\u001A\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0012\u001A%\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0013\u001A\u0019\u0010\u000F\u001A\u00020\u000E2\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0014\u001A\u0018\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u001A\u0010\u001D\u001A\u00020\u000B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/collection/LongSet;", "emptyLongSet", "()Landroidx/collection/LongSet;", "longSetOf", "", "element1", "(J)Landroidx/collection/LongSet;", "element2", "(JJ)Landroidx/collection/LongSet;", "element3", "(JJJ)Landroidx/collection/LongSet;", "", "elements", "([J)Landroidx/collection/LongSet;", "Landroidx/collection/MutableLongSet;", "mutableLongSetOf", "()Landroidx/collection/MutableLongSet;", "(J)Landroidx/collection/MutableLongSet;", "(JJ)Landroidx/collection/MutableLongSet;", "(JJJ)Landroidx/collection/MutableLongSet;", "([J)Landroidx/collection/MutableLongSet;", "k", "", "hash", "(J)I", "b", "[J", "getEmptyLongArray", "()[J", "EmptyLongArray", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class LongSetKt {
    public static final MutableLongSet a;
    public static final long[] b;

    static {
        LongSetKt.a = new MutableLongSet(0);
        LongSetKt.b = new long[0];
    }

    @NotNull
    public static final LongSet emptyLongSet() {
        return LongSetKt.a;
    }

    @NotNull
    public static final long[] getEmptyLongArray() {
        return LongSetKt.b;
    }

    public static final int hash(long v) {
        int v1 = Long.hashCode(v);
        return v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
    }

    @NotNull
    public static final LongSet longSetOf() {
        return LongSetKt.a;
    }

    @NotNull
    public static final LongSet longSetOf(long v) {
        return LongSetKt.mutableLongSetOf(v);
    }

    @NotNull
    public static final LongSet longSetOf(long v, long v1) {
        return LongSetKt.mutableLongSetOf(v, v1);
    }

    @NotNull
    public static final LongSet longSetOf(long v, long v1, long v2) {
        return LongSetKt.mutableLongSetOf(v, v1, v2);
    }

    @NotNull
    public static final LongSet longSetOf(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        LongSet longSet0 = new MutableLongSet(arr_v.length);
        ((MutableLongSet)longSet0).plusAssign(arr_v);
        return longSet0;
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf(long v) {
        MutableLongSet mutableLongSet0 = new MutableLongSet(1);
        mutableLongSet0.plusAssign(v);
        return mutableLongSet0;
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf(long v, long v1) {
        MutableLongSet mutableLongSet0 = new MutableLongSet(2);
        mutableLongSet0.plusAssign(v);
        mutableLongSet0.plusAssign(v1);
        return mutableLongSet0;
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf(long v, long v1, long v2) {
        MutableLongSet mutableLongSet0 = new MutableLongSet(3);
        mutableLongSet0.plusAssign(v);
        mutableLongSet0.plusAssign(v1);
        mutableLongSet0.plusAssign(v2);
        return mutableLongSet0;
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        MutableLongSet mutableLongSet0 = new MutableLongSet(arr_v.length);
        mutableLongSet0.plusAssign(arr_v);
        return mutableLongSet0;
    }
}

