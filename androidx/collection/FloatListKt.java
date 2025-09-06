package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0015\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001A%\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0003\u001A\u00020\u00002\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001A\u0010\u0010\u000F\u001A\u00020\u000EH\u0086\b¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0011\u001A\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0012\u001A%\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0013\u001A\u001C\u0010\u000F\u001A\u00020\u000E2\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000F\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/collection/FloatList;", "emptyFloatList", "()Landroidx/collection/FloatList;", "floatListOf", "", "element1", "(F)Landroidx/collection/FloatList;", "element2", "(FF)Landroidx/collection/FloatList;", "element3", "(FFF)Landroidx/collection/FloatList;", "", "elements", "([F)Landroidx/collection/FloatList;", "Landroidx/collection/MutableFloatList;", "mutableFloatListOf", "()Landroidx/collection/MutableFloatList;", "(F)Landroidx/collection/MutableFloatList;", "(FF)Landroidx/collection/MutableFloatList;", "(FFF)Landroidx/collection/MutableFloatList;", "([F)Landroidx/collection/MutableFloatList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class FloatListKt {
    public static final MutableFloatList a;

    static {
        FloatListKt.a = new MutableFloatList(0);
    }

    @NotNull
    public static final FloatList emptyFloatList() {
        return FloatListKt.a;
    }

    @NotNull
    public static final FloatList floatListOf() {
        return FloatListKt.a;
    }

    @NotNull
    public static final FloatList floatListOf(float f) {
        return FloatListKt.mutableFloatListOf(f);
    }

    @NotNull
    public static final FloatList floatListOf(float f, float f1) {
        return FloatListKt.mutableFloatListOf(f, f1);
    }

    @NotNull
    public static final FloatList floatListOf(float f, float f1, float f2) {
        return FloatListKt.mutableFloatListOf(f, f1, f2);
    }

    @NotNull
    public static final FloatList floatListOf(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "elements");
        FloatList floatList0 = new MutableFloatList(arr_f.length);
        ((MutableFloatList)floatList0).plusAssign(arr_f);
        return floatList0;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f) {
        MutableFloatList mutableFloatList0 = new MutableFloatList(1);
        mutableFloatList0.add(f);
        return mutableFloatList0;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f, float f1) {
        MutableFloatList mutableFloatList0 = new MutableFloatList(2);
        mutableFloatList0.add(f);
        mutableFloatList0.add(f1);
        return mutableFloatList0;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f, float f1, float f2) {
        MutableFloatList mutableFloatList0 = new MutableFloatList(3);
        mutableFloatList0.add(f);
        mutableFloatList0.add(f1);
        mutableFloatList0.add(f2);
        return mutableFloatList0;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "elements");
        MutableFloatList mutableFloatList0 = new MutableFloatList(arr_f.length);
        mutableFloatList0.plusAssign(arr_f);
        return mutableFloatList0;
    }
}

