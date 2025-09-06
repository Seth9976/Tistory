package dagger.hilt.android.internal;

import android.os.Looper;

public final class ThreadUtil {
    public static Thread a;

    public static void ensureMainThread() {
        if(!ThreadUtil.isMainThread()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static boolean isMainThread() {
        if(ThreadUtil.a == null) {
            ThreadUtil.a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == ThreadUtil.a;
    }
}

