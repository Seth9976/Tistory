package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import i3.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/core/splashscreen/SplashScreen$Impl31$setKeepOnScreenCondition$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplashScreen.Impl31.setKeepOnScreenCondition.1 implements ViewTreeObserver.OnPreDrawListener {
    public final d a;
    public final View b;

    public SplashScreen.Impl31.setKeepOnScreenCondition.1(d d0, View view0) {
        this.a = d0;
        this.b = view0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public boolean onPreDraw() {
        if(this.a.f.shouldKeepOnScreen()) {
            return false;
        }
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}

