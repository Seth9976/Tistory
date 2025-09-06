package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\u001A%\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A-\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A%\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\n\u0010\u000B\u001A%\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\f\u0010\u000B\u001A)\u0010\u0012\u001A\u00020\u0011*\u0006\u0012\u0002\b\u00030\r2\u0010\b\u0002\u0010\u0010\u001A\n\u0018\u00010\u000Ej\u0004\u0018\u0001`\u000FH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\"\u0010\u0015\u001A\u00020\u0014*\u0006\u0012\u0002\b\u00030\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0015\u0010\u0016\"\"\u0010\u001C\u001A\u00020\u0005*\u0006\u0012\u0002\b\u00030\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001B\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001D"}, d2 = {"T", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "cancellable", "(Lkotlinx/coroutines/flow/SharedFlow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "context", "flowOn", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "conflate", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "distinctUntilChanged", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "cancel", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/util/concurrent/CancellationException;)V", "", "isActive", "(Lkotlinx/coroutines/flow/FlowCollector;)Z", "isActive$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getCoroutineContext", "(Lkotlinx/coroutines/flow/FlowCollector;)Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LintKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @ReplaceWith(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void cancel(@NotNull FlowCollector flowCollector0, @Nullable CancellationException cancellationException0) {
        throw a.h();
    }

    public static void cancel$default(FlowCollector flowCollector0, CancellationException cancellationException0, int v, Object object0) {
        if((v & 1) != 0) {
            cancellationException0 = null;
        }
        LintKt.cancel(flowCollector0, cancellationException0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Applying \'cancellable\' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @NotNull
    public static final Flow cancellable(@NotNull SharedFlow sharedFlow0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Applying \'conflate\' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @NotNull
    public static final Flow conflate(@NotNull StateFlow stateFlow0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Applying \'distinctUntilChanged\' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @NotNull
    public static final Flow distinctUntilChanged(@NotNull StateFlow stateFlow0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Applying \'flowOn\' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @ReplaceWith(expression = "this", imports = {}))
    @NotNull
    public static final Flow flowOn(@NotNull SharedFlow sharedFlow0, @NotNull CoroutineContext coroutineContext0) {
        throw a.h();
    }

    @NotNull
    public static final CoroutineContext getCoroutineContext(@NotNull FlowCollector flowCollector0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @ReplaceWith(expression = "currentCoroutineContext()", imports = {}))
    public static void getCoroutineContext$annotations(FlowCollector flowCollector0) {
    }

    public static final boolean isActive(@NotNull FlowCollector flowCollector0) {
        throw a.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @ReplaceWith(expression = "currentCoroutineContext().isActive", imports = {}))
    public static void isActive$annotations(FlowCollector flowCollector0) {
    }
}

