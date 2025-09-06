package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001A\u0010\u0005\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/unit/Density;", "a", "Landroidx/compose/ui/unit/Density;", "getDefaultDensity", "()Landroidx/compose/ui/unit/Density;", "DefaultDensity", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DrawContextKt {
    public static final Density a;

    static {
        DrawContextKt.a = DensityKt.Density(1.0f, 1.0f);
    }

    @NotNull
    public static final Density getDefaultDensity() {
        return DrawContextKt.a;
    }
}

