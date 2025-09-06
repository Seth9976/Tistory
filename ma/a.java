package ma;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

public enum a {
    Circle,
    Rectangle;

    public static final a[] c;
    public static final EnumEntries d;

    static {
        a.c = arr_a;
        Intrinsics.checkNotNullParameter(arr_a, "entries");
        a.d = new sd.a(arr_a);
    }
}

