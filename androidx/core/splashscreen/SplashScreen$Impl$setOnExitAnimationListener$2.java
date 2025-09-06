package androidx.core.splashscreen;

import android.view.View.OnLayoutChangeListener;
import android.view.View;
import androidx.activity.m;
import i3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001JW\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"androidx/core/splashscreen/SplashScreen$Impl$setOnExitAnimationListener$2", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplashScreen.Impl.setOnExitAnimationListener.2 implements View.OnLayoutChangeListener {
    public final e a;
    public final SplashScreenViewProvider b;

    public SplashScreen.Impl.setOnExitAnimationListener.2(e e0, SplashScreenViewProvider splashScreenViewProvider0) {
        this.a = e0;
        this.b = splashScreenViewProvider0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public void onLayoutChange(@NotNull View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        Intrinsics.checkNotNullParameter(view0, "view");
        if(!view0.isAttachedToWindow()) {
            return;
        }
        view0.removeOnLayoutChangeListener(this);
        e e0 = this.a;
        boolean z = e0.f.shouldKeepOnScreen();
        SplashScreenViewProvider splashScreenViewProvider0 = this.b;
        if(z) {
            e0.h = splashScreenViewProvider0;
        }
        else {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider0, "splashScreenViewProvider");
            OnExitAnimationListener splashScreen$OnExitAnimationListener0 = e0.g;
            if(splashScreen$OnExitAnimationListener0 != null) {
                e0.g = null;
                splashScreenViewProvider0.getView().postOnAnimation(new m(24, splashScreenViewProvider0, splashScreen$OnExitAnimationListener0));
            }
        }
    }
}

