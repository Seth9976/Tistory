package androidx.compose.ui.geometry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000E\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class GeometryUtilsKt {
    @NotNull
    public static final String toStringAsFixed(float f, int v) {
        if(Float.isNaN(f)) {
            return "NaN";
        }
        if(Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int v1 = Math.max(v, 0);
        float f1 = (float)Math.pow(10.0, v1);
        float f2 = f * f1;
        int v2 = (int)f2;
        float f3 = ((float)(f2 - ((float)v2) >= 0.5f ? v2 + 1 : ((int)f2))) / f1;
        return v1 <= 0 ? String.valueOf(((int)f3)) : String.valueOf(f3);
    }
}

