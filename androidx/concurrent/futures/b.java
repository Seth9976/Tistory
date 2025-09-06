package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class b implements ListenableFuture {
    public final WeakReference a;
    public final a b;

    public b(Completer callbackToFutureAdapter$Completer0) {
        this.b = new a(this);
        this.a = new WeakReference(callbackToFutureAdapter$Completer0);
    }

    @Override  // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.b.addListener(runnable0, executor0);
    }

    @Override
    public final boolean cancel(boolean z) {
        Completer callbackToFutureAdapter$Completer0 = (Completer)this.a.get();
        boolean z1 = this.b.cancel(z);
        if(z1 && callbackToFutureAdapter$Completer0 != null) {
            callbackToFutureAdapter$Completer0.a = null;
            callbackToFutureAdapter$Completer0.b = null;
            callbackToFutureAdapter$Completer0.c.set(null);
        }
        return z1;
    }

    @Override
    public final Object get() {
        return this.b.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.b.get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

