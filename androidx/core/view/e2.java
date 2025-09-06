package androidx.core.view;

import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;

public final class e2 implements WindowInsetsAnimationControlListener {
    public WindowInsetsAnimationControllerCompat a;
    public final WindowInsetsAnimationControlListenerCompat b;

    public e2(WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0) {
        this.b = windowInsetsAnimationControlListenerCompat0;
        this.a = null;
    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController0) {
        this.b.onCancelled((windowInsetsAnimationController0 == null ? null : this.a));
    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController0) {
        this.b.onFinished(this.a);
    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController0, int v) {
        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat0 = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController0);
        this.a = windowInsetsAnimationControllerCompat0;
        this.b.onReady(windowInsetsAnimationControllerCompat0, v);
    }
}

