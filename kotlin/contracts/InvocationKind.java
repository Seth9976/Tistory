package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.internal.ContractsDsl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
@ExperimentalContracts
@ContractsDsl
public enum InvocationKind {
    @ContractsDsl
    AT_MOST_ONCE,
    @ContractsDsl
    AT_LEAST_ONCE,
    @ContractsDsl
    EXACTLY_ONCE,
    @ContractsDsl
    UNKNOWN;

    public static final InvocationKind[] a;
    public static final EnumEntries b;

    static {
        InvocationKind.a = arr_invocationKind;
        Intrinsics.checkNotNullParameter(arr_invocationKind, "entries");
        InvocationKind.b = new a(arr_invocationKind);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return InvocationKind.b;
    }
}

