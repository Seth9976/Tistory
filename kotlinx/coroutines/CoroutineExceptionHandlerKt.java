package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;
import md.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001A%\u0010\u0000\u001A\u00020\u00012\u001A\b\u0004\u0010\u0002\u001A\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\b\u001A\u0018\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0005H\u0007\u001A\u0018\u0010\n\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\u00052\u0006\u0010\f\u001A\u00020\u0005H\u0000¨\u0006\r"}, d2 = {"CoroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "", "", "handleCoroutineException", "context", "exception", "handlerException", "originalException", "thrownException", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,110:1\n75#2:111\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n38#1:111\n*E\n"})
public final class CoroutineExceptionHandlerKt {
    @NotNull
    public static final CoroutineExceptionHandler CoroutineExceptionHandler(@NotNull Function2 function20) {
        return new CoroutineExceptionHandler(CoroutineExceptionHandler.Key) {
            @Override  // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(@NotNull CoroutineContext coroutineContext0, @NotNull Throwable throwable0) {
                function20.invoke(coroutineContext0, throwable0);
            }
        };
    }

    @InternalCoroutinesApi
    public static final void handleCoroutineException(@NotNull CoroutineContext coroutineContext0, @NotNull Throwable throwable0) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)coroutineContext0.get(CoroutineExceptionHandler.Key);
            if(coroutineExceptionHandler0 != null) {
                coroutineExceptionHandler0.handleException(coroutineContext0, throwable0);
                return;
            }
        }
        catch(Throwable throwable1) {
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(coroutineContext0, CoroutineExceptionHandlerKt.handlerException(throwable0, throwable1));
            return;
        }
        CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(coroutineContext0, throwable0);
    }

    @NotNull
    public static final Throwable handlerException(@NotNull Throwable throwable0, @NotNull Throwable throwable1) {
        if(throwable0 == throwable1) {
            return throwable0;
        }
        Throwable throwable2 = new RuntimeException("Exception while trying to handle coroutine exception", throwable1);
        b.addSuppressed(throwable2, throwable0);
        return throwable2;
    }
}

