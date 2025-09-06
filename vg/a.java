package vg;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;

public final class a {
    public static final void a(AsyncTimeout asyncTimeout0, long v, boolean z) {
        if(AsyncTimeout.m == null) {
            AsyncTimeout.m = new AsyncTimeout();
            b b0 = new b("Okio Watchdog");  // 初始化器: Ljava/lang/Thread;-><init>(Ljava/lang/String;)V
            b0.setDaemon(true);
            b0.start();
        }
        long v1 = System.nanoTime();
        int v2 = Long.compare(v, 0L);
        if(v2 != 0 && z) {
            asyncTimeout0.g = Math.min(v, asyncTimeout0.deadlineNanoTime() - v1) + v1;
        }
        else if(v2 != 0) {
            asyncTimeout0.g = v + v1;
        }
        else if(z) {
            asyncTimeout0.g = asyncTimeout0.deadlineNanoTime();
        }
        else {
            throw new AssertionError();
        }
        long v3 = AsyncTimeout.access$remainingNanos(asyncTimeout0, v1);
        AsyncTimeout asyncTimeout1 = AsyncTimeout.m;
        Intrinsics.checkNotNull(asyncTimeout1);
        while(asyncTimeout1.f != null) {
            AsyncTimeout asyncTimeout2 = asyncTimeout1.f;
            Intrinsics.checkNotNull(asyncTimeout2);
            if(v3 < AsyncTimeout.access$remainingNanos(asyncTimeout2, v1)) {
                break;
            }
            asyncTimeout1 = asyncTimeout1.f;
            Intrinsics.checkNotNull(asyncTimeout1);
        }
        asyncTimeout0.f = asyncTimeout1.f;
        asyncTimeout1.f = asyncTimeout0;
        if(asyncTimeout1 == AsyncTimeout.m) {
            AsyncTimeout.j.signal();
        }
    }

    public static final void b(AsyncTimeout asyncTimeout0) {
        for(AsyncTimeout asyncTimeout1 = AsyncTimeout.m; asyncTimeout1 != null; asyncTimeout1 = asyncTimeout1.f) {
            if(asyncTimeout1.f == asyncTimeout0) {
                asyncTimeout1.f = asyncTimeout0.f;
                asyncTimeout0.f = null;
                return;
            }
        }
        throw new IllegalStateException("node was not found in the queue");
    }

    public static AsyncTimeout c() {
        AsyncTimeout asyncTimeout0 = AsyncTimeout.m;
        Intrinsics.checkNotNull(asyncTimeout0);
        AsyncTimeout asyncTimeout1 = asyncTimeout0.f;
        if(asyncTimeout1 == null) {
            AsyncTimeout.j.await(60000L, TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNull(AsyncTimeout.m);
            return null;
        }
        long v = AsyncTimeout.access$remainingNanos(asyncTimeout1, System.nanoTime());
        if(v > 0L) {
            AsyncTimeout.j.await(v, TimeUnit.NANOSECONDS);
            return null;
        }
        AsyncTimeout asyncTimeout2 = AsyncTimeout.m;
        Intrinsics.checkNotNull(asyncTimeout2);
        asyncTimeout2.f = asyncTimeout1.f;
        asyncTimeout1.f = null;
        asyncTimeout1.e = 2;
        return asyncTimeout1;
    }
}

