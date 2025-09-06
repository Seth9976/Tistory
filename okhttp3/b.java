package okhttp3;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache.Snapshot;
import okio.BufferedSource;
import okio.Okio;

public final class b extends ResponseBody {
    public final Snapshot b;
    public final String c;
    public final String d;
    public final BufferedSource e;

    public b(Snapshot diskLruCache$Snapshot0, String s, String s1) {
        Intrinsics.checkNotNullParameter(diskLruCache$Snapshot0, "snapshot");
        super();
        this.b = diskLruCache$Snapshot0;
        this.c = s;
        this.d = s1;
        this.e = Okio.buffer(new Cache.CacheResponseBody.1(diskLruCache$Snapshot0.getSource(1), this));
    }

    @Override  // okhttp3.ResponseBody
    public final long contentLength() {
        return this.d == null ? -1L : Util.toLongOrDefault(this.d, -1L);
    }

    @Override  // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.c == null ? null : MediaType.Companion.parse(this.c);
    }

    @Override  // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.e;
    }
}

