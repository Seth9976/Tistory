package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function1 {
    public final LoadType w;
    public final Error x;

    public a1(LoadType loadType0, Error remoteMediator$MediatorResult$Error0) {
        this.w = loadType0;
        this.x = remoteMediator$MediatorResult$Error0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((a)object0), "it");
        ((a)object0).a(this.w);
        androidx.paging.LoadState.Error loadState$Error0 = new androidx.paging.LoadState.Error(this.x.getThrowable());
        ((a)object0).e(this.w, loadState$Error0);
        return Unit.INSTANCE;
    }
}

