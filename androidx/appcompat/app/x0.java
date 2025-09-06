package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

public final class x0 extends ViewPropertyAnimatorListenerAdapter {
    public final int a;
    public final WindowDecorActionBar b;

    public x0(WindowDecorActionBar windowDecorActionBar0, int v) {
        this.a = v;
        this.b = windowDecorActionBar0;
        super();
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
    public final void onAnimationEnd(View view0) {
        if(this.a != 0) {
            this.b.z = null;
            this.b.e.requestLayout();
            return;
        }
        WindowDecorActionBar windowDecorActionBar0 = this.b;
        if(windowDecorActionBar0.u) {
            View view1 = windowDecorActionBar0.h;
            if(view1 != null) {
                view1.setTranslationY(0.0f);
                windowDecorActionBar0.e.setTranslationY(0.0f);
            }
        }
        windowDecorActionBar0.e.setVisibility(8);
        windowDecorActionBar0.e.setTransitioning(false);
        windowDecorActionBar0.z = null;
        Callback actionMode$Callback0 = windowDecorActionBar0.p;
        if(actionMode$Callback0 != null) {
            actionMode$Callback0.onDestroyActionMode(windowDecorActionBar0.o);
            windowDecorActionBar0.o = null;
            windowDecorActionBar0.p = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout0 = windowDecorActionBar0.d;
        if(actionBarOverlayLayout0 != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout0);
        }
    }
}

