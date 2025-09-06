package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import t2.a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A\u001A\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DensityKt {
    @Stable
    @NotNull
    public static final Density Density(float f, float f1) {
        return new a(f, f1);
    }

    public static Density Density$default(float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 1.0f;
        }
        return DensityKt.Density(f, f1);
    }
}

