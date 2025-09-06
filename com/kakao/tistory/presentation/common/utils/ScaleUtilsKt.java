package com.kakao.tistory.presentation.common.utils;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.DimenRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001A\u00020\u0001\u001A\u0012\u0010\u0004\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0006\u001A\u0011\u0010\u0007\u001A\u00020\b*\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"dimen2px", "", "Landroid/content/Context;", "dimension", "dp2px", "dp", "", "lineHeightToDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)F", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScaleUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleUtils.kt\ncom/kakao/tistory/presentation/common/utils/ScaleUtilsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,29:1\n77#2:30\n*S KotlinDebug\n*F\n+ 1 ScaleUtils.kt\ncom/kakao/tistory/presentation/common/utils/ScaleUtilsKt\n*L\n27#1:30\n*E\n"})
public final class ScaleUtilsKt {
    public static final int dimen2px(@NotNull Context context0, @DimenRes int v) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        return context0.getResources().getDimensionPixelSize(v);
    }

    public static final int dp2px(@NotNull Context context0, float f) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        return (int)TypedValue.applyDimension(1, f, context0.getResources().getDisplayMetrics());
    }

    @Composable
    public static final float lineHeightToDp(@NotNull TextStyle textStyle0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(textStyle0, "<this>");
        composer0.startReplaceGroup(0x2753DCFB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2753DCFB, v, -1, "com.kakao.tistory.presentation.common.utils.lineHeightToDp (ScaleUtils.kt:26)");
        }
        float f = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).toDp-GaN1DYA(textStyle0.getLineHeight-XSAIIZE());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return f;
    }
}

