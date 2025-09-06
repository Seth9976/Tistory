package androidx.databinding;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;

public final class j implements View.OnAttachStateChangeListener {
    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        ViewDataBinding.getBinding(view0).mRebindRunnable.run();
        view0.removeOnAttachStateChangeListener(this);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

