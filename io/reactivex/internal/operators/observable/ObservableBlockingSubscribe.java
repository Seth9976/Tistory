package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BlockingObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.BlockingIgnoringReceiver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

public final class ObservableBlockingSubscribe {
    public static void subscribe(ObservableSource observableSource0) {
        BlockingIgnoringReceiver blockingIgnoringReceiver0 = new BlockingIgnoringReceiver();
        LambdaObserver lambdaObserver0 = new LambdaObserver(Functions.emptyConsumer(), blockingIgnoringReceiver0, blockingIgnoringReceiver0, Functions.emptyConsumer());
        observableSource0.subscribe(lambdaObserver0);
        BlockingHelper.awaitForComplete(blockingIgnoringReceiver0, lambdaObserver0);
        Throwable throwable0 = blockingIgnoringReceiver0.error;
        if(throwable0 != null) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    public static void subscribe(ObservableSource observableSource0, Observer observer0) {
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        BlockingObserver blockingObserver0 = new BlockingObserver(linkedBlockingQueue0);
        observer0.onSubscribe(blockingObserver0);
        observableSource0.subscribe(blockingObserver0);
        while(!blockingObserver0.isDisposed()) {
            Object object0 = linkedBlockingQueue0.poll();
            if(object0 == null) {
                try {
                    object0 = linkedBlockingQueue0.take();
                }
                catch(InterruptedException interruptedException0) {
                    blockingObserver0.dispose();
                    observer0.onError(interruptedException0);
                    return;
                }
            }
            if(blockingObserver0.isDisposed() || object0 == BlockingObserver.TERMINATED || NotificationLite.acceptFull(object0, observer0)) {
                break;
            }
        }
    }

    public static void subscribe(ObservableSource observableSource0, Consumer consumer0, Consumer consumer1, Action action0) {
        ObjectHelper.requireNonNull(consumer0, "onNext is null");
        ObjectHelper.requireNonNull(consumer1, "onError is null");
        ObjectHelper.requireNonNull(action0, "onComplete is null");
        ObservableBlockingSubscribe.subscribe(observableSource0, new LambdaObserver(consumer0, consumer1, action0, Functions.emptyConsumer()));
    }
}

