package okio;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\t\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001A\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0002\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "<init>", "(Lokio/Source;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lokio/Source;", "a", "Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ForwardingSource implements Source {
    public final Source a;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    public final Source -deprecated_delegate() {
        return this.a;
    }

    public ForwardingSource(@NotNull Source source0) {
        Intrinsics.checkNotNullParameter(source0, "delegate");
        super();
        this.a = source0;
    }

    @Override  // okio.Source
    public void close() throws IOException {
        this.a.close();
    }

    @JvmName(name = "delegate")
    @NotNull
    public final Source delegate() {
        return this.a;
    }

    @Override  // okio.Source
    public long read(@NotNull Buffer buffer0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        return this.a.read(buffer0, v);
    }

    @Override  // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.a.timeout();
    }

    @Override
    @NotNull
    public String toString() {
        return this.getClass().getSimpleName() + '(' + this.a + ')';
    }
}

