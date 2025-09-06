package androidx.compose.ui.graphics.layer;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import i3.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(0x1F)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/layer/RenderNodeVerificationHelper;", "", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/RenderEffect;", "target", "", "setRenderEffect", "(Landroid/graphics/RenderNode;Landroidx/compose/ui/graphics/RenderEffect;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RenderNodeVerificationHelper {
    @NotNull
    public static final RenderNodeVerificationHelper INSTANCE;

    static {
        RenderNodeVerificationHelper.INSTANCE = new RenderNodeVerificationHelper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void setRenderEffect(@NotNull RenderNode renderNode0, @Nullable RenderEffect renderEffect0) {
        a.m(renderNode0, (renderEffect0 == null ? null : renderEffect0.asAndroidRenderEffect()));
    }
}

