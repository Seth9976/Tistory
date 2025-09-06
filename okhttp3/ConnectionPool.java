package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000E\u001A\u00020\u0006¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000FJ\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\rR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/ConnectionPool;", "", "Lokhttp3/internal/connection/RealConnectionPool;", "delegate", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "idleConnectionCount", "()I", "connectionCount", "", "evictAll", "a", "Lokhttp3/internal/connection/RealConnectionPool;", "getDelegate$okhttp", "()Lokhttp3/internal/connection/RealConnectionPool;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ConnectionPool {
    public final RealConnectionPool a;

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public ConnectionPool(int v, long v1, @NotNull TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
        this(new RealConnectionPool(TaskRunner.INSTANCE, v, v1, timeUnit0));
    }

    public ConnectionPool(@NotNull RealConnectionPool realConnectionPool0) {
        Intrinsics.checkNotNullParameter(realConnectionPool0, "delegate");
        super();
        this.a = realConnectionPool0;
    }

    public final int connectionCount() {
        return this.a.connectionCount();
    }

    public final void evictAll() {
        this.a.evictAll();
    }

    @NotNull
    public final RealConnectionPool getDelegate$okhttp() {
        return this.a;
    }

    public final int idleConnectionCount() {
        return this.a.idleConnectionCount();
    }
}

