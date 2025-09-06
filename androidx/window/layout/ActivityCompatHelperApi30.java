package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(30)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/window/layout/ActivityCompatHelperApi30;", "", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "maximumWindowBounds", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ActivityCompatHelperApi30 {
    @NotNull
    public static final ActivityCompatHelperApi30 INSTANCE;

    static {
        ActivityCompatHelperApi30.INSTANCE = new ActivityCompatHelperApi30();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final Rect currentWindowBounds(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Rect rect0 = activity0.getWindowManager().getCurrentWindowMetrics().getBounds();
        Intrinsics.checkNotNullExpressionValue(rect0, "activity.windowManager.currentWindowMetrics.bounds");
        return rect0;
    }

    @NotNull
    public final Rect maximumWindowBounds(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Rect rect0 = activity0.getWindowManager().getMaximumWindowMetrics().getBounds();
        Intrinsics.checkNotNullExpressionValue(rect0, "activity.windowManager.maximumWindowMetrics.bounds");
        return rect0;
    }
}

