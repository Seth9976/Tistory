package kotlin.collections;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import sd.a;

public enum i0 {
    Ready,
    NotReady,
    Done,
    Failed;

    public static final i0[] e;
    public static final EnumEntries f;

    static {
        i0.e = arr_i0;
        Intrinsics.checkNotNullParameter(arr_i0, "entries");
        i0.f = new a(arr_i0);
    }
}

