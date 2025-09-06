package androidx.lifecycle;

import androidx.activity.m;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000F\u0010\u0006\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000F\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0003J\u000F\u0010\b\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u000F\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\u0010\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "<init>", "()V", "", "pause", "resume", "finish", "drainQueue", "", "canRun", "()Z", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "runnable", "dispatchAndEnqueue", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DispatchQueue {
    public boolean a;
    public boolean b;
    public boolean c;
    public final ArrayDeque d;

    public DispatchQueue() {
        this.a = true;
        this.d = new ArrayDeque();
    }

    // 去混淆评级： 低(20)
    @MainThread
    public final boolean canRun() {
        return this.b || !this.a;
    }

    @AnyThread
    public final void dispatchAndEnqueue(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        Intrinsics.checkNotNullParameter(runnable0, "runnable");
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(coroutineContext0) && !this.canRun()) {
            if(!this.d.offer(runnable0)) {
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
            this.drainQueue();
            return;
        }
        mainCoroutineDispatcher0.dispatch(coroutineContext0, new m(3, this, runnable0));
    }

    @MainThread
    public final void drainQueue() {
        if(this.c) {
            return;
        }
        try {
            this.c = true;
            while(true) {
                ArrayDeque arrayDeque0 = this.d;
                if(arrayDeque0.isEmpty() || !this.canRun()) {
                    break;
                }
                Runnable runnable0 = (Runnable)arrayDeque0.poll();
                if(runnable0 != null) {
                    runnable0.run();
                }
            }
        }
        finally {
            this.c = false;
        }
    }

    @MainThread
    public final void finish() {
        this.b = true;
        this.drainQueue();
    }

    @MainThread
    public final void pause() {
        this.a = true;
    }

    @MainThread
    public final void resume() {
        if(!this.a) {
            return;
        }
        if(this.b) {
            throw new IllegalStateException("Cannot resume a finished dispatcher");
        }
        this.a = false;
        this.drainQueue();
    }
}

