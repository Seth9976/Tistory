package com.google.android.material.motion;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.activity.BackEventCompat;

public final class b implements OnBackAnimationCallback {
    public final MaterialBackHandler a;
    public final c b;

    public b(c c0, MaterialBackHandler materialBackHandler0) {
        this.b = c0;
        this.a = materialBackHandler0;
    }

    @Override  // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        if(this.b.a != null) {
            this.a.cancelBackProgress();
        }
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.handleBackInvoked();
    }

    @Override  // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent0) {
        if(this.b.a != null) {
            BackEventCompat backEventCompat0 = new BackEventCompat(backEvent0);
            this.a.updateBackProgress(backEventCompat0);
        }
    }

    @Override  // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent0) {
        if(this.b.a != null) {
            BackEventCompat backEventCompat0 = new BackEventCompat(backEvent0);
            this.a.startBackProgress(backEventCompat0);
        }
    }
}

