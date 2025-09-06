package androidx.paging;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class q implements InvalidatedCallback, FunctionAdapter {
    public final LegacyPagingSource a;

    public q(LegacyPagingSource legacyPagingSource0) {
        this.a = legacyPagingSource0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof InvalidatedCallback) || !(object0 instanceof FunctionAdapter) ? false : Intrinsics.areEqual(this.getFunctionDelegate(), ((FunctionAdapter)object0).getFunctionDelegate());
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
    }

    @Override
    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }

    @Override  // androidx.paging.DataSource$InvalidatedCallback
    public final void onInvalidated() {
        this.a.invalidate();
    }
}

