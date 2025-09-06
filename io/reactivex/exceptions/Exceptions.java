package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.util.ExceptionHelper;

public final class Exceptions {
    @NonNull
    public static RuntimeException propagate(@NonNull Throwable throwable0) {
        throw ExceptionHelper.wrapOrThrow(throwable0);
    }

    public static void throwIfFatal(@NonNull Throwable throwable0) {
        if(throwable0 instanceof VirtualMachineError) {
            throw (VirtualMachineError)throwable0;
        }
        if(throwable0 instanceof ThreadDeath) {
            throw (ThreadDeath)throwable0;
        }
        if(throwable0 instanceof LinkageError) {
            throw (LinkageError)throwable0;
        }
    }
}

