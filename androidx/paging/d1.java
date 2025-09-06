package androidx.paging;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function1 {
    public final Error w;

    public d1(Error remoteMediator$MediatorResult$Error0) {
        this.w = remoteMediator$MediatorResult$Error0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((a)object0), "it");
        ((a)object0).a(LoadType.REFRESH);
        androidx.paging.LoadState.Error loadState$Error0 = new androidx.paging.LoadState.Error(this.w.getThrowable());
        ((a)object0).e(LoadType.REFRESH, loadState$Error0);
        return ((a)object0).c() == null ? false : true;
    }
}

