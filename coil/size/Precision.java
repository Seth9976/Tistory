package coil.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcoil/size/Precision;", "", "EXACT", "INEXACT", "AUTOMATIC", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum Precision {
    EXACT,
    INEXACT,
    AUTOMATIC;

    public static final Precision[] a;
    public static final EnumEntries b;

    static {
        Precision.a = arr_precision;
        Intrinsics.checkNotNullParameter(arr_precision, "entries");
        Precision.b = new a(arr_precision);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return Precision.b;
    }
}

