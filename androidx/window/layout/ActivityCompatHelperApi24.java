package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(24)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/ActivityCompatHelperApi24;", "", "Landroid/app/Activity;", "activity", "", "isInMultiWindowMode", "(Landroid/app/Activity;)Z", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ActivityCompatHelperApi24 {
    @NotNull
    public static final ActivityCompatHelperApi24 INSTANCE;

    static {
        ActivityCompatHelperApi24.INSTANCE = new ActivityCompatHelperApi24();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean isInMultiWindowMode(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        return activity0.isInMultiWindowMode();
    }
}

