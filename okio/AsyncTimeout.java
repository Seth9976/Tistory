package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001B\u001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000F\u0010\n\u001A\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010J\'\u0010\u0014\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001A\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001A\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001D"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "<init>", "()V", "", "enter", "", "exit", "()Z", "cancel", "timedOut", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", "Lokio/Source;", "source", "(Lokio/Source;)Lokio/Source;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "vg/a", "vg/b", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,382:1\n1#2:383\n*E\n"})
public class AsyncTimeout extends Timeout {
    public int e;
    public AsyncTimeout f;
    public long g;
    public static final a h;
    public static final ReentrantLock i;
    public static final Condition j;
    public static final long k;
    public static final long l;
    public static AsyncTimeout m;

    static {
        AsyncTimeout.h = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        ReentrantLock reentrantLock0 = new ReentrantLock();
        AsyncTimeout.i = reentrantLock0;
        Condition condition0 = reentrantLock0.newCondition();
        Intrinsics.checkNotNullExpressionValue(condition0, "newCondition(...)");
        AsyncTimeout.j = condition0;
        long v = TimeUnit.SECONDS.toMillis(60L);
        AsyncTimeout.k = v;
        AsyncTimeout.l = TimeUnit.MILLISECONDS.toNanos(v);
    }

    public static final long access$getIDLE_TIMEOUT_MILLIS$cp() [...] // 潜在的解密器

