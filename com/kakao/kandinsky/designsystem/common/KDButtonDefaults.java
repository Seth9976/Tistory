package com.kakao.kandinsky.designsystem.common;

import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001JD\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJD\u0010\u0016\u001A\u00020\u00132\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000EH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u001C\u001A\u00020\u00192\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000E2\b\b\u0002\u0010\u0017\u001A\u00020\u000E2\b\b\u0002\u0010\u0018\u001A\u00020\u000EH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Lcom/kakao/kandinsky/designsystem/common/KDButtonDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/ButtonElevation;", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "buttonElevation", "", "disableOpacity", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "Lcom/kakao/kandinsky/designsystem/common/KDButtonColors;", "buttonColors-zf8z9n0", "(FJJJJLandroidx/compose/runtime/Composer;II)Lcom/kakao/kandinsky/designsystem/common/KDButtonColors;", "buttonColors", "checkedContainerColor", "checkedContentColor", "Lcom/kakao/kandinsky/designsystem/common/KDToggleButtonColors;", "toggleButtonColors-dPtIKUs", "(FJJJJJJLandroidx/compose/runtime/Composer;II)Lcom/kakao/kandinsky/designsystem/common/KDToggleButtonColors;", "toggleButtonColors", "designsystem_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDButton.kt\ncom/kakao/kandinsky/designsystem/common/KDButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,240:1\n148#2:241\n148#2:242\n148#2:243\n148#2:244\n148#2:245\n*S KotlinDebug\n*F\n+ 1 KDButton.kt\ncom/kakao/kandinsky/designsystem/common/KDButtonDefaults\n*L\n120#1:241\n121#1:242\n122#1:243\n123#1:244\n124#1:245\n*E\n"})
public final class KDButtonDefaults {
    public static final int $stable;
    @NotNull
    public static final KDButtonDefaults INSTANCE;

    static {
        KDButtonDefaults.INSTANCE = new KDButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final KDButtonColors buttonColors-zf8z9n0(float f, long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        composer0.startReplaceGroup(0x36DF10E7);
        float f1 = (v5 & 1) == 0 ? f : 0.2f;
        long v6 = (v5 & 2) == 0 ? v : 0L;
        long v7 = (v5 & 4) == 0 ? v1 : MaterialTheme.INSTANCE.getColorScheme(composer0, MaterialTheme.$stable).getSecondary-0d7_KjU();
        long v8 = (v5 & 8) == 0 ? v2 : Color.copy-wmQWz5c$default(v6, Color.getAlpha-impl(v6) * f1, 0.0f, 0.0f, 0.0f, 14, null);
        long v9 = (v5 & 16) == 0 ? v3 : Color.copy-wmQWz5c$default(v7, f1 * Color.getAlpha-impl(v7), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x36DF10E7, v4, -1, "com.kakao.kandinsky.designsystem.common.KDButtonDefaults.buttonColors (KDButton.kt:133)");
        }
        KDButtonColors kDButtonColors0 = new KDButtonColors(v6, v7, v8, v9, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return kDButtonColors0;
    }

    @Composable
    @NotNull
    public final ButtonElevation buttonElevation-R_JCAzs(float f, float f1, float f2, float f3, float f4, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceGroup(0xCAAA779C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCAAA779C, v, -1, "com.kakao.kandinsky.designsystem.common.KDButtonDefaults.buttonElevation (KDButton.kt:124)");
        }
        ButtonElevation buttonElevation0 = ButtonDefaults.INSTANCE.buttonElevation-R_JCAzs(((v1 & 1) == 0 ? f : 0.0f), ((v1 & 2) == 0 ? f1 : 0.0f), ((v1 & 4) == 0 ? f2 : 0.0f), ((v1 & 8) == 0 ? f3 : 0.0f), ((v1 & 16) == 0 ? f4 : 0.0f), composer0, v & 0xFFFE | ButtonDefaults.$stable << 15, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return buttonElevation0;
    }

    @Composable
    @NotNull
    public final KDToggleButtonColors toggleButtonColors-dPtIKUs(float f, long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        composer0.startReplaceGroup(0x56E6CF39);
        float f1 = (v7 & 1) == 0 ? f : 0.2f;
        long v8 = (v7 & 2) == 0 ? v : 0L;
        long v9 = (v7 & 4) == 0 ? v1 : MaterialTheme.INSTANCE.getColorScheme(composer0, MaterialTheme.$stable).getSecondary-0d7_KjU();
        long v10 = (v7 & 8) == 0 ? v2 : Color.copy-wmQWz5c$default(v8, f1, 0.0f, 0.0f, 0.0f, 14, null);
        long v11 = (v7 & 16) == 0 ? v3 : Color.copy-wmQWz5c$default(v9, f1, 0.0f, 0.0f, 0.0f, 14, null);
        long v12 = (v7 & 0x40) == 0 ? v5 : MaterialTheme.INSTANCE.getColorScheme(composer0, MaterialTheme.$stable).getPrimary-0d7_KjU();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x56E6CF39, v6, -1, "com.kakao.kandinsky.designsystem.common.KDButtonDefaults.toggleButtonColors (KDButton.kt:144)");
        }
        KDToggleButtonColors kDToggleButtonColors0 = new KDToggleButtonColors(v8, v9, v10, v11, ((v7 & 0x20) == 0 ? v4 : v8), v12, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return kDToggleButtonColors0;
    }
}

