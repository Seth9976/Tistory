package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import sf.h;
import sf.i;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class JobKt {
    @NotNull
    public static final CompletableJob Job(@Nullable Job job0) {
        return new JobImpl(job0);
    }

    public static CompletableJob Job$default(Job job0, int v, Object object0) {
        if((v & 1) != 0) {
            job0 = null;
        }
        return JobKt.Job(job0);
    }

    public static Job Job$default(Job job0, int v, Object object0) {
        if((v & 1) != 0) {
            job0 = null;
        }
        return JobKt.Job(job0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void cancel(CoroutineContext coroutineContext0) {
        JobKt.cancel(coroutineContext0, null);
    }

    public static final void cancel(@NotNull CoroutineContext coroutineContext0, @Nullable CancellationException cancellationException0) {
        Job job0 = (Job)coroutineContext0.get(Job.Key);
        if(job0 != null) {
            job0.cancel(cancellationException0);
        }
    }

    public static final void cancel(@NotNull Job job0, @NotNull String s, @Nullable Throwable throwable0) {
        job0.cancel(ExceptionsKt.CancellationException(s, throwable0));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final boolean cancel(CoroutineContext coroutineContext0, Throwable throwable0) {
        Element coroutineContext$Element0 = coroutineContext0.get(Job.Key);
        JobSupport jobSupport0 = coroutineContext$Element0 instanceof JobSupport ? ((JobSupport)coroutineContext$Element0) : null;
        if(jobSupport0 == null) {
            return false;
        }
        if(throwable0 == null) {
            throwable0 = new JobCancellationException("Job was cancelled", null, jobSupport0);
        }
        jobSupport0.cancelInternal(throwable0);
        return true;
    }

    public static void cancel$default(CoroutineContext coroutineContext0, CancellationException cancellationException0, int v, Object object0) {
        if((v & 1) != 0) {
            cancellationException0 = null;
        }
        JobKt.cancel(coroutineContext0, cancellationException0);
    }

    public static void cancel$default(Job job0, String s, Throwable throwable0, int v, Object object0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        JobKt.cancel(job0, s, throwable0);
    }

    public static boolean cancel$default(CoroutineContext coroutineContext0, Throwable throwable0, int v, Object object0) {
        if((v & 1) != 0) {
            throwable0 = null;
        }
        return JobKt.cancel(coroutineContext0, throwable0);
    }

    @Nullable
    public static final Object cancelAndJoin(@NotNull Job job0, @NotNull Continuation continuation0) {
        DefaultImpls.cancel$default(job0, null, 1, null);
        Unit unit0 = job0.join(continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void cancelChildren(CoroutineContext coroutineContext0) {
        JobKt.cancelChildren(coroutineContext0, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void cancelChildren(CoroutineContext coroutineContext0, Throwable throwable0) {
        Job job0 = (Job)coroutineContext0.get(Job.Key);
        if(job0 != null) {
            for(Object object0: job0.getChildren()) {
                Job job1 = (Job)object0;
                JobSupport jobSupport0 = job1 instanceof JobSupport ? ((JobSupport)job1) : null;
                if(jobSupport0 != null) {
                    Throwable throwable1 = throwable0 == null ? new JobCancellationException("Job was cancelled", null, job0) : throwable0;
                    jobSupport0.cancelInternal(throwable1);
                }
            }
        }
    }

    public static final void cancelChildren(@NotNull CoroutineContext coroutineContext0, @Nullable CancellationException cancellationException0) {
        Job job0 = (Job)coroutineContext0.get(Job.Key);
        if(job0 != null) {
            Sequence sequence0 = job0.getChildren();
            if(sequence0 != null) {
                for(Object object0: sequence0) {
                    ((Job)object0).cancel(cancellationException0);
                }
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void cancelChildren(Job job0) {
        JobKt.cancelChildren(job0, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void cancelChildren(Job job0, Throwable throwable0) {
        for(Object object0: job0.getChildren()) {
            Job job1 = (Job)object0;
            JobSupport jobSupport0 = job1 instanceof JobSupport ? ((JobSupport)job1) : null;
            if(jobSupport0 != null) {
                Throwable throwable1 = throwable0 == null ? new JobCancellationException("Job was cancelled", null, job0) : throwable0;
                jobSupport0.cancelInternal(throwable1);
            }
        }
    }

    public static final void cancelChildren(@NotNull Job job0, @Nullable CancellationException cancellationException0) {
        for(Object object0: job0.getChildren()) {
            ((Job)object0).cancel(cancellationException0);
        }
    }

    public static void cancelChildren$default(CoroutineContext coroutineContext0, Throwable throwable0, int v, Object object0) {
        if((v & 1) != 0) {
            throwable0 = null;
        }
        JobKt.cancelChildren(coroutineContext0, throwable0);
    }

    public static void cancelChildren$default(CoroutineContext coroutineContext0, CancellationException cancellationException0, int v, Object object0) {
        if((v & 1) != 0) {
            cancellationException0 = null;
        }
        JobKt.cancelChildren(coroutineContext0, cancellationException0);
    }

    public static void cancelChildren$default(Job job0, Throwable throwable0, int v, Object object0) {
        if((v & 1) != 0) {
            throwable0 = null;
        }
        JobKt.cancelChildren(job0, throwable0);
    }

    public static void cancelChildren$default(Job job0, CancellationException cancellationException0, int v, Object object0) {
        if((v & 1) != 0) {
            cancellationException0 = null;
        }
        JobKt.cancelChildren(job0, cancellationException0);
    }

    public static final void cancelFutureOnCancellation(@NotNull CancellableContinuation cancellableContinuation0, @NotNull Future future0) {
        cancellableContinuation0.invokeOnCancellation(new h(future0, 0));
    }

    @InternalCoroutinesApi
    @NotNull
    public static final DisposableHandle cancelFutureOnCompletion(@NotNull Job job0, @NotNull Future future0) {
        return job0.invokeOnCompletion(new i(future0));
    }

    @NotNull
    public static final DisposableHandle disposeOnCompletion(@NotNull Job job0, @NotNull DisposableHandle disposableHandle0) {
        return job0.invokeOnCompletion(new DisposeOnCompletion(disposableHandle0));
    }

    public static final void ensureActive(@NotNull CoroutineContext coroutineContext0) {
        Job job0 = (Job)coroutineContext0.get(Job.Key);
        if(job0 != null) {
            JobKt.ensureActive(job0);
        }
    }

    public static final void ensureActive(@NotNull Job job0) {
        if(!job0.isActive()) {
            throw job0.getCancellationException();
        }
    }

    @NotNull
    public static final Job getJob(@NotNull CoroutineContext coroutineContext0) {
        Job job0 = (Job)coroutineContext0.get(Job.Key);
        if(job0 == null) {
            throw new IllegalStateException(("Current context doesn\'t contain Job in it: " + coroutineContext0).toString());
        }
        return job0;
    }

    public static final boolean isActive(@NotNull CoroutineContext coroutineContext0) {
        Job job0 = (Job)coroutineContext0.get(Job.Key);
        return job0 == null ? true : job0.isActive();
    }
}

