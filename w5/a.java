package w5;

import coil.network.CacheResponse;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.CacheControl;

public final class a extends Lambda implements Function0 {
    public final CacheResponse w;

    public a(CacheResponse cacheResponse0) {
        this.w = cacheResponse0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CacheControl.Companion.parse(this.w.getResponseHeaders());
    }
}

