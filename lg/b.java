package lg;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import okhttp3.MultipartReader;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

public final class b implements Source {
    public final Timeout a;
    public final MultipartReader b;

    public b(MultipartReader multipartReader0) {
        this.b = multipartReader0;
        this.a = new Timeout();
    }

    @Override  // okio.Source
    public final void close() {
        MultipartReader multipartReader0 = this.b;
        if(Intrinsics.areEqual(MultipartReader.access$getCurrentPart$p(multipartReader0), this)) {
            MultipartReader.access$setCurrentPart$p(multipartReader0, null);
        }
    }

    @Override  // okio.Source
    public final long read(Buffer buffer0, long v) {
        long v8;
        long v6;
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        MultipartReader multipartReader0 = this.b;
        if(!Intrinsics.areEqual(MultipartReader.access$getCurrentPart$p(multipartReader0), this)) {
            throw new IllegalStateException("closed");
        }
        Timeout timeout0 = MultipartReader.access$getSource$p(multipartReader0).timeout();
        Timeout timeout1 = this.a;
        long v1 = timeout0.timeoutNanos();
        long v2 = timeout1.timeoutNanos();
        long v3 = timeout0.timeoutNanos();
        TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
        timeout0.timeout(Timeout.Companion.minTimeout(v2, v3), timeUnit0);
        if(timeout0.hasDeadline()) {
            long v4 = timeout0.deadlineNanoTime();
            if(timeout1.hasDeadline()) {
                timeout0.deadlineNanoTime(Math.min(timeout0.deadlineNanoTime(), timeout1.deadlineNanoTime()));
            }
            try {
                long v5 = MultipartReader.access$currentPartBytesRemaining(multipartReader0, v);
                v6 = v5 == 0L ? -1L : MultipartReader.access$getSource$p(multipartReader0).read(buffer0, v5);
            }
            catch(Throwable throwable0) {
                timeout0.timeout(v1, TimeUnit.NANOSECONDS);
                if(timeout1.hasDeadline()) {
                    timeout0.deadlineNanoTime(v4);
                }
                throw throwable0;
            }
            timeout0.timeout(v1, timeUnit0);
            if(timeout1.hasDeadline()) {
                timeout0.deadlineNanoTime(v4);
            }
            return v6;
        }
        if(timeout1.hasDeadline()) {
            timeout0.deadlineNanoTime(timeout1.deadlineNanoTime());
        }
        try {
            long v7 = MultipartReader.access$currentPartBytesRemaining(multipartReader0, v);
            v8 = v7 == 0L ? -1L : MultipartReader.access$getSource$p(multipartReader0).read(buffer0, v7);
        }
        catch(Throwable throwable1) {
            timeout0.timeout(v1, TimeUnit.NANOSECONDS);
            if(timeout1.hasDeadline()) {
                timeout0.clearDeadline();
            }
            throw throwable1;
        }
        timeout0.timeout(v1, timeUnit0);
        if(timeout1.hasDeadline()) {
            timeout0.clearDeadline();
        }
        return v8;
    }

    @Override  // okio.Source
    public final Timeout timeout() {
        return this.a;
    }
}

