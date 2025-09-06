package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.core.os.CancellationSignal.OnCancelListener;
import kotlin.jvm.internal.Intrinsics;

public final class g implements OnCancelListener {
    public final View a;
    public final DefaultSpecialEffectsController b;
    public final i c;
    public final Operation d;

    public g(View view0, i i0, DefaultSpecialEffectsController defaultSpecialEffectsController0, Operation specialEffectsController$Operation0) {
        this.a = view0;
        this.b = defaultSpecialEffectsController0;
        this.c = i0;
        this.d = specialEffectsController$Operation0;
    }

    @Override  // androidx.core.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        Intrinsics.checkNotNullParameter(this.b, "this$0");
        Intrinsics.checkNotNullParameter(this.c, "$animationInfo");
        Operation specialEffectsController$Operation0 = this.d;
        Intrinsics.checkNotNullParameter(specialEffectsController$Operation0, "$operation");
        this.a.clearAnimation();
        this.b.getContainer().endViewTransition(this.a);
        this.c.a();
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animation from operation " + specialEffectsController$Operation0 + " has been cancelled.");
        }
    }
}

