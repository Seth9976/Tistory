package androidx.work;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A!\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "R", "Lcom/google/common/util/concurrent/ListenableFuture;", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n314#2,11:92\n*S KotlinDebug\n*F\n+ 1 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n*L\n47#1:92,11\n*E\n"})
public final class ListenableFutureKt {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public static final Object await(@NotNull ListenableFuture listenableFuture0, @NotNull Continuation continuation0) {
        if(listenableFuture0.isDone()) {
            try {
                return listenableFuture0.get();
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                if(throwable0 != null) {
                    executionException0 = throwable0;
                }
                throw executionException0;
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        listenableFuture0.addListener(new Runnable() {
            @Override
            public final void run() {
                CancellableContinuation cancellableContinuation0;
                try {
                    cancellableContinuation0 = cancellableContinuationImpl0;
                    cancellableContinuation0.resumeWith(Result.constructor-impl(listenableFuture0.get()));
                }
                catch(Throwable throwable0) {
                    Throwable throwable1 = throwable0.getCause();
                    if(throwable1 == null) {
                        throwable1 = throwable0;
                    }
                    if(throwable0 instanceof CancellationException) {
                        cancellableContinuation0.cancel(throwable1);
                        return;
                    }
                    cancellableContinuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable1)));
                }
            }
        }, DirectExecutor.INSTANCE);
        cancellableContinuationImpl0.invokeOnCancellation(new Function1(listenableFuture0) {
            public final ListenableFuture w;

            {
                this.w = listenableFuture0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Throwable throwable0) {
                this.w.cancel(false);
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

