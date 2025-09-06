package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleSupport;

public final class u extends a0 {
    public final Fragment a;

    public u(Fragment fragment0) {
        this.a = fragment0;
    }

    @Override  // androidx.fragment.app.a0
    public final void a() {
        this.a.mSavedStateRegistryController.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(this.a);
        Bundle bundle0 = this.a.mSavedFragmentState;
        Bundle bundle1 = bundle0 == null ? null : bundle0.getBundle("registryState");
        this.a.mSavedStateRegistryController.performRestore(bundle1);
    }
}

