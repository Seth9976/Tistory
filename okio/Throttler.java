package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J+\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001F\u001A\u00020\u001A8\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010%\u001A\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lokio/Throttler;", "", "", "allocatedUntil", "<init>", "(J)V", "()V", "bytesPerSecond", "waitByteCount", "maxByteCount", "", "(JJJ)V", "byteCount", "take$okio", "(J)J", "take", "now", "byteCountOrWaitNanos$okio", "(JJ)J", "byteCountOrWaitNanos", "Lokio/Source;", "source", "(Lokio/Source;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "f", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "condition", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Throttler {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ReentrantLock e;
    public final Condition f;

    public Throttler() {
        this(System.nanoTime());
    }

    public Throttler(long v) {
        this.a = v;
        this.c = 0x2000L;
        this.d = 0x40000L;
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.e = reentrantLock0;
        Condition condition0 = reentrantLock0.newCondition();
        Intrinsics.checkNotNullExpressionValue(condition0, "newCondition(...)");
        this.f = condition0;
    }

    public final long byteCountOrWaitNanos$okio(long v, long v1) {
        if(this.b == 0L) {
            return v1;
        }
        long v2 = Math.max(this.a - v, 0L);
        long v3 = this.d;
        long v4 = this.b;
        long v5 = v3 - v2 * v4 / 1000000000L;
        if(v5 >= v1) {
            this.a = v1 * 1000000000L / v4 + (v + v2);
            return v1;
        }
        long v6 = this.c;
        if(v5 >= v6) {
            this.a = v3 * 1000000000L / v4 + v;
            return v5;
        }
        long v7 = Math.min(v6, v1);
        long v8 = this.d;
        long v9 = this.b;
        long v10 = (v7 - v8) * 1000000000L / v9 + v2;
        if(v10 == 0L) {
            this.a = v8 * 1000000000L / v9 + v;
            return v7;
        }
        return -v10;
    }

    @JvmOverloads
    public final void bytesPerSecond(long v) {
        Throttler.bytesPerSecond$default(this, v, 0L, 0L, 6, null);
    }

    @JvmOverloads
    public final void bytesPerSecond(long v, long v1) {
        Throttler.bytesPerSecond$default(this, v, v1, 0L, 4, null);
    }

    @JvmOverloads
    public final void bytesPerSecond(long v, long v1, long v2) {
        ReentrantLock reentrantLock0 = this.e;
        reentrantLock0.lock();
        try {
            if(Long.compare(v, 0L) >= 0 && v1 > 0L && v2 >= v1) {
                this.b = v;
                this.c = v1;
                this.d = v2;
                this.f.signalAll();
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static void bytesPerSecond$default(Throttler throttler0, long v, long v1, long v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = throttler0.c;
        }
        if((v3 & 4) != 0) {
            v2 = throttler0.d;
        }
        throttler0.bytesPerSecond(v, v1, v2);
    }

    @NotNull
    public final Condition getCondition() {
        return this.f;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.e;
    }

    @NotNull
    public final Sink sink(@NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        return new ForwardingSink(this) {
            @Override  // okio.ForwardingSink
            public void write(@NotNull Buffer buffer0, long v) throws IOException {
                Intrinsics.checkNotNullParameter(buffer0, "source");
                while(v > 0L) {
                    try {
                        long v1 = this.b.take$okio(v);
                        super.write(buffer0, v1);
                        v -= v1;
                    }
                    catch(InterruptedException unused_ex) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull Source source0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        return new ForwardingSource(this) {
            @Override  // okio.ForwardingSource
            public long read(@NotNull Buffer buffer0, long v) {
                Intrinsics.checkNotNullParameter(buffer0, "sink");
                try {
                    return super.read(buffer0, this.b.take$okio(v));
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long v) {
        if(v > 0L) {
            ReentrantLock reentrantLock0 = this.e;
            reentrantLock0.lock();
            try {
                long v2;
                while((v2 = this.byteCountOrWaitNanos$okio(System.nanoTime(), v)) < 0L) {
                    this.f.awaitNanos(-v2);
                }
                return v2;
            }
            finally {
                reentrantLock0.unlock();
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

