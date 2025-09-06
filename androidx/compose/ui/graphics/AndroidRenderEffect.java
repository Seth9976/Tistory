package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0006\u001A\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u0007¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "androidRenderEffect", "<init>", "(Landroid/graphics/RenderEffect;)V", "createRenderEffect", "()Landroid/graphics/RenderEffect;", "b", "Landroid/graphics/RenderEffect;", "getAndroidRenderEffect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidRenderEffect extends RenderEffect {
    public final android.graphics.RenderEffect b;

    public AndroidRenderEffect(@NotNull android.graphics.RenderEffect renderEffect0) {
        super(null);
        this.b = renderEffect0;
    }

    @Override  // androidx.compose.ui.graphics.RenderEffect
    @NotNull
    public android.graphics.RenderEffect createRenderEffect() {
        return this.b;
    }

    @NotNull
    public final android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.b;
    }
}

