package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

public final class a implements RippleTheme {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.material.ripple.RippleTheme
    public final long defaultColor-WaAFU9c(Composer composer0, int v) {
        composer0.startReplaceGroup(2042140174);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042140174, v, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:239)");
        }
        long v1 = RippleTheme.Companion.defaultRippleColor-5vOe2sY(0xFF00000000000000L, true);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return v1;
    }

    @Override  // androidx.compose.material.ripple.RippleTheme
    public final RippleAlpha rippleAlpha(Composer composer0, int v) {
        composer0.startReplaceGroup(0x9EDAF9E9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9EDAF9E9, v, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:243)");
        }
        RippleAlpha rippleAlpha0 = RippleTheme.Companion.defaultRippleAlpha-DxMtmZc(0xFF00000000000000L, true);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return rippleAlpha0;
    }
}

