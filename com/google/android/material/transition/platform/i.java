package com.google.android.material.transition.platform;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import java.lang.ref.WeakReference;

public final class i extends k {
    public final int a;
    public final Object b;

    public i(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.android.material.transition.platform.k
    public void onTransitionEnd(Transition transition0) {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                Drawable drawable0 = ((Window)object0).getDecorView().getBackground();
                if(drawable0 != null) {
                    drawable0.mutate().clearColorFilter();
                }
                return;
            }
            case 2: {
                WeakReference weakReference0 = MaterialContainerTransformSharedElementCallback.f;
                if(weakReference0 != null) {
                    View view0 = (View)weakReference0.get();
                    if(view0 != null) {
                        view0.setAlpha(1.0f);
                        MaterialContainerTransformSharedElementCallback.f = null;
                    }
                }
                ((Activity)object0).finish();
                ((Activity)object0).overridePendingTransition(0, 0);
            }
        }
    }

    @Override  // com.google.android.material.transition.platform.k
    public void onTransitionStart(Transition transition0) {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                Drawable drawable0 = ((Window)object0).getDecorView().getBackground();
                if(drawable0 != null) {
                    drawable0.mutate().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, BlendModeCompat.CLEAR));
                }
                return;
            }
            case 1: {
                Drawable drawable1 = ((Window)object0).getDecorView().getBackground();
                if(drawable1 != null) {
                    drawable1.mutate().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, BlendModeCompat.CLEAR));
                }
            }
        }
    }
}

