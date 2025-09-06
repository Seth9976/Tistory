package p0;

import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;

public final class z2 implements ElevationOverlay {
    public static final z2 a;

    static {
        z2.a = new z2();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.material.ElevationOverlay
    public final long apply-7g2Lkgo(long v, float f, Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9B70B043, v1, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        if(Dp.compareTo-0680j_4(f, 0.0f) > 0 && !MaterialTheme.INSTANCE.getColors(composer0, 6).isLight()) {
            v = ColorKt.compositeOver--OWjLjI(ElevationOverlayKt.access$calculateForegroundColor-CLU3JFs(v, f, composer0, v1 & 0x7E), v);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v;
    }
}

