package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(17)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/layout/DisplayCompatHelperApi17;", "", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "point", "", "getRealSize", "(Landroid/view/Display;Landroid/graphics/Point;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class DisplayCompatHelperApi17 {
    @NotNull
    public static final DisplayCompatHelperApi17 INSTANCE;

    static {
        DisplayCompatHelperApi17.INSTANCE = new DisplayCompatHelperApi17();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void getRealSize(@NotNull Display display0, @NotNull Point point0) {
        Intrinsics.checkNotNullParameter(display0, "display");
        Intrinsics.checkNotNullParameter(point0, "point");
        display0.getRealSize(point0);
    }
}

