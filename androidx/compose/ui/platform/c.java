package androidx.compose.ui.platform;

import android.view.ViewTreeObserver.OnScrollChangedListener;

public final class c implements ViewTreeObserver.OnScrollChangedListener {
    public final AndroidComposeView a;

    public c(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.a.p();
    }
}

