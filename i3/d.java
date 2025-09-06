package i3;

import android.app.Activity;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.splashscreen.SplashScreen.Impl31.hierarchyListener.1;
import androidx.core.splashscreen.SplashScreen.Impl31.setKeepOnScreenCondition.1;
import androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition;
import androidx.core.splashscreen.SplashScreen.OnExitAnimationListener;
import kotlin.jvm.internal.Intrinsics;

public final class d extends e {
    public SplashScreen.Impl31.setKeepOnScreenCondition.1 i;
    public boolean j;
    public final SplashScreen.Impl31.hierarchyListener.1 k;

    public d(Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super(activity0);
        this.j = true;
        this.k = new SplashScreen.Impl31.hierarchyListener.1(this, activity0);
    }

    @Override  // i3.e
    public final void a() {
        Resources.Theme resources$Theme0 = this.a.getTheme();
        Intrinsics.checkNotNullExpressionValue(resources$Theme0, "activity.theme");
        this.d(resources$Theme0, new TypedValue());
        ((ViewGroup)this.a.getWindow().getDecorView()).setOnHierarchyChangeListener(this.k);
    }

    @Override  // i3.e
    public final void b(KeepOnScreenCondition splashScreen$KeepOnScreenCondition0) {
        Intrinsics.checkNotNullParameter(splashScreen$KeepOnScreenCondition0, "keepOnScreenCondition");
        Intrinsics.checkNotNullParameter(splashScreen$KeepOnScreenCondition0, "<set-?>");
        this.f = splashScreen$KeepOnScreenCondition0;
        View view0 = this.a.findViewById(0x1020002);
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        if(this.i != null && viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnPreDrawListener(this.i);
        }
        SplashScreen.Impl31.setKeepOnScreenCondition.1 splashScreen$Impl31$setKeepOnScreenCondition$10 = new SplashScreen.Impl31.setKeepOnScreenCondition.1(this, view0);
        this.i = splashScreen$Impl31$setKeepOnScreenCondition$10;
        viewTreeObserver0.addOnPreDrawListener(splashScreen$Impl31$setKeepOnScreenCondition$10);
    }

    @Override  // i3.e
    public final void c(OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
        Intrinsics.checkNotNullParameter(splashScreen$OnExitAnimationListener0, "exitAnimationListener");
        this.a.getSplashScreen().setOnExitAnimationListener(new c(this, splashScreen$OnExitAnimationListener0));
    }
}

