package kotlinx.coroutines.tasks;

import aa.r;
import androidx.core.app.h;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eg.a;
import eg.b;
import eg.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A#\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001A#\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001A-\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t\u001A#\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A+\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Lkotlinx/coroutines/Deferred;", "Lcom/google/android/gms/tasks/Task;", "asTask", "(Lkotlinx/coroutines/Deferred;)Lcom/google/android/gms/tasks/Task;", "asDeferred", "(Lcom/google/android/gms/tasks/Task;)Lkotlinx/coroutines/Deferred;", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;)Lkotlinx/coroutines/Deferred;", "await", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,167:1\n314#2,11:168\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n139#1:168,11\n*E\n"})
public final class TasksKt {
    public static final TasksKt.asDeferredImpl.3 a(Task task0, CancellationTokenSource cancellationTokenSource0) {
        CompletableDeferred completableDeferred0 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if(task0.isComplete()) {
            Exception exception0 = task0.getException();
            if(exception0 != null) {
                completableDeferred0.completeExceptionally(exception0);
            }
            else if(task0.isCanceled()) {
                DefaultImpls.cancel$default(completableDeferred0, null, 1, null);
            }
            else {
                completableDeferred0.complete(task0.getResult());
            }
        }
        else {
            h h0 = new h(completableDeferred0, 12);
            task0.addOnCompleteListener((a this) -> runnable0.run(), h0);
        }
        if(cancellationTokenSource0 != null) {
            completableDeferred0.invokeOnCompletion(new b(cancellationTokenSource0, 0));
        }
        return new TasksKt.asDeferredImpl.3(completableDeferred0);
    }

    public static final Object access$awaitImpl(Task task0, CancellationTokenSource cancellationTokenSource0, Continuation continuation0) {
        return TasksKt.b(task0, cancellationTokenSource0, continuation0);
    }

    @NotNull
    public static final Deferred asDeferred(@NotNull Task task0) {
        return TasksKt.a(task0, null);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final Deferred asDeferred(@NotNull Task task0, @NotNull CancellationTokenSource cancellationTokenSource0) {
        return TasksKt.a(task0, cancellationTokenSource0);
    }

    @NotNull
    public static final Task asTask(@NotNull Deferred deferred0) {
        CancellationTokenSource cancellationTokenSource0 = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource(cancellationTokenSource0.getToken());
        deferred0.invokeOnCompletion(new r(cancellationTokenSource0, deferred0, 7, taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    @ExperimentalCoroutinesApi
    @Nullable
    public static final Object await(@NotNull Task task0, @NotNull CancellationTokenSource cancellationTokenSource0, @NotNull Continuation continuation0) {
        return TasksKt.b(task0, cancellationTokenSource0, continuation0);
    }

    @Nullable
    public static final Object await(@NotNull Task task0, @NotNull Continuation continuation0) {
        return TasksKt.b(task0, null, continuation0);
    }

    public static final Object b(Task task0, CancellationTokenSource cancellationTokenSource0, Continuation continuation0) {
        if(task0.isComplete()) {
            Exception exception0 = task0.getException();
            if(exception0 != null) {
                throw exception0;
            }
            if(task0.isCanceled()) {
                throw new CancellationException("Task " + task0 + " was cancelled normally.");
            }
            return task0.getResult();
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        c c0 = new c(cancellableContinuationImpl0);
        task0.addOnCompleteListener((a this) -> runnable0.run(), c0);
        if(cancellationTokenSource0 != null) {
            cancellableContinuationImpl0.invokeOnCancellation(new b(cancellationTokenSource0, 1));
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == qd.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

