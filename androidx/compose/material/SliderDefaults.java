package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.h3;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001Jv\u0010\u0010\u001A\u00020\r2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0012\u001A\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001A\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001A\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001A\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001A\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "Landroidx/compose/material/SliderColors;", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "colors", "", "InactiveTrackAlpha", "F", "DisabledInactiveTrackAlpha", "DisabledActiveTrackAlpha", "TickAlpha", "DisabledTickAlpha", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;
    @NotNull
    public static final SliderDefaults INSTANCE = null;
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    static {
        SliderDefaults.INSTANCE = new SliderDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final SliderColors colors-q0g_0yA(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, @Nullable Composer composer0, int v10, int v11, int v12) {
        composer0.startReplaceableGroup(0x19FD1A17);
        long v13 = (v12 & 1) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v14 = (v12 & 2) == 0 ? v1 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v15 = (v12 & 4) == 0 ? v2 : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v16 = (v12 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(v15, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
        long v17 = (v12 & 16) == 0 ? v4 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        long v18 = (v12 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(v17, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        long v19 = (v12 & 0x40) == 0 ? v6 : Color.copy-wmQWz5c$default(ColorsKt.contentColorFor-ek8zF_U(v15, composer0, v10 >> 6 & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v20 = (v12 & 0x80) == 0 ? v7 : Color.copy-wmQWz5c$default(v15, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v21 = (v12 & 0x100) == 0 ? v8 : Color.copy-wmQWz5c$default(v19, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        long v22 = (v12 & 0x200) == 0 ? v9 : Color.copy-wmQWz5c$default(v18, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x19FD1A17, v10, v11, "androidx.compose.material.SliderDefaults.colors (Slider.kt:498)");
        }
        SliderColors sliderColors0 = new h3(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return sliderColors0;
    }
}

