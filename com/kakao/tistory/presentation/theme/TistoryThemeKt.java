package com.kakao.tistory.presentation.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A,\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0011\u0010\u0005\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "darkTheme", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "TistoryTheme", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryThemeKt {
    public static final Colors a;

    // 去混淆评级： 中等(80)
    static {
        TistoryThemeKt.a = ColorsKt.lightColors-2qZNXz8$default(0xFFFFFFFF00000000L, 0xFF22222200000000L, 0L, 0L, 0xFFFFFFFF00000000L, 0xFFFFFFFF00000000L, 0xFFFF554400000000L, 0xFF22222200000000L, 0L, 0xFF22222200000000L, 0xFF22222200000000L, 0L, 0x90C, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void TistoryTheme(boolean z, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        int v2;
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(1228778603);
        if((v1 & 2) == 0) {
            v2 = (v & 0x70) == 0 ? (composer1.changedInstance(function20) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v2 & 81) != 16 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 1) != 0) {
                    v2 &= -15;
                }
                z1 = z;
            }
            else if((v1 & 1) == 0) {
                z1 = z;
            }
            else {
                v2 &= -15;
                z1 = DarkThemeKt.isSystemInDarkTheme(composer1, 0);
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1228778603, v2, -1, "com.kakao.tistory.presentation.theme.TistoryTheme (TistoryTheme.kt:28)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x70FC733F, true, new i(new TextSelectionColors(0xFF88888800000000L, Color.copy-wmQWz5c$default(0xFF88888800000000L, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null), function20), composer1, 54);
            MaterialThemeKt.MaterialTheme(TistoryThemeKt.a, TypeKt.getTypography(), null, composableLambda0, composer1, 0xC36, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(z1, function20, v, v1));
        }
    }
}

