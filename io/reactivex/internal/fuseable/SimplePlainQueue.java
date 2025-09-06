package io.reactivex.internal.fuseable;

import io.reactivex.annotations.Nullable;

public interface SimplePlainQueue extends SimpleQueue {
    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    Object poll();
}

