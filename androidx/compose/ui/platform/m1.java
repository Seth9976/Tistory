package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class m1 {
    public static final m1 a;

    static {
        m1.a = new m1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final int a(@NotNull RenderNode renderNode0) {
        return renderNode0.getAmbientShadowColor();
    }

    @DoNotInline
    public final int b(@NotNull RenderNode renderNode0) {
        return renderNode0.getSpotShadowColor();
    }

    @DoNotInline
    public final void c(@NotNull RenderNode renderNode0, int v) {
        renderNode0.setAmbientShadowColor(v);
    }

    @DoNotInline
    public final void d(@NotNull RenderNode renderNode0, int v) {
        renderNode0.setSpotShadowColor(v);
    }
}

