package androidx.work;

import android.content.Context;
import androidx.activity.h;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import k5.a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000BJ\u0013\u0010\f\u001A\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000F\u001A\u00020\u000EH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\rJ\u001B\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001B\u0010\u0016\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u000EH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u000E0\b¢\u0006\u0004\b\u0018\u0010\u000BJ\r\u0010\u0019\u001A\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001AR\u001A\u0010 \u001A\u00020\u001B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR \u0010&\u001A\b\u0012\u0004\u0012\u00020\t0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R \u0010-\u001A\u00020\'8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u001A\u001A\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/ForegroundInfo;", "getForegroundInfo", "Landroidx/work/Data;", "data", "", "setProgress", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Lkotlinx/coroutines/CompletableJob;", "e", "Lkotlinx/coroutines/CompletableJob;", "getJob$work_runtime_release", "()Lkotlinx/coroutines/CompletableJob;", "job", "Landroidx/work/impl/utils/futures/SettableFuture;", "f", "Landroidx/work/impl/utils/futures/SettableFuture;", "getFuture$work_runtime_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "future", "Lkotlinx/coroutines/CoroutineDispatcher;", "g", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "coroutineContext", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoroutineWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineWorker.kt\nandroidx/work/CoroutineWorker\n+ 2 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,144:1\n40#2,8:145\n48#2:162\n60#2,7:163\n40#2,8:172\n48#2:189\n60#2,7:190\n314#3,9:153\n323#3,2:170\n314#3,9:180\n323#3,2:197\n*S KotlinDebug\n*F\n+ 1 CoroutineWorker.kt\nandroidx/work/CoroutineWorker\n*L\n110#1:145,8\n110#1:162\n110#1:163,7\n125#1:172,8\n125#1:189\n125#1:190,7\n110#1:153,9\n110#1:170,2\n125#1:180,9\n125#1:197,2\n*E\n"})
public abstract class CoroutineWorker extends ListenableWorker {
    public final CompletableJob e;
    public final SettableFuture f;
    public final CoroutineDispatcher g;

    public CoroutineWorker(@NotNull Context context0, @NotNull WorkerParameters workerParameters0) {
        Intrinsics.checkNotNullParameter(context0, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters0, "params");
        super(context0, workerParameters0);
        this.e = JobKt.Job$default(null, 1, null);
        SettableFuture settableFuture0 = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(settableFuture0, "create()");
        this.f = settableFuture0;
        settableFuture0.addListener(new h(this, 23), this.getTaskExecutor().getSerialTaskExecutor());
        this.g = Dispatchers.getDefault();
    }

    @Nullable
    public abstract Object doWork(@NotNull Continuation arg1);

    @NotNull
    public CoroutineDispatcher getCoroutineContext() {
        return this.g;
    }

    @Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static void getCoroutineContext$annotations() {
    }

    @Nullable
    public Object getForegroundInfo(@NotNull Continuation continuation0) {
        throw new IllegalStateException("Not implemented");
    }

    @Override  // androidx.work.ListenableWorker
    @NotNull
    public final ListenableFuture getForegroundInfoAsync() {
        CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
        CoroutineScope coroutineScope0 = CoroutineScopeKt.CoroutineScope(this.getCoroutineContext().plus(completableJob0));
        ListenableFuture listenableFuture0 = new JobListenableFuture(completableJob0, null, 2, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new a(((JobListenableFuture)listenableFuture0), this, null), 3, null);
        return listenableFuture0;
    }

    @NotNull
    public final SettableFuture getFuture$work_runtime_release() {
        return this.f;
    }

    @NotNull
    public final CompletableJob getJob$work_runtime_release() {
        return this.e;
    }

    @Override  // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.f.cancel(false);
    }

    @Nullable
    public final Object setForeground(@NotNull ForegroundInfo foregroundInfo0, @NotNull Continuation continuation0) {
        ListenableFuture listenableFuture0 = this.setForegroundAsync(foregroundInfo0);
        Intrinsics.checkNotNullExpressionValue(listenableFuture0, "setForegroundAsync(foregroundInfo)");
        if(listenableFuture0.isDone()) {
            try {
                listenableFuture0.get();
                return Unit.INSTANCE;
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
        listenableFuture0.addListener(new androidx.work.ListenableFutureKt.await.2.1(cancellableContinuationImpl0, listenableFuture0), DirectExecutor.INSTANCE);
        cancellableContinuationImpl0.invokeOnCancellation(new androidx.work.ListenableFutureKt.await.2.2(listenableFuture0));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == qd.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object setProgress(@NotNull Data data0, @NotNull Continuation continuation0) {
        ListenableFuture listenableFuture0 = this.setProgressAsync(data0);
        Intrinsics.checkNotNullExpressionValue(listenableFuture0, "setProgressAsync(data)");
        if(listenableFuture0.isDone()) {
            try {
                listenableFuture0.get();
                return Unit.INSTANCE;
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
        listenableFuture0.addListener(new androidx.work.ListenableFutureKt.await.2.1(cancellableContinuationImpl0, listenableFuture0), DirectExecutor.INSTANCE);
        cancellableContinuationImpl0.invokeOnCancellation(new androidx.work.ListenableFutureKt.await.2.2(listenableFuture0));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == qd.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.work.ListenableWorker
    @NotNull
    public final ListenableFuture startWork() {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(this.getCoroutineContext().plus(this.e)), null, null, new androidx.work.a(this, null), 3, null);
        return this.f;
    }
}

