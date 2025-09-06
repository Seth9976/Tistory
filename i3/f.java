package i3;

import a7.b;
import android.app.Activity;
import android.content.res.Resources.Theme;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import androidx.core.splashscreen.ThemeUtils.Api31;
import java.time.Duration;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

public final class f extends b {
    public SplashScreenView d;

    @Override  // a7.b
    public final void c() {
    }

    @Override  // a7.b
    public final long e() {
        Duration duration0 = this.o().getIconAnimationDuration();
        return duration0 == null ? 0L : duration0.toMillis();
    }

    @Override  // a7.b
    public final long f() {
        Instant instant0 = this.o().getIconAnimationStart();
        return instant0 == null ? 0L : instant0.toEpochMilli();
    }

    @Override  // a7.b
    public final View g() {
        View view0 = this.o().getIconView();
        Intrinsics.checkNotNull(view0);
        return view0;
    }

    @Override  // a7.b
    public final ViewGroup h() {
        return this.o();
    }

    @Override  // a7.b
    public final void l() {
        this.o().remove();
        Activity activity0 = (Activity)this.b;
        Resources.Theme resources$Theme0 = activity0.getTheme();
        Intrinsics.checkNotNullExpressionValue(resources$Theme0, "activity.theme");
        View view0 = activity0.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "activity.window.decorView");
        Api31.applyThemesSystemBarAppearance$default(resources$Theme0, view0, null, 4, null);
    }

    public final SplashScreenView o() {
        SplashScreenView splashScreenView0 = this.d;
        if(splashScreenView0 != null) {
            return splashScreenView0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("platformView");
        return null;
    }
}

