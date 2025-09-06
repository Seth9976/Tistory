package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

public final class g0 {
    public static final g0 a;

    static {
        g0.a = new g0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(26)
    public final void a(@NotNull View view0, int v, boolean z) {
        view0.setFocusable(v);
        view0.setDefaultFocusHighlightEnabled(z);
    }
}