    public static final long access$getIDLE_TIMEOUT_NANOS$cp() [...] // 潜在的解密器

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException0) {
        return this.newTimeoutException(iOException0);
    }

    public static final long access$remainingNanos(AsyncTimeout asyncTimeout0, long v) {
        return asyncTimeout0.g - v;
    }

    @Override  // okio.Timeout
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock0 = AsyncTimeout.i;
        reentrantLock0.lock();
        try {
            if(this.e == 1) {
                a.b(this);
                this.e = 3;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public final void enter() {
        long v = this.timeoutNanos();
        boolean z = this.hasDeadline();
        if(v == 0L && !z) {
            return;
        }
        ReentrantLock reentrantLock0 = AsyncTimeout.i;
        reentrantLock0.lock();
        try {
            if(this.e == 0) {
                this.e = 1;
                a.a(this, v, z);
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean exit() {
        ReentrantLock reentrantLock0 = AsyncTimeout.i;
        reentrantLock0.lock();
        try {
            int v1 = this.e;
            boolean z = false;
            this.e = 0;
            if(v1 == 1) {
                a.b(this);
                return false;
            }
            if(v1 == 2) {
                z = true;
            }
            return z;
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException0) {
        IOException iOException1 = new InterruptedIOException("timeout");
        if(iOException0 != null) {
            iOException1.initCause(iOException0);
        }
        return iOException1;
    }

    @NotNull
    public final Sink sink(@NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        return new Sink() {
            public final AsyncTimeout a;
            public final Sink b;

            {
                AsyncTimeout asyncTimeout0 = sink0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = asyncTimeout0;
                this.b = sink0;
            }

            @Override  // okio.Sink
            public void close() {
                AsyncTimeout asyncTimeout0 = this.a;
                asyncTimeout0.enter();
                try {
                    try {
                        this.b.close();
                    }
                    catch(IOException iOException0) {
                        if(asyncTimeout0.exit()) {
                            iOException0 = asyncTimeout0.access$newTimeoutException(iOException0);
                        }
                        throw iOException0;
                    }
                }
                catch(Throwable throwable0) {
                    asyncTimeout0.exit();
                    throw throwable0;
                }
                if(asyncTimeout0.exit()) {
                    throw asyncTimeout0.access$newTimeoutException(null);
                }
            }

            @Override  // okio.Sink
            public void flush() {
                AsyncTimeout asyncTimeout0 = this.a;
                asyncTimeout0.enter();
                try {
                    try {
                        this.b.flush();
                    }
                    catch(IOException iOException0) {
                        if(asyncTimeout0.exit()) {
                            iOException0 = asyncTimeout0.access$newTimeoutException(iOException0);
                        }
                        throw iOException0;
                    }
                }
                catch(Throwable throwable0) {
                    asyncTimeout0.exit();
                    throw throwable0;
                }
                if(asyncTimeout0.exit()) {
                    throw asyncTimeout0.access$newTimeoutException(null);
                }
            }

            @NotNull
            public AsyncTimeout timeout() {
                return this.a;
            }

            @Override  // okio.Sink
            public Timeout timeout() {
                return this.timeout();
            }

            @Override
            @NotNull
            public String toString() {
                return "AsyncTimeout.sink(" + this.b + ')';
            }

            @Override  // okio.Sink
            public void write(@NotNull Buffer buffer0, long v) {
                Intrinsics.checkNotNullParameter(buffer0, "source");
                -SegmentedByteString.checkOffsetAndCount(buffer0.size(), 0L, v);
                while(true) {
                    long v1 = 0L;
                    if(v <= 0L) {
                        break;
                    }
                    Segment segment0 = buffer0.head;
                    Intrinsics.checkNotNull(segment0);
                    while(v1 < 0x10000L) {
                        v1 += (long)(segment0.limit - segment0.pos);
                        if(v1 >= v) {
                            v1 = v;
                            break;
                        }
                        segment0 = segment0.next;
                        Intrinsics.checkNotNull(segment0);
                    }
                    AsyncTimeout asyncTimeout0 = this.a;
                    asyncTimeout0.enter();
                    try {
                        try {
                            this.b.write(buffer0, v1);
                        }
                        catch(IOException iOException0) {
                            if(asyncTimeout0.exit()) {
                                iOException0 = asyncTimeout0.access$newTimeoutException(iOException0);
                            }
                            throw iOException0;
                        }
                    }
                    catch(Throwable throwable0) {
                        asyncTimeout0.exit();
                        throw throwable0;
                    }
                    if(asyncTimeout0.exit()) {
                        throw asyncTimeout0.access$newTimeoutException(null);
                    }
                    v -= v1;
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull Source source0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        return new Source() {
            public final AsyncTimeout a;
            public final Source b;

            {
                AsyncTimeout asyncTimeout0 = source0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = asyncTimeout0;
                this.b = source0;
            }

            @Override  // okio.Source
            public void close() {
                AsyncTimeout asyncTimeout0 = this.a;
                asyncTimeout0.enter();
                try {
                    try {
                        this.b.close();
                    }
                    catch(IOException iOException0) {
                        if(asyncTimeout0.exit()) {
                            iOException0 = asyncTimeout0.access$newTimeoutException(iOException0);
                        }
                        throw iOException0;
                    }
                }
                catch(Throwable throwable0) {
                    asyncTimeout0.exit();
                    throw throwable0;
                }
                if(asyncTimeout0.exit()) {
                    throw asyncTimeout0.access$newTimeoutException(null);
                }
            }

            @Override  // okio.Source
            public long read(@NotNull Buffer buffer0, long v) {
                long v1;
                Intrinsics.checkNotNullParameter(buffer0, "sink");
                AsyncTimeout asyncTimeout0 = this.a;
                asyncTimeout0.enter();
                try {
                    try {
                        v1 = this.b.read(buffer0, v);
                    }
                    catch(IOException iOException0) {
                        if(asyncTimeout0.exit()) {
                            iOException0 = asyncTimeout0.access$newTimeoutException(iOException0);
                        }
                        throw iOException0;
                    }
                }
                catch(Throwable throwable0) {
                    asyncTimeout0.exit();
                    throw throwable0;
                }
                if(asyncTimeout0.exit()) {
                    throw asyncTimeout0.access$newTimeoutException(null);
                }
                return v1;
            }

            @NotNull
            public AsyncTimeout timeout() {
                return this.a;
            }

            @Override  // okio.Source
            public Timeout timeout() {
                return this.timeout();
            }

            @Override
            @NotNull
            public String toString() {
                return "AsyncTimeout.source(" + this.b + ')';
            }
        };
    }

    public void timedOut() {
    }

    public final Object withTimeout(@NotNull Function0 function00) {
        Object object0;
        Intrinsics.checkNotNullParameter(function00, "block");
        this.enter();
        try {
            try {
                object0 = function00.invoke();
            }
            catch(IOException iOException0) {
                if(this.exit()) {
                    iOException0 = this.access$newTimeoutException(iOException0);
                }
                throw iOException0;
            }
        }
        catch(Throwable throwable0) {
            this.exit();
            throw throwable0;
        }
        if(this.exit()) {
            throw this.access$newTimeoutException(null);
        }
        return object0;
    }
}

