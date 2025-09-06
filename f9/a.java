package f9;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

public enum a {
    NONE,
    WIFI,
    MOBILE,
    ETC;

    public static final a[] e;
    public static final EnumEntries f;

    static {
        a.e = arr_a;
        Intrinsics.checkNotNullParameter(arr_a, "entries");
        a.f = new sd.a(arr_a);
    }
}

