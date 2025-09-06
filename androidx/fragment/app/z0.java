package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

public final class z0 implements FragmentResultListener {
    public final Lifecycle a;
    public final FragmentResultListener b;
    public final u0 c;

    public z0(Lifecycle lifecycle0, FragmentResultListener fragmentResultListener0, u0 u00) {
        this.a = lifecycle0;
        this.b = fragmentResultListener0;
        this.c = u00;
    }

    @Override  // androidx.fragment.app.FragmentResultListener
    public final void onFragmentResult(String s, Bundle bundle0) {
        this.b.onFragmentResult(s, bundle0);
    }
}

