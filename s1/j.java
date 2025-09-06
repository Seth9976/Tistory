package s1;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class j {
    public static final j a;

    static {
        j.a = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode0) {
        renderNode0.discardDisplayList();
    }
}

