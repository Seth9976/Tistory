package androidx.fragment.app;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class i1 implements View.OnAttachStateChangeListener {
    public final View a;

    public i1(View view0) {
        this.a = view0;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.a.removeOnAttachStateChangeListener(this);
        ViewCompat.requestApplyInsets(this.a);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

