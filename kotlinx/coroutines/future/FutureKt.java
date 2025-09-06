package kotlinx.coroutines.future;

import androidx.compose.foundation.text.selection.b1;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import u2.b;
import y0.y0;
import yf.c;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A]\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\'\u0010\n\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001A#\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000E¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0017\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00120\u000B*\u00020\u0011¢\u0006\u0004\b\u000F\u0010\u0013\u001A#\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001A#\u0010\u0017\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Ljava/util/concurrent/CompletableFuture;", "future", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/Deferred;", "asCompletableFuture", "(Lkotlinx/coroutines/Deferred;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/Job;", "", "(Lkotlinx/coroutines/Job;)Ljava/util/concurrent/CompletableFuture;", "Ljava/util/concurrent/CompletionStage;", "asDeferred", "(Ljava/util/concurrent/CompletionStage;)Lkotlinx/coroutines/Deferred;", "await", "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,197:1\n1#2:198\n314#3,11:199\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n172#1:199,11\n*E\n"})
public final class FutureKt {
    @NotNull
    public static final CompletableFuture asCompletableFuture(@NotNull Deferred deferred0) {
        CompletableFuture completableFuture0 = new CompletableFuture();
        completableFuture0.handle(new c(deferred0, 1));
        deferred0.invokeOnCompletion(new b(11, completableFuture0, deferred0));
        return completableFuture0;
    }

    @NotNull
    public static final CompletableFuture asCompletableFuture(@NotNull Job job0) {
        CompletableFuture completableFuture0 = new CompletableFuture();
        completableFuture0.handle(new c(job0, 1));
        job0.invokeOnCompletion(new y0(completableFuture0, 1));
        return completableFuture0;
    }

    @NotNull
    public static final Deferred asDeferred(@NotNull CompletionStage completionStage0) {
        CompletableFuture completableFuture0 = completionStage0.toCompletableFuture();
        if(completableFuture0.isDone()) {
            try {
                return CompletableDeferredKt.CompletableDeferred(completableFuture0.get());
            }
            catch(Throwable throwable0) {
                ExecutionException executionException0 = throwable0 instanceof ExecutionException ? ((ExecutionException)throwable0) : null;
                if(executionException0 != null) {
                    Throwable throwable1 = executionException0.getCause();
                    if(throwable1 != null) {
                        throwable0 = throwable1;
                    }
                }
                CompletableDeferred completableDeferred0 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                completableDeferred0.completeExceptionally(throwable0);
                return completableDeferred0;
            }
        }
        Deferred deferred0 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        completionStage0.handle(new c(new b1(deferred0, 22), 0));
        JobKt.cancelFutureOnCompletion(deferred0, completableFuture0);
        return deferred0;
    }

    @Nullable
    public static final Object await(@NotNull CompletionStage completionStage0, @NotNull Continuation continuation0) {
        CompletableFuture completableFuture0 = completionStage0.toCompletableFuture();
        if(completableFuture0.isDone()) {
            try {
                return completableFuture0.get();
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
        yf.b b0 = new yf.b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b0.cont = cancellableContinuationImpl0;
        completionStage0.handle(b0);
        cancellableContinuationImpl0.invokeOnCancellation(new b(12, completableFuture0, b0));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @NotNull
    public static final CompletableFuture future(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0, @NotNull CoroutineStart coroutineStart0, @NotNull Function2 function20) {
        if(coroutineStart0.isLazy()) {
            throw new IllegalArgumentException((coroutineStart0 + " start is not supported").toString());
        }
        CoroutineContext coroutineContext1 = CoroutineContextKt.newCoroutineContext(coroutineScope0, coroutineContext0);
        CompletableFuture completableFuture0 = new CompletableFuture();
        yf.a a0 = new yf.a(coroutineContext1, completableFuture0);
        completableFuture0.handle(a0);
        a0.start(coroutineStart0, a0, function20);
        return completableFuture0;
    }

    public static CompletableFuture future$default(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0, CoroutineStart coroutineStart0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v & 2) != 0) {
            coroutineStart0 = CoroutineStart.DEFAULT;
        }
        return FutureKt.future(coroutineScope0, coroutineContext0, coroutineStart0, function20);
    }
}

