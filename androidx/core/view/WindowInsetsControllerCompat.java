package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class WindowInsetsControllerCompat {
    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(@NonNull WindowInsetsControllerCompat arg1, int arg2);
    }

    public static final int BEHAVIOR_DEFAULT = 1;
    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;
    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    public final g2 a;

    public WindowInsetsControllerCompat(@NonNull Window window0, @NonNull View view0) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0 = new SoftwareKeyboardControllerCompat(view0);
        if(Build.VERSION.SDK_INT >= 30) {
            f2 f20 = new f2(m1.h(window0), this, softwareKeyboardControllerCompat0);
            f20.e = window0;
            this.a = f20;
            return;
        }
        this.a = new b2(window0, softwareKeyboardControllerCompat0);  // 初始化器: Landroidx/core/view/a2;-><init>(Landroid/view/Window;Landroidx/core/view/SoftwareKeyboardControllerCompat;)V
    }

    public WindowInsetsControllerCompat(WindowInsetsController windowInsetsController0) {
        this.a = new f2(windowInsetsController0, this, new SoftwareKeyboardControllerCompat(windowInsetsController0));
    }

    public void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        this.a.a(windowInsetsControllerCompat$OnControllableInsetsChangedListener0);
    }

    public void controlWindowInsetsAnimation(int v, long v1, @Nullable Interpolator interpolator0, @Nullable CancellationSignal cancellationSignal0, @NonNull WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0) {
        this.a.b(v, v1, interpolator0, cancellationSignal0, windowInsetsAnimationControlListenerCompat0);
    }

    @SuppressLint({"WrongConstant"})
    public int getSystemBarsBehavior() {
        return this.a.c();
    }

    public void hide(int v) {
        this.a.d(v);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.a.e();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.a.f();
    }

    public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        this.a.g(windowInsetsControllerCompat$OnControllableInsetsChangedListener0);
    }

    public void setAppearanceLightNavigationBars(boolean z) {
        this.a.h(z);
    }

    public void setAppearanceLightStatusBars(boolean z) {
        this.a.i(z);
    }

    public void setSystemBarsBehavior(int v) {
        this.a.j(v);
    }

    public void show(int v) {
        this.a.k(v);
    }

    @NonNull
    @RequiresApi(30)
    @Deprecated
    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController0) {
        return new WindowInsetsControllerCompat(windowInsetsController0);
    }
}

