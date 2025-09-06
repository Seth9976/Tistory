package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@SinceKotlin(version = "1.3")
public enum CoroutineSingletons {
    COROUTINE_SUSPENDED,
    UNDECIDED,
    RESUMED;

    public static final CoroutineSingletons[] a;
    public static final EnumEntries b;

    static {
        CoroutineSingletons.a = arr_coroutineSingletons;
        Intrinsics.checkNotNullParameter(arr_coroutineSingletons, "entries");
        CoroutineSingletons.b = new a(arr_coroutineSingletons);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CoroutineSingletons.b;
    }
}

