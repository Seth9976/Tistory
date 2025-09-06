package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public interface MaybeObserver {
    void onComplete();

    void onError(@NonNull Throwable arg1);

    void onSubscribe(@NonNull Disposable arg1);

    void onSuccess(@NonNull Object arg1);
}

