package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class t extends q {
    @Override  // androidx.activity.o
    @DoNotInline
    public void setUp(@NotNull SystemBarStyle systemBarStyle0, @NotNull SystemBarStyle systemBarStyle1, @NotNull Window window0, @NotNull View view0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(systemBarStyle0, "statusBarStyle");
        Intrinsics.checkNotNullParameter(systemBarStyle1, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window0, "window");
        Intrinsics.checkNotNullParameter(view0, "view");
        boolean z2 = false;
        WindowCompat.setDecorFitsSystemWindows(window0, false);
        window0.setStatusBarColor(systemBarStyle0.getScrimWithEnforcedContrast$activity_release(z));
        window0.setNavigationBarColor(systemBarStyle1.getScrimWithEnforcedContrast$activity_release(z1));
        s.j(window0);
        if(systemBarStyle1.getNightMode$activity_release() == 0) {
            z2 = true;
        }
        window0.setNavigationBarContrastEnforced(z2);
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = new WindowInsetsControllerCompat(window0, view0);
        windowInsetsControllerCompat0.setAppearanceLightStatusBars(!z);
        windowInsetsControllerCompat0.setAppearanceLightNavigationBars(((boolean)(true ^ z1)));
    }
}

