package io.reactivex.internal.observers;

public interface InnerQueuedObserverSupport {
    void drain();

    void innerComplete(InnerQueuedObserver arg1);

    void innerError(InnerQueuedObserver arg1, Throwable arg2);

    void innerNext(InnerQueuedObserver arg1, Object arg2);
}

