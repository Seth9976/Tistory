package s1;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class k {
    public static final k a;

    static {
        k.a = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
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

