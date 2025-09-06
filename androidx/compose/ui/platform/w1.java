package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.graphics.RenderEffect;
import i3.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class w1 {
    public static final w1 a;

    static {
        w1.a = new w1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull View view0, @Nullable RenderEffect renderEffect0) {
        a.n(view0, (renderEffect0 == null ? null : renderEffect0.asAndroidRenderEffect()));
    }
}

