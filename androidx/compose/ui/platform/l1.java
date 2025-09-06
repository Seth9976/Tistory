package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class l1 {
    public static final l1 a;

    static {
        l1.a = new l1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode0) {
        renderNode0.discardDisplayList();
    }
}

