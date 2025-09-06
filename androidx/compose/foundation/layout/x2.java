package androidx.compose.foundation.layout;

import android.os.Build.VERSION;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat;
import androidx.core.view.WindowInsetsAnimationCompat.Callback;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

public final class x2 extends Callback implements View.OnAttachStateChangeListener, OnApplyWindowInsetsListener, Runnable {
    public final WindowInsetsHolder c;
    public boolean d;
    public boolean e;
    public WindowInsetsCompat f;

    public x2(WindowInsetsHolder windowInsetsHolder0) {
        super(!windowInsetsHolder0.getConsumes());
        this.c = windowInsetsHolder0;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        this.f = windowInsetsCompat0;
        WindowInsetsHolder windowInsetsHolder0 = this.c;
        windowInsetsHolder0.updateImeAnimationTarget(windowInsetsCompat0);
        if(this.d) {
            if(Build.VERSION.SDK_INT == 30) {
                view0.post(this);
                return windowInsetsHolder0.getConsumes() ? WindowInsetsCompat.CONSUMED : windowInsetsCompat0;
            }
        }
        else if(!this.e) {
            windowInsetsHolder0.updateImeAnimationSource(windowInsetsCompat0);
            WindowInsetsHolder.update$default(windowInsetsHolder0, windowInsetsCompat0, 0, 2, null);
        }
        return windowInsetsHolder0.getConsumes() ? WindowInsetsCompat.CONSUMED : windowInsetsCompat0;
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        this.d = false;
        this.e = false;
        WindowInsetsCompat windowInsetsCompat0 = this.f;
        if(Long.compare(windowInsetsAnimationCompat0.getDurationMillis(), 0L) != 0 && windowInsetsCompat0 != null) {
            this.c.updateImeAnimationSource(windowInsetsCompat0);
            this.c.updateImeAnimationTarget(windowInsetsCompat0);
            WindowInsetsHolder.update$default(this.c, windowInsetsCompat0, 0, 2, null);
        }
        this.f = null;
        super.onEnd(windowInsetsAnimationCompat0);
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        this.d = true;
        this.e = true;
        super.onPrepare(windowInsetsAnimationCompat0);
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat0, List list0) {
        WindowInsetsHolder.update$default(this.c, windowInsetsCompat0, 0, 2, null);
        return this.c.getConsumes() ? WindowInsetsCompat.CONSUMED : windowInsetsCompat0;
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat0, BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
        this.d = false;
        return super.onStart(windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        view0.requestApplyInsets();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }

    @Override
    public final void run() {
        if(this.d) {
            this.d = false;
            this.e = false;
            WindowInsetsCompat windowInsetsCompat0 = this.f;
            if(windowInsetsCompat0 != null) {
                this.c.updateImeAnimationSource(windowInsetsCompat0);
                WindowInsetsHolder.update$default(this.c, windowInsetsCompat0, 0, 2, null);
                this.f = null;
            }
        }
    }
}

