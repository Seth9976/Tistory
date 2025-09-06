package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import lg.a;
import okio.ForwardingSink;
import okio.Sink;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/Cache$RealCacheRequest$1", "Lokio/ForwardingSink;", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Cache.RealCacheRequest.1 extends ForwardingSink {
    public final Cache b;
    public final a c;

    public Cache.RealCacheRequest.1(Cache cache0, a a0, Sink sink0) {
        this.b = cache0;
        this.c = a0;
        super(sink0);
    }

    @Override  // okio.ForwardingSink
    public void close() throws IOException {
        Cache cache0 = this.b;
        a a0 = this.c;
        synchronized(cache0) {
            if(a0.d) {
                return;
            }
            a0.d = true;
            cache0.setWriteSuccessCount$okhttp(cache0.getWriteSuccessCount$okhttp() + 1);
        }
        super.close();
        this.c.a.commit();
    }
}

