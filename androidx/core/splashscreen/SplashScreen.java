package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import androidx.annotation.MainThread;
import i3.d;
import i3.e;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"CustomSplashScreen"})
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000B2\u00020\u0001:\u0005\u000B\f\r\u000E\u000FJ\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/core/splashscreen/SplashScreen;", "", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "condition", "", "setKeepOnScreenCondition", "(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "listener", "setOnExitAnimationListener", "(Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V", "Companion", "i3/e", "i3/d", "KeepOnScreenCondition", "OnExitAnimationListener", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplashScreen {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001A\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Companion;", "", "Landroid/app/Activity;", "Landroidx/core/splashscreen/SplashScreen;", "installSplashScreen", "(Landroid/app/Activity;)Landroidx/core/splashscreen/SplashScreen;", "", "MASK_FACTOR", "F", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final SplashScreen installSplashScreen(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "<this>");
            SplashScreen splashScreen0 = new SplashScreen(activity0, null);
            SplashScreen.access$install(splashScreen0);
            return splashScreen0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\'¨\u0006\u0004"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "", "shouldKeepOnScreen", "", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public interface KeepOnScreenCondition {
        @MainThread
        boolean shouldKeepOnScreen();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\'¨\u0006\u0006"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "", "onSplashScreenExit", "", "splashScreenViewProvider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public interface OnExitAnimationListener {
        @MainThread
        void onSplashScreenExit(@NotNull SplashScreenViewProvider arg1);
    }

    @NotNull
    public static final Companion Companion;
    public final e a;

    static {
        SplashScreen.Companion = new Companion(null);
    }

    public SplashScreen(Activity activity0, DefaultConstructorMarker defaultConstructorMarker0) {
        e e0 = Build.VERSION.SDK_INT >= 0x1F ? new d(activity0) : new e(activity0);
        this.a = e0;
    }

    public static final void access$install(SplashScreen splashScreen0) {
        splashScreen0.a.a();
    }

    @JvmStatic
    @NotNull
    public static final SplashScreen installSplashScreen(@NotNull Activity activity0) {
        return SplashScreen.Companion.installSplashScreen(activity0);
    }

    public final void setKeepOnScreenCondition(@NotNull KeepOnScreenCondition splashScreen$KeepOnScreenCondition0) {
        Intrinsics.checkNotNullParameter(splashScreen$KeepOnScreenCondition0, "condition");
        this.a.b(splashScreen$KeepOnScreenCondition0);
    }

    public final void setOnExitAnimationListener(@NotNull OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
        Intrinsics.checkNotNullParameter(splashScreen$OnExitAnimationListener0, "listener");
        this.a.c(splashScreen$OnExitAnimationListener0);
    }
}

