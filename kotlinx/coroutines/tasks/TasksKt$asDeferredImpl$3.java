package kotlinx.coroutines.tasks;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0097\u0001\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001A\u00028\u0000H\u0096A\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0097\u0001\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\n\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0097\u0001\u00A2\u0006\u0004\b\n\u0010\u000FJ \u0010\n\u001A\u00020\t2\u000E\u0010\r\u001A\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0096\u0001\u00A2\u0006\u0004\b\n\u0010\u0012J8\u0010\u0018\u001A\u00028\u0001\"\u0004\b\u0001\u0010\u00132\u0006\u0010\u0014\u001A\u00028\u00012\u0018\u0010\u0017\u001A\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00010\u0015H\u0096\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001D\u001A\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u001A*\u00020\u00162\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00010\u001BH\u0096\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0014\u0010\u001F\u001A\u00060\u0010j\u0002`\u0011H\u0097\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00028\u0000H\u0097\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001A\u0004\u0018\u00010\fH\u0097\u0001\u00A2\u0006\u0004\b#\u0010$JI\u0010-\u001A\u00020,2\u0006\u0010%\u001A\u00020\u000E2\u0006\u0010&\u001A\u00020\u000E2\'\u0010+\u001A#\u0012\u0015\u0012\u0013\u0018\u00010\f\u00A2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\'j\u0002`*H\u0097\u0001\u00A2\u0006\u0004\b-\u0010.J9\u0010-\u001A\u00020,2\'\u0010+\u001A#\u0012\u0015\u0012\u0013\u0018\u00010\f\u00A2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\'j\u0002`*H\u0096\u0001\u00A2\u0006\u0004\b-\u0010/J\u0013\u00100\u001A\u00020\tH\u0096A\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u0010\bJ\u001C\u00102\u001A\u0002012\n\u0010\u001C\u001A\u0006\u0012\u0002\b\u00030\u001BH\u0096\u0001\u00A2\u0006\u0004\b2\u00103J\u0018\u00105\u001A\u0002012\u0006\u00104\u001A\u000201H\u0096\u0003\u00A2\u0006\u0004\b5\u00106J\u0018\u00105\u001A\u0002072\u0006\u00108\u001A\u000207H\u0097\u0003\u00A2\u0006\u0004\b5\u00109J\u0010\u0010:\u001A\u00020\u000EH\u0096\u0001\u00A2\u0006\u0004\b:\u0010;R\u001A\u0010?\u001A\b\u0012\u0004\u0012\u0002070<8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b=\u0010>R\u0014\u0010@\u001A\u00020\u000E8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b@\u0010;R\u0014\u0010A\u001A\u00020\u000E8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bA\u0010;R\u0014\u0010B\u001A\u00020\u000E8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bB\u0010;R\u0018\u0010\u001C\u001A\u0006\u0012\u0002\b\u00030\u001B8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bC\u0010DR\u001A\u0010H\u001A\b\u0012\u0004\u0012\u00028\u00000E8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bF\u0010GR\u0014\u0010L\u001A\u00020I8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bJ\u0010KR\u0016\u0010O\u001A\u0004\u0018\u0001078\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006P"}, d2 = {"kotlinx/coroutines/tasks/TasksKt$asDeferredImpl$3", "Lkotlinx/coroutines/Deferred;", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cancel", "()V", "", "cause", "", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getCompleted", "()Ljava/lang/Object;", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/Job;", "other", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "start", "()Z", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "isActive", "isCancelled", "isCompleted", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwait", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "getParent", "()Lkotlinx/coroutines/Job;", "parent", "kotlinx-coroutines-play-services"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TasksKt.asDeferredImpl.3 implements Deferred {
    public final CompletableDeferred a;

    public TasksKt.asDeferredImpl.3(CompletableDeferred completableDeferred0) {
        this.a = completableDeferred0;
    }

    @Override  // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public ChildHandle attachChild(@NotNull ChildJob childJob0) {
        return this.a.attachChild(childJob0);
    }

    @Override  // kotlinx.coroutines.Deferred
    @Nullable
    public Object await(@NotNull Continuation continuation0) {
        return this.a.await(continuation0);
    }

    @Override  // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public void cancel() {
        this.a.cancel();
    }

    @Override  // kotlinx.coroutines.Job
    public void cancel(@Nullable CancellationException cancellationException0) {
        this.a.cancel(cancellationException0);
    }

    @Override  // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public boolean cancel(Throwable throwable0) {
        return this.a.cancel(throwable0);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Object fold(Object object0, @NotNull Function2 function20) {
        return this.a.fold(object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @Nullable
    public Element get(@NotNull Key coroutineContext$Key0) {
        return this.a.get(coroutineContext$Key0);
    }

    @Override  // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public CancellationException getCancellationException() {
        return this.a.getCancellationException();
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public Sequence getChildren() {
        return this.a.getChildren();
    }

    @Override  // kotlinx.coroutines.Deferred
    @ExperimentalCoroutinesApi
    public Object getCompleted() {
        return this.a.getCompleted();
    }

    @Override  // kotlinx.coroutines.Deferred
    @ExperimentalCoroutinesApi
    @Nullable
    public Throwable getCompletionExceptionOrNull() {
        return this.a.getCompletionExceptionOrNull();
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public Key getKey() {
        return this.a.getKey();
    }

    @Override  // kotlinx.coroutines.Deferred
    @NotNull
    public SelectClause1 getOnAwait() {
        return this.a.getOnAwait();
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public SelectClause0 getOnJoin() {
        return this.a.getOnJoin();
    }

    @Override  // kotlinx.coroutines.Job
    @Nullable
    public Job getParent() {
        return this.a.getParent();
    }

    @Override  // kotlinx.coroutines.Job
    @NotNull
    public DisposableHandle invokeOnCompletion(@NotNull Function1 function10) {
        return this.a.invokeOnCompletion(function10);
    }

    @Override  // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public DisposableHandle invokeOnCompletion(boolean z, boolean z1, @NotNull Function1 function10) {
        return this.a.invokeOnCompletion(z, z1, function10);
    }

    @Override  // kotlinx.coroutines.Job
    public boolean isActive() {
        return this.a.isActive();
    }

    @Override  // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override  // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return this.a.isCompleted();
    }

    @Override  // kotlinx.coroutines.Job
    @Nullable
    public Object join(@NotNull Continuation continuation0) {
        return this.a.join(continuation0);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public CoroutineContext minusKey(@NotNull Key coroutineContext$Key0) {
        return this.a.minusKey(coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext0) {
        return this.a.plus(coroutineContext0);
    }

    @Override  // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public Job plus(@NotNull Job job0) {
        return this.a.plus(job0);
    }

    @Override  // kotlinx.coroutines.Job
    public boolean start() {
        return this.a.start();
    }
}

