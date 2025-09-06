package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final DiskLruCache w;
    public final Editor x;

    public a(DiskLruCache diskLruCache0, Editor diskLruCache$Editor0) {
        this.w = diskLruCache0;
        this.x = diskLruCache$Editor0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((IOException)object0), "it");
        synchronized(this.w) {
            this.x.detach$okhttp();
            return Unit.INSTANCE;
        }
    }
}

