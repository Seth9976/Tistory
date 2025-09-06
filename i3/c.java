package i3;

import android.app.Activity;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.Window;
import android.window.SplashScreen.OnExitAnimationListener;
import android.window.SplashScreenView;
import androidx.core.splashscreen.SplashScreen.OnExitAnimationListener;
import androidx.core.splashscreen.SplashScreenViewProvider;
import androidx.core.splashscreen.ThemeUtils.Api31;
import androidx.webkit.internal.k;
import kotlin.jvm.internal.Intrinsics;

public final class c implements SplashScreen.OnExitAnimationListener {
    public final d a;
    public final OnExitAnimationListener b;

    public c(d d0, OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
        this.a = d0;
        this.b = splashScreen$OnExitAnimationListener0;
    }

    @Override  // android.window.SplashScreen$OnExitAnimationListener
    public final void onSplashScreenExit(SplashScreenView splashScreenView0) {
        d d0 = this.a;
        OnExitAnimationListener splashScreen$OnExitAnimationListener0 = this.b;
        Intrinsics.checkNotNullParameter(d0, "this$0");
        Intrinsics.checkNotNullParameter(splashScreen$OnExitAnimationListener0, "$exitAnimationListener");
        Intrinsics.checkNotNullParameter(splashScreenView0, "splashScreenView");
        d0.getClass();
        TypedValue typedValue0 = new TypedValue();
        Activity activity0 = d0.a;
        Resources.Theme resources$Theme0 = activity0.getTheme();
        Window window0 = activity0.getWindow();
        boolean z = true;
        if(resources$Theme0.resolveAttribute(0x1010451, typedValue0, true)) {
            window0.setStatusBarColor(typedValue0.data);
        }
        if(resources$Theme0.resolveAttribute(0x1010452, typedValue0, true)) {
            window0.setNavigationBarColor(typedValue0.data);
        }
        if(resources$Theme0.resolveAttribute(0x1010450, typedValue0, true)) {
            if(typedValue0.data == 0) {
                window0.clearFlags(0x80000000);
            }
            else {
                window0.addFlags(0x80000000);
            }
        }
        if(resources$Theme0.resolveAttribute(0x1010605, typedValue0, true)) {
            window0.setNavigationBarContrastEnforced(typedValue0.data != 0);
        }
        if(resources$Theme0.resolveAttribute(0x1010604, typedValue0, true)) {
            if(typedValue0.data == 0) {
                z = false;
            }
            k.v(window0, z);
        }
        ViewGroup viewGroup0 = (ViewGroup)window0.getDecorView();
        Intrinsics.checkNotNullExpressionValue(resources$Theme0, "theme");
        Api31.applyThemesSystemBarAppearance(resources$Theme0, viewGroup0, typedValue0);
        viewGroup0.setOnHierarchyChangeListener(null);
        window0.setDecorFitsSystemWindows(d0.j);
        splashScreen$OnExitAnimationListener0.onSplashScreenExit(new SplashScreenViewProvider(splashScreenView0, activity0));
    }
}

