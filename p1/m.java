package p1;

import android.graphics.RenderEffect;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class m {
    public static final m a;

    static {
        m.a = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final RenderEffect a(@Nullable androidx.compose.ui.graphics.RenderEffect renderEffect0, float f, float f1, int v) {
        return renderEffect0 == null ? RenderEffect.createBlurEffect(f, f1, AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v)) : RenderEffect.createBlurEffect(f, f1, renderEffect0.asAndroidRenderEffect(), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v));
    }

    @DoNotInline
    @NotNull
    public final RenderEffect b(@Nullable androidx.compose.ui.graphics.RenderEffect renderEffect0, long v) {
        return renderEffect0 == null ? RenderEffect.createOffsetEffect(Offset.getX-impl(v), Offset.getY-impl(v)) : RenderEffect.createOffsetEffect(Offset.getX-impl(v), Offset.getY-impl(v), renderEffect0.asAndroidRenderEffect());
    }
}

