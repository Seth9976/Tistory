package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A0\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A.\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\n2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A0\u0010\u0010\u001A\u00020\r2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\"&\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00000\u00118GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0014\u0010\u0015\"(\u0010\u001D\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00118GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u001A\u0010\u0013\u0012\u0004\b\u001C\u0010\u0017\u001A\u0004\b\u001B\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/foundation/IndicationNodeFactory;", "ripple-H2RKhps", "(ZFJ)Landroidx/compose/foundation/IndicationNodeFactory;", "ripple", "Landroidx/compose/ui/graphics/ColorProducer;", "ripple-wH6b6FI", "(Landroidx/compose/ui/graphics/ColorProducer;ZF)Landroidx/compose/foundation/IndicationNodeFactory;", "Landroidx/compose/foundation/Indication;", "rippleOrFallbackImplementation-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "rippleOrFallbackImplementation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalUseFallbackRippleImplementation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalUseFallbackRippleImplementation$annotations", "()V", "LocalUseFallbackRippleImplementation", "Landroidx/compose/material3/RippleConfiguration;", "b", "getLocalRippleConfiguration", "getLocalRippleConfiguration$annotations", "LocalRippleConfiguration", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/RippleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,370:1\n77#2:371\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/RippleKt\n*L\n232#1:371\n*E\n"})
public final class RippleKt {
    public static final ProvidableCompositionLocal a;
    public static final ProvidableCompositionLocal b;
    public static final ii c;
    public static final ii d;

    static {
        RippleKt.a = CompositionLocalKt.staticCompositionLocalOf(m4.M);
        RippleKt.b = CompositionLocalKt.compositionLocalOf$default(null, m4.L, 1, null);
        RippleKt.c = new ii(true, NaNf, null, 0L);
        RippleKt.d = new ii(false, NaNf, null, 0L);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final ProvidableCompositionLocal getLocalRippleConfiguration() {
        return RippleKt.b;
    }

    @ExperimentalMaterial3Api
    public static void getLocalRippleConfiguration$annotations() {
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final ProvidableCompositionLocal getLocalUseFallbackRippleImplementation() {
        return RippleKt.a;
    }

    @ExperimentalMaterial3Api
    public static void getLocalUseFallbackRippleImplementation$annotations() {
    }

    // 去混淆评级： 低(26)
    @Stable
    @NotNull
    public static final IndicationNodeFactory ripple-H2RKhps(boolean z, float f, long v) {
        if(Dp.equals-impl0(f, NaNf) && Color.equals-impl0(v, 0L)) {
            return z ? RippleKt.c : RippleKt.d;
        }
        return new ii(z, f, null, v);
    }

    public static IndicationNodeFactory ripple-H2RKhps$default(boolean z, float f, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            z = true;
        }
        if((v1 & 2) != 0) {
            f = NaNf;
        }
        if((v1 & 4) != 0) {
            v = 0L;
        }
        return RippleKt.ripple-H2RKhps(z, f, v);
    }

    // 去混淆评级： 低(20)
    @Stable
    @NotNull
    public static final IndicationNodeFactory ripple-wH6b6FI(@NotNull ColorProducer colorProducer0, boolean z, float f) {
        return new ii(z, f, colorProducer0, 0L);
    }

    public static IndicationNodeFactory ripple-wH6b6FI$default(ColorProducer colorProducer0, boolean z, float f, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            f = NaNf;
        }
        return RippleKt.ripple-wH6b6FI(colorProducer0, z, f);
    }

    @Composable
    @NotNull
    public static final Indication rippleOrFallbackImplementation-9IZ8Weo(boolean z, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        if((v2 & 1) != 0) {
            z = true;
        }
        if((v2 & 2) != 0) {
            f = NaNf;
        }
        if((v2 & 4) != 0) {
            v = 0L;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB19242F5, v1, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        composer0.startReplaceGroup(-1280632857);
        Indication indication0 = ((Boolean)composer0.consume(RippleKt.a)).booleanValue() ? androidx.compose.material.ripple.RippleKt.rememberRipple-9IZ8Weo(z, f, v, composer0, v1 & 0x3FE, 0) : RippleKt.ripple-H2RKhps(z, f, v);
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return indication0;
    }
}

