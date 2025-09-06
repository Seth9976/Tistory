package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s1.l;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/layer/SurfaceUtils;", "", "Landroid/view/Surface;", "surface", "Landroid/graphics/Canvas;", "lockCanvas", "(Landroid/view/Surface;)Landroid/graphics/Canvas;", "", "isLockHardwareCanvasAvailable", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SurfaceUtils {
    @NotNull
    public static final SurfaceUtils INSTANCE;

    static {
        SurfaceUtils.INSTANCE = new SurfaceUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean isLockHardwareCanvasAvailable() [...] // Inlined contents

    @RequiresApi(22)
    @NotNull
    public final Canvas lockCanvas(@NotNull Surface surface0) {
        return l.a.a(surface0);
    }
}

