package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001F\u0010\r\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "", "size", "", "truncate", "<init>", "(Lokio/Source;JZ)V", "Lokio/Buffer;", "sink", "byteCount", "read", "(Lokio/Buffer;J)J", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FixedLengthSource extends ForwardingSource {
    public final long b;
    public final boolean c;
    public long d;

    public FixedLengthSource(@NotNull Source source0, long v, boolean z) {
        Intrinsics.checkNotNullParameter(source0, "delegate");
        super(source0);
        this.b = v;
        this.c = z;
    }

    @Override  // okio.ForwardingSource
    public long read(@NotNull Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        long v1 = this.d;
        long v2 = this.b;
        if(Long.compare(v1, v2) > 0) {
            v = 0L;
        }
        else if(this.c) {
            long v3 = v2 - v1;
            if(v3 == 0L) {
                return -1L;
            }
            v = Math.min(v, v3);
        }
        long v4 = super.read(buffer0, v);
        int v5 = Long.compare(v4, -1L);
        if(v5 != 0) {
            this.d += v4;
        }
        long v6 = this.d;
        if(v6 < v2 && v5 == 0 || v6 > v2) {
            if(v4 > 0L && v6 > v2) {
                long v7 = buffer0.size() - (this.d - v2);
                Buffer buffer1 = new Buffer();
                buffer1.writeAll(buffer0);
                buffer0.write(buffer1, v7);
                buffer1.clear();
            }
            throw new IOException("expected " + v2 + " bytes but got " + this.d);
        }
        return v4;
    }
}

