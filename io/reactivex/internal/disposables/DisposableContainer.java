package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;

public interface DisposableContainer {
    boolean add(Disposable arg1);

    boolean delete(Disposable arg1);

    boolean remove(Disposable arg1);
}

