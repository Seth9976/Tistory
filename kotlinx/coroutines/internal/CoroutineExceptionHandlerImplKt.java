package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0006\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00000\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "callback", "", "ensurePlatformExceptionHandlerLoaded", "(Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "", "exception", "propagateExceptionFinalResort", "(Ljava/lang/Throwable;)V", "", "a", "Ljava/util/Collection;", "getPlatformExceptionHandlers", "()Ljava/util/Collection;", "platformExceptionHandlers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class CoroutineExceptionHandlerImplKt {
    public static final Collection a;

    static {
        CoroutineExceptionHandlerImplKt.a = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.asSequence(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));
    }

    public static final void ensurePlatformExceptionHandlerLoaded(@NotNull CoroutineExceptionHandler coroutineExceptionHandler0) {
        if(!CoroutineExceptionHandlerImplKt.a.contains(coroutineExceptionHandler0)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader");
        }
    }

    @NotNull
    public static final Collection getPlatformExceptionHandlers() {
        return CoroutineExceptionHandlerImplKt.a;
    }

    public static final void propagateExceptionFinalResort(@NotNull Throwable throwable0) {
        Thread thread0 = Thread.currentThread();
        thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
    }
}

