package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils.RelativePadding;

public final class b implements OnApplyWindowInsetsListener {
    public final BottomAppBar a;

    public b(BottomAppBar bottomAppBar0) {
        this.a = bottomAppBar0;
    }

    @Override  // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0, RelativePadding viewUtils$RelativePadding0) {
        boolean z;
        BottomAppBar bottomAppBar0 = this.a;
        if(bottomAppBar0.p0) {
            bottomAppBar0.w0 = windowInsetsCompat0.getSystemWindowInsetBottom();
        }
        int v = 1;
        int v1 = 0;
        if(bottomAppBar0.q0) {
            z = bottomAppBar0.y0 != windowInsetsCompat0.getSystemWindowInsetLeft();
            bottomAppBar0.y0 = windowInsetsCompat0.getSystemWindowInsetLeft();
        }
        else {
            z = false;
        }
        if(bottomAppBar0.r0) {
            if(bottomAppBar0.x0 == windowInsetsCompat0.getSystemWindowInsetRight()) {
                v = 0;
            }
            bottomAppBar0.x0 = windowInsetsCompat0.getSystemWindowInsetRight();
            v1 = v;
        }
        if(z || v1 != 0) {
            AnimatorSet animatorSet0 = bottomAppBar0.g0;
            if(animatorSet0 != null) {
                animatorSet0.cancel();
            }
            AnimatorSet animatorSet1 = bottomAppBar0.f0;
            if(animatorSet1 != null) {
                animatorSet1.cancel();
            }
            bottomAppBar0.C();
            bottomAppBar0.B();
        }
        return windowInsetsCompat0;
    }
}

