package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import androidx.core.os.CancellationSignal.OnCancelListener;
import kotlin.jvm.internal.Intrinsics;

public final class f implements OnCancelListener {
    public final Animator a;
    public final Operation b;

    public f(Animator animator0, Operation specialEffectsController$Operation0) {
        this.a = animator0;
        this.b = specialEffectsController$Operation0;
    }

    @Override  // androidx.core.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        Operation specialEffectsController$Operation0 = this.b;
        Intrinsics.checkNotNullParameter(specialEffectsController$Operation0, "$operation");
        this.a.end();
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Animator from operation " + specialEffectsController$Operation0 + " has been canceled.");
        }
    }
}

