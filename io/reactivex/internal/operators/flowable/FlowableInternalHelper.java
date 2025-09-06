package io.reactivex.internal.operators.flowable;

import a6.a;
import cd.h;
import cd.o;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableInternalHelper {
    public static enum RequestMax implements Consumer {
        INSTANCE;

        @Override  // io.reactivex.functions.Consumer
        public void accept(Object object0) throws Exception {
            this.accept(((Subscription)object0));
        }

        public void accept(Subscription subscription0) throws Exception {
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    public static Function flatMapIntoIterable(Function function0) {
        return new n2(function0, 0);
    }

    public static Function flatMapWithCombiner(Function function0, BiFunction biFunction0) {
        return new o(2, biFunction0, function0);
    }

    public static Function itemDelay(Function function0) {
        return new n2(function0, 1);
    }

    public static Callable replayCallable(Flowable flowable0) {
        return new a(flowable0, 3);
    }

    public static Callable replayCallable(Flowable flowable0, int v) {
        return new l2(flowable0, v, 0);
    }

    public static Callable replayCallable(Flowable flowable0, int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        return new m2(flowable0, v, v1, timeUnit0, scheduler0, 0);
    }

    public static Callable replayCallable(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return new r2(flowable0, v, timeUnit0, scheduler0, 0);
    }

    public static Function replayFunction(Function function0, Scheduler scheduler0) {
        return new o(3, function0, scheduler0);
    }

    public static BiFunction simpleBiGenerator(BiConsumer biConsumer0) {
        return new o2(biConsumer0, 0);
    }

    public static BiFunction simpleGenerator(Consumer consumer0) {
        return new p2(consumer0, 0);
    }

    public static Action subscriberOnComplete(Subscriber subscriber0) {
        return new h(subscriber0, 2);
    }

    public static Consumer subscriberOnError(Subscriber subscriber0) {
        return new q2(subscriber0, 0);
    }

    public static Consumer subscriberOnNext(Subscriber subscriber0) {
        return new q2(subscriber0, 1);
    }

    public static Function zipIterable(Function function0) {
        return new n2(function0, 2);
    }
}

