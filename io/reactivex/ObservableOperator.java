package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface ObservableOperator {
    @NonNull
    Observer apply(@NonNull Observer arg1) throws Exception;
}

