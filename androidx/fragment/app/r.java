package androidx.fragment.app;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class r implements Runnable {
    public final int a;
    public final Object b;

    public r(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.b;
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(((ArrayList)object0), "$transitioningViews");
            FragmentTransition.setViewVisibility(((ArrayList)object0), 4);
            return;
        }
        ((Fragment)object0).mViewLifecycleOwner.f.performRestore(((Fragment)object0).mSavedViewRegistryState);
        ((Fragment)object0).mSavedViewRegistryState = null;
    }
}

