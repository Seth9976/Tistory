package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class e {
    public static final e a;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final boolean a(@NotNull Canvas canvas0, @NotNull Path path0) {
        return canvas0.clipOutPath(path0);
    }

    @DoNotInline
    public final boolean b(@NotNull Canvas canvas0, float f, float f1, float f2, float f3) {
        return canvas0.clipOutRect(f, f1, f2, f3);
    }

    @DoNotInline
    public final boolean c(@NotNull Canvas canvas0, int v, int v1, int v2, int v3) {
        return canvas0.clipOutRect(v, v1, v2, v3);
    }

    @DoNotInline
    public final boolean d(@NotNull Canvas canvas0, @NotNull Rect rect0) {
        return canvas0.clipOutRect(rect0);
    }

    @DoNotInline
    public final boolean e(@NotNull Canvas canvas0, @NotNull RectF rectF0) {
        return canvas0.clipOutRect(rectF0);
    }
}

