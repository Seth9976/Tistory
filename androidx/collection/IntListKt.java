package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0015\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001A%\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0003\u001A\u00020\u00002\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001A\u0010\u0010\u000F\u001A\u00020\u000EH\u0086\b¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0011\u001A\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0012\u001A%\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0013\u001A\u001C\u0010\u000F\u001A\u00020\u000E2\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000F\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/collection/IntList;", "emptyIntList", "()Landroidx/collection/IntList;", "intListOf", "", "element1", "(I)Landroidx/collection/IntList;", "element2", "(II)Landroidx/collection/IntList;", "element3", "(III)Landroidx/collection/IntList;", "", "elements", "([I)Landroidx/collection/IntList;", "Landroidx/collection/MutableIntList;", "mutableIntListOf", "()Landroidx/collection/MutableIntList;", "(I)Landroidx/collection/MutableIntList;", "(II)Landroidx/collection/MutableIntList;", "(III)Landroidx/collection/MutableIntList;", "([I)Landroidx/collection/MutableIntList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class IntListKt {
    public static final MutableIntList a;

    static {
        IntListKt.a = new MutableIntList(0);
    }

    @NotNull
    public static final IntList emptyIntList() {
        return IntListKt.a;
    }

    @NotNull
    public static final IntList intListOf() {
        return IntListKt.a;
    }

    @NotNull
    public static final IntList intListOf(int v) {
        return IntListKt.mutableIntListOf(v);
    }

    @NotNull
    public static final IntList intListOf(int v, int v1) {
        return IntListKt.mutableIntListOf(v, v1);
    }

    @NotNull
    public static final IntList intListOf(int v, int v1, int v2) {
        return IntListKt.mutableIntListOf(v, v1, v2);
    }

    @NotNull
    public static final IntList intListOf(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        IntList intList0 = new MutableIntList(arr_v.length);
        ((MutableIntList)intList0).plusAssign(arr_v);
        return intList0;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int v) {
        MutableIntList mutableIntList0 = new MutableIntList(1);
        mutableIntList0.add(v);
        return mutableIntList0;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int v, int v1) {
        MutableIntList mutableIntList0 = new MutableIntList(2);
        mutableIntList0.add(v);
        mutableIntList0.add(v1);
        return mutableIntList0;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int v, int v1, int v2) {
        MutableIntList mutableIntList0 = new MutableIntList(3);
        mutableIntList0.add(v);
        mutableIntList0.add(v1);
        mutableIntList0.add(v2);
        return mutableIntList0;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        MutableIntList mutableIntList0 = new MutableIntList(arr_v.length);
        mutableIntList0.plusAssign(arr_v);
        return mutableIntList0;
    }
}

