package com.google.firebase.inject;

import androidx.annotation.NonNull;
import com.google.firebase.annotations.DeferredApi;

public interface Deferred {
    public interface DeferredHandler {
        @DeferredApi
        void handle(Provider arg1);
    }

    void whenAvailable(@NonNull DeferredHandler arg1);
}

