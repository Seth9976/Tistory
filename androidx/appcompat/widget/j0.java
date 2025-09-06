package androidx.appcompat.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;

public final class j0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final AppCompatSpinner a;

    public j0(AppCompatSpinner appCompatSpinner0) {
        this.a = appCompatSpinner0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AppCompatSpinner appCompatSpinner0 = this.a;
        if(!appCompatSpinner0.getInternalPopup().isShowing()) {
            int v = l0.b(appCompatSpinner0);
            int v1 = l0.a(appCompatSpinner0);
            appCompatSpinner0.f.show(v, v1);
        }
        ViewTreeObserver viewTreeObserver0 = appCompatSpinner0.getViewTreeObserver();
        if(viewTreeObserver0 != null) {
            k0.a(viewTreeObserver0, this);
        }
    }
}

