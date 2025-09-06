package s1;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class l {
    public static final l a;

    static {
        l.a = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final Canvas a(@NotNull Surface surface0) {
        return surface0.lockHardwareCanvas();
    }
}

