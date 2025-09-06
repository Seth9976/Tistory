package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import io.reactivex.internal.subscribers.BoundedSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.BlockingIgnoringReceiver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableBlockingSubscribe {
    public static void subscribe(Publisher publisher0) {
        BlockingIgnoringReceiver blockingIgnoringReceiver0 = new BlockingIgnoringReceiver();
        LambdaSubscriber lambdaSubscriber0 = new LambdaSubscriber(Functions.emptyConsumer(), blockingIgnoringReceiver0, blockingIgnoringReceiver0, Functions.REQUEST_MAX);
        publisher0.subscribe(lambdaSubscriber0);
        BlockingHelper.awaitForComplete(blockingIgnoringReceiver0, lambdaSubscriber0);
        Throwable throwable0 = blockingIgnoringReceiver0.error;
        if(throwable0 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    public static void subscribe(Publisher publisher0, Consumer consumer0, Consumer consumer1, Action action0) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        FlowableBlockingSubscribe.subscribe(publisher0, new LambdaSubscriber(consumer0, consumer1, action0, Functions.REQUEST_MAX));
    }

    public static void subscribe(Publisher publisher0, Consumer consumer0, Consumer consumer1, Action action0, int v) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        ObjectHelper.verifyPositive(v, "number > 0 required");
        FlowableBlockingSubscribe.subscribe(publisher0, new BoundedSubscriber(consumer0, consumer1, action0, Functions.boundedConsumer(v), v));
    }

    public static void subscribe(Publisher publisher0, Subscriber subscriber0) {
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber0 = new BlockingSubscriber(linkedBlockingQueue0);
        publisher0.subscribe(blockingSubscriber0);
        while(true) {
            try {
                if(blockingSubscriber0.isCancelled()) {
                    break;
                }
                Object object0 = linkedBlockingQueue0.poll();
                if(object0 == null) {
                    if(blockingSubscriber0.isCancelled()) {
                        break;
                    }
                    BlockingHelper.verifyNonBlocking();
                    object0 = linkedBlockingQueue0.take();
                }
                if(blockingSubscriber0.isCancelled() || object0 == BlockingSubscriber.TERMINATED || NotificationLite.acceptFull(object0, subscriber0)) {
                    return;
                }
                continue;
            }
            catch(InterruptedException interruptedException0) {
            }
            blockingSubscriber0.cancel();
            subscriber0.onError(interruptedException0);
            return;
        }
    }
}

