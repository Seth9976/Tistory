package androidx.paging;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s4.e0;

public final class z extends Lambda implements Function0 {
    public final e0 w;

    public z(e0 e00) {
        this.w = e00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w.d.getCachedEvent$paging_common_release();
    }
}

