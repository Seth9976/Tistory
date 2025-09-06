package io.reactivex.internal.operators.observable;

import a6.a;
import cd.h;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.l2;
import io.reactivex.internal.operators.flowable.m2;
import io.reactivex.internal.operators.flowable.n2;
import io.reactivex.internal.operators.flowable.o2;
import io.reactivex.internal.operators.flowable.p2;
import io.reactivex.internal.operators.flowable.r2;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class ObservableInternalHelper {
    public static Function flatMapIntoIterable(Function function0) {
        return new n2(function0, 3);
    }

    public static Function flatMapWithCombiner(Function function0, BiFunction biFunction0) {
        return new r1(1, biFunction0, function0);
    }

    public static Function itemDelay(Function function0) {
        return new n2(function0, 4);
    }

    public static Action observerOnComplete(Observer observer0) {
        return new h(observer0, 3);
    }

    public static Consumer observerOnError(Observer observer0) {
        return new s1(observer0, 0);
    }

    public static Consumer observerOnNext(Observer observer0) {
        return new s1(observer0, 1);
    }

    public static Callable replayCallable(Observable observable0) {
        return new a(observable0, 4);
    }

    public static Callable replayCallable(Observable observable0, int v) {
        return new l2(observable0, v, 1);
    }

    public static Callable replayCallable(Observable observable0, int v, long v1, TimeUnit timeUnit0, Scheduler scheduler0) {
        return new m2(observable0, v, v1, timeUnit0, scheduler0, 1);
    }

    public static Callable replayCallable(Observable observable0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return new r2(observable0, v, timeUnit0, scheduler0, 1);
    }

    public static Function replayFunction(Function function0, Scheduler scheduler0) {
        return new r1(2, function0, scheduler0);
    }

    public static BiFunction simpleBiGenerator(BiConsumer biConsumer0) {
        return new o2(biConsumer0, 1);
    }

    public static BiFunction simpleGenerator(Consumer consumer0) {
        return new p2(consumer0, 1);
    }

    public static Function zipIterable(Function function0) {
        return new n2(function0, 5);
    }
}

