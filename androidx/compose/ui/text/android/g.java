package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class g {
    public static final g a;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final boolean a(@NotNull Canvas canvas0, float f, float f1, float f2, float f3) {
        return canvas0.quickReject(f, f1, f2, f3);
    }

    @DoNotInline
    public final boolean b(@NotNull Canvas canvas0, @NotNull Path path0) {
        return canvas0.quickReject(path0);
    }

    @DoNotInline
    public final boolean c(@NotNull Canvas canvas0, @NotNull RectF rectF0) {
        return canvas0.quickReject(rectF0);
    }
}

