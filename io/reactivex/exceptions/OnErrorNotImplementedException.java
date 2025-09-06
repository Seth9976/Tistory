package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;

public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(String s, @NonNull Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(s, throwable0);
    }

    public OnErrorNotImplementedException(@NonNull Throwable throwable0) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + throwable0, throwable0);
    }
}

