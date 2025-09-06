package androidx.compose.ui.platform;

import android.view.View;
import androidx.activity.s;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

public final class c0 {
    public static final c0 a;

    static {
        c0.a = new c0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(29)
    public final void a(@NotNull View view0) {
        s.h(view0);
    }
}

