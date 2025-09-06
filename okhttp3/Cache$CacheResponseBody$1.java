package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import okio.ForwardingSource;
import okio.Source;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/Cache$CacheResponseBody$1", "Lokio/ForwardingSource;", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Cache.CacheResponseBody.1 extends ForwardingSource {
    public final b b;

    public Cache.CacheResponseBody.1(Source source0, b b0) {
        this.b = b0;
        super(source0);
    }

    @Override  // okio.ForwardingSource
    public void close() throws IOException {
        this.b.b.close();
        super.close();
    }
}

