package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "CONTINUE", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.8")
@ExperimentalPathApi
public enum CopyActionResult {
    CONTINUE,
    SKIP_SUBTREE,
    TERMINATE;

    public static final CopyActionResult[] a;
    public static final EnumEntries b;

    static {
        CopyActionResult.a = arr_copyActionResult;
        Intrinsics.checkNotNullParameter(arr_copyActionResult, "entries");
        CopyActionResult.b = new a(arr_copyActionResult);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CopyActionResult.b;
    }
}

