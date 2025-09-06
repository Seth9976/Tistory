package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final LivePagedList w;

    public u(LivePagedList livePagedList0) {
        this.w = livePagedList0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.d(true);
        return Unit.INSTANCE;
    }
}

