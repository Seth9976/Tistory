package io.reactivex.disposables;

import ad.a;
import ad.b;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Future;
import org.reactivestreams.Subscription;

public final class Disposables {
    @NonNull
    public static Disposable disposed() {
        return EmptyDisposable.INSTANCE;
    }

    @NonNull
    public static Disposable empty() {
        return Disposables.fromRunnable(Functions.EMPTY_RUNNABLE);
    }

    @NonNull
    public static Disposable fromAction(@NonNull Action action0) {
        ObjectHelper.requireNonNull(action0, "run is null");
        return new a(action0, 0);
    }

    @NonNull
    public static Disposable fromFuture(@NonNull Future future0) {
        ObjectHelper.requireNonNull(future0, "future is null");
        return Disposables.fromFuture(future0, true);
    }

    @NonNull
    public static Disposable fromFuture(@NonNull Future future0, boolean z) {
        ObjectHelper.requireNonNull(future0, "future is null");
        return new b(future0, z);
    }

    @NonNull
    public static Disposable fromRunnable(@NonNull Runnable runnable0) {
        ObjectHelper.requireNonNull(runnable0, "run is null");
        return new a(runnable0, 1);
    }

    @NonNull
    public static Disposable fromSubscription(@NonNull Subscription subscription0) {
        ObjectHelper.requireNonNull(subscription0, "subscription is null");
        return new a(subscription0, 2);
    }
}

