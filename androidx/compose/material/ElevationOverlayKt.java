package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p0.o2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001F\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005\"\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0003\u001A\u0004\b\t\u0010\u0005¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ElevationOverlay;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalElevationOverlay", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalElevationOverlay", "Landroidx/compose/ui/unit/Dp;", "b", "getLocalAbsoluteElevation", "LocalAbsoluteElevation", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ElevationOverlayKt {
    public static final ProvidableCompositionLocal a;
    public static final ProvidableCompositionLocal b;

    static {
        ElevationOverlayKt.a = CompositionLocalKt.staticCompositionLocalOf(o2.A);
        ElevationOverlayKt.b = CompositionLocalKt.compositionLocalOf$default(null, o2.z, 1, null);
    }

    public static final long access$calculateForegroundColor-CLU3JFs(long v, float f, Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6029A0DB, v1, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long v2 = Color.copy-wmQWz5c$default(ColorsKt.contentColorFor-ek8zF_U(v, composer0, v1 & 14), (((float)Math.log(f + 1.0f)) * 4.5f + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v2;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalAbsoluteElevation() {
        return ElevationOverlayKt.b;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalElevationOverlay() {
        return ElevationOverlayKt.a;
    }
}

