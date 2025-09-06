package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

public abstract class BlockingBaseSubscriber extends CountDownLatch implements FlowableSubscriber {
    public Object a;
    public Throwable b;
    public Subscription c;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final Object blockingGet() {
        if(this.getCount() != 0L) {
            try {
                BlockingHelper.verifyNonBlocking();
                this.await();
            }
            catch(InterruptedException interruptedException0) {
                Subscription subscription0 = this.c;
                this.c = SubscriptionHelper.CANCELLED;
                if(subscription0 != null) {
                    subscription0.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        return this.a;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.countDown();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

