package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0019\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001A!\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0006\u001A)\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\b\u001A1\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\n\u001A-\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\f\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000B\"\u00028\u0000¢\u0006\u0004\b\u0004\u0010\r\u001A\u0019\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u001A!\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0011\u001A)\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0012\u001A1\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00028\u00002\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0013\u001A-\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00002\u0012\u0010\f\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000B\"\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0014¨\u0006\u0015"}, d2 = {"E", "Landroidx/collection/ScatterSet;", "emptyScatterSet", "()Landroidx/collection/ScatterSet;", "scatterSetOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "", "elements", "([Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "Landroidx/collection/MutableScatterSet;", "mutableScatterSetOf", "()Landroidx/collection/MutableScatterSet;", "(Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "([Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1084:1\n1#2:1085\n*E\n"})
public final class ScatterSetKt {
    public static final MutableScatterSet a;

    static {
        ScatterSetKt.a = new MutableScatterSet(0);
    }

    @NotNull
    public static final ScatterSet emptyScatterSet() {
        Intrinsics.checkNotNull(ScatterSetKt.a, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return ScatterSetKt.a;
    }

    @NotNull
    public static final MutableScatterSet mutableScatterSetOf() {
        return new MutableScatterSet(0, 1, null);
    }

    @NotNull
    public static final MutableScatterSet mutableScatterSetOf(Object object0) {
        MutableScatterSet mutableScatterSet0 = new MutableScatterSet(1);
        mutableScatterSet0.plusAssign(object0);
        return mutableScatterSet0;
    }

    @NotNull
    public static final MutableScatterSet mutableScatterSetOf(Object object0, Object object1) {
        MutableScatterSet mutableScatterSet0 = new MutableScatterSet(2);
        mutableScatterSet0.plusAssign(object0);
        mutableScatterSet0.plusAssign(object1);
        return mutableScatterSet0;
    }

    @NotNull
    public static final MutableScatterSet mutableScatterSetOf(Object object0, Object object1, Object object2) {
        MutableScatterSet mutableScatterSet0 = new MutableScatterSet(3);
        mutableScatterSet0.plusAssign(object0);
        mutableScatterSet0.plusAssign(object1);
        mutableScatterSet0.plusAssign(object2);
        return mutableScatterSet0;
    }

    @NotNull
    public static final MutableScatterSet mutableScatterSetOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        MutableScatterSet mutableScatterSet0 = new MutableScatterSet(arr_object.length);
        mutableScatterSet0.plusAssign(arr_object);
        return mutableScatterSet0;
    }

    @NotNull
    public static final ScatterSet scatterSetOf() {
        Intrinsics.checkNotNull(ScatterSetKt.a, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return ScatterSetKt.a;
    }

    @NotNull
    public static final ScatterSet scatterSetOf(Object object0) {
        return ScatterSetKt.mutableScatterSetOf(object0);
    }

    @NotNull
    public static final ScatterSet scatterSetOf(Object object0, Object object1) {
        return ScatterSetKt.mutableScatterSetOf(object0, object1);
    }

    @NotNull
    public static final ScatterSet scatterSetOf(Object object0, Object object1, Object object2) {
        return ScatterSetKt.mutableScatterSetOf(object0, object1, object2);
    }

    @NotNull
    public static final ScatterSet scatterSetOf(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        ScatterSet scatterSet0 = new MutableScatterSet(arr_object.length);
        ((MutableScatterSet)scatterSet0).plusAssign(arr_object);
        return scatterSet0;
    }
}

