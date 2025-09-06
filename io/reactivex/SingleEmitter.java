package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;

public interface SingleEmitter {
    boolean isDisposed();

    void onError(@NonNull Throwable arg1);

    void onSuccess(@NonNull Object arg1);

    void setCancellable(@Nullable Cancellable arg1);

    void setDisposable(@Nullable Disposable arg1);

    boolean tryOnError(@NonNull Throwable arg1);
}

