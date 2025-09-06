package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener;

public final class l implements OnDismissListener {
    public final BaseTransientBottomBar a;

    public l(BaseTransientBottomBar baseTransientBottomBar0) {
        this.a = baseTransientBottomBar0;
    }

    @Override  // com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener
    public final void onDismiss(View view0) {
        if(view0.getParent() != null) {
            view0.setVisibility(8);
        }
        this.a.dispatchDismiss(0);
    }

    @Override  // com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener
    public final void onDragStateChanged(int v) {
        BaseTransientBottomBar baseTransientBottomBar0 = this.a;
        switch(v) {
            case 0: {
                s.b().e(baseTransientBottomBar0.y);
                return;
            }
            case 1: 
            case 2: {
                s.b().d(baseTransientBottomBar0.y);
            }
        }
    }
}

