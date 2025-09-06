package androidx.appcompat.app;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.ContentFrameLayout;

public final class g0 extends ContentFrameLayout {
    public final i0 i;

    public g0(i0 i00, ContextThemeWrapper contextThemeWrapper0) {
        this.i = i00;
        super(contextThemeWrapper0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.i.m(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            int v = (int)motionEvent0.getX();
            int v1 = (int)motionEvent0.getY();
            if(v < -5 || v1 < -5 || v > this.getWidth() + 5 || v1 > this.getHeight() + 5) {
                AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.i.s(0);
                this.i.k(appCompatDelegateImpl$PanelFeatureState0, true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public final void setBackgroundResource(int v) {
        this.setBackgroundDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }
}

