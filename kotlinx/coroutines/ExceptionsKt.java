package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import md.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001A\u001E\u0010\u0000\u001A\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001A\u0004\u0018\u00010\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u001A\u0015\u0010\u0007\u001A\u00020\b*\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u0080\b*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\n"}, d2 = {"CancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "cause", "", "addSuppressedThrowable", "", "other", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class ExceptionsKt {
    @NotNull
    public static final CancellationException CancellationException(@Nullable String s, @Nullable Throwable throwable0) {
        CancellationException cancellationException0 = new CancellationException(s);
        cancellationException0.initCause(throwable0);
        return cancellationException0;
    }

    public static final void addSuppressedThrowable(@NotNull Throwable throwable0, @NotNull Throwable throwable1) {
        b.addSuppressed(throwable0, throwable1);
    }
}

