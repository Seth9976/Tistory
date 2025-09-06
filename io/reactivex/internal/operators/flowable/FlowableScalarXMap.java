package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableScalarXMap {
    public static Flowable scalarXMap(Object object0, Function function0) {
        return RxJavaPlugins.onAssembly(new g4(object0, function0, 1));
    }

    public static boolean tryScalarXMapSubscribe(Publisher publisher0, Subscriber subscriber0, Function function0) {
        Object object1;
        Publisher publisher1;
        Object object0;
        if(publisher0 instanceof Callable) {
            try {
                object0 = ((Callable)publisher0).call();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                EmptySubscription.error(throwable0, subscriber0);
                return true;
            }
            if(object0 == null) {
                EmptySubscription.complete(subscriber0);
                return true;
            }
            try {
                publisher1 = (Publisher)ObjectHelper.requireNonNull(function0.apply(object0), "The mapper returned a null Publisher");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                EmptySubscription.error(throwable1, subscriber0);
                return true;
            }
            if(publisher1 instanceof Callable) {
                try {
                    object1 = ((Callable)publisher1).call();
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    EmptySubscription.error(throwable2, subscriber0);
                    return true;
                }
                if(object1 == null) {
                    EmptySubscription.complete(subscriber0);
                    return true;
                }
                subscriber0.onSubscribe(new ScalarSubscription(subscriber0, object1));
                return true;
            }
            publisher1.subscribe(subscriber0);
            return true;
        }
        return false;
    }
}

