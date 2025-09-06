package androidx.fragment.app;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class e0 implements OnContextAvailableListener {
    public final FragmentActivity a;

    public e0(FragmentActivity fragmentActivity0) {
        this.a = fragmentActivity0;
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.mFragments.attachHost(null);
    }
}

