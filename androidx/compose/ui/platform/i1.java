package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.graphics.RenderEffect;
import i3.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class i1 {
    public static final i1 a;

    static {
        i1.a = new i1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode0, @Nullable RenderEffect renderEffect0) {
        a.m(renderNode0, (renderEffect0 == null ? null : renderEffect0.asAndroidRenderEffect()));
    }
}

