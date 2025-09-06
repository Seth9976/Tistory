package p0;

import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

public final class c5 implements RippleTheme {
    public static final c5 a;

    static {
        c5.a = new c5();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.material.ripple.RippleTheme
    public final long defaultColor-WaAFU9c(Composer composer0, int v) {
        composer0.startReplaceableGroup(0x20D0860F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x20D0860F, v, -1, "androidx.compose.material.MaterialRippleTheme.defaultColor (MaterialTheme.kt:127)");
        }
        long v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        boolean z = MaterialTheme.INSTANCE.getColors(composer0, 6).isLight();
        long v2 = RippleTheme.Companion.defaultRippleColor-5vOe2sY(v1, z);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return v2;
    }

    @Override  // androidx.compose.material.ripple.RippleTheme
    public final RippleAlpha rippleAlpha(Composer composer0, int v) {
        composer0.startReplaceableGroup(0xAB6024AA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAB6024AA, v, -1, "androidx.compose.material.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:133)");
        }
        long v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        boolean z = MaterialTheme.INSTANCE.getColors(composer0, 6).isLight();
        RippleAlpha rippleAlpha0 = RippleTheme.Companion.defaultRippleAlpha-DxMtmZc(v1, z);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return rippleAlpha0;
    }
}

