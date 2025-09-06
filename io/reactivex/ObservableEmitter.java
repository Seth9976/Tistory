package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;

public interface ObservableEmitter extends Emitter {
    boolean isDisposed();

    @NonNull
    ObservableEmitter serialize();

    void setCancellable(@Nullable Cancellable arg1);

    void setDisposable(@Nullable Disposable arg1);

    boolean tryOnError(@NonNull Throwable arg1);
}

