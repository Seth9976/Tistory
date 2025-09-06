package androidx.browser.browseractions;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

public final class d extends Dialog {
    public final BrowserActionsFallbackMenuView a;

    public d(Context context0, BrowserActionsFallbackMenuView browserActionsFallbackMenuView0) {
        super(context0);
        this.a = browserActionsFallbackMenuView0;
    }

    public final void b(boolean z) {
        this.a.setScaleX((z ? 0.0f : 1.0f));
        this.a.setScaleY((z ? 0.0f : 1.0f));
        this.a.animate().scaleX((z ? 1.0f : 0.0f)).scaleY((z ? 1.0f : 0.0f)).setDuration((z ? 0xFAL : 150L)).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new c(this, z, 0)).start();
    }

    @Override  // android.app.Dialog
    public final void dismiss() {
        this.b(false);
    }

    @Override  // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.b(false);
            return true;
        }
        return false;
    }

    @Override  // android.app.Dialog
    public final void show() {
        this.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.b(true);
        super.show();
    }
}

