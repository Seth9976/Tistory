package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class d extends FunctionReferenceImpl implements Function2 {
    public d(androidx.paging.AsyncPagedListDiffer.loadStateManager.1 asyncPagedListDiffer$loadStateManager$10) {
        super(2, asyncPagedListDiffer$loadStateManager$10, LoadStateManager.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((LoadType)object0), "p0");
        Intrinsics.checkNotNullParameter(((LoadState)object1), "p1");
        ((LoadStateManager)this.receiver).setState(((LoadType)object0), ((LoadState)object1));
        return Unit.INSTANCE;
    }
}

