package kotlinx.coroutines.android;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,18:1\n202#2,2:19\n*E\n"})
public final class HandlerDispatcherKt.awaitFrameSlowPath.lambda.3..inlined.Runnable.1 implements Runnable {
    public final CancellableContinuation a;

    public HandlerDispatcherKt.awaitFrameSlowPath.lambda.3..inlined.Runnable.1(CancellableContinuation cancellableContinuation0) {
        this.a = cancellableContinuation0;
        super();
    }

    @Override
    public final void run() {
        HandlerDispatcherKt.access$updateChoreographerAndPostFrameCallback(this.a);
    }
}

