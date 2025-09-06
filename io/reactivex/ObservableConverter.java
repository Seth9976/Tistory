package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface ObservableConverter {
    @NonNull
    Object apply(@NonNull Observable arg1);
}

