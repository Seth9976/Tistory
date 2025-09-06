package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import k5.b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "Landroidx/work/Operation$State$SUCCESS;", "Landroidx/work/Operation;", "(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n+ 2 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,30:1\n40#2,8:31\n48#2:48\n60#2,7:49\n48#2:58\n60#2,7:59\n314#3,9:39\n323#3,2:56\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n*L\n29#1:31,8\n29#1:48\n29#1:49,7\n29#1:58\n29#1:59,7\n29#1:39,9\n29#1:56,2\n*E\n"})
public final class OperationKt {
    @Nullable
    public static final Object await(@NotNull Operation operation0, @NotNull Continuation continuation0) {
        Object object2;
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.q;
            if((v & 0x80000000) == 0) {
                b0 = new b(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                b0.q = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = b0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ListenableFuture listenableFuture0 = operation0.getResult();
                Intrinsics.checkNotNullExpressionValue(listenableFuture0, "result");
                if(listenableFuture0.isDone()) {
                    try {
                        object2 = listenableFuture0.get();
                    }
                    catch(ExecutionException executionException0) {
                        Throwable throwable0 = executionException0.getCause();
                        if(throwable0 != null) {
                            executionException0 = throwable0;
                        }
                        throw executionException0;
                    }
                }
                else {
                    b0.o = listenableFuture0;
                    b0.q = 1;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(b0), 1);
                    cancellableContinuationImpl0.initCancellability();
                    listenableFuture0.addListener(new androidx.work.ListenableFutureKt.await.2.1(cancellableContinuationImpl0, listenableFuture0), DirectExecutor.INSTANCE);
                    cancellableContinuationImpl0.invokeOnCancellation(new androidx.work.ListenableFutureKt.await.2.2(listenableFuture0));
                    object0 = cancellableContinuationImpl0.getResult();
                    if(object0 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(b0);
                    }
                    if(object0 == object1) {
                        return object1;
                    }
                    object2 = object0;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                object2 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Intrinsics.checkNotNullExpressionValue(object2, "result.await()");
        return object2;
    }
}

