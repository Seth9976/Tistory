package s1;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.graphics.RenderEffect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class n {
    public static final n a;

    static {
        n.a = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull View view0, @Nullable RenderEffect renderEffect0) {
        view0.setRenderEffect((renderEffect0 == null ? null : renderEffect0.asAndroidRenderEffect()));
    }
}

