package io.reactivex.internal.util;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.CountDownLatch;

public final class BlockingIgnoringReceiver extends CountDownLatch implements Action, Consumer {
    public Throwable error;

    public BlockingIgnoringReceiver() {
        super(1);
    }

    @Override  // io.reactivex.functions.Consumer
    public void accept(Object object0) throws Exception {
        this.accept(((Throwable)object0));
    }

    public void accept(Throwable throwable0) {
        this.error = throwable0;
        this.countDown();
    }

    @Override  // io.reactivex.functions.Action
    public void run() {
        this.countDown();
    }
}

