package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface SingleOnSubscribe {
    void subscribe(@NonNull SingleEmitter arg1) throws Exception;
}

