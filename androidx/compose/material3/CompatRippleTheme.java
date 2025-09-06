package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0007\u001A\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/material3/CompatRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "defaultColor", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/CompatRippleTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,370:1\n77#2:371\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/CompatRippleTheme\n*L\n245#1:371\n*E\n"})
public final class CompatRippleTheme implements RippleTheme {
    public static final int $stable;
    @NotNull
    public static final CompatRippleTheme INSTANCE;

    static {
        CompatRippleTheme.INSTANCE = new CompatRippleTheme();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.material.ripple.RippleTheme
    @Composable
    @Deprecated(message = "Super method is deprecated")
    public long defaultColor-WaAFU9c(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x920EA82F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x920EA82F, v, -1, "androidx.compose.material3.CompatRippleTheme.defaultColor (Ripple.kt:244)");
        }
        long v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return v1;
    }

    @Override  // androidx.compose.material.ripple.RippleTheme
    @Composable
    @Deprecated(message = "Super method is deprecated")
    @NotNull
    public RippleAlpha rippleAlpha(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(-290975286);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-290975286, v, -1, "androidx.compose.material3.CompatRippleTheme.rippleAlpha (Ripple.kt:248)");
        }
        RippleAlpha rippleAlpha0 = RippleDefaults.INSTANCE.getRippleAlpha();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return rippleAlpha0;
    }
}

