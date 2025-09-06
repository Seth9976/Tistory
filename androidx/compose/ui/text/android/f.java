package androidx.compose.ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;
import p1.d;
import s1.c;

public final class f {
    public static final f a;

    static {
        f.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull Canvas canvas0) {
        d.p(canvas0);
    }

    @DoNotInline
    public final void b(@NotNull Canvas canvas0, int v, @NotNull BlendMode blendMode0) {
        canvas0.drawColor(v, blendMode0);
    }

    @DoNotInline
    public final void c(@NotNull Canvas canvas0, long v) {
        canvas0.drawColor(v);
    }

    @DoNotInline
    public final void d(@NotNull Canvas canvas0, long v, @NotNull BlendMode blendMode0) {
        canvas0.drawColor(v, blendMode0);
    }

    @DoNotInline
    public final void e(@NotNull Canvas canvas0, @NotNull RectF rectF0, float f, float f1, @NotNull RectF rectF1, float f2, float f3, @NotNull Paint paint0) {
        canvas0.drawDoubleRoundRect(rectF0, f, f1, rectF1, f2, f3, paint0);
    }

    @DoNotInline
    public final void f(@NotNull Canvas canvas0, @NotNull RectF rectF0, @NotNull float[] arr_f, @NotNull RectF rectF1, @NotNull float[] arr_f1, @NotNull Paint paint0) {
        canvas0.drawDoubleRoundRect(rectF0, arr_f, rectF1, arr_f1, paint0);
    }

    @DoNotInline
    public final void g(@NotNull Canvas canvas0, @NotNull RenderNode renderNode0) {
        c.i(canvas0, renderNode0);
    }

    @DoNotInline
    public final void h(@NotNull Canvas canvas0, @NotNull MeasuredText measuredText0, int v, int v1, int v2, int v3, float f, float f1, boolean z, @NotNull Paint paint0) {
        canvas0.drawTextRun(measuredText0, v, v1, v2, v3, f, f1, z, paint0);
    }

    @DoNotInline
    public final void i(@NotNull Canvas canvas0) {
        d.h(canvas0);
    }
}

