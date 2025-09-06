package androidx.lifecycle;

import androidx.annotation.NonNull;

@Deprecated
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override  // androidx.lifecycle.LifecycleOwner
    @NonNull
    default Lifecycle getLifecycle() {
        return this.getLifecycle();
    }

    @NonNull
    LifecycleRegistry getLifecycle();
}

