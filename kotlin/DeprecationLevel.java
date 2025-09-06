package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/DeprecationLevel;", "", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum DeprecationLevel {
    WARNING,
    ERROR,
    HIDDEN;

    public static final DeprecationLevel[] a;
    public static final EnumEntries b;

    static {
        DeprecationLevel.a = arr_deprecationLevel;
        Intrinsics.checkNotNullParameter(arr_deprecationLevel, "entries");
        DeprecationLevel.b = new a(arr_deprecationLevel);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return DeprecationLevel.b;
    }
}

