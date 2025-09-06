package io.reactivex.internal.functions;

import a7.c;
import androidx.appcompat.app.w0;
import cd.a;
import cd.b;
import cd.d;
import cd.e;
import cd.f;
import cd.g;
import cd.h;
import cd.i;
import cd.j;
import cd.k;
import cd.l;
import cd.m;
import cd.n;
import cd.o;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.Function;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscription;

public final class Functions {
    public static class BoundedConsumer implements Consumer {
        public final int a;

        public BoundedConsumer(int v) {
            this.a = v;
        }

        @Override  // io.reactivex.functions.Consumer
        public void accept(Object object0) throws Exception {
            this.accept(((Subscription)object0));
        }

        public void accept(Subscription subscription0) throws Exception {
            subscription0.request(((long)this.a));
        }
    }

    public static final Action EMPTY_ACTION;
    public static final LongConsumer EMPTY_LONG_CONSUMER;
    public static final Runnable EMPTY_RUNNABLE;
    public static final Consumer ERROR_CONSUMER;
    public static final Consumer ON_ERROR_MISSING;
    public static final Consumer REQUEST_MAX;
    public static final j a;
    public static final f b;
    public static final c c;
    public static final c d;
    public static final n e;
    public static final androidx.constraintlayout.core.c f;

    static {
        Functions.a = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        Functions.EMPTY_RUNNABLE = new androidx.emoji2.text.n(1);
        Functions.EMPTY_ACTION = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        Functions.b = new f(0);
        Functions.ERROR_CONSUMER = new f(1);
        Functions.ON_ERROR_MISSING = new f(3);
        Functions.EMPTY_LONG_CONSUMER = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        Functions.c = new c(3);
        Functions.d = new c(2);
        Functions.e = new n(0);
        Functions.f = new androidx.constraintlayout.core.c(4);
        Functions.REQUEST_MAX = new f(2);
    }

    public static Consumer actionConsumer(Action action0) {
        return new a(action0, 0);
    }

    public static Predicate alwaysFalse() {
        return Functions.d;
    }

    public static Predicate alwaysTrue() {
        return Functions.c;
    }

    public static Consumer boundedConsumer(int v) {
        return new BoundedConsumer(v);
    }

    public static Function castFunction(Class class0) {
        return new b(class0, 8);
    }

    public static Callable createArrayList(int v) {
        return new cd.c(v);
    }

    public static Callable createHashSet() {
        return i.a;
    }

    public static Consumer emptyConsumer() {
        return Functions.b;
    }

    public static Predicate equalsWith(Object object0) {
        return new ae.a(object0, 1);
    }

    public static Action futureAction(Future future0) {
        return new h(future0, 0);
    }

    public static Function identity() {
        return Functions.a;
    }

    public static Predicate isInstanceOf(Class class0) {
        return new d(class0);
    }

    public static Callable justCallable(Object object0) {
        return new k(object0);
    }

    public static Function justFunction(Object object0) {
        return new k(object0);
    }

    public static Function listSorter(Comparator comparator0) {
        return new b(comparator0, 9);
    }

    public static Comparator naturalComparator() {
        return l.a;
    }

    public static Comparator naturalOrder() {
        return Functions.f;
    }

    public static Action notificationOnComplete(Consumer consumer0) {
        return new h(consumer0, 1);
    }

    public static Consumer notificationOnError(Consumer consumer0) {
        return new m(consumer0, 0);
    }

    public static Consumer notificationOnNext(Consumer consumer0) {
        return new m(consumer0, 1);
    }

    public static Callable nullSupplier() {
        return Functions.e;
    }

    public static Predicate predicateReverseFor(BooleanSupplier booleanSupplier0) {
        return new androidx.appcompat.view.menu.f(booleanSupplier0, 4);
    }

    public static Function timestampWith(TimeUnit timeUnit0, Scheduler scheduler0) {
        return new o(0, timeUnit0, scheduler0);
    }

    public static Function toFunction(BiFunction biFunction0) {
        ObjectHelper.requireNonNull(biFunction0, "f is null");
        return new b(biFunction0, 0);
    }

    public static Function toFunction(Function3 function30) {
        ObjectHelper.requireNonNull(function30, "f is null");
        return new b(function30, 1);
    }

    public static Function toFunction(Function4 function40) {
        ObjectHelper.requireNonNull(function40, "f is null");
        return new b(function40, 2);
    }

    public static Function toFunction(Function5 function50) {
        ObjectHelper.requireNonNull(function50, "f is null");
        return new b(function50, 3);
    }

    public static Function toFunction(Function6 function60) {
        ObjectHelper.requireNonNull(function60, "f is null");
        return new b(function60, 4);
    }

    public static Function toFunction(Function7 function70) {
        ObjectHelper.requireNonNull(function70, "f is null");
        return new b(function70, 5);
    }

    public static Function toFunction(Function8 function80) {
        ObjectHelper.requireNonNull(function80, "f is null");
        return new b(function80, 6);
    }

    public static Function toFunction(Function9 function90) {
        ObjectHelper.requireNonNull(function90, "f is null");
        return new b(function90, 7);
    }

    public static BiConsumer toMapKeySelector(Function function0) {
        return new androidx.appcompat.view.menu.f(function0, 5);
    }

    public static BiConsumer toMapKeyValueSelector(Function function0, Function function1) {
        return new a7.b(5, function1, function0);
    }

    public static BiConsumer toMultimapKeyValueSelector(Function function0, Function function1, Function function2) {
        return new w0(function2, function1, function0);
    }
}

