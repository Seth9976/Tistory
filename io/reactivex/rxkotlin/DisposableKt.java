package io.reactivex.rxkotlin;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003\u001A\u0015\u0010\u0004\u001A\u00020\u0005*\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0001H\u0086\u0002¨\u0006\u0007"}, d2 = {"addTo", "Lio/reactivex/disposables/Disposable;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "plusAssign", "", "disposable", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class DisposableKt {
    @NotNull
    public static final Disposable addTo(@NotNull Disposable disposable0, @NotNull CompositeDisposable compositeDisposable0) {
        Intrinsics.checkParameterIsNotNull(disposable0, "$this$addTo");
        Intrinsics.checkParameterIsNotNull(compositeDisposable0, "compositeDisposable");
        compositeDisposable0.add(disposable0);
        return disposable0;
    }

    public static final void plusAssign(@NotNull CompositeDisposable compositeDisposable0, @NotNull Disposable disposable0) {
        Intrinsics.checkParameterIsNotNull(compositeDisposable0, "$this$plusAssign");
        Intrinsics.checkParameterIsNotNull(disposable0, "disposable");
        compositeDisposable0.add(disposable0);
    }
}

