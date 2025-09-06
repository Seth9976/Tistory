package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import fg.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000F\u001A\u00020\u000E2\u000E\u0010\u000B\u001A\n \n*\u0004\u0018\u00010\t0\t2\u000E\u0010\r\u001A\n \n*\u0004\u0018\u00010\f0\fH\u0096\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000B\u001A\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001A\n \n*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0014\u001A\n \n*\u0004\u0018\u00018\u00008\u00002\u0006\u0010\u000B\u001A\u00020\u00162\u000E\u0010\r\u001A\n \n*\u0004\u0018\u00010\u00170\u0017H\u0096\u0003¢\u0006\u0004\b\u0014\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001B\u0010\u001AJ\u0015\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u001C\u001A\u00028\u0000¢\u0006\u0004\b\u001D\u0010\u001E¨\u0006\u001F"}, d2 = {"Landroidx/work/JobListenableFuture;", "R", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlinx/coroutines/Job;", "job", "Landroidx/work/impl/utils/futures/SettableFuture;", "underlying", "<init>", "(Lkotlinx/coroutines/Job;Landroidx/work/impl/utils/futures/SettableFuture;)V", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "p0", "Ljava/util/concurrent/Executor;", "p1", "", "addListener", "(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V", "", "cancel", "(Z)Z", "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "()Z", "isDone", "result", "complete", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class JobListenableFuture implements ListenableFuture {
    public final Job a;
    public final SettableFuture b;

    public JobListenableFuture(@NotNull Job job0, @NotNull SettableFuture settableFuture0) {
        Intrinsics.checkNotNullParameter(job0, "job");
        Intrinsics.checkNotNullParameter(settableFuture0, "underlying");
        super();
        this.a = job0;
        this.b = settableFuture0;
        job0.invokeOnCompletion(new c(this, 15));
    }

    public JobListenableFuture(Job job0, SettableFuture settableFuture0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            settableFuture0 = SettableFuture.create();
            Intrinsics.checkNotNullExpressionValue(settableFuture0, "create()");
        }
        this(job0, settableFuture0);
    }

    @Override  // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable0, Executor executor0) {
        this.b.addListener(runnable0, executor0);
    }

    @Override
    public boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    public final void complete(Object object0) {
        this.b.set(object0);
    }

    @Override
    public Object get() {
        return this.b.get();
    }

    @Override
    public Object get(long v, TimeUnit timeUnit0) {
        return this.b.get(v, timeUnit0);
    }

    @Override
    public boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.b.isDone();
    }
}

