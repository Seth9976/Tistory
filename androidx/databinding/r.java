package androidx.databinding;

import java.lang.ref.ReferenceQueue;
import kotlin.jvm.internal.Intrinsics;

public final class r implements CreateWeakListener {
    @Override  // androidx.databinding.CreateWeakListener
    public final w create(ViewDataBinding viewDataBinding0, int v, ReferenceQueue referenceQueue0) {
        Intrinsics.checkNotNull(referenceQueue0);
        return new StateFlowListener(viewDataBinding0, v, referenceQueue0).getListener();
    }
}

