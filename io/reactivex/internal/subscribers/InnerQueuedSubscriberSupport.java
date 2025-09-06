package io.reactivex.internal.subscribers;

public interface InnerQueuedSubscriberSupport {
    void drain();

    void innerComplete(InnerQueuedSubscriber arg1);

    void innerError(InnerQueuedSubscriber arg1, Throwable arg2);

    void innerNext(InnerQueuedSubscriber arg1, Object arg2);
}

