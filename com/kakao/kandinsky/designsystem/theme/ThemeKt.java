package com.kakao.kandinsky.designsystem.theme;

import androidx.compose.foundation.text.selection.s;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.ni;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A \u0010\u0000\u001A\u00020\u00012\u0011\u0010\u0002\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"KandinskyTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ThemeKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void KandinskyTheme(@NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(2011058536);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2011058536, v1, -1, "com.kakao.kandinsky.designsystem.theme.KandinskyTheme (Theme.kt:11)");
            }
            MaterialThemeKt.MaterialTheme(ColorKt.getKandinskyColorScheme(), null, TypeKt.getTypography(), ComposableLambdaKt.rememberComposableLambda(-183007468, true, new ni(function20, 1), composer1, 54), composer1, 0xD86, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(v, 1, function20));
        }
    }
}

