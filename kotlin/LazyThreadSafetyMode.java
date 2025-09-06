package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum LazyThreadSafetyMode {
    SYNCHRONIZED,
    PUBLICATION,
    NONE;

    public static final LazyThreadSafetyMode[] a;
    public static final EnumEntries b;

    static {
        LazyThreadSafetyMode.a = arr_lazyThreadSafetyMode;
        Intrinsics.checkNotNullParameter(arr_lazyThreadSafetyMode, "entries");
        LazyThreadSafetyMode.b = new a(arr_lazyThreadSafetyMode);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return LazyThreadSafetyMode.b;
    }
}

