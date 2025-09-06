package androidx.core.view;

import android.view.KeyEvent;
import android.view.View.OnUnhandledKeyEventListener;
import android.view.View;

public final class k0 implements View.OnUnhandledKeyEventListener {
    public final OnUnhandledKeyEventListenerCompat a;

    public k0(OnUnhandledKeyEventListenerCompat viewCompat$OnUnhandledKeyEventListenerCompat0) {
        this.a = viewCompat$OnUnhandledKeyEventListenerCompat0;
    }

    @Override  // android.view.View$OnUnhandledKeyEventListener
    public final boolean onUnhandledKeyEvent(View view0, KeyEvent keyEvent0) {
        return this.a.onUnhandledKeyEvent(view0, keyEvent0);
    }
}

