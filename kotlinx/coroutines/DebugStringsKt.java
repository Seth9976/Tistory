package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.DispatchedContinuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0007\u001A\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"classSimpleName", "", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class DebugStringsKt {
    @NotNull
    public static final String getClassSimpleName(@NotNull Object object0) {
        return object0.getClass().getSimpleName();
    }

    @NotNull
    public static final String getHexAddress(@NotNull Object object0) {
        return Integer.toHexString(System.identityHashCode(object0));
    }

    @NotNull
    public static final String toDebugString(@NotNull Continuation continuation0) {
        if(continuation0 instanceof DispatchedContinuation) {
            return continuation0.toString();
        }
        String s = continuation0 + '@' + DebugStringsKt.getHexAddress(continuation0);
        return Result.exceptionOrNull-impl(s) == null ? s : continuation0.getClass().getName() + '@' + DebugStringsKt.getHexAddress(continuation0);
    }
}

