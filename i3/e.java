package i3;

import android.app.Activity;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.text.n0;
import androidx.core.splashscreen.MaskedDrawable;
import androidx.core.splashscreen.R.attr;
import androidx.core.splashscreen.R.dimen;
import androidx.core.splashscreen.R.drawable;
import androidx.core.splashscreen.R.id;
import androidx.core.splashscreen.SplashScreen.Impl.setKeepOnScreenCondition.1;
import androidx.core.splashscreen.SplashScreen.Impl.setOnExitAnimationListener.2;
import androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition;
import androidx.core.splashscreen.SplashScreen.OnExitAnimationListener;
import androidx.core.splashscreen.SplashScreenViewProvider;
import kotlin.jvm.internal.Intrinsics;

public class e {
    public final Activity a;
    public Integer b;
    public Integer c;
    public Drawable d;
    public boolean e;
    public KeepOnScreenCondition f;
    public OnExitAnimationListener g;
    public SplashScreenViewProvider h;

    public e(Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super();
        this.a = activity0;
        this.f = new n0(19);
    }

    public void a() {
        TypedValue typedValue0 = new TypedValue();
        Resources.Theme resources$Theme0 = this.a.getTheme();
        boolean z = true;
        if(resources$Theme0.resolveAttribute(attr.windowSplashScreenBackground, typedValue0, true)) {
            this.b = typedValue0.resourceId;
            this.c = typedValue0.data;
        }
        if(resources$Theme0.resolveAttribute(attr.windowSplashScreenAnimatedIcon, typedValue0, true)) {
            this.d = resources$Theme0.getDrawable(typedValue0.resourceId);
        }
        if(resources$Theme0.resolveAttribute(attr.splashScreenIconSize, typedValue0, true)) {
            if(typedValue0.resourceId != dimen.splashscreen_icon_size_with_background) {
                z = false;
            }
            this.e = z;
        }
        Intrinsics.checkNotNullExpressionValue(resources$Theme0, "currentTheme");
        this.d(resources$Theme0, typedValue0);
    }

    public void b(KeepOnScreenCondition splashScreen$KeepOnScreenCondition0) {
        Intrinsics.checkNotNullParameter(splashScreen$KeepOnScreenCondition0, "keepOnScreenCondition");
        this.f = splashScreen$KeepOnScreenCondition0;
        View view0 = this.a.findViewById(0x1020002);
        view0.getViewTreeObserver().addOnPreDrawListener(new SplashScreen.Impl.setKeepOnScreenCondition.1(this, view0));
    }

    public void c(OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
        float f;
        Intrinsics.checkNotNullParameter(splashScreen$OnExitAnimationListener0, "exitAnimationListener");
        this.g = splashScreen$OnExitAnimationListener0;
        Activity activity0 = this.a;
        SplashScreenViewProvider splashScreenViewProvider0 = new SplashScreenViewProvider(activity0);
        Integer integer0 = this.b;
        Integer integer1 = this.c;
        View view0 = splashScreenViewProvider0.getView();
        if(integer0 != null && ((int)integer0) != 0) {
            view0.setBackgroundResource(((int)integer0));
        }
        else if(integer1 == null) {
            view0.setBackground(activity0.getWindow().getDecorView().getBackground());
        }
        else {
            view0.setBackgroundColor(((int)integer1));
        }
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            ImageView imageView0 = (ImageView)view0.findViewById(id.splashscreen_icon_view);
            if(this.e) {
                Drawable drawable1 = imageView0.getContext().getDrawable(drawable.icon_background);
                f = imageView0.getResources().getDimension(dimen.splashscreen_icon_size_with_background) * 0.666667f;
                if(drawable1 != null) {
                    imageView0.setBackground(new MaskedDrawable(drawable1, f));
                }
            }
            else {
                f = imageView0.getResources().getDimension(dimen.splashscreen_icon_size_no_background) * 0.666667f;
            }
            imageView0.setImageDrawable(new MaskedDrawable(drawable0, f));
        }
        view0.addOnLayoutChangeListener(new SplashScreen.Impl.setOnExitAnimationListener.2(this, splashScreenViewProvider0));
    }

    public final void d(Resources.Theme resources$Theme0, TypedValue typedValue0) {
        Intrinsics.checkNotNullParameter(resources$Theme0, "currentTheme");
        Intrinsics.checkNotNullParameter(typedValue0, "typedValue");
        if(resources$Theme0.resolveAttribute(attr.postSplashScreenTheme, typedValue0, true)) {
            int v = typedValue0.resourceId;
            if(v != 0) {
                this.a.setTheme(v);
            }
        }
    }
}

