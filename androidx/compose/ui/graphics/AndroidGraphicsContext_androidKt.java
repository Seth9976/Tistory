package androidx.compose.ui.graphics;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1.c;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u000E\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006\u001A\f\u0010\u0007\u001A\u00020\u0001*\u00020\u0004H\u0000\"\u0014\u0010\u0000\u001A\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0000\u0010\u0002¨\u0006\b"}, d2 = {"isLayerPersistenceEnabled", "", "()Z", "GraphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "layerContainer", "Landroid/view/ViewGroup;", "isLayerManagerInitialized", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidGraphicsContext_androidKt {
    @NotNull
    public static final GraphicsContext GraphicsContext(@NotNull ViewGroup viewGroup0) {
        return new c(viewGroup0);
    }

    public static final boolean isLayerManagerInitialized(@NotNull GraphicsContext graphicsContext0) {
        Intrinsics.checkNotNull(graphicsContext0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidGraphicsContext");
        ((c)graphicsContext0).getClass();
        return false;
    }

    public static final boolean isLayerPersistenceEnabled() {
        return false;
    }
}

