package kotlin.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.2")
public enum RequireKotlinVersionKind {
    LANGUAGE_VERSION,
    COMPILER_VERSION,
    API_VERSION;

    public static final RequireKotlinVersionKind[] a;
    public static final EnumEntries b;

    static {
        RequireKotlinVersionKind.a = arr_requireKotlinVersionKind;
        Intrinsics.checkNotNullParameter(arr_requireKotlinVersionKind, "entries");
        RequireKotlinVersionKind.b = new a(arr_requireKotlinVersionKind);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return RequireKotlinVersionKind.b;
    }
}

