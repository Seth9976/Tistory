package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

public final class BlockingHelper {
    public static void awaitForComplete(CountDownLatch countDownLatch0, Disposable disposable0) {
        if(countDownLatch0.getCount() == 0L) {
            return;
        }
        try {
            BlockingHelper.verifyNonBlocking();
            countDownLatch0.await();
        }
        catch(InterruptedException interruptedException0) {
            disposable0.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", interruptedException0);
        }
    }

    // 去混淆评级： 中等(110)
    public static void verifyNonBlocking() {
    }
}

