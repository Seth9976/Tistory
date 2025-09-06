package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\f\u0010\u0004\u001A\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"clip", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clipToBounds", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ClipKt {
    @Stable
    @NotNull
    public static final Modifier clip(@NotNull Modifier modifier0, @NotNull Shape shape0) {
        return GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape0, true, null, 0L, 0L, 0, 0x1E7FF, null);
    }

    @Stable
    @NotNull
    public static final Modifier clipToBounds(@NotNull Modifier modifier0) {
        return GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 0x1EFFF, null);
    }
}

