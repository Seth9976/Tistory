package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0015\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001A%\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0003\u001A\u00020\u00002\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001A\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0011\u001A\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0012\u001A%\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0013\u001A\u0019\u0010\u000F\u001A\u00020\u000E2\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0014\u001A\u0018\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\"\u001A\u0010\u001C\u001A\u00020\u000B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Landroidx/collection/IntSet;", "emptyIntSet", "()Landroidx/collection/IntSet;", "intSetOf", "", "element1", "(I)Landroidx/collection/IntSet;", "element2", "(II)Landroidx/collection/IntSet;", "element3", "(III)Landroidx/collection/IntSet;", "", "elements", "([I)Landroidx/collection/IntSet;", "Landroidx/collection/MutableIntSet;", "mutableIntSetOf", "()Landroidx/collection/MutableIntSet;", "(I)Landroidx/collection/MutableIntSet;", "(II)Landroidx/collection/MutableIntSet;", "(III)Landroidx/collection/MutableIntSet;", "([I)Landroidx/collection/MutableIntSet;", "k", "hash", "(I)I", "b", "[I", "getEmptyIntArray", "()[I", "EmptyIntArray", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class IntSetKt {
    public static final MutableIntSet a;
    public static final int[] b;

    static {
        IntSetKt.a = new MutableIntSet(0);
        IntSetKt.b = new int[0];
    }

    @NotNull
    public static final IntSet emptyIntSet() {
        return IntSetKt.a;
    }

    @NotNull
    public static final int[] getEmptyIntArray() {
        return IntSetKt.b;
    }

    public static final int hash(int v) {
        return v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
    }

    @NotNull
    public static final IntSet intSetOf() {
        return IntSetKt.a;
    }

    @NotNull
    public static final IntSet intSetOf(int v) {
        return IntSetKt.mutableIntSetOf(v);
    }

    @NotNull
    public static final IntSet intSetOf(int v, int v1) {
        return IntSetKt.mutableIntSetOf(v, v1);
    }

    @NotNull
    public static final IntSet intSetOf(int v, int v1, int v2) {
        return IntSetKt.mutableIntSetOf(v, v1, v2);
    }

    @NotNull
    public static final IntSet intSetOf(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        IntSet intSet0 = new MutableIntSet(arr_v.length);
        ((MutableIntSet)intSet0).plusAssign(arr_v);
        return intSet0;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int v) {
        MutableIntSet mutableIntSet0 = new MutableIntSet(1);
        mutableIntSet0.plusAssign(v);
        return mutableIntSet0;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int v, int v1) {
        MutableIntSet mutableIntSet0 = new MutableIntSet(2);
        mutableIntSet0.plusAssign(v);
        mutableIntSet0.plusAssign(v1);
        return mutableIntSet0;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int v, int v1, int v2) {
        MutableIntSet mutableIntSet0 = new MutableIntSet(3);
        mutableIntSet0.plusAssign(v);
        mutableIntSet0.plusAssign(v1);
        mutableIntSet0.plusAssign(v2);
        return mutableIntSet0;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        MutableIntSet mutableIntSet0 = new MutableIntSet(arr_v.length);
        mutableIntSet0.plusAssign(arr_v);
        return mutableIntSet0;
    }
}

