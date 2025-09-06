package com.google.android.material.snackbar;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.material.internal.WindowUtils;

public final class h implements Runnable {
    public final BaseTransientBottomBar a;

    public h(BaseTransientBottomBar baseTransientBottomBar0) {
        this.a = baseTransientBottomBar0;
    }

    @Override
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar0 = this.a;
        if(baseTransientBottomBar0.view != null) {
            Context context0 = baseTransientBottomBar0.h;
            if(context0 != null) {
                int v = WindowUtils.getCurrentWindowBounds(context0).height();
                int[] arr_v = new int[2];
                baseTransientBottomBar0.view.getLocationInWindow(arr_v);
                int v1 = arr_v[1];
                int v2 = v - (baseTransientBottomBar0.view.getHeight() + v1) + ((int)baseTransientBottomBar0.view.getTranslationY());
                int v3 = baseTransientBottomBar0.s;
                if(v2 >= v3) {
                    baseTransientBottomBar0.t = v3;
                    return;
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = baseTransientBottomBar0.view.getLayoutParams();
                if(!(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.E, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                baseTransientBottomBar0.t = baseTransientBottomBar0.s;
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin = baseTransientBottomBar0.s - v2 + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin;
                baseTransientBottomBar0.view.requestLayout();
            }
        }
    }
}

