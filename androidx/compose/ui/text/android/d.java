package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class d {
    public static final d a;

    static {
        d.a = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull Canvas canvas0, @NotNull CharSequence charSequence0, int v, int v1, int v2, int v3, float f, float f1, boolean z, @NotNull Paint paint0) {
        canvas0.drawTextRun(charSequence0, v, v1, v2, v3, f, f1, z, paint0);
    }

    @DoNotInline
    public final void b(@NotNull Canvas canvas0, @NotNull char[] arr_c, int v, int v1, int v2, int v3, float f, float f1, boolean z, @NotNull Paint paint0) {
        canvas0.drawTextRun(arr_c, v, v1, v2, v3, f, f1, z, paint0);
    }
}

