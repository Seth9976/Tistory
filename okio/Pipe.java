package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import jeb.synthetic.FIN;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u0010\u001A\u00020\rH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u001C\u001A\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\"\u0010$\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b%\u0010\u001F\u001A\u0004\b&\u0010!\"\u0004\b\'\u0010#R\"\u0010,\u001A\u00020\u001D8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b)\u0010\u001F\u001A\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00101\u001A\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\f\"\u0004\b0\u0010\nR\u0017\u00107\u001A\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R\u0017\u0010=\u001A\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<R\u0017\u0010\u0007\u001A\u00020\u00068G¢\u0006\f\n\u0004\b>\u0010.\u001A\u0004\b\u0007\u0010\fR\u0017\u0010\u0010\u001A\u00020\r8G¢\u0006\f\n\u0004\b?\u0010@\u001A\u0004\b\u0010\u0010\u000F¨\u0006A"}, d2 = {"Lokio/Pipe;", "", "", "maxBufferSize", "<init>", "(J)V", "Lokio/Sink;", "sink", "", "fold", "(Lokio/Sink;)V", "-deprecated_sink", "()Lokio/Sink;", "Lokio/Source;", "-deprecated_source", "()Lokio/Source;", "source", "cancel", "()V", "a", "J", "getMaxBufferSize$okio", "()J", "Lokio/Buffer;", "b", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "buffer", "", "c", "Z", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "canceled", "d", "getSinkClosed$okio", "setSinkClosed$okio", "sinkClosed", "e", "getSourceClosed$okio", "setSourceClosed$okio", "sourceClosed", "f", "Lokio/Sink;", "getFoldedSink$okio", "setFoldedSink$okio", "foldedSink", "Ljava/util/concurrent/locks/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "h", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "condition", "i", "j", "Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,262:1\n1#2:263\n300#3,26:264\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n222#1:264,26\n*E\n"})
public final class Pipe {
    public final long a;
    public final Buffer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Sink f;
    public final ReentrantLock g;
    public final Condition h;
    public final okio.Pipe.sink.1 i;
    public final okio.Pipe.source.1 j;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    @JvmName(name = "-deprecated_sink")
    @NotNull
    public final Sink -deprecated_sink() {
        return this.i;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "source", imports = {}))
    @JvmName(name = "-deprecated_source")
    @NotNull
    public final Source -deprecated_source() {
        return this.j;
    }

    public Pipe(long v) {
        this.a = v;
        this.b = new Buffer();
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.g = reentrantLock0;
        Condition condition0 = reentrantLock0.newCondition();
        Intrinsics.checkNotNullExpressionValue(condition0, "newCondition(...)");
        this.h = condition0;
        if(v < 1L) {
            throw new IllegalArgumentException(q.n(v, "maxBufferSize < 1: ").toString());
        }
        this.i = new Sink() {
            public final Timeout a;
            public final Pipe b;

            {
                this.b = pipe0;
                this.a = new Timeout();
            }

            @Override  // okio.Sink
            public void close() {
                Sink sink0;
                Pipe pipe0 = this.b;
                ReentrantLock reentrantLock0 = pipe0.getLock();
                reentrantLock0.lock();
                if(pipe0.getSinkClosed$okio()) {
                    reentrantLock0.unlock();
                    return;
                }
                try {
                    sink0 = pipe0.getFoldedSink$okio();
                    if(sink0 == null) {
                        if(pipe0.getSourceClosed$okio() && pipe0.getBuffer$okio().size() > 0L) {
                            throw new IOException("source is closed");
                        }
                        pipe0.setSinkClosed$okio(true);
                        pipe0.getCondition().signalAll();
                        sink0 = null;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                if(sink0 != null) {
                    Timeout timeout0 = sink0.timeout();
                    Timeout timeout1 = pipe0.sink().timeout();
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
                            sink0.close();
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
                    }
                    else {
                        if(timeout1.hasDeadline()) {
                            timeout0.deadlineNanoTime(timeout1.deadlineNanoTime());
                        }
                        try {
                            sink0.close();
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
                    }
                }
            }

            @Override  // okio.Sink
            public void flush() {
                Pipe pipe0 = this.b;
                ReentrantLock reentrantLock0 = pipe0.getLock();
                reentrantLock0.lock();
                try {
                    if(!pipe0.getSinkClosed$okio()) {
                        if(pipe0.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                        Sink sink0 = pipe0.getFoldedSink$okio();
                        if(sink0 == null) {
                            if(pipe0.getSourceClosed$okio() && pipe0.getBuffer$okio().size() > 0L) {
                                throw new IOException("source is closed");
                            }
                            sink0 = null;
                        }
                        if(sink0 != null) {
                            Timeout timeout0 = sink0.timeout();
                            Timeout timeout1 = pipe0.sink().timeout();
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
                                    sink0.flush();
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
                                    return;
                                }
                            }
                            else {
                                if(timeout1.hasDeadline()) {
                                    timeout0.deadlineNanoTime(timeout1.deadlineNanoTime());
                                }
                                try {
                                    sink0.flush();
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
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                throw new IllegalStateException("closed");
            }

            @Override  // okio.Sink
            @NotNull
            public Timeout timeout() {
                return this.a;
            }

            @Override  // okio.Sink
            public void write(@NotNull Buffer buffer0, long v) {
                Sink sink1;
                Intrinsics.checkNotNullParameter(buffer0, "source");
                Pipe pipe0 = this.b;
                ReentrantLock reentrantLock0 = pipe0.getLock();
                reentrantLock0.lock();
                try {
                    if(!pipe0.getSinkClosed$okio()) {
                        if(pipe0.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                        while(v > 0L) {
                            Sink sink0 = pipe0.getFoldedSink$okio();
                            if(sink0 != null) {
                                sink1 = sink0;
                                goto label_27;
                            }
                            if(pipe0.getSourceClosed$okio()) {
                                throw new IOException("source is closed");
                            }
                            long v2 = pipe0.getMaxBufferSize$okio() - pipe0.getBuffer$okio().size();
                            if(v2 == 0L) {
                                this.a.awaitSignal(pipe0.getCondition());
                                if(pipe0.getCanceled$okio()) {
                                    throw new IOException("canceled");
                                }
                            }
                            else {
                                long v3 = Math.min(v2, v);
                                pipe0.getBuffer$okio().write(buffer0, v3);
                                v -= v3;
                                pipe0.getCondition().signalAll();
                            }
                        }
                        sink1 = null;
                    label_27:
                        if(sink1 != null) {
                            Timeout timeout0 = sink1.timeout();
                            Timeout timeout1 = pipe0.sink().timeout();
                            long v4 = timeout0.timeoutNanos();
                            long v5 = timeout1.timeoutNanos();
                            long v6 = timeout0.timeoutNanos();
                            TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
                            timeout0.timeout(Timeout.Companion.minTimeout(v5, v6), timeUnit0);
                            if(timeout0.hasDeadline()) {
                                long v7 = timeout0.deadlineNanoTime();
                                if(timeout1.hasDeadline()) {
                                    timeout0.deadlineNanoTime(Math.min(timeout0.deadlineNanoTime(), timeout1.deadlineNanoTime()));
                                }
                                try {
                                    sink1.write(buffer0, v);
                                }
                                catch(Throwable throwable0) {
                                    timeout0.timeout(v4, TimeUnit.NANOSECONDS);
                                    if(timeout1.hasDeadline()) {
                                        timeout0.deadlineNanoTime(v7);
                                    }
                                    throw throwable0;
                                }
                                timeout0.timeout(v4, timeUnit0);
                                if(timeout1.hasDeadline()) {
                                    timeout0.deadlineNanoTime(v7);
                                    return;
                                }
                            }
                            else {
                                if(timeout1.hasDeadline()) {
                                    timeout0.deadlineNanoTime(timeout1.deadlineNanoTime());
                                }
                                try {
                                    sink1.write(buffer0, v);
                                }
                                catch(Throwable throwable1) {
                                    timeout0.timeout(v4, TimeUnit.NANOSECONDS);
                                    if(timeout1.hasDeadline()) {
                                        timeout0.clearDeadline();
                                    }
                                    throw throwable1;
                                }
                                timeout0.timeout(v4, timeUnit0);
                                if(timeout1.hasDeadline()) {
                                    timeout0.clearDeadline();
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                throw new IllegalStateException("closed");
            }
        };
        this.j = new Source() {
            public final Timeout a;
            public final Pipe b;

            {
                this.b = pipe0;
                this.a = new Timeout();
            }

            @Override  // okio.Source
            public void close() {
                ReentrantLock reentrantLock0 = this.b.getLock();
                reentrantLock0.lock();
                try {
                    this.b.setSourceClosed$okio(true);
                    this.b.getCondition().signalAll();
                }
                finally {
                    reentrantLock0.unlock();
                }
            }

            @Override  // okio.Source
            public long read(@NotNull Buffer buffer0, long v) {
                long v1;
                Intrinsics.checkNotNullParameter(buffer0, "sink");
                Pipe pipe0 = this.b;
                ReentrantLock reentrantLock0 = pipe0.getLock();
                reentrantLock0.lock();
                try {
                    if(pipe0.getSourceClosed$okio()) {
                        throw new IllegalStateException("closed");
                    }
                    if(pipe0.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    while(true) {
                    label_8:
                        if(pipe0.getBuffer$okio().size() != 0L) {
                            v1 = pipe0.getBuffer$okio().read(buffer0, v);
                            pipe0.getCondition().signalAll();
                            break;
                        }
                        goto label_13;
                    }
                }
                catch(Throwable throwable0) {
                    reentrantLock0.unlock();
                    throw throwable0;
                }
                reentrantLock0.unlock();
                return v1;
            label_13:
                if(pipe0.getSinkClosed$okio()) {
                    reentrantLock0.unlock();
                    return -1L;
                }
                try {
                    this.a.awaitSignal(pipe0.getCondition());
                    if(pipe0.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    goto label_8;
                }
                catch(Throwable throwable0) {
                }
                reentrantLock0.unlock();
                throw throwable0;
            }

            @Override  // okio.Source
            @NotNull
            public Timeout timeout() {
                return this.a;
            }
        };
    }

    public final void cancel() {
        this.g.lock();
        try {
            this.c = true;
            this.b.clear();
            this.h.signalAll();
        }
        finally {
            this.g.unlock();
        }
    }

    public final void fold(@NotNull Sink sink0) throws IOException {
        boolean z1;
        Buffer buffer2;
        Condition condition0;
        int v;
        ReentrantLock reentrantLock0;
        Buffer buffer0 = this.b;
        Intrinsics.checkNotNullParameter(sink0, "sink");
        while(true) {
            reentrantLock0 = this.g;
            reentrantLock0.lock();
            v = FIN.finallyOpen$NT();
            if(this.f != null) {
                goto label_46;
            }
            if(this.c) {
                goto label_43;
            }
            boolean z = this.d;
            condition0 = this.h;
            Buffer buffer1 = null;
            if(buffer0.exhausted()) {
                this.e = true;
                this.f = sink0;
                buffer2 = null;
                z1 = true;
            }
            else {
                buffer2 = new Buffer();
                buffer2.write(buffer0, buffer0.size());
                condition0.signalAll();
                z1 = false;
            }
            FIN.finallyCodeBegin$NT(v);
            reentrantLock0.unlock();
            FIN.finallyCodeEnd$NT(v);
            if(z1) {
                if(z) {
                    sink0.close();
                }
                return;
            }
            try {
                if(buffer2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sinkBuffer");
                }
                else {
                    buffer1 = buffer2;
                }
                sink0.write(buffer1, buffer2.size());
                sink0.flush();
                continue;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
        reentrantLock0.lock();
        try {
            this.e = true;
            condition0.signalAll();
        }
        finally {
            reentrantLock0.unlock();
        }
        throw throwable0;
    label_43:
        this.f = sink0;
        FIN.finallyExec$NT(v);
        throw new IOException("canceled");
    label_46:
        FIN.finallyExec$NT(v);
        throw new IllegalStateException("sink already folded");
    }

    @NotNull
    public final Buffer getBuffer$okio() {
        return this.b;
    }

    public final boolean getCanceled$okio() {
        return this.c;
    }

    @NotNull
    public final Condition getCondition() {
        return this.h;
    }

    @Nullable
    public final Sink getFoldedSink$okio() {
        return this.f;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.g;
    }

    public final long getMaxBufferSize$okio() {
        return this.a;
    }

    public final boolean getSinkClosed$okio() {
        return this.d;
    }

    public final boolean getSourceClosed$okio() {
        return this.e;
    }

    public final void setCanceled$okio(boolean z) {
        this.c = z;
    }

    public final void setFoldedSink$okio(@Nullable Sink sink0) {
        this.f = sink0;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.d = z;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.e = z;
    }

    @JvmName(name = "sink")
    @NotNull
    public final Sink sink() {
        return this.i;
    }

    @JvmName(name = "source")
    @NotNull
    public final Source source() {
        return this.j;
    }
}

