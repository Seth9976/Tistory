package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p0.o2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Shapes;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalShapes", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ShapesKt {
    public static final ProvidableCompositionLocal a;

    static {
        ShapesKt.a = CompositionLocalKt.staticCompositionLocalOf(o2.D);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalShapes() {
        return ShapesKt.a;
    }
}

