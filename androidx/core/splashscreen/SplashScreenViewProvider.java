package androidx.core.splashscreen;

import a7.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.window.SplashScreenView;
import androidx.annotation.RequiresApi;
import i3.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0011\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u000BR\u0011\u0010\u000F\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0011\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u000ER\u0011\u0010\u0015\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0014¨\u0006\u001A"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider;", "", "Landroid/app/Activity;", "ctx", "<init>", "(Landroid/app/Activity;)V", "Landroid/window/SplashScreenView;", "platformView", "(Landroid/window/SplashScreenView;Landroid/app/Activity;)V", "", "remove", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "getIconView", "iconView", "", "getIconAnimationStartMillis", "()J", "iconAnimationStartMillis", "getIconAnimationDurationMillis", "iconAnimationDurationMillis", "a7/b", "i3/f", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplashScreenViewProvider {
    public final b a;

    public SplashScreenViewProvider(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "ctx");
        b b0;
        super();
        if(Build.VERSION.SDK_INT >= 0x1F) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            b0 = new f(activity0);  // 初始化器: La7/b;-><init>(Landroid/app/Activity;)V
        }
        else {
            b0 = new b(activity0);
        }
        b0.c();
        this.a = b0;
    }

    @RequiresApi(0x1F)
    public SplashScreenViewProvider(@NotNull SplashScreenView splashScreenView0, @NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(splashScreenView0, "platformView");
        Intrinsics.checkNotNullParameter(activity0, "ctx");
        this(activity0);
        ((f)this.a).getClass();
        Intrinsics.checkNotNullParameter(splashScreenView0, "<set-?>");
        ((f)this.a).d = splashScreenView0;
    }

    public final long getIconAnimationDurationMillis() {
        return this.a.e();
    }

    public final long getIconAnimationStartMillis() {
        return this.a.f();
    }

    @NotNull
    public final View getIconView() {
        return this.a.g();
    }

    @NotNull
    public final View getView() {
        return this.a.h();
    }

    public final void remove() {
        this.a.l();
    }
}

