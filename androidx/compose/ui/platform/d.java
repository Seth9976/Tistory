package androidx.compose.ui.platform;

import android.view.ViewTreeObserver.OnTouchModeChangeListener;

public final class d implements ViewTreeObserver.OnTouchModeChangeListener {
    public final AndroidComposeView a;

    public d(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
    }

    // 去混淆评级： 低(30)
    @Override  // android.view.ViewTreeObserver$OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.a.m0.setInputMode-iuPiT84((z ? 1 : 2));
    }
}

