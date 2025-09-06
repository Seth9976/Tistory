package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class o implements EdgeToEdgeImpl {
    @Override  // androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window0) {
        Intrinsics.checkNotNullParameter(window0, "window");
    }

    @Override  // androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(@NotNull SystemBarStyle systemBarStyle0, @NotNull SystemBarStyle systemBarStyle1, @NotNull Window window0, @NotNull View view0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(systemBarStyle0, "statusBarStyle");
        Intrinsics.checkNotNullParameter(systemBarStyle1, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window0, "window");
        Intrinsics.checkNotNullParameter(view0, "view");
        WindowCompat.setDecorFitsSystemWindows(window0, false);
        window0.setStatusBarColor(systemBarStyle0.getScrim$activity_release(z));
        window0.setNavigationBarColor(systemBarStyle1.getScrim$activity_release(z1));
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = new WindowInsetsControllerCompat(window0, view0);
        windowInsetsControllerCompat0.setAppearanceLightStatusBars(!z);
        windowInsetsControllerCompat0.setAppearanceLightNavigationBars(!z1);
    }
}

