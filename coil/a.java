package coil;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final Builder w;

    public a(Builder imageLoader$Builder0) {
        this.w = imageLoader$Builder0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new coil.memory.MemoryCache.Builder(this.w.a).build();
    }
}

