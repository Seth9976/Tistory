package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface ObservableOnSubscribe {
    void subscribe(@NonNull ObservableEmitter arg1) throws Exception;
}

