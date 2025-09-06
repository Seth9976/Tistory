package okio;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001A\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0002\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "delegate", "<init>", "(Lokio/Sink;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lokio/Sink;", "a", "Lokio/Sink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ForwardingSink implements Sink {
    public final Sink a;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    public final Sink -deprecated_delegate() {
        return this.a;
    }

    public ForwardingSink(@NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(sink0, "delegate");
        super();
        this.a = sink0;
    }

    @Override  // okio.Sink
    public void close() throws IOException {
        this.a.close();
    }

    @JvmName(name = "delegate")
    @NotNull
    public final Sink delegate() {
        return this.a;
    }

    @Override  // okio.Sink
    public void flush() throws IOException {
        this.a.flush();
    }

    @Override  // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.a.timeout();
    }

    @Override
    @NotNull
    public String toString() {
        return this.getClass().getSimpleName() + '(' + this.a + ')';
    }

    @Override  // okio.Sink
    public void write(@NotNull Buffer buffer0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        this.a.write(buffer0, v);
    }
}

