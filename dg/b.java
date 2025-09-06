package dg;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.sync.MutexImpl;

public final class b implements CancellableContinuation, Waiter {
    public final CancellableContinuationImpl a;
    public final Object b;
    public final MutexImpl c;

    public b(MutexImpl mutexImpl0, CancellableContinuationImpl cancellableContinuationImpl0, Object object0) {
        this.c = mutexImpl0;
        this.a = cancellableContinuationImpl0;
        this.b = object0;
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final boolean cancel(Throwable throwable0) {
        return this.a.cancel(throwable0);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final void completeResume(Object object0) {
        this.a.completeResume(object0);
    }

    @Override  // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.a.getContext();
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final void initCancellability() {
        this.a.initCancellability();
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final void invokeOnCancellation(Function1 function10) {
        this.a.invokeOnCancellation(function10);
    }

    @Override  // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(Segment segment0, int v) {
        this.a.invokeOnCancellation(segment0, v);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final boolean isActive() {
        return this.a.isActive();
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final boolean isCompleted() {
        return this.a.isCompleted();
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final void resume(Object object0, Function1 function10) {
        MutexImpl.access$getOwner$FU$p().set(this.c, this.b);
        a a0 = new a(this.c, this, 0);
        this.a.resume(((Unit)object0), a0);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final void resumeUndispatched(CoroutineDispatcher coroutineDispatcher0, Object object0) {
        this.a.resumeUndispatched(coroutineDispatcher0, ((Unit)object0));
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher0, Throwable throwable0) {
        this.a.resumeUndispatchedWithException(coroutineDispatcher0, throwable0);
    }

    @Override  // kotlin.coroutines.Continuation
    public final void resumeWith(Object object0) {
        this.a.resumeWith(object0);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final Object tryResume(Object object0, Object object1) {
        return this.a.tryResume(((Unit)object0), object1);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final Object tryResume(Object object0, Object object1, Function1 function10) {
        MutexImpl mutexImpl0 = this.c;
        a a0 = new a(mutexImpl0, this, 1);
        Object object2 = this.a.tryResume(((Unit)object0), object1, a0);
        if(object2 != null) {
            MutexImpl.access$getOwner$FU$p().set(mutexImpl0, this.b);
        }
        return object2;
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public final Object tryResumeWithException(Throwable throwable0) {
        return this.a.tryResumeWithException(throwable0);
    }
}

