package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0003\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0015\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001A\u001D\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001A%\u0010\u0003\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001A\u0019\u0010\u0003\u001A\u00020\u00002\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001A\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0011\u001A\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0012\u001A%\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0013\u001A\u0019\u0010\u000F\u001A\u00020\u000E2\n\u0010\f\u001A\u00020\u000B\"\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0014\u001A\u0018\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u001A\u0010\u001D\u001A\u00020\u000B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/collection/FloatSet;", "emptyFloatSet", "()Landroidx/collection/FloatSet;", "floatSetOf", "", "element1", "(F)Landroidx/collection/FloatSet;", "element2", "(FF)Landroidx/collection/FloatSet;", "element3", "(FFF)Landroidx/collection/FloatSet;", "", "elements", "([F)Landroidx/collection/FloatSet;", "Landroidx/collection/MutableFloatSet;", "mutableFloatSetOf", "()Landroidx/collection/MutableFloatSet;", "(F)Landroidx/collection/MutableFloatSet;", "(FF)Landroidx/collection/MutableFloatSet;", "(FFF)Landroidx/collection/MutableFloatSet;", "([F)Landroidx/collection/MutableFloatSet;", "k", "", "hash", "(F)I", "b", "[F", "getEmptyFloatArray", "()[F", "EmptyFloatArray", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class FloatSetKt {
    public static final MutableFloatSet a;
    public static final float[] b;

    static {
        FloatSetKt.a = new MutableFloatSet(0);
        FloatSetKt.b = new float[0];
    }

    @NotNull
    public static final FloatSet emptyFloatSet() {
        return FloatSetKt.a;
    }

    @NotNull
    public static final FloatSet floatSetOf() {
        return FloatSetKt.a;
    }

    @NotNull
    public static final FloatSet floatSetOf(float f) {
        return FloatSetKt.mutableFloatSetOf(f);
    }

    @NotNull
    public static final FloatSet floatSetOf(float f, float f1) {
        return FloatSetKt.mutableFloatSetOf(f, f1);
    }

    @NotNull
    public static final FloatSet floatSetOf(float f, float f1, float f2) {
        return FloatSetKt.mutableFloatSetOf(f, f1, f2);
    }

    @NotNull
    public static final FloatSet floatSetOf(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "elements");
        FloatSet floatSet0 = new MutableFloatSet(arr_f.length);
        ((MutableFloatSet)floatSet0).plusAssign(arr_f);
        return floatSet0;
    }

    @NotNull
    public static final float[] getEmptyFloatArray() {
        return FloatSetKt.b;
    }

    public static final int hash(float f) {
        int v = Float.hashCode(f);
        return v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f) {
        MutableFloatSet mutableFloatSet0 = new MutableFloatSet(1);
        mutableFloatSet0.plusAssign(f);
        return mutableFloatSet0;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f, float f1) {
        MutableFloatSet mutableFloatSet0 = new MutableFloatSet(2);
        mutableFloatSet0.plusAssign(f);
        mutableFloatSet0.plusAssign(f1);
        return mutableFloatSet0;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f, float f1, float f2) {
        MutableFloatSet mutableFloatSet0 = new MutableFloatSet(3);
        mutableFloatSet0.plusAssign(f);
        mutableFloatSet0.plusAssign(f1);
        mutableFloatSet0.plusAssign(f2);
        return mutableFloatSet0;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "elements");
        MutableFloatSet mutableFloatSet0 = new MutableFloatSet(arr_f.length);
        mutableFloatSet0.plusAssign(arr_f);
        return mutableFloatSet0;
    }
}

