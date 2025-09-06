package androidx.fragment.app;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import java.util.concurrent.atomic.AtomicReference;

public final class s extends ActivityResultLauncher {
    public final AtomicReference a;
    public final ActivityResultContract b;

    public s(AtomicReference atomicReference0, ActivityResultContract activityResultContract0) {
        this.a = atomicReference0;
        this.b = activityResultContract0;
        super();
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public final ActivityResultContract getContract() {
        return this.b;
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public final void launch(Object object0, ActivityOptionsCompat activityOptionsCompat0) {
        ActivityResultLauncher activityResultLauncher0 = (ActivityResultLauncher)this.a.get();
        if(activityResultLauncher0 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        activityResultLauncher0.launch(object0, activityOptionsCompat0);
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public final void unregister() {
        ActivityResultLauncher activityResultLauncher0 = (ActivityResultLauncher)this.a.getAndSet(null);
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.unregister();
        }
    }
}

