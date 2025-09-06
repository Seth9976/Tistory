package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function1 {
    public final LoadType w;
    public final Success x;

    public z0(LoadType loadType0, Success remoteMediator$MediatorResult$Success0) {
        this.w = loadType0;
        this.x = remoteMediator$MediatorResult$Success0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((a)object0), "it");
        LoadType loadType0 = this.w;
        ((a)object0).a(loadType0);
        if(this.x.endOfPaginationReached()) {
            ((a)object0).d(loadType0, AccessorState.BlockState.COMPLETED);
        }
        return Unit.INSTANCE;
    }
}

