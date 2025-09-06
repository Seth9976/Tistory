package androidx.paging;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function1 {
    public final Callback w;

    public t0(Callback pagedList$Callback0) {
        this.w = pagedList$Callback0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((WeakReference)object0), "it");
        return ((WeakReference)object0).get() == null || ((WeakReference)object0).get() == this.w;
    }
}

