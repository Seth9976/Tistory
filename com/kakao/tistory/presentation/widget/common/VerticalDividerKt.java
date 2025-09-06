package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.kakao.tistory.presentation.R.color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A0\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"VerticalDivider", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "VerticalDivider-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVerticalDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerticalDivider.kt\ncom/kakao/tistory/presentation/widget/common/VerticalDividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,31:1\n148#2:32\n*S KotlinDebug\n*F\n+ 1 VerticalDivider.kt\ncom/kakao/tistory/presentation/widget/common/VerticalDividerKt\n*L\n23#1:32\n*E\n"})
public final class VerticalDividerKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void VerticalDivider-aM-cp0Q(@Nullable Modifier modifier0, long v, float f, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        float f1;
        int v5;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x829205B7);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
            if((v2 & 2) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x20 : 16;
            }
            else {
                v4 = v;
                v5 = 16;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            f1 = f;
        }
        else if((v1 & 0x380) == 0) {
            f1 = f;
            v3 |= (composer1.changed(f1) ? 0x100 : 0x80);
        }
        else {
            f1 = f;
        }
        if((v3 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) != 0) {
                    v4 = ColorResources_androidKt.colorResource(color.gray3, composer1, 0);
                    v3 &= 0xFFFFFF8F;
                }
                if((v2 & 4) != 0) {
                    f1 = 1.0f;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                modifier1 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x829205B7, v3, -1, "com.kakao.tistory.presentation.widget.common.VerticalDivider (VerticalDivider.kt:23)");
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.width-3ABfNKs(SizeKt.fillMaxHeight$default(modifier1, 0.0f, 1, null), f1), v4, null, 2, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j5(modifier1, v4, f1, v1, v2));
        }
    }
}

