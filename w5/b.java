package w5;

import coil.network.CacheResponse;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;

public final class b extends Lambda implements Function0 {
    public final CacheResponse w;

    public b(CacheResponse cacheResponse0) {
        this.w = cacheResponse0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.w.getResponseHeaders().get("Content-Type");
        return s != null ? MediaType.Companion.parse(s) : null;
    }
}

