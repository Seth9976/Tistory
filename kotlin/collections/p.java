package kotlin.collections;

import a5.b;
import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

public abstract class p extends o {
    public static final int access$reverseElementIndex(List list0, int v) {
        if(new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list0)).contains(v)) {
            return CollectionsKt__CollectionsKt.getLastIndex(list0) - v;
        }
        StringBuilder stringBuilder0 = b.s(v, "Element index ", " must be in range [");
        stringBuilder0.append(new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list0)));
        stringBuilder0.append("].");
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public static final int access$reverseIteratorIndex(List list0, int v) {
        return CollectionsKt__CollectionsKt.getLastIndex(list0) - v;
    }

    public static final int access$reversePositionIndex(List list0, int v) {
        if(new IntRange(0, list0.size()).contains(v)) {
            return list0.size() - v;
        }
        StringBuilder stringBuilder0 = b.s(v, "Position index ", " must be in range [");
        stringBuilder0.append(new IntRange(0, list0.size()));
        stringBuilder0.append("].");
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @NotNull
    public static List asReversed(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return new c0(list0);
    }

    @JvmName(name = "asReversedMutable")
    @NotNull
    public static List asReversedMutable(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        return new b0(list0);
    }
}

