package androidx.room;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

public final class b {
    public final IntRange a;
    public final List b;

    public b(List list0, IntRange intRange0) {
        Intrinsics.checkNotNullParameter(intRange0, "resultRange");
        Intrinsics.checkNotNullParameter(list0, "resultIndices");
        super();
        this.a = intRange0;
        this.b = list0;
    }
}

