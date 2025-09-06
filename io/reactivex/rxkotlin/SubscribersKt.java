package io.reactivex.rxkotlin;

import cd.a;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import jd.g;
import jd.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A_\u0010\u000B\u001A\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u00A2\u0006\u0004\b\u000B\u0010\f\u001A_\u0010\u000B\u001A\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u00A2\u0006\u0004\b\u000B\u0010\u000E\u001AO\u0010\u000B\u001A\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000F2\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u00A2\u0006\u0004\b\u000B\u0010\u0011\u001A_\u0010\u000B\u001A\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u00A2\u0006\u0004\b\u000B\u0010\u0013\u001A9\u0010\u000B\u001A\u00020\n*\u00020\u00142\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007\u00A2\u0006\u0004\b\u000B\u0010\u0015\u001A_\u0010\u0016\u001A\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A_\u0010\u0016\u001A\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0018\u00A8\u0006\u0019"}, d2 = {"", "T", "Lio/reactivex/Observable;", "Lkotlin/Function1;", "", "", "onError", "Lkotlin/Function0;", "onComplete", "onNext", "Lio/reactivex/disposables/Disposable;", "subscribeBy", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Flowable;", "(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Single;", "onSuccess", "(Lio/reactivex/Single;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Maybe;", "(Lio/reactivex/Maybe;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Completable;", "(Lio/reactivex/Completable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lio/reactivex/disposables/Disposable;", "blockingSubscribeBy", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class SubscribersKt {
    public static final h a;
    public static final h b;
    public static final g c;

    static {
        SubscribersKt.a = h.y;
        SubscribersKt.b = h.x;
        SubscribersKt.c = g.w;
    }

    public static final Consumer a(Function1 function10) {
        if(function10 == SubscribersKt.a) {
            Consumer consumer0 = Functions.emptyConsumer();
            Intrinsics.checkExpressionValueIsNotNull(consumer0, "Functions.emptyConsumer()");
            return consumer0;
        }
        if(function10 != null) {
            function10 = new a(function10, 4);
        }
        return (Consumer)function10;
    }

    public static final Action b(Function0 function00) {
        if(function00 == SubscribersKt.c) {
            Intrinsics.checkExpressionValueIsNotNull(Functions.EMPTY_ACTION, "Functions.EMPTY_ACTION");
            return Functions.EMPTY_ACTION;
        }
        if(function00 != null) {
            function00 = new cd.h(function00, 4);
        }
        return (Action)function00;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static final void blockingSubscribeBy(@NotNull Flowable flowable0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function1 function11) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$blockingSubscribeBy");
        Intrinsics.checkParameterIsNotNull(function10, "onError");
        Intrinsics.checkParameterIsNotNull(function00, "onComplete");
        Intrinsics.checkParameterIsNotNull(function11, "onNext");
        flowable0.blockingSubscribe(SubscribersKt.a(function11), SubscribersKt.c(function10), SubscribersKt.b(function00));
    }

    @SchedulerSupport("none")
    public static final void blockingSubscribeBy(@NotNull Observable observable0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function1 function11) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$blockingSubscribeBy");
        Intrinsics.checkParameterIsNotNull(function10, "onError");
        Intrinsics.checkParameterIsNotNull(function00, "onComplete");
        Intrinsics.checkParameterIsNotNull(function11, "onNext");
        observable0.blockingSubscribe(SubscribersKt.a(function11), SubscribersKt.c(function10), SubscribersKt.b(function00));
    }

    public static void blockingSubscribeBy$default(Flowable flowable0, Function1 function10, Function0 function00, Function1 function11, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = SubscribersKt.b;
        }
        if((v & 2) != 0) {
            function00 = SubscribersKt.c;
        }
        if((v & 4) != 0) {
            function11 = SubscribersKt.a;
        }
        SubscribersKt.blockingSubscribeBy(flowable0, function10, function00, function11);
    }

    public static void blockingSubscribeBy$default(Observable observable0, Function1 function10, Function0 function00, Function1 function11, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = SubscribersKt.b;
        }
        if((v & 2) != 0) {
            function00 = SubscribersKt.c;
        }
        if((v & 4) != 0) {
            function11 = SubscribersKt.a;
        }
        SubscribersKt.blockingSubscribeBy(observable0, function10, function00, function11);
    }

    public static final Consumer c(Function1 function10) {
        if(function10 == SubscribersKt.b) {
            Intrinsics.checkExpressionValueIsNotNull(Functions.ON_ERROR_MISSING, "Functions.ON_ERROR_MISSING");
            return Functions.ON_ERROR_MISSING;
        }
        if(function10 != null) {
            function10 = new a(function10, 4);
        }
        return (Consumer)function10;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Disposable subscribeBy(@NotNull Completable completable0, @NotNull Function1 function10, @NotNull Function0 function00) {
        Disposable disposable0;
        Intrinsics.checkParameterIsNotNull(completable0, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(function10, "onError");
        Intrinsics.checkParameterIsNotNull(function00, "onComplete");
        h h0 = SubscribersKt.b;
        if(function10 == h0 && function00 == SubscribersKt.c) {
            disposable0 = completable0.subscribe();
            Intrinsics.checkExpressionValueIsNotNull(disposable0, "subscribe()");
            return disposable0;
        }
        if(function10 == h0) {
            disposable0 = completable0.subscribe(new cd.h(function00, 4));
            Intrinsics.checkExpressionValueIsNotNull(disposable0, "subscribe(onComplete)");
            return disposable0;
        }
        disposable0 = completable0.subscribe(SubscribersKt.b(function00), new a(function10, 4));
        Intrinsics.checkExpressionValueIsNotNull(disposable0, "subscribe(onComplete.asO…ion(), Consumer(onError))");
        return disposable0;
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Disposable subscribeBy(@NotNull Flowable flowable0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function1 function11) {
        Intrinsics.checkParameterIsNotNull(flowable0, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(function10, "onError");
        Intrinsics.checkParameterIsNotNull(function00, "onComplete");
        Intrinsics.checkParameterIsNotNull(function11, "onNext");
        Disposable disposable0 = flowable0.subscribe(SubscribersKt.a(function11), SubscribersKt.c(function10), SubscribersKt.b(function00));
        Intrinsics.checkExpressionValueIsNotNull(disposable0, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return disposable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Disposable subscribeBy(@NotNull Maybe maybe0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function1 function11) {
        Intrinsics.checkParameterIsNotNull(maybe0, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(function10, "onError");
        Intrinsics.checkParameterIsNotNull(function00, "onComplete");
        Intrinsics.checkParameterIsNotNull(function11, "onSuccess");
        Disposable disposable0 = maybe0.subscribe(SubscribersKt.a(function11), SubscribersKt.c(function10), SubscribersKt.b(function00));
        Intrinsics.checkExpressionValueIsNotNull(disposable0, "subscribe(onSuccess.asCo…ete.asOnCompleteAction())");
        return disposable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Disposable subscribeBy(@NotNull Observable observable0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function1 function11) {
        Intrinsics.checkParameterIsNotNull(observable0, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(function10, "onError");
        Intrinsics.checkParameterIsNotNull(function00, "onComplete");
        Intrinsics.checkParameterIsNotNull(function11, "onNext");
        Disposable disposable0 = observable0.subscribe(SubscribersKt.a(function11), SubscribersKt.c(function10), SubscribersKt.b(function00));
        Intrinsics.checkExpressionValueIsNotNull(disposable0, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return disposable0;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Disposable subscribeBy(@NotNull Single single0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkParameterIsNotNull(single0, "$this$subscribeBy");
        Intrinsics.checkParameterIsNotNull(function10, "onError");
        Intrinsics.checkParameterIsNotNull(function11, "onSuccess");
        Disposable disposable0 = single0.subscribe(SubscribersKt.a(function11), SubscribersKt.c(function10));
        Intrinsics.checkExpressionValueIsNotNull(disposable0, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return disposable0;
    }

    public static Disposable subscribeBy$default(Completable completable0, Function1 function10, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = SubscribersKt.b;
        }
        if((v & 2) != 0) {
            function00 = SubscribersKt.c;
        }
        return SubscribersKt.subscribeBy(completable0, function10, function00);
    }

    public static Disposable subscribeBy$default(Flowable flowable0, Function1 function10, Function0 function00, Function1 function11, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = SubscribersKt.b;
        }
        if((v & 2) != 0) {
            function00 = SubscribersKt.c;
        }
        if((v & 4) != 0) {
            function11 = SubscribersKt.a;
        }
        return SubscribersKt.subscribeBy(flowable0, function10, function00, function11);
    }

    public static Disposable subscribeBy$default(Maybe maybe0, Function1 function10, Function0 function00, Function1 function11, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = SubscribersKt.b;
        }
        if((v & 2) != 0) {
            function00 = SubscribersKt.c;
        }
        if((v & 4) != 0) {
            function11 = SubscribersKt.a;
        }
        return SubscribersKt.subscribeBy(maybe0, function10, function00, function11);
    }

    public static Disposable subscribeBy$default(Observable observable0, Function1 function10, Function0 function00, Function1 function11, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = SubscribersKt.b;
        }
        if((v & 2) != 0) {
            function00 = SubscribersKt.c;
        }
        if((v & 4) != 0) {
            function11 = SubscribersKt.a;
        }
        return SubscribersKt.subscribeBy(observable0, function10, function00, function11);
    }

    public static Disposable subscribeBy$default(Single single0, Function1 function10, Function1 function11, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = SubscribersKt.b;
        }
        if((v & 2) != 0) {
            function11 = SubscribersKt.a;
        }
        return SubscribersKt.subscribeBy(single0, function10, function11);
    }
}

