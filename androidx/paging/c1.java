package androidx.paging;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function1 {
    public final Success w;

    public c1(Success remoteMediator$MediatorResult$Success0) {
        this.w = remoteMediator$MediatorResult$Success0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((a)object0), "it");
        LoadType loadType0 = LoadType.REFRESH;
        ((a)object0).a(loadType0);
        if(this.w.endOfPaginationReached()) {
            ((a)object0).d(loadType0, AccessorState.BlockState.COMPLETED);
            ((a)object0).d(LoadType.PREPEND, AccessorState.BlockState.COMPLETED);
            ((a)object0).d(LoadType.APPEND, AccessorState.BlockState.COMPLETED);
            ((a)object0).c.clear();
        }
        else {
            ((a)object0).d(LoadType.PREPEND, AccessorState.BlockState.UNBLOCKED);
            ((a)object0).d(LoadType.APPEND, AccessorState.BlockState.UNBLOCKED);
        }
        ((a)object0).e(LoadType.PREPEND, null);
        ((a)object0).e(LoadType.APPEND, null);
        return ((a)object0).c() == null ? false : true;
    }
}

