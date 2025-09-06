package androidx.fragment.app;

import androidx.activity.OnBackPressedCallback;

public final class q0 extends OnBackPressedCallback {
    public final FragmentManager a;

    public q0(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
        super(false);
    }

    @Override  // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        FragmentManager fragmentManager0 = this.a;
        fragmentManager0.w(true);
        if(fragmentManager0.h.isEnabled()) {
            fragmentManager0.popBackStackImmediate();
            return;
        }
        fragmentManager0.g.onBackPressed();
    }
}

