package lg;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache.RealCacheRequest.1;
import okhttp3.Cache;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache.Editor;
import okio.Sink;

public final class a implements CacheRequest {
    public final Editor a;
    public final Sink b;
    public final Cache.RealCacheRequest.1 c;
    public boolean d;
    public final Cache e;

    public a(Cache cache0, Editor diskLruCache$Editor0) {
        Intrinsics.checkNotNullParameter(diskLruCache$Editor0, "editor");
        this.e = cache0;
        this.a = diskLruCache$Editor0;
        Sink sink0 = diskLruCache$Editor0.newSink(1);
        this.b = sink0;
        this.c = new Cache.RealCacheRequest.1(cache0, this, sink0);
    }

    @Override  // okhttp3.internal.cache.CacheRequest
    public final void abort() {
        Cache cache0 = this.e;
        synchronized(cache0) {
            if(this.d) {
                return;
            }
            this.d = true;
            cache0.setWriteAbortCount$okhttp(cache0.getWriteAbortCount$okhttp() + 1);
        }
        Util.closeQuietly(this.b);
        try {
            this.a.abort();
        }
        catch(IOException unused_ex) {
        }
    }

    @Override  // okhttp3.internal.cache.CacheRequest
    public final Sink body() {
        return this.c;
    }
}

