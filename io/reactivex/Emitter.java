package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface Emitter {
    void onComplete();

    void onError(@NonNull Throwable arg1);

    void onNext(@NonNull Object arg1);
}

