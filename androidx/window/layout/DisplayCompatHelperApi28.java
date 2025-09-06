package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(28)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/window/layout/DisplayCompatHelperApi28;", "", "Landroid/view/DisplayCutout;", "displayCutout", "", "safeInsetLeft", "(Landroid/view/DisplayCutout;)I", "safeInsetTop", "safeInsetRight", "safeInsetBottom", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class DisplayCompatHelperApi28 {
    @NotNull
    public static final DisplayCompatHelperApi28 INSTANCE;

    static {
        DisplayCompatHelperApi28.INSTANCE = new DisplayCompatHelperApi28();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final int safeInsetBottom(@NotNull DisplayCutout displayCutout0) {
        Intrinsics.checkNotNullParameter(displayCutout0, "displayCutout");
        return displayCutout0.getSafeInsetBottom();
    }

    public final int safeInsetLeft(@NotNull DisplayCutout displayCutout0) {
        Intrinsics.checkNotNullParameter(displayCutout0, "displayCutout");
        return displayCutout0.getSafeInsetLeft();
    }

    public final int safeInsetRight(@NotNull DisplayCutout displayCutout0) {
        Intrinsics.checkNotNullParameter(displayCutout0, "displayCutout");
        return displayCutout0.getSafeInsetRight();
    }

    public final int safeInsetTop(@NotNull DisplayCutout displayCutout0) {
        Intrinsics.checkNotNullParameter(displayCutout0, "displayCutout");
        return displayCutout0.getSafeInsetTop();
    }
}

