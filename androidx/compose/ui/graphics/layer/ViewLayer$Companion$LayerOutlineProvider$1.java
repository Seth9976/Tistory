package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/graphics/layer/ViewLayer$Companion$LayerOutlineProvider$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ViewLayer.Companion.LayerOutlineProvider.1 extends ViewOutlineProvider {
    @Override  // android.view.ViewOutlineProvider
    public void getOutline(@Nullable View view0, @NotNull Outline outline0) {
        if(view0 instanceof ViewLayer) {
            Outline outline1 = ((ViewLayer)view0).e;
            if(outline1 != null) {
                outline0.set(outline1);
            }
        }
    }
}

