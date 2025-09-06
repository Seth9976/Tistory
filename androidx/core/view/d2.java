package androidx.core.view;

import android.view.WindowInsetsController.OnControllableInsetsChangedListener;
import android.view.WindowInsetsController;

public final class d2 implements WindowInsetsController.OnControllableInsetsChangedListener {
    public final f2 a;
    public final OnControllableInsetsChangedListener b;

    public d2(f2 f20, OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        this.a = f20;
        this.b = windowInsetsControllerCompat$OnControllableInsetsChangedListener0;
    }

    @Override  // android.view.WindowInsetsController$OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController0, int v) {
        f2 f20 = this.a;
        OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0 = this.b;
        if(f20.b == windowInsetsController0) {
            windowInsetsControllerCompat$OnControllableInsetsChangedListener0.onControllableInsetsChanged(f20.a, v);
        }
    }
}

