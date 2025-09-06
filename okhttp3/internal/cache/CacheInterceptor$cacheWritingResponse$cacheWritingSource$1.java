package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"okhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CacheInterceptor.cacheWritingResponse.cacheWritingSource.1 implements Source {
    public boolean a;
    public final BufferedSource b;
    public final CacheRequest c;
    public final BufferedSink d;

    public CacheInterceptor.cacheWritingResponse.cacheWritingSource.1(BufferedSource bufferedSource0, CacheRequest cacheRequest0, BufferedSink bufferedSink0) {
        this.b = bufferedSource0;
        this.c = cacheRequest0;
        this.d = bufferedSink0;
    }

    @Override  // okio.Source
    public void close() throws IOException {
        if(!this.a && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.a = true;
            this.c.abort();
        }
        this.b.close();
    }

    @Override  // okio.Source
    public long read(@NotNull Buffer buffer0, long v) throws IOException {
        BufferedSink bufferedSink0;
        long v1;
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        try {
            v1 = this.b.read(buffer0, v);
            bufferedSink0 = this.d;
        }
        catch(IOException iOException0) {
            if(!this.a) {
                this.a = true;
                this.c.abort();
            }
            throw iOException0;
        }
        if(Long.compare(v1, -1L) == 0) {
            if(!this.a) {
                this.a = true;
                bufferedSink0.close();
            }
            return -1L;
        }
        buffer0.copyTo(bufferedSink0.getBuffer(), buffer0.size() - v1, v1);
        bufferedSink0.emitCompleteSegments();
        return v1;
    }

    @Override  // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.b.timeout();
    }
}

