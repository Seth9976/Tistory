package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import md.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.e;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AI\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001A\u0002H\u00042\u0006\u0010\u0007\u001A\u00020\bH\u0000¢\u0006\u0002\u0010\t\u001A=\u0010\n\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001A\u0002H\u00042\u0006\u0010\u0007\u001A\u00020\bH\u0000¢\u0006\u0002\u0010\u000B\u001AC\u0010\f\u001A\u0004\u0018\u00010\r\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001A\u0002H\u00042\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000F**\b\u0000\u0010\u0010\u001A\u0004\b\u0000\u0010\u0004\"\u000E\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u00012\u000E\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0011"}, d2 = {"bindCancellationFun", "Lkotlin/Function1;", "", "", "E", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;", "callUndeliveredElement", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "callUndeliveredElementCatchingException", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOnUndeliveredElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,44:1\n75#2:45\n*S KotlinDebug\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n*L\n22#1:45\n*E\n"})
public final class OnUndeliveredElementKt {
    @NotNull
    public static final Function1 bindCancellationFun(@NotNull Function1 function10, Object object0, @NotNull CoroutineContext coroutineContext0) {
        return new e(function10, object0, 0, coroutineContext0);
    }

    public static final void callUndeliveredElement(@NotNull Function1 function10, Object object0, @NotNull CoroutineContext coroutineContext0) {
        UndeliveredElementException undeliveredElementException0 = OnUndeliveredElementKt.callUndeliveredElementCatchingException(function10, object0, null);
        if(undeliveredElementException0 != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext0, undeliveredElementException0);
        }
    }

    @Nullable
    public static final UndeliveredElementException callUndeliveredElementCatchingException(@NotNull Function1 function10, Object object0, @Nullable UndeliveredElementException undeliveredElementException0) {
        try {
            function10.invoke(object0);
            return undeliveredElementException0;
        }
        catch(Throwable throwable0) {
            if(undeliveredElementException0 != null && undeliveredElementException0.getCause() != throwable0) {
                b.addSuppressed(undeliveredElementException0, throwable0);
                return undeliveredElementException0;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + object0, throwable0);
        }
    }

    public static UndeliveredElementException callUndeliveredElementCatchingException$default(Function1 function10, Object object0, UndeliveredElementException undeliveredElementException0, int v, Object object1) {
        if((v & 2) != 0) {
            undeliveredElementException0 = null;
        }
        return OnUndeliveredElementKt.callUndeliveredElementCatchingException(function10, object0, undeliveredElementException0);
    }
}

