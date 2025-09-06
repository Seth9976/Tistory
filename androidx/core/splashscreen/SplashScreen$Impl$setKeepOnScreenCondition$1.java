package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.activity.m;
import i3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/core/splashscreen/SplashScreen$Impl$setKeepOnScreenCondition$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplashScreen.Impl.setKeepOnScreenCondition.1 implements ViewTreeObserver.OnPreDrawListener {
    public final e a;
    public final View b;

    public SplashScreen.Impl.setKeepOnScreenCondition.1(e e0, View view0) {
        this.a = e0;
        this.b = view0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public boolean onPreDraw() {
        e e0 = this.a;
        if(e0.f.shouldKeepOnScreen()) {
            return false;
        }
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        SplashScreenViewProvider splashScreenViewProvider0 = e0.h;
        if(splashScreenViewProvider0 != null) {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider0, "splashScreenViewProvider");
            OnExitAnimationListener splashScreen$OnExitAnimationListener0 = e0.g;
            if(splashScreen$OnExitAnimationListener0 != null) {
                e0.g = null;
                splashScreenViewProvider0.getView().postOnAnimation(new m(24, splashScreenViewProvider0, splashScreen$OnExitAnimationListener0));
            }
        }
        return true;
    }
}

