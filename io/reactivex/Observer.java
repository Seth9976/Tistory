package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public interface Observer {
    void onComplete();

    void onError(@NonNull Throwable arg1);

    void onNext(@NonNull Object arg1);

    void onSubscribe(@NonNull Disposable arg1);
}

