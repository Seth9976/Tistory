package c0;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final LazyGridState w;
    public final int x;

    public q(LazyGridState lazyGridState0, int v) {
        this.w = lazyGridState0;
        this.x = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot.Companion.restoreNonObservable(snapshot0, Snapshot.Companion.makeCurrentNonObservable(snapshot0), function10);
        this.w.a.onNestedPrefetch(((NestedPrefetchScope)object0), this.x);
        return Unit.INSTANCE;
    }
}

