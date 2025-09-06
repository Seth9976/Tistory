package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0015\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001A%\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0003\u001A\u00020\u00002\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001A\u0010\u0010\u000F\u001A\u00020\u000EH\u0086\b¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0011\u001A\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0012\u001A%\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0013\u001A\u001C\u0010\u000F\u001A\u00020\u000E2\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000F\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/collection/LongList;", "emptyLongList", "()Landroidx/collection/LongList;", "longListOf", "", "element1", "(J)Landroidx/collection/LongList;", "element2", "(JJ)Landroidx/collection/LongList;", "element3", "(JJJ)Landroidx/collection/LongList;", "", "elements", "([J)Landroidx/collection/LongList;", "Landroidx/collection/MutableLongList;", "mutableLongListOf", "()Landroidx/collection/MutableLongList;", "(J)Landroidx/collection/MutableLongList;", "(JJ)Landroidx/collection/MutableLongList;", "(JJJ)Landroidx/collection/MutableLongList;", "([J)Landroidx/collection/MutableLongList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class LongListKt {
    public static final MutableLongList a;

    static {
        LongListKt.a = new MutableLongList(0);
    }

    @NotNull
    public static final LongList emptyLongList() {
        return LongListKt.a;
    }

    @NotNull
    public static final LongList longListOf() {
        return LongListKt.a;
    }

    @NotNull
    public static final LongList longListOf(long v) {
        return LongListKt.mutableLongListOf(v);
    }

    @NotNull
    public static final LongList longListOf(long v, long v1) {
        return LongListKt.mutableLongListOf(v, v1);
    }

    @NotNull
    public static final LongList longListOf(long v, long v1, long v2) {
        return LongListKt.mutableLongListOf(v, v1, v2);
    }

    @NotNull
    public static final LongList longListOf(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        LongList longList0 = new MutableLongList(arr_v.length);
        ((MutableLongList)longList0).plusAssign(arr_v);
        return longList0;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long v) {
        MutableLongList mutableLongList0 = new MutableLongList(1);
        mutableLongList0.add(v);
        return mutableLongList0;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long v, long v1) {
        MutableLongList mutableLongList0 = new MutableLongList(2);
        mutableLongList0.add(v);
        mutableLongList0.add(v1);
        return mutableLongList0;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long v, long v1, long v2) {
        MutableLongList mutableLongList0 = new MutableLongList(3);
        mutableLongList0.add(v);
        mutableLongList0.add(v1);
        mutableLongList0.add(v2);
        return mutableLongList0;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        MutableLongList mutableLongList0 = new MutableLongList(arr_v.length);
        mutableLongList0.plusAssign(arr_v);
        return mutableLongList0;
    }
}

