package androidx.fragment.app;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import java.util.concurrent.atomic.AtomicReference;

public final class y extends a0 {
    public final Function a;
    public final AtomicReference b;
    public final ActivityResultContract c;
    public final ActivityResultCallback d;
    public final Fragment e;

    public y(Fragment fragment0, Function function0, AtomicReference atomicReference0, ActivityResultContract activityResultContract0, ActivityResultCallback activityResultCallback0) {
        this.e = fragment0;
        this.a = function0;
        this.b = atomicReference0;
        this.c = activityResultContract0;
        this.d = activityResultCallback0;
    }

    @Override  // androidx.fragment.app.a0
    public final void a() {
        String s = this.e.generateActivityResultKey();
        ActivityResultLauncher activityResultLauncher0 = ((ActivityResultRegistry)this.a.apply(null)).register(s, this.e, this.c, this.d);
        this.b.set(activityResultLauncher0);
    }
}

