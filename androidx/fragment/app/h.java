package androidx.fragment.app;

import androidx.collection.ArrayMap;
import kotlin.jvm.internal.Intrinsics;

public final class h implements Runnable {
    public final Operation a;
    public final Operation b;
    public final boolean c;
    public final ArrayMap d;

    public h(Operation specialEffectsController$Operation0, Operation specialEffectsController$Operation1, boolean z, ArrayMap arrayMap0) {
        this.a = specialEffectsController$Operation0;
        this.b = specialEffectsController$Operation1;
        this.c = z;
        this.d = arrayMap0;
    }

    @Override
    public final void run() {
        Intrinsics.checkNotNullParameter(this.d, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(this.a.getFragment(), this.b.getFragment(), this.c, this.d, false);
    }
}

