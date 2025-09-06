package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class h {
    public static final h a;

    static {
        h.a = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull Canvas canvas0, @NotNull int[] arr_v, int v, @NotNull float[] arr_f, int v1, int v2, @NotNull Font font0, @NotNull Paint paint0) {
        canvas0.drawGlyphs(arr_v, v, arr_f, v1, v2, font0, paint0);
    }

    @DoNotInline
    public final void b(@NotNull Canvas canvas0, @NotNull NinePatch ninePatch0, @NotNull Rect rect0, @Nullable Paint paint0) {
        canvas0.drawPatch(ninePatch0, rect0, paint0);
    }

    @DoNotInline
    public final void c(@NotNull Canvas canvas0, @NotNull NinePatch ninePatch0, @NotNull RectF rectF0, @Nullable Paint paint0) {
        canvas0.drawPatch(ninePatch0, rectF0, paint0);
    }
}

