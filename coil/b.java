package coil;

import coil.util.SingletonDiskCache;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Builder w;

    public b(Builder imageLoader$Builder0) {
        this.w = imageLoader$Builder0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return SingletonDiskCache.INSTANCE.get(this.w.a);
    }
}

