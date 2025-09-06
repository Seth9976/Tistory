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
import p0.i3;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001Jv\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "", "checkedTrackAlpha", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "Landroidx/compose/material/SwitchColors;", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "colors", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SwitchDefaults {
    public static final int $stable;
    @NotNull
    public static final SwitchDefaults INSTANCE;

    static {
        SwitchDefaults.INSTANCE = new SwitchDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final SwitchColors colors-SQMK_m0(long v, long v1, float f, long v2, long v3, float f1, long v4, long v5, long v6, long v7, @Nullable Composer composer0, int v8, int v9, int v10) {
        composer0.startReplaceableGroup(0xC27AFBD2);
        long v11 = (v10 & 1) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSecondaryVariant-0d7_KjU();
        long v12 = (v10 & 2) == 0 ? v1 : v11;
        float f2 = (v10 & 4) == 0 ? f : 0.54f;
        long v13 = (v10 & 8) == 0 ? v2 : MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU();
        long v14 = (v10 & 16) == 0 ? v3 : MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU();
        float f3 = (v10 & 0x20) == 0 ? f1 : 0.38f;
        long v15 = (v10 & 0x40) == 0 ? v4 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(v11, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v16 = (v10 & 0x80) == 0 ? v5 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(v12, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v17 = (v10 & 0x100) == 0 ? v6 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(v13, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v18 = (v10 & 0x200) == 0 ? v7 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(v14, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC27AFBD2, v8, v9, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:340)");
        }
        SwitchColors switchColors0 = new i3(v11, Color.copy-wmQWz5c$default(v12, f2, 0.0f, 0.0f, 0.0f, 14, null), v13, Color.copy-wmQWz5c$default(v14, f3, 0.0f, 0.0f, 0.0f, 14, null), v15, Color.copy-wmQWz5c$default(v16, f2, 0.0f, 0.0f, 0.0f, 14, null), v17, Color.copy-wmQWz5c$default(v18, f3, 0.0f, 0.0f, 0.0f, 14, null));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return switchColors0;
    }
}

